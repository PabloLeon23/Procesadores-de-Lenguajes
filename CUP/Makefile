all:
	jflex trabajo.flex
	java -jar java-cup-11b.jar cup_done.cup
	javac -cp java-cup-11b.jar:. VarInfo.java Tabla.java analex.java parser.java sym.java Main.java

exec:
	java -cp java-cup-11b-runtime.jar:. Main prueba_cup.txt
