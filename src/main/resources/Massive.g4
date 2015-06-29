grammar Massive;

program : stat+ ;

stat : function_call ';'
     | assign_stat ';'
     | return_stat ';'
     ;

assign_stat : ID '=' exp ;

return_stat : 'return' exp ;

exp : exp ARITHMETIC_OPERATOR exp #arithmetic_exp
    | exp RELATIONAL_OPERATOR exp #relational_exp
    | exp EQUALITY_OPERATOR exp #equality_exp
    | exp LOGICAL_OPERATOR exp #logical_exp
    | operand #operand_exp
    | function_call #function_call_exp
    | '(' exp ')' #nested_exp
    ;

function_call : ID'('INTERNAL_TYPE')' ;

operand : STRING_LITERAL #string_literal
        | NUMBER_LITERAL #number_literal
        | BOOLEAN_LITERAL #boolean_literal
        | ID #id_operand
        ;

BOOLEAN_LITERAL : 'false' | 'true' ;

STRING_LITERAL : '\"' .*? '\"' ;

NUMBER_LITERAL : INTEGER_LITERAL | FLOAT_LITERAL ;

INTEGER_LITERAL : DIGIT+ ;

FLOAT_LITERAL : DIGIT+'.'DIGIT+ ;

LITERAL : NUMBER_LITERAL | STRING_LITERAL ;

ARITHMETIC_OPERATOR : '+' | '/' | '-' | '*' ;

RELATIONAL_OPERATOR : '>' | '<' | '=<' | '>=' ;

EQUALITY_OPERATOR : '==' | '!=' ;

LOGICAL_OPERATOR : 'AND' | 'OR' ;

INTERNAL_TYPE : 'KISI' | 'HESAP' ;

ID : LETTER(LETTER | DIGIT)* ;

DIGIT : [0-9] ;

LETTER : [A-z] ;

WS : [ \t\r\n]+ -> skip ;