all:
	java -jar /usr/local/lib/antlr-4.6-complete.jar ruby.g4
	javac *.java

test:
	java org.antlr.v4.gui.TestRig ruby prog pruebas/prueba1.txt -gui

clean:
	rm *.class

