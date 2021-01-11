#!/bin/bash

echo "Project name: "
read PROGNAME
mkdir $PROGNAME 
cd $PROGNAME 

mkdir src
cd src

echo "Package name: "
read PACKAGE
mkdir $PACKAGE
cd $PACKAGE

echo "Class name: "
read CLASS

echo "package $PROGNAME.src.$PACKAGE;


public class $CLASS {
    public static void main(String[] args){
            
    }
}">> $CLASS.java

vim $CLASS.java
