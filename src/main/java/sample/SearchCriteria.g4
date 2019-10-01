grammar SearchCriteria;

options {
  language = Java;
}
//
//@header {
//    package com.futuredata.common.searchcriteria.gen;
//}

criteria: expression ( NEWLINE expression)*;
expression :  boolExpr;
boolExpr: negationExpr (boolOp negationExpr)*;
negationExpr:
    negationOp* operand;
operand: pair
    | '(' expression ')';
pair : key ':' val;

key : STRING;
val : STRING                                            # stringValue
    | INT                                               # intValue
    | '(' (STRING|INT) (STRING|INT)* ')'                # multiTermsValue
    | '[' (STRING|INT) ('TO'|'to') (STRING|INT) ']'     # rangeValue
    ;
negationOp: 'not'| 'NOT' |'-';
boolOp: andOp | orOp;
andOp: 'AND' | 'and';
orOp: 'OR' | 'or';



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