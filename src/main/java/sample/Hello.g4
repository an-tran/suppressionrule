// Define a grammar called HEllo
grammar Hello;
rule : 'hello' WS ID ;

ID : [a-zA-Z]+ ;
WS : [ \t\r\n]+ -> skip ;
//WS : [ \t\r\n]+ ;

//program: STRING  (  ';'   STRING)+;
//program: STRING  (  '\n'  STRING)+;
//op: 'AND' | 'and' | 'OR' | 'or';
//WS : [ \t]+ -> skip ;
//STRING: ~[,;\n\r"()]+ ;
//NEWLINE:'\r'? '\n'->skip;
