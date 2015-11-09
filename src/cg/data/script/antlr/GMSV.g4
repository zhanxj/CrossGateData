grammar GMSV;
ID : ('a'..'z' |'A'..'Z')+ ; 
INT : '0'..'9' + ; 
NEWLINE:'\r' ? '\n' ; 
WS : (' ' |'\t' |'\n' |'\r' )+ {skip();} ;
LOGIC:'&' '&' | '|' '|';
DEFINE_VALUE:INT(',' INT)*;

/* =========================================== */
/*               system function               */
/* =========================================== */

r:ID DEFINE_VALUE;
block:ID (LOGIC ID)*;
cancel : cancel; // 




/* =========================================== */
/*                game function                */
/* =========================================== */

addfeversec : addfeversec INT; // 加卡时
addgold : addgold ; // 加钱
addgoldlevel : addgoldlevel; // 
addluck : addluck ; // 加幸运度
addskillslot : addskillslot ; // 加技能格
addstampcount : addstampcount ; // 给某一道具加计数值 
albumitemflg : albumitemflg ; // 变更人物头象