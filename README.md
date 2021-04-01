# task0

**Compilation from project folder:**  
javac src/com/katsuba/task0/HelloMain.java

**Run:**  
java src/com/katsuba/task0/HelloMain

**Run with arguments (listing arguments separated by a space):**  
java src/com/katsuba/task0/HelloMain hello world

**Compilation of all `*.java` files:**  
javac src/com/katsuba/task0/*.java

**Compilation to out directory:**  
javac -d out src/com/katsuba/task0/HelloMain.java

**Run:**  
java -classpath out com/katsuba/task0/HelloMain

**Creating `jar`:**  
jar -cf Hello.jar com/katsuba/task0/HelloMain.class

**Run `jar`:**  
java -jar HelloMain.jar

**Compilation including library:**  
javac -classpath lib/commons-io-2.8.0.jar -d out src/com/katsuba/task0/FileMain.java

**Run including library:**  
java -classpath lib/commons-io-2.8.0.jar;out com/katsuba/task0/FileMain file.txt

**Creating `jar` including library:**  
*(`FileMain.jar `- name of jar file, `MANIFEST.MF` - manifest file, `FileMain.class` - class, `commons-io-2.8.0.jar` - library)*  
jar cfm FileMain.jar MANIFEST.MF FileMain.class commons-io-2.8.0.jar

*File `MANIFEST.MF`:*  
Manifest-Version: 1.0  
Class-Path: commons-io-2.8.0.jar  
Created-By: 1.8.0_271 (Oracle Corporation)  
Main-Class: FileMain  

**Run `jar` including library:**  
*(`FileMain.jar` - jar file, `file.txt` - program argument)*  
java -jar FileMain.jar file.txt
