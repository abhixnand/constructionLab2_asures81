# Construction Lab 2 – Design Patterns and Dependency Injection

## Student
ASURITE: asures81

## Commit Hashes
(Replace after running git log)
Activity 1: <hash1>
Activity 2: <hash2>
Activity 3: <hash3>

## Project Structure
All source files are located in the src/ directory.

## How to Run

Activity 1:
java -Dvi=alt AltMain
java AltMain

Activity 2:
java -Dvi=alt Act2Main
java Act2Main

Activity 3:
java -Dvi=alt -Des=one Act3Main
java -Des=two Act3Main
java Act3Main

## Discussion
Strategy and Visitor patterns both allow behavior extension, but differ in purpose. Strategy enables selecting algorithms at runtime, making it ideal for interchangeable logic such as emissions calculation. Visitor allows adding new operations across object structures without modifying those classes, making it suitable for inspection logic. Strategy is simpler and more flexible for behavior changes, while Visitor is powerful for extending functionality across stable class hierarchies.
