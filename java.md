Java
====

run a program with no arguments
```
javac ProgramToBeCompiled.java
java ProgramToBeCompiled
```

run a program with arguments
```
javac ProgramToBeCompiled.java
java ProgramToBeCompiled 1 2 Happy Birthday
```

run a program that reads a file as stdin
```
javac ProgramToBeCompiled.java
java ProgramToBeCompiled < file.txt
```

run a program that reads stdin from stdout of another program
```
javac ProgramToBeCompiled.java
cat file.txt | java ProgramToBeCompiled 
java AnotherProgramWithOutput | java ProgramToBeCompiled
```
