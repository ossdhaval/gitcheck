#!/bin/bash

pwd
echo $JVM_PROJECTS
 for module in $JVM_PROJECTS
 do
   echo "Generating javadocs for module: $module and all it's sub-modules"
   mvn -f $module/pom.xml javadoc:javadoc

   echo "Move generated javadocs from all sub-modules to respective doc site location"

   echo "getting all sub-module names"
   generated_doc_paths=( $( find $module -type d  -path '*/target/site/apidocs' | sed -r 's|/[^/]+$||' | sed -r 's|/[^/]+$||' | sed -r 's|/[^/]+$||'))

   echo "Loop through paths where javadoc got generated and move them to documentation site"
   for source_path in "${generated_doc_paths[@]}"
   do
     # check if the directory `docs/admin/reference/javadocs/$source_path` exists, if not then create one
     mkdir -p docs/admin/reference/javadocs/$source_path
     echo "copy javadocs for $source_path"
     cp -rv ./$source_path/target/site/apidocs/* ./docs/admin/reference/javadocs/$source_path/
   done
 done
