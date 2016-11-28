grammar ruby;

prog : expression_list;
expression_list : expression_list expression terminator
         | expression terminator;
expression : rvalue;
rvalue : assignment
         | rvalue MUL rvalue
         | rvalue DIV rvalue
         | rvalue PLUS rvalue
         | rvalue MINUS rvalue
         | lvalue
         | INT
         | FLOAT;
assignment : lvalue ASSIGN rvalue;
lvalue : ID;
terminator : SEMICOLON | CRLF;

MUL : '*';
DIV : '/';
PLUS : '+';
MINUS : '-';
INT : [0-9]+;
FLOAT : [0-9]+'.'[0-9]+;
ASSIGN : '=';
ID : [a-zA-Z_][0-9a-zA-Z_]*;
SEMICOLON : ';';
CRLF : [ \t\r\n]+ -> skip ;
