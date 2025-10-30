@echo off
echo === CLEANING ===
if exist build rmdir /s /q build
if exist *.jar del *.jar

echo === COMPILING ===
mkdir build
javac -d build src\Main.java
javac -d build -cp build test\TestMain.java

echo === RUNNING TESTS ===
java -cp build TestMain

echo === PACKAGING ===
jar cfe myapp.jar Main -C build .

echo === BUILD SUCCESSFUL ===