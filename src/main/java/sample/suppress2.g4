grammar suppress2;

expression :  pair ;
pair : STRING ':' val // use KEY cause error while STRING not. "ip : ep"
    | '(' expression ')' ;
val : STRING
    | INT
    | '[' INT 'TO' INT ']' ;
boolexpr:  pair ('AND' | 'and' | 'OR' | 'or') pair
    ;

program: STRING  (  NEWLINE STRING)+;
//op: 'AND' | 'and' | 'OR' | 'or';
WS : [ \t\r\n]+ -> skip ;
STRING: ~[,\n\r"()]+ ;

//STRING: [a-zA-Z]+ ; // If one uses STRING, it must be define before KEY. Order matters.
                    // KEY and STRING are equals but if KEY is defined earlier, antlr will match
                    // token with KEY not STRINg => parse error.
KEY : [a-zA-Z]+ ; // KEY
INT: [0-9]+;
NEWLINE:'\r'?'\n';
//STRING: ~[,\n\r":()]+ ;
