grammar Progressive;

exp : predicate
    | '(' logical_exp ')'
    ;

logical_exp : predicate 'AND' predicate #and_exp
            | predicate 'OR' predicate #or_exp
            | predicate #predicate
            ;

predicate : operand RELATIONAL_OPERATOR operand
          ;

operand : function_call | NUMBER_LITERAL | BOOLEAN_LITERAL;

function_call : ID'('INTERNAL_TYPE')';

RELATIONAL_OPERATOR : '>' | '<' | '=<' | '>=' | '==' | '!=';

INTERNAL_TYPE : 'KISI' | 'HESAP' ;

BOOLEAN_LITERAL : 'true' | 'false' ;

ID : [A-z]+;

NUMBER_LITERAL : [0-9]+;

WS : [ \t\r\n]+ -> skip ;