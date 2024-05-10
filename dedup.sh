#!/usr/bin/env bash

resultPath="./03results"
while getopts "f:" opt ; do
    case $opt in
        f)
            export resultPath="$OPTARG"
            ;;
        \?)
          echo "Invalid option: -$OPTARG"
          exit 1
          ;;
    esac
done

# running elements
ProjectPath="."
ClassPath="${ProjectPath}/Jetris/*"
LibPath="${ProjectPath}/lib/*"
OpenJDK8Lib="/usr/lib/jvm/java-8-openjdk-amd64/lib/*:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/*"
ClassPaths="${ClassPath}:${LibPath}:${OpenJDK8Lib}"
ClassPaths=${ClassPaths// }

echo "Executing command: java -Xms10g -Xmx10g -ea -cp ${ClassPaths} DeDeup -f ${resultPath} ..."
java -Xms10g -Xmx10g -ea -cp ${ClassPaths} DeDeup -f ${resultPath}

