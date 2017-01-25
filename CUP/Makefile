all:
	jflex src/analizador_lexico.flex
	java -jar lib/java-cup-11b.jar src/analizador_sintactico.cup
	mv *.java src
	javac -sourcepath src -cp lib/java-cup-11b.jar -d bin src/*.java

exec:
	java -cp lib/java-cup-11b-runtime.jar:bin Main tests/prueba_cup.txt

clean:
	rm bin/*.class
	rm src/analex.java src/parser.java src/sym.java
