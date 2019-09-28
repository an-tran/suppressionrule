// Define a grammar called HEllo
grammar Hello;
//r : 'hello' ID ;
//ID : [a-zA-Z]+ ;
//WS : [ \t\r\n]+ -> skip ;

program: STRING  (  ';'   STRING)+;
//program: STRING  (  '\n'  STRING)+;
//op: 'AND' | 'and' | 'OR' | 'or';
//WS : [ \t]+ -> skip ;
STRING: ~[,;\n\r"()]+ ;
NEWLINE:'\r'? '\n'->skip;
