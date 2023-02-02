# PairsFinder
Simple Java 11 project to find pairs given a sum.

## Requirements

This simple application was built using Java Vanilla 11, so it is needed any JDK 11+ configuration ready 
before downloading the code. To compile it or execute it, there's no additional libraries added.

## Compile

To execute the java Compiler it's needed to be in the root folder of the project and run the following command.

```shell
cd src/
javac Main.java
```
Which is going to create the `Main.class`, that class has the **bytecode**.

after having the `.class` at this step  it's possible to run the code as follows:

```shell
java Main 1,9,5,0,20,-4,12,16,7 12
```
output:
```shell
+ 12,0
+ 16,-4
+ 7,5

```

or if you rather package it into a jar file

```shell
jar cmvf META-INF/MANIFEST.MF PairsFinder.jar Main.class
```

and run it as

```shell
java -jar PairsFinder.jar 1,9,5,0,20,-4,12,16,7 12
```
output:
```shell
+ 12,0
+ 16,-4
+ 7,5
```
