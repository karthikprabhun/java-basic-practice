# java-basic-practice

Java Tutorial for Beginners - covers fundamentals https://www.youtube.com/watch?v=eIrMbAQSU34

## Concepts

Variables & constants - used to store temporary value in memory
Types - Primitive & Reference Types
    primitive - byte, short,int, long, float, double , char, boolean ( refer chart )
    Reference 
Casting - implicit & explicit
Numbers, String & Arrays
Read Input from terminal - Scanner

Comparison Operator
Logic Operators
ternary Operator
Conditional Statements - if, switch
Loops - for, do while , while
Continue - takes to beginning of the loop & Break - breaks the loop


## Terminologies
variable type, identifier, assignment, initializer, convention , camelCase, code snippets


## Notes

Reserved keyword in java ? void , true , false, public ....
Access modifier - public, protected, private
Naming convention for classes - first letter capital and method - use camel case 
Under The Hood  - 

    Main.java (source code) --> JAVA COMPILER --> Main.class ( bite code which is platform independent) --> JVM --> Native code ( Windows , Linux etc )
Diff between primitive vs reference type ?
Difference between parameters and arguments ?

abstract class are like half-baked cake.
Factory method -> which creates object ex: NumberFormat.getCurrencyInstance()

why String a != "quit" will throw error ? String is reference type, here using comparison operator will check the address instead of value. so use .equals() 


## Commands

java Main.java
javac Main.class

## Facts:
There are 4 editions of Java for building different kinds of applications
Standards Edition - this is the core platform , it contains all the basic libraries
Enterprise Edition - provides additional libraries for building fault-tolerant, distributed multi-tier software. 
Micro Education - specific to mobile device
Java Card - used in smart cards


## Best practice
Use constant instead of magic number
always use meaningful name for variables
