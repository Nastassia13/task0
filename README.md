# task0

**Compilation from project folder:**  
javac src/com/katsuba/task0/HelloMain.java

**Run:**  
java src/com/katsuba/task0/HelloMain

**Run with arguments (listing arguments separated by a space):**  
java src/com/katsuba/task0/HelloMain hello world

**Compilation of all `*.java` files:**  
javac src/com/katsuba/task0/*.java

**Compiling to out directory:**  
javac -d out src/com/katsuba/task0/HelloMain.java

**Run:**  
java -classpath out com/katsuba/task0/HelloMain

**Creating `jar`:**  
jar -cf Hello.jar com/katsuba/task0/HelloMain.class

**Run `jar`:**  
java -jar HelloMain.jar
