#!/bin/bash

mkdir -p classes
javac -sourcepath src -d classes src/*.java
java -cp classes Main