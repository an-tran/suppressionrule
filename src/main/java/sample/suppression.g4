grammar suppression;

pair : STRING ':' val;
val : STRING
    | INT
    | '(' (STRING|INT) (STRING|INT)* ')'
    | '[' (STRING|INT) ('TO'|'to') (STRING|INT) ']';

operand: pair
    | '(' expression ')';
negation:
    ('not'|'-')* operand;
boolExpr: negation (( andOp | orOp) negation)*;
andOp: 'AND' | 'and';
orOp: 'OR' | 'or';
expression :  boolExpr;

program: expression ( NEWLINE expression)*;

fragment LETTER : ('a'..'z' | 'A'..'Z') ;
fragment DIGIT : '0'..'9';
//KEY : LETTER (LETTER | DIGIT | '-') *;
//VALUE : ~[,\n\r":()]+ ;
WS : [ \t]+ -> skip ;
INT : [0-9]+;
NEWLINE: '\r'? '\n';
STRING: ~[,\n\r":() [\]]+ | STRING_LITERAL;
//    | '"' ~[\n\r"]* '"';
STRING_LITERAL
    :   '"'
        { StringBuilder b = new StringBuilder(); }
        ( '\\"'         { b.appendCodePoint('"'); }
          | c=~[\n\r"]  { b.appendCodePoint(c); }
        )*
        '"'
        { setText(b.toString()); }
    ;