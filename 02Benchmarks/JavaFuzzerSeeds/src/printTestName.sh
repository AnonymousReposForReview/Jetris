#!/usr/bin/env bash

filepath=/Users/yingquanzhao/Workspace/JVM/02JIT/Projects/Benchmarks/JavaFuzzerSeeds/src/tests/*

for dir in ${filepath}; do
    if [[ -d "$dir" ]]; then
        dir_name=$(basename "$dir")  # 获取原始文件夹名称
        test_name="tests.${dir_name}.Test"  # 构建Test.java文件的路径
        echo "${test_name}"
    fi
done