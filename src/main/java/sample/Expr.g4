grammar Expr;

/** The start rule; begin parsing here. */
prog:   stat+ ;

stat:   expr NEWLINE
    |   ID '=' expr NEWLINE
    |   NEWLINE
    ;

expr:
        expr '*' expr   #mul
    |   expr '/' expr   #div
    |   expr '+' expr   #plus
    |   expr '-' expr   #sub
    |   INT             #int
    |   ID              #id
    |   '(' expr ')'    #compound
    ;

ID  :   [a-zA-Z]+ ;      // match identifiers <label id="code.tour.expr.3"/>
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace
