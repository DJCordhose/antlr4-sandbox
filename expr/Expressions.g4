grammar Expressions;

start : expr ;

expr : left=expr op=('*'|'/') right=expr #opExpr
     | left=expr op=('+'|'-') right=expr #opExpr
     | atom=INT                          #atomExpr
     ;
   
INT : ('0'..'9')+ ;

WS : [ \t\r\n]+ -> skip ;

