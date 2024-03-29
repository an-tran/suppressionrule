grammar suppression;

pair : key ':' val;
key : STRING;
val : STRING                                            # stringValue
    | INT                                               # intValue
    | '(' (STRING|INT) (STRING|INT)* ')'                # multiTermsValue
    | '[' (STRING|INT) ('TO'|'to') (STRING|INT) ']'     # rangeValue
    ;
operand: pair
    | '(' expression ')';
negationExpr:
    negationOp* operand;
boolExpr: negationExpr (( andOp | orOp) negationExpr)*;
negationOp: 'not'| 'NOT' |'-';
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
STRING
    :   ~[ ,\n\r":()[\]-] ~[ ,\n\r":()[\]]*
        | STRING_LITERAL
    ;
STRING_LITERAL
    :   '"'
        ( '\\"'
          | ~[\n\r"]
        )*
        '"'
    ;