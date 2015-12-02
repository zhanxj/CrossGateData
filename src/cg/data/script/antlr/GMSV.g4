grammar GMSV;
@header {
package cg.data.script.antlr;
}
ID : ('a'..'z' | 'A'..'Z')+ ; 
STRING : ('a'..'z' | 'A'..'Z' | '0'..'9')+ ; 
INT : '0'..'9' + ; 
BOOLEAN : 'true' | 'false' ;
NEWLINE:'\r' ? '\n' ; 
WS : (' ' | '\t' |'\n' |'\r' )+ {skip();} ;
LOGIC : '&' '&' | '|' '|';
DEFINE_VALUE : INT(',' INT)*;
COMMENT : '/*' (.)*? '*/' {skip();} ;
LINE_COMMENT : ('#' | '//') ~ ('\n' | '\r')* '\r'? '\n' {skip();} ;

/* =========================================== */
/*               system function               */
/* =========================================== */

r : ID DEFINE_VALUE;

/* =========================================== */
/*                game function                */
/* =========================================== */

addfeversec : 'addfeversec' STRING; // 加卡时
addgold : 'addgold' STRING; // 加钱
addgoldlevel : 'addgoldlevel'; // 
addluck : 'addluck' INT INT; // 加幸运度
addskillslot : 'addskillslot'; // 加1技能格
addstampcount : 'addstampcount' INT INT; // 给某一道具加计数值 
albumitemflg : 'albumitemflg'; // 变更人物头象
bankitem : 'bankitem'; // 
Bimage : 'Bimage'; // 判断人物图形编号
BBImage : 'BBImage'; // 判断人物图形编号
block : 'block' BOOLEAN; // NPC指令开端（类似设定一块一块脚本块）
Changepal : 'Changepal' INT INT; // 改变地图调色板
checkitemcategory : 'checkitemcategory'; // 
CheckRealTime : 'CheckRealTime' STRING; // 检查真实时间
checkskillslot : 'checkskillslot'; // 检查技能格数
checktitle : 'checktitle'; // 檢查是否有新称号
encount : 'encount' STRING; // 打怪
endblock : 'endblock'; // 
endevent : 'endevent' INT INT; // 赋予指定event编号
endif : 'endif'; // 配合IF
EndWindow : 'EndWindow' STRING STRING; // 对话结束关闭对话视窗
EquipItem : 'EquipItem' INT; // 检测否拥有装备
fame : 'fame'; // 称号值
floor : 'floor'; // 判断所在地图的编号比如法兰 1000
fp : 'fp'; // 给予+-生命值
gaendwindow : 'gaendwindow' STRING; // 全队endwindow？
gaglobalflag : 'gaglobalflag'; // 全队globalFlag条件判断
gawindow : 'gawindow' STRING STRING; // 全队window？
getalbumflgtotal : 'getalbumflgtotal'; // 
giveitem : 'giveitem' INT INT; // 给予指定道具编号指令
GiveLeak0Item : 'GiveLeak0Item' INT; // 给予特定道具编号指令（未鉴定道具）
GiveLeak1Item : 'GiveLeak1Item' INT; // 给予指定关键道具编号指令（已鉴定道具）
givepet : 'givepet' INT; // 给予指定宠物
giverecipe : 'giverecipe' INT; // 给予指定技能编号
givestackitem : 'givestackitem' INT INT; // 给予指定道具编号指令（已鉴定道具，计算堆叠）
globalFlag : 'globalFlag'; // 类似ENDEVENT的判断？？ 
globaltimer : 'globaltimer' STRING INT; // 设置计时器值
Gold : 'Gold'; // 检查当前金钱值
gotob : 'gotob'; // 用于语句跳转，向上跳（goto back）
gotof : 'gotof'; // 用语语句跳转，向下跳（goto forward）
Group : 'Group'; // 检查当前組对人数
guildmember : 'guildmember'; // 
HaveItem : 'HaveItem' INT; // 检测是否拥有道具
haveleak0item : 'haveleak0item' INT; // 检测是否拥有道具（未鉴定道具）
haveleak1item : 'haveleak1item' INT; // 检测是否拥有道具（已鉴定道具）
havetitle : 'havetitle' INT; // 检测是否拥有称号
houseid : 'houseid' INT; // 检测是否拥有出租屋
imagetype : 'imagetype'; // 判断形象类型
Item : 'Item' INT; // 道具编号开端(如Item1234)
ItemCreateTime : 'ItemCreateTime' INT; // 判断道具创建到現在的时间差
itemdur : 'itemdur' INT; // 判断指定道具当前耐久
itemdurper : 'itemdurper' INT; // 判断指定道具当前耐久百分比
ItemSpace : 'ItemSpace'; // 判断道具空间
job : 'job'; // 判断人物职业编号
jobancestry : 'jobancestry'; // 判断人物职业基础编号
jobrank : 'jobrank'; // 判断人物职业等級
killdrugdish : 'killdrugdish'; // 
killitem : 'killitem' INT; // 刪除指定编号道具
killitemall : 'killitemall' INT; // 刪除指定编号下的所有道具
killleak0item : 'killleak0item' INT INT; // 刪除指定编号下未鉴定的所有道具
killleak1item : 'killleak1item' INT; // 刪除指定编号下已鉴定的所有道具
killpet : 'killpet' INT; // 刪除指定宠物
killpeth : 'killpeth' INT INT; // 刪除指定宠物，级别不小于定值
killpetl : 'killpetl' INT INT; // 刪除指定宠物，级别不大于定值
LeaveGroup : 'LeaveGroup'; // 强制离队
level : 'level'; // 判断等級
localcount : 'localcount'; // 本地计量？类似与局部计量变量
localflag : 'localflag'; // 
lp : 'lp'; // 判断生命值
maxfp : 'maxfp'; // 判断最大魔法值
maxlp : 'maxlp'; // 判断最大生命值
Message : 'Message' INT; // 显示系统提示 ，参数为msg编号
metamocount : 'metamocount'; // 人物指定变更变身编号
moveto : 'moveto'; // 
Next : 'Next'; // 搭配Window指令
no : 'no'; // 搭配Window指令
nowevent : 'nowevent' INT; // 判断当前event值
nowtime : 'nowtime'; // 判断当前魔力时间(0~15)
OK : 'OK'; // 搭配Window指令
pequipitem : 'pequipitem' INT INT; // 整个队伍中有几人装备某道具
petlevel : 'petlevel' INT; // 设定指定宠物等级
petspace : 'petspace'; // 判断宠物栏当前剩余空格
phitem : 'phitem' INT INT; // 整个队伍的道具判断
Play_SE : 'Play_SE'; // 播放指定音效
playse : 'playse' INT INT INT; // 播放指定音效
random : 'random' INT INT; // 随即数设定
Setaction : 'Setaction' INT; // 指定npc动作(必須是可动的npc)
setcharm : 'setcharm' STRING; // 设定魅力值
SetDur : 'SetDur' INT STRING; // 设定物品耐久
setfeverflg : 'setfeverflg' INT; // 设定称号值
sethouse : 'sethouse' INT INT; // 设定房间剩余时间
sethouselimit : 'sethouselimit' INT INT; // 设定房间剩余时间
setlevel : 'setlevel' INT; // 设定等级
SetLoginPoint : 'SetLoginPoint' INT; // 设定登陆点指令
SetLp : 'SetLp' INT; // 设定生命值
SetObject : 'SetObject' INT INT INT INT INT; // 设定指定不可穿越道具
setparameter : 'setparameter'; // 
setvisitor : 'setvisitor' INT; // 设置访问者数量
shapenext : 'shapenext' INT; // 设定NPC变换形象
shapeoff : 'shapeoff'; // 
shapeon : 'shapeon'; // 
shipchardown : 'shipchardown' INT; // 下船？
shipchartake : 'shipchartake' INT INT; // 上船
shipgetstoptime : 'shipgetstoptime'; // 
skilllevel : 'skilllevel' INT; // 设定技能等級
stackitemspace : 'stackitemspace'; // 
StrCmpChat : 'StrCmpChat' STRING; // 判断 msg对话字句
strstrchat : 'strstrchat'; // 同上？
systemmessage : 'systemmessage' STRING; // 系统信息？
total : 'total'; // 全局总量
tglobalflag : 'tglobalflag'; // 
trueimage : 'trueimage'; // 角色本身形象
warp : 'warp' STRING STRING STRING; // 移动指令
Window_NO : 'Window_NO'; // 搭配Window_yes使用(玩家选no时)
Window_OK : 'Window_OK'; // 玩家选确定后
Window_YES : 'Window_YES' BOOLEAN; // 玩家选"yes"时
xpos : 'xpos'; // 指定x坐标
yes : 'yes' BOOLEAN; // 搭配window使用
