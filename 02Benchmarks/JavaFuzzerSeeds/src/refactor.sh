#!/usr/bin/env bash

filepath=/Users/yingquanzhao/Workspace/JVM/02JIT/Projects/Benchmarks/JavaFuzzerSeeds/src/tests/*

for dir in ${filepath}; do
    if [[ -d "$dir" ]]; then
        dir_name=$(basename "$dir")  # 获取原始文件夹名称
        test_path="${dir}/Test.java"  # 构建Test.java文件的路径

        # 如果Test.java文件存在
        if [[ -f "$test_path" ]]; then

          echo "Test.java found in ${dir}"

          # 创建临时文件
          temp_file=$(mktemp)
          # 将 package tests.javafuzzer1; 和 import utils.FuzzerUtils; 写入临时文件
          echo "package tests.${dir_name};" > "$temp_file"
          echo "import utils.FuzzerUtils;" >> "$temp_file"

          # 删除包含 "FuzzerUtils.out.println" 的行，但保留特定行
          remove_enter=$(mktemp)
          awk '/FuzzerUtils\.out\.println/ { if (!/;$/) { deleteLines=1 } else { deleteLines=0 } } deleteLines { next } 1' "$test_path" >> "$remove_enter"
          awk '!(/FuzzerUtils\.out\.println/ && !/FuzzerUtils\.out\.println\(ex\.getClass\(\)\.getCanonicalName\(\)\);/)' "$remove_enter" >> "$temp_file"
          # 将临时文件覆盖原始文件
          mv "$temp_file" "$test_path"
        else
          echo "Test.java NOT FOUND IN ${dir}"
        fi
    fi
done