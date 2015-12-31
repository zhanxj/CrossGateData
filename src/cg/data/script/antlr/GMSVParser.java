// Generated from D:\file\workspace\CrossGateData\src\cg\data\script\antlr\GMSV.g4 by ANTLR 4.5.1

package cg.data.script.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GMSVParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, T__138=139, T__139=140, T__140=141, T__141=142, T__142=143, 
		T__143=144, T__144=145, T__145=146, T__146=147, T__147=148, T__148=149, 
		T__149=150, T__150=151, T__151=152, T__152=153, T__153=154, T__154=155, 
		T__155=156, T__156=157, T__157=158, T__158=159, T__159=160, T__160=161, 
		T__161=162, T__162=163, T__163=164, T__164=165, T__165=166, T__166=167, 
		T__167=168, T__168=169, T__169=170, T__170=171, T__171=172, T__172=173, 
		T__173=174, T__174=175, T__175=176, T__176=177, T__177=178, T__178=179, 
		T__179=180, T__180=181, T__181=182, T__182=183, T__183=184, T__184=185, 
		T__185=186, T__186=187, T__187=188, T__188=189, T__189=190, T__190=191, 
		T__191=192, T__192=193, T__193=194, T__194=195, T__195=196, T__196=197, 
		T__197=198, T__198=199, T__199=200, T__200=201, T__201=202, T__202=203, 
		T__203=204, T__204=205, T__205=206, T__206=207, T__207=208, T__208=209, 
		T__209=210, T__210=211, T__211=212, T__212=213, T__213=214, T__214=215, 
		T__215=216, T__216=217, T__217=218, T__218=219, T__219=220, T__220=221, 
		STRING=222, BOOLEAN=223, LOGIC=224, DEFINE_VALUE=225, NAME=226, INT=227, 
		COLON=228, COMMA=229, SEMICOLON=230, LPAREN=231, RPAREN=232, LSQUARE=233, 
		RSQUARE=234, LCURLY=235, RCURLY=236, DOT=237, UNDERLINE=238, ASSIGNEQUAL=239, 
		NOTEQUAL1=240, NOTEQUAL2=241, LESSTHANOREQUALTO1=242, LESSTHAN=243, GREATERTHANOREQUALTO1=244, 
		GREATERTHAN=245, DIVIDE=246, PLUS=247, MINUS=248, STAR=249, MOD=250, AMPERSAND=251, 
		TILDE=252, BITWISEOR=253, BITWISEXOR=254, POUND=255, DOLLAR=256, COMMENT=257, 
		LINE_COMMENT=258, WS=259, EQUAL=260;
	public static final int
		RULE_r = 0, RULE_addfeversec = 1, RULE_addgold = 2, RULE_addgoldlevel = 3, 
		RULE_addluck = 4, RULE_addskillslot = 5, RULE_addstampcount = 6, RULE_bimage = 7, 
		RULE_bbimage = 8, RULE_block = 9, RULE_changepal = 10, RULE_checkitemcategory = 11, 
		RULE_checkrealtime = 12, RULE_checkskillslot = 13, RULE_checktitle = 14, 
		RULE_encount = 15, RULE_endevent = 16, RULE_endwindow = 17, RULE_equipitem = 18, 
		RULE_fame = 19, RULE_floor = 20, RULE_fp = 21, RULE_gaendwindow = 22, 
		RULE_gawindow = 23, RULE_giveitem = 24, RULE_giveleak0item = 25, RULE_giveleak1item = 26, 
		RULE_givepet = 27, RULE_giverecipe = 28, RULE_givestackitem = 29, RULE_globalflag = 30, 
		RULE_globaltimer = 31, RULE_gold = 32, RULE_gotob = 33, RULE_gotof = 34, 
		RULE_group = 35, RULE_haveitem = 36, RULE_haveleak0item = 37, RULE_haveleak1item = 38, 
		RULE_havetitle = 39, RULE_houseid = 40, RULE_imagetype = 41, RULE_item = 42, 
		RULE_itemcreatetime = 43, RULE_itemdur = 44, RULE_itemdurper = 45, RULE_itemspace = 46, 
		RULE_job = 47, RULE_jobancestry = 48, RULE_jobrank = 49, RULE_killdrugdish = 50, 
		RULE_killitem = 51, RULE_killitemall = 52, RULE_killleak0item = 53, RULE_killleak1item = 54, 
		RULE_killpet = 55, RULE_killpeth = 56, RULE_killpetl = 57, RULE_leavegroup = 58, 
		RULE_level = 59, RULE_localcount = 60, RULE_localflag = 61, RULE_lp = 62, 
		RULE_maxfp = 63, RULE_maxlp = 64, RULE_message = 65, RULE_metamocount = 66, 
		RULE_next = 67, RULE_no = 68, RULE_nowevent = 69, RULE_nowtime = 70, RULE_ok = 71, 
		RULE_pequipitem = 72, RULE_petlevel = 73, RULE_petspace = 74, RULE_phitem = 75, 
		RULE_playse = 76, RULE_random = 77, RULE_setaction = 78, RULE_setcharm = 79, 
		RULE_setdur = 80, RULE_setfeverflg = 81, RULE_sethouse = 82, RULE_sethouselimit = 83, 
		RULE_setlevel = 84, RULE_setloginpoint = 85, RULE_setlp = 86, RULE_setobject = 87, 
		RULE_setvisitor = 88, RULE_shapenext = 89, RULE_shipchardown = 90, RULE_shipchartake = 91, 
		RULE_shipgetstoptime = 92, RULE_skilllevel = 93, RULE_stackitemspace = 94, 
		RULE_strcmpchat = 95, RULE_strstrchat = 96, RULE_systemmessage = 97, RULE_trueimage = 98, 
		RULE_warp = 99, RULE_window_no = 100, RULE_window_ok = 101, RULE_window_yes = 102, 
		RULE_xpos = 103, RULE_yes = 104;
	public static final String[] ruleNames = {
		"r", "addfeversec", "addgold", "addgoldlevel", "addluck", "addskillslot", 
		"addstampcount", "bimage", "bbimage", "block", "changepal", "checkitemcategory", 
		"checkrealtime", "checkskillslot", "checktitle", "encount", "endevent", 
		"endwindow", "equipitem", "fame", "floor", "fp", "gaendwindow", "gawindow", 
		"giveitem", "giveleak0item", "giveleak1item", "givepet", "giverecipe", 
		"givestackitem", "globalflag", "globaltimer", "gold", "gotob", "gotof", 
		"group", "haveitem", "haveleak0item", "haveleak1item", "havetitle", "houseid", 
		"imagetype", "item", "itemcreatetime", "itemdur", "itemdurper", "itemspace", 
		"job", "jobancestry", "jobrank", "killdrugdish", "killitem", "killitemall", 
		"killleak0item", "killleak1item", "killpet", "killpeth", "killpetl", "leavegroup", 
		"level", "localcount", "localflag", "lp", "maxfp", "maxlp", "message", 
		"metamocount", "next", "no", "nowevent", "nowtime", "ok", "pequipitem", 
		"petlevel", "petspace", "phitem", "playse", "random", "setaction", "setcharm", 
		"setdur", "setfeverflg", "sethouse", "sethouselimit", "setlevel", "setloginpoint", 
		"setlp", "setobject", "setvisitor", "shapenext", "shipchardown", "shipchartake", 
		"shipgetstoptime", "skilllevel", "stackitemspace", "strcmpchat", "strstrchat", 
		"systemmessage", "trueimage", "warp", "window_no", "window_ok", "window_yes", 
		"xpos", "yes"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Addfeversec'", "'AddFeverSec'", "'addfeversec'", "'AddGold'", 
		"'Addgold'", "'addgold'", "'AddGoldLevel'", "'addluck'", "'addskillslot'", 
		"'AddStampCount'", "'BImage'", "'Bimage'", "'BBImage'", "'BBimage'", "'bbimage'", 
		"'block'", "'ChangePal'", "'Changepal'", "'changepal'", "'CheckItemCategory'", 
		"'checkitemcategory'", "'CheckRealTime'", "'checkskillslot'", "'CheckTitle'", 
		"'checktitle'", "'Checktitle'", "'Encount'", "'encount'", "'endevent'", 
		"'EndEvent'", "'Endevent'", "'EndWindow'", "'endWindow'", "'EndWIndow'", 
		"'Endwindow'", "'ENDWindow'", "'endwindow'", "'EquipItem'", "'Fame'", 
		"'Floor'", "'fp'", "'FP'", "'GAendWindow'", "'GAendwindow'", "'GAEndWindow'", 
		"'GAwindow'", "'GAWindow'", "'giveItem'", "'Giveitem'", "'GIveitem'", 
		"'GiveItem'", "'GIveItem'", "'giveitem'", "'Giveleak0Item'", "'GiveLeak0Item'", 
		"'GiveLeak0item'", "'GIveleak1Item'", "'Giveleak1item'", "'Giveleak1Item'", 
		"'GiveLeak1item'", "'GiveLeak1Item'", "'Givepet'", "'GivePet'", "'givepet'", 
		"'GiveRecipe'", "'Giverecipe'", "'giverecipe'", "'GiveStackItem'", "'GAglobalFlag'", 
		"'GlobalTimerA'", "'gold'", "'Gold'", "'GOLD'", "'gotoB'", "'GotoB'", 
		"'gotoF'", "'GotoF'", "'Group'", "'group'", "'HaveItem'", "'HaveLeak0Item'", 
		"'HaveLeak1Item'", "'havetitle'", "'Havetitle'", "'HaveTitle'", "'HouseId'", 
		"'Imagetype'", "'Item'", "'ITEM'", "'item'", "'itemcreatetime'", "'ItemCreateTime'", 
		"'Itemcreatetime'", "'ItemDur'", "'ItemDUR'", "'ItemDurPer'", "'ItemSpace'", 
		"'Itemspace'", "'itemspace'", "'job'", "'Job'", "'jobancestry'", "'JobAncestry'", 
		"'Jobrank'", "'JobRank'", "'killdrugdish'", "'killitem'", "'Killitem'", 
		"'killItem'", "'KillItem'", "'Killitemall'", "'killitemall'", "'KillItemall'", 
		"'KillItemAll'", "'KillItemALL'", "'KIllItemall'", "'killItemall'", "'killleak0item'", 
		"'KillLeak0item'", "'KillLeak0Item'", "'KillLeak1Item'", "'KillLeak1item'", 
		"'KillPet'", "'KillPetH'", "'KillPeth'", "'Killpeth'", "'KillPetl'", "'KillPetL'", 
		"'killpetL'", "'Leavegroup'", "'LeaveGroup'", "'leavegroup'", "'level'", 
		"'Level'", "'localCount'", "'LocalCount'", "'LocalFlag'", "'Localflag'", 
		"'lp'", "'maxfp'", "'maxlp'", "'Message'", "'message'", "'MetamoCount'", 
		"'next'", "'NEXT'", "'No'", "'NO'", "'nowevent'", "'Nowevent'", "'NowEvent'", 
		"'Nowtime'", "'nowtime'", "'NowTime'", "'OK'", "'PEquipItem'", "'PetLevel'", 
		"'petlevel'", "'Petlevel'", "'Petspace'", "'petspace'", "'PetSpace'", 
		"'petSpace'", "'PHItem'", "'playse'", "'Random'", "'random'", "'Setaction'", 
		"'SetAction'", "'setaction'", "'SetCharm'", "'setcharm'", "'SetDur'", 
		"'Setdur'", "'SetDUR'", "'Setfeverflg'", "'SetHouse'", "'SetHouseLimit'", 
		"'SetLevel'", "'SetLoginPoint'", "'SetLP'", "'SetLp'", "'SetObject'", 
		"'SetVisitor'", "'ShapeNext'", "'shapenext'", "'ShipCharDown'", "'ShipCharTake'", 
		"'ShipGetStopTime'", "'Skilllevel'", "'skilllevel'", "'SkillLevel'", "'StackItemSpace'", 
		"'StrCmpChat'", "'strcmpchat'", "'StrStrChat'", "'systemmessage'", "'SystemMessage'", 
		"'trueimage'", "'Warp'", "'warp'", "'window_no'", "'Window_no'", "'Window_NO'", 
		"'Window_No'", "'Window_OK'", "'Window_ok'", "'Window_Ok'", "'window_ok'", 
		"'window_OK'", "'WIndow_OK'", "'window_yes'", "'Window_YES'", "'Window_Yes'", 
		"'Window_yes'", "'WindoW_YES'", "'xpos'", "'Xpos'", "'XPos'", "'YES'", 
		"'Yes'", null, null, null, null, null, null, "':'", "','", "';'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "'.'", "'_'", "'='", "'<>'", "'!='", 
		"'<='", "'<'", "'>='", "'>'", "'/'", "'+'", "'-'", "'*'", "'%'", "'&'", 
		"'~'", "'|'", "'^'", "'#'", "'$'", null, null, null, "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "STRING", "BOOLEAN", "LOGIC", "DEFINE_VALUE", 
		"NAME", "INT", "COLON", "COMMA", "SEMICOLON", "LPAREN", "RPAREN", "LSQUARE", 
		"RSQUARE", "LCURLY", "RCURLY", "DOT", "UNDERLINE", "ASSIGNEQUAL", "NOTEQUAL1", 
		"NOTEQUAL2", "LESSTHANOREQUALTO1", "LESSTHAN", "GREATERTHANOREQUALTO1", 
		"GREATERTHAN", "DIVIDE", "PLUS", "MINUS", "STAR", "MOD", "AMPERSAND", 
		"TILDE", "BITWISEOR", "BITWISEXOR", "POUND", "DOLLAR", "COMMENT", "LINE_COMMENT", 
		"WS", "EQUAL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GMSV.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GMSVParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GMSVParser.NAME, 0); }
		public TerminalNode DEFINE_VALUE() { return getToken(GMSVParser.DEFINE_VALUE, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(NAME);
			setState(211);
			match(DEFINE_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddfeversecContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public AddfeversecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addfeversec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAddfeversec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAddfeversec(this);
		}
	}

	public final AddfeversecContext addfeversec() throws RecognitionException {
		AddfeversecContext _localctx = new AddfeversecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_addfeversec);
		try {
			setState(217);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(T__2);
				setState(216);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddgoldContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public AddgoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addgold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAddgold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAddgold(this);
		}
	}

	public final AddgoldContext addgold() throws RecognitionException {
		AddgoldContext _localctx = new AddgoldContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_addgold);
		try {
			setState(223);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(T__5);
				setState(222);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddgoldlevelContext extends ParserRuleContext {
		public AddgoldlevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addgoldlevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAddgoldlevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAddgoldlevel(this);
		}
	}

	public final AddgoldlevelContext addgoldlevel() throws RecognitionException {
		AddgoldlevelContext _localctx = new AddgoldlevelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_addgoldlevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddluckContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public AddluckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addluck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAddluck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAddluck(this);
		}
	}

	public final AddluckContext addluck() throws RecognitionException {
		AddluckContext _localctx = new AddluckContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addluck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__7);
			setState(228);
			match(INT);
			setState(229);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddskillslotContext extends ParserRuleContext {
		public AddskillslotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addskillslot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAddskillslot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAddskillslot(this);
		}
	}

	public final AddskillslotContext addskillslot() throws RecognitionException {
		AddskillslotContext _localctx = new AddskillslotContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_addskillslot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddstampcountContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public AddstampcountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addstampcount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAddstampcount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAddstampcount(this);
		}
	}

	public final AddstampcountContext addstampcount() throws RecognitionException {
		AddstampcountContext _localctx = new AddstampcountContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addstampcount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__9);
			setState(234);
			match(INT);
			setState(235);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BimageContext extends ParserRuleContext {
		public BimageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bimage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterBimage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitBimage(this);
		}
	}

	public final BimageContext bimage() throws RecognitionException {
		BimageContext _localctx = new BimageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bimage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BbimageContext extends ParserRuleContext {
		public BbimageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bbimage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterBbimage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitBbimage(this);
		}
	}

	public final BbimageContext bbimage() throws RecognitionException {
		BbimageContext _localctx = new BbimageContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bbimage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(GMSVParser.BOOLEAN, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__15);
			setState(242);
			match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangepalContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public ChangepalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changepal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterChangepal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitChangepal(this);
		}
	}

	public final ChangepalContext changepal() throws RecognitionException {
		ChangepalContext _localctx = new ChangepalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_changepal);
		try {
			setState(249);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(T__18);
				setState(247);
				match(INT);
				setState(248);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckitemcategoryContext extends ParserRuleContext {
		public CheckitemcategoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkitemcategory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterCheckitemcategory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitCheckitemcategory(this);
		}
	}

	public final CheckitemcategoryContext checkitemcategory() throws RecognitionException {
		CheckitemcategoryContext _localctx = new CheckitemcategoryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_checkitemcategory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckrealtimeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public CheckrealtimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkrealtime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterCheckrealtime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitCheckrealtime(this);
		}
	}

	public final CheckrealtimeContext checkrealtime() throws RecognitionException {
		CheckrealtimeContext _localctx = new CheckrealtimeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_checkrealtime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__21);
			setState(254);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckskillslotContext extends ParserRuleContext {
		public CheckskillslotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkskillslot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterCheckskillslot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitCheckskillslot(this);
		}
	}

	public final CheckskillslotContext checkskillslot() throws RecognitionException {
		CheckskillslotContext _localctx = new CheckskillslotContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_checkskillslot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChecktitleContext extends ParserRuleContext {
		public ChecktitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checktitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterChecktitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitChecktitle(this);
		}
	}

	public final ChecktitleContext checktitle() throws RecognitionException {
		ChecktitleContext _localctx = new ChecktitleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_checktitle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EncountContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public EncountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterEncount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitEncount(this);
		}
	}

	public final EncountContext encount() throws RecognitionException {
		EncountContext _localctx = new EncountContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_encount);
		try {
			setState(263);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(T__27);
				setState(262);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndeventContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public EndeventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endevent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterEndevent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitEndevent(this);
		}
	}

	public final EndeventContext endevent() throws RecognitionException {
		EndeventContext _localctx = new EndeventContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_endevent);
		try {
			setState(270);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(T__30);
				setState(268);
				match(INT);
				setState(269);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndwindowContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(GMSVParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GMSVParser.STRING, i);
		}
		public EndwindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endwindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterEndwindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitEndwindow(this);
		}
	}

	public final EndwindowContext endwindow() throws RecognitionException {
		EndwindowContext _localctx = new EndwindowContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_endwindow);
		try {
			setState(280);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(277);
				match(T__36);
				setState(278);
				match(STRING);
				setState(279);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquipitemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public EquipitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equipitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterEquipitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitEquipitem(this);
		}
	}

	public final EquipitemContext equipitem() throws RecognitionException {
		EquipitemContext _localctx = new EquipitemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_equipitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__37);
			setState(283);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FameContext extends ParserRuleContext {
		public FameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterFame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitFame(this);
		}
	}

	public final FameContext fame() throws RecognitionException {
		FameContext _localctx = new FameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fame);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloorContext extends ParserRuleContext {
		public FloorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterFloor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitFloor(this);
		}
	}

	public final FloorContext floor() throws RecognitionException {
		FloorContext _localctx = new FloorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_floor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FpContext extends ParserRuleContext {
		public FpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterFp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitFp(this);
		}
	}

	public final FpContext fp() throws RecognitionException {
		FpContext _localctx = new FpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==T__40 || _la==T__41) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GaendwindowContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public GaendwindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gaendwindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGaendwindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGaendwindow(this);
		}
	}

	public final GaendwindowContext gaendwindow() throws RecognitionException {
		GaendwindowContext _localctx = new GaendwindowContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_gaendwindow);
		try {
			setState(295);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(T__44);
				setState(294);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GawindowContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(GMSVParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GMSVParser.STRING, i);
		}
		public GawindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gawindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGawindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGawindow(this);
		}
	}

	public final GawindowContext gawindow() throws RecognitionException {
		GawindowContext _localctx = new GawindowContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_gawindow);
		try {
			setState(301);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(T__46);
				setState(299);
				match(STRING);
				setState(300);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GiveitemContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public GiveitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_giveitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGiveitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGiveitem(this);
		}
	}

	public final GiveitemContext giveitem() throws RecognitionException {
		GiveitemContext _localctx = new GiveitemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_giveitem);
		try {
			setState(311);
			switch (_input.LA(1)) {
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 6);
				{
				setState(308);
				match(T__52);
				setState(309);
				match(INT);
				setState(310);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Giveleak0itemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public Giveleak0itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_giveleak0item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGiveleak0item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGiveleak0item(this);
		}
	}

	public final Giveleak0itemContext giveleak0item() throws RecognitionException {
		Giveleak0itemContext _localctx = new Giveleak0itemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_giveleak0item);
		try {
			setState(317);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(T__54);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(T__55);
				setState(316);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Giveleak1itemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public Giveleak1itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_giveleak1item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGiveleak1item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGiveleak1item(this);
		}
	}

	public final Giveleak1itemContext giveleak1item() throws RecognitionException {
		Giveleak1itemContext _localctx = new Giveleak1itemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_giveleak1item);
		try {
			setState(325);
			switch (_input.LA(1)) {
			case T__56:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(T__56);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(T__57);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(T__58);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				match(T__59);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				match(T__60);
				setState(324);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GivepetContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public GivepetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_givepet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGivepet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGivepet(this);
		}
	}

	public final GivepetContext givepet() throws RecognitionException {
		GivepetContext _localctx = new GivepetContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_givepet);
		try {
			setState(331);
			switch (_input.LA(1)) {
			case T__61:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(T__61);
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(T__62);
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(T__63);
				setState(330);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GiverecipeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public GiverecipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_giverecipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGiverecipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGiverecipe(this);
		}
	}

	public final GiverecipeContext giverecipe() throws RecognitionException {
		GiverecipeContext _localctx = new GiverecipeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_giverecipe);
		try {
			setState(337);
			switch (_input.LA(1)) {
			case T__64:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(T__64);
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(T__65);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(T__66);
				setState(336);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GivestackitemContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public GivestackitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_givestackitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGivestackitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGivestackitem(this);
		}
	}

	public final GivestackitemContext givestackitem() throws RecognitionException {
		GivestackitemContext _localctx = new GivestackitemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_givestackitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(T__67);
			setState(340);
			match(INT);
			setState(341);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalflagContext extends ParserRuleContext {
		public GlobalflagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalflag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGlobalflag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGlobalflag(this);
		}
	}

	public final GlobalflagContext globalflag() throws RecognitionException {
		GlobalflagContext _localctx = new GlobalflagContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_globalflag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__68);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobaltimerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public GlobaltimerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globaltimer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGlobaltimer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGlobaltimer(this);
		}
	}

	public final GlobaltimerContext globaltimer() throws RecognitionException {
		GlobaltimerContext _localctx = new GlobaltimerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_globaltimer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__69);
			setState(346);
			match(STRING);
			setState(347);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GoldContext extends ParserRuleContext {
		public GoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGold(this);
		}
	}

	public final GoldContext gold() throws RecognitionException {
		GoldContext _localctx = new GoldContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_gold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotobContext extends ParserRuleContext {
		public GotobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotob; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGotob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGotob(this);
		}
	}

	public final GotobContext gotob() throws RecognitionException {
		GotobContext _localctx = new GotobContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_gotob);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !(_la==T__73 || _la==T__74) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotofContext extends ParserRuleContext {
		public GotofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGotof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGotof(this);
		}
	}

	public final GotofContext gotof() throws RecognitionException {
		GotofContext _localctx = new GotofContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_gotof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !(_la==T__75 || _la==T__76) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupContext extends ParserRuleContext {
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGroup(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !(_la==T__77 || _la==T__78) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HaveitemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public HaveitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haveitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterHaveitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitHaveitem(this);
		}
	}

	public final HaveitemContext haveitem() throws RecognitionException {
		HaveitemContext _localctx = new HaveitemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_haveitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__79);
			setState(358);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Haveleak0itemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public Haveleak0itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haveleak0item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterHaveleak0item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitHaveleak0item(this);
		}
	}

	public final Haveleak0itemContext haveleak0item() throws RecognitionException {
		Haveleak0itemContext _localctx = new Haveleak0itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_haveleak0item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__80);
			setState(361);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Haveleak1itemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public Haveleak1itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haveleak1item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterHaveleak1item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitHaveleak1item(this);
		}
	}

	public final Haveleak1itemContext haveleak1item() throws RecognitionException {
		Haveleak1itemContext _localctx = new Haveleak1itemContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_haveleak1item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__81);
			setState(364);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavetitleContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public HavetitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havetitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterHavetitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitHavetitle(this);
		}
	}

	public final HavetitleContext havetitle() throws RecognitionException {
		HavetitleContext _localctx = new HavetitleContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_havetitle);
		try {
			setState(370);
			switch (_input.LA(1)) {
			case T__82:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(T__82);
				}
				break;
			case T__83:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(T__83);
				}
				break;
			case T__84:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				match(T__84);
				setState(369);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HouseidContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public HouseidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_houseid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterHouseid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitHouseid(this);
		}
	}

	public final HouseidContext houseid() throws RecognitionException {
		HouseidContext _localctx = new HouseidContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_houseid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__85);
			setState(373);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImagetypeContext extends ParserRuleContext {
		public ImagetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imagetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterImagetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitImagetype(this);
		}
	}

	public final ImagetypeContext imagetype() throws RecognitionException {
		ImagetypeContext _localctx = new ImagetypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_imagetype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__86);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitItem(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_item);
		try {
			setState(381);
			switch (_input.LA(1)) {
			case T__87:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(T__87);
				}
				break;
			case T__88:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(T__88);
				}
				break;
			case T__89:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(T__89);
				setState(380);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemcreatetimeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public ItemcreatetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemcreatetime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterItemcreatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitItemcreatetime(this);
		}
	}

	public final ItemcreatetimeContext itemcreatetime() throws RecognitionException {
		ItemcreatetimeContext _localctx = new ItemcreatetimeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_itemcreatetime);
		try {
			setState(387);
			switch (_input.LA(1)) {
			case T__90:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(T__90);
				}
				break;
			case T__91:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(T__91);
				}
				break;
			case T__92:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				match(T__92);
				setState(386);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemdurContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public ItemdurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemdur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterItemdur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitItemdur(this);
		}
	}

	public final ItemdurContext itemdur() throws RecognitionException {
		ItemdurContext _localctx = new ItemdurContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_itemdur);
		try {
			setState(392);
			switch (_input.LA(1)) {
			case T__93:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(T__93);
				}
				break;
			case T__94:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(T__94);
				setState(391);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemdurperContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public ItemdurperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemdurper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterItemdurper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitItemdurper(this);
		}
	}

	public final ItemdurperContext itemdurper() throws RecognitionException {
		ItemdurperContext _localctx = new ItemdurperContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_itemdurper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(T__95);
			setState(395);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemspaceContext extends ParserRuleContext {
		public ItemspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemspace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterItemspace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitItemspace(this);
		}
	}

	public final ItemspaceContext itemspace() throws RecognitionException {
		ItemspaceContext _localctx = new ItemspaceContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_itemspace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (T__96 - 97)) | (1L << (T__97 - 97)) | (1L << (T__98 - 97)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JobContext extends ParserRuleContext {
		public JobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_job; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterJob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitJob(this);
		}
	}

	public final JobContext job() throws RecognitionException {
		JobContext _localctx = new JobContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_job);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_la = _input.LA(1);
			if ( !(_la==T__99 || _la==T__100) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JobancestryContext extends ParserRuleContext {
		public JobancestryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobancestry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterJobancestry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitJobancestry(this);
		}
	}

	public final JobancestryContext jobancestry() throws RecognitionException {
		JobancestryContext _localctx = new JobancestryContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_jobancestry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_la = _input.LA(1);
			if ( !(_la==T__101 || _la==T__102) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JobrankContext extends ParserRuleContext {
		public JobrankContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobrank; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterJobrank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitJobrank(this);
		}
	}

	public final JobrankContext jobrank() throws RecognitionException {
		JobrankContext _localctx = new JobrankContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_jobrank);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_la = _input.LA(1);
			if ( !(_la==T__103 || _la==T__104) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KilldrugdishContext extends ParserRuleContext {
		public KilldrugdishContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killdrugdish; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKilldrugdish(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKilldrugdish(this);
		}
	}

	public final KilldrugdishContext killdrugdish() throws RecognitionException {
		KilldrugdishContext _localctx = new KilldrugdishContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_killdrugdish);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(T__105);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KillitemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public KillitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKillitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKillitem(this);
		}
	}

	public final KillitemContext killitem() throws RecognitionException {
		KillitemContext _localctx = new KillitemContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_killitem);
		try {
			setState(412);
			switch (_input.LA(1)) {
			case T__106:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(T__106);
				}
				break;
			case T__107:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(T__107);
				}
				break;
			case T__108:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				match(T__108);
				}
				break;
			case T__109:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				match(T__109);
				setState(411);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KillitemallContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public KillitemallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killitemall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKillitemall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKillitemall(this);
		}
	}

	public final KillitemallContext killitemall() throws RecognitionException {
		KillitemallContext _localctx = new KillitemallContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_killitemall);
		try {
			setState(422);
			switch (_input.LA(1)) {
			case T__110:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(T__110);
				}
				break;
			case T__111:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				match(T__111);
				}
				break;
			case T__112:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				match(T__112);
				}
				break;
			case T__113:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				match(T__113);
				}
				break;
			case T__114:
				enterOuterAlt(_localctx, 5);
				{
				setState(418);
				match(T__114);
				}
				break;
			case T__115:
				enterOuterAlt(_localctx, 6);
				{
				setState(419);
				match(T__115);
				}
				break;
			case T__116:
				enterOuterAlt(_localctx, 7);
				{
				setState(420);
				match(T__116);
				setState(421);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Killleak0itemContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public Killleak0itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killleak0item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKillleak0item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKillleak0item(this);
		}
	}

	public final Killleak0itemContext killleak0item() throws RecognitionException {
		Killleak0itemContext _localctx = new Killleak0itemContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_killleak0item);
		try {
			setState(429);
			switch (_input.LA(1)) {
			case T__117:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(T__117);
				}
				break;
			case T__118:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(T__118);
				}
				break;
			case T__119:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(T__119);
				setState(427);
				match(INT);
				setState(428);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Killleak1itemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public Killleak1itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killleak1item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKillleak1item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKillleak1item(this);
		}
	}

	public final Killleak1itemContext killleak1item() throws RecognitionException {
		Killleak1itemContext _localctx = new Killleak1itemContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_killleak1item);
		try {
			setState(434);
			switch (_input.LA(1)) {
			case T__120:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(T__120);
				}
				break;
			case T__121:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(T__121);
				setState(433);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KillpetContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public KillpetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killpet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKillpet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKillpet(this);
		}
	}

	public final KillpetContext killpet() throws RecognitionException {
		KillpetContext _localctx = new KillpetContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_killpet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(T__122);
			setState(437);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KillpethContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public KillpethContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killpeth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKillpeth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKillpeth(this);
		}
	}

	public final KillpethContext killpeth() throws RecognitionException {
		KillpethContext _localctx = new KillpethContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_killpeth);
		try {
			setState(444);
			switch (_input.LA(1)) {
			case T__123:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(T__123);
				}
				break;
			case T__124:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				match(T__124);
				}
				break;
			case T__125:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				match(T__125);
				setState(442);
				match(INT);
				setState(443);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KillpetlContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public KillpetlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killpetl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKillpetl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKillpetl(this);
		}
	}

	public final KillpetlContext killpetl() throws RecognitionException {
		KillpetlContext _localctx = new KillpetlContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_killpetl);
		try {
			setState(451);
			switch (_input.LA(1)) {
			case T__126:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(T__126);
				}
				break;
			case T__127:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(T__127);
				}
				break;
			case T__128:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				match(T__128);
				setState(449);
				match(INT);
				setState(450);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeavegroupContext extends ParserRuleContext {
		public LeavegroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leavegroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterLeavegroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitLeavegroup(this);
		}
	}

	public final LeavegroupContext leavegroup() throws RecognitionException {
		LeavegroupContext _localctx = new LeavegroupContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_leavegroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_la = _input.LA(1);
			if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (T__129 - 130)) | (1L << (T__130 - 130)) | (1L << (T__131 - 130)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelContext extends ParserRuleContext {
		public LevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitLevel(this);
		}
	}

	public final LevelContext level() throws RecognitionException {
		LevelContext _localctx = new LevelContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_level);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if ( !(_la==T__132 || _la==T__133) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalcountContext extends ParserRuleContext {
		public LocalcountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localcount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterLocalcount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitLocalcount(this);
		}
	}

	public final LocalcountContext localcount() throws RecognitionException {
		LocalcountContext _localctx = new LocalcountContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_localcount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if ( !(_la==T__134 || _la==T__135) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalflagContext extends ParserRuleContext {
		public LocalflagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localflag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterLocalflag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitLocalflag(this);
		}
	}

	public final LocalflagContext localflag() throws RecognitionException {
		LocalflagContext _localctx = new LocalflagContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_localflag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !(_la==T__136 || _la==T__137) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LpContext extends ParserRuleContext {
		public LpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterLp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitLp(this);
		}
	}

	public final LpContext lp() throws RecognitionException {
		LpContext _localctx = new LpContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_lp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(T__138);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaxfpContext extends ParserRuleContext {
		public MaxfpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxfp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMaxfp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMaxfp(this);
		}
	}

	public final MaxfpContext maxfp() throws RecognitionException {
		MaxfpContext _localctx = new MaxfpContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_maxfp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(T__139);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaxlpContext extends ParserRuleContext {
		public MaxlpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxlp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMaxlp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMaxlp(this);
		}
	}

	public final MaxlpContext maxlp() throws RecognitionException {
		MaxlpContext _localctx = new MaxlpContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_maxlp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(T__140);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMessage(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_message);
		try {
			setState(470);
			switch (_input.LA(1)) {
			case T__141:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(T__141);
				}
				break;
			case T__142:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(T__142);
				setState(469);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetamocountContext extends ParserRuleContext {
		public MetamocountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metamocount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMetamocount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMetamocount(this);
		}
	}

	public final MetamocountContext metamocount() throws RecognitionException {
		MetamocountContext _localctx = new MetamocountContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_metamocount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(T__143);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NextContext extends ParserRuleContext {
		public NextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitNext(this);
		}
	}

	public final NextContext next() throws RecognitionException {
		NextContext _localctx = new NextContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_next);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !(_la==T__144 || _la==T__145) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoContext extends ParserRuleContext {
		public NoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitNo(this);
		}
	}

	public final NoContext no() throws RecognitionException {
		NoContext _localctx = new NoContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_no);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_la = _input.LA(1);
			if ( !(_la==T__146 || _la==T__147) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoweventContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public NoweventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nowevent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterNowevent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitNowevent(this);
		}
	}

	public final NoweventContext nowevent() throws RecognitionException {
		NoweventContext _localctx = new NoweventContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_nowevent);
		try {
			setState(482);
			switch (_input.LA(1)) {
			case T__148:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(T__148);
				}
				break;
			case T__149:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				match(T__149);
				}
				break;
			case T__150:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				match(T__150);
				setState(481);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NowtimeContext extends ParserRuleContext {
		public NowtimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nowtime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterNowtime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitNowtime(this);
		}
	}

	public final NowtimeContext nowtime() throws RecognitionException {
		NowtimeContext _localctx = new NowtimeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_nowtime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_la = _input.LA(1);
			if ( !(((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (T__151 - 152)) | (1L << (T__152 - 152)) | (1L << (T__153 - 152)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OkContext extends ParserRuleContext {
		public OkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterOk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitOk(this);
		}
	}

	public final OkContext ok() throws RecognitionException {
		OkContext _localctx = new OkContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_ok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(T__154);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PequipitemContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public PequipitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pequipitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterPequipitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitPequipitem(this);
		}
	}

	public final PequipitemContext pequipitem() throws RecognitionException {
		PequipitemContext _localctx = new PequipitemContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_pequipitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(T__155);
			setState(489);
			match(INT);
			setState(490);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PetlevelContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public PetlevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_petlevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterPetlevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitPetlevel(this);
		}
	}

	public final PetlevelContext petlevel() throws RecognitionException {
		PetlevelContext _localctx = new PetlevelContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_petlevel);
		try {
			setState(496);
			switch (_input.LA(1)) {
			case T__156:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				match(T__156);
				}
				break;
			case T__157:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				match(T__157);
				}
				break;
			case T__158:
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
				match(T__158);
				setState(495);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PetspaceContext extends ParserRuleContext {
		public PetspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_petspace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterPetspace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitPetspace(this);
		}
	}

	public final PetspaceContext petspace() throws RecognitionException {
		PetspaceContext _localctx = new PetspaceContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_petspace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !(((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (T__159 - 160)) | (1L << (T__160 - 160)) | (1L << (T__161 - 160)) | (1L << (T__162 - 160)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PhitemContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public PhitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterPhitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitPhitem(this);
		}
	}

	public final PhitemContext phitem() throws RecognitionException {
		PhitemContext _localctx = new PhitemContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_phitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(T__163);
			setState(501);
			match(INT);
			setState(502);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlayseContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public PlayseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterPlayse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitPlayse(this);
		}
	}

	public final PlayseContext playse() throws RecognitionException {
		PlayseContext _localctx = new PlayseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_playse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(T__164);
			setState(505);
			match(INT);
			setState(506);
			match(INT);
			setState(507);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RandomContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public RandomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_random; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterRandom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitRandom(this);
		}
	}

	public final RandomContext random() throws RecognitionException {
		RandomContext _localctx = new RandomContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_random);
		try {
			setState(513);
			switch (_input.LA(1)) {
			case T__165:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(T__165);
				}
				break;
			case T__166:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(T__166);
				setState(511);
				match(INT);
				setState(512);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetactionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public SetactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetaction(this);
		}
	}

	public final SetactionContext setaction() throws RecognitionException {
		SetactionContext _localctx = new SetactionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_setaction);
		try {
			setState(519);
			switch (_input.LA(1)) {
			case T__167:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(T__167);
				}
				break;
			case T__168:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(T__168);
				}
				break;
			case T__169:
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				match(T__169);
				setState(518);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetcharmContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public SetcharmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setcharm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetcharm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetcharm(this);
		}
	}

	public final SetcharmContext setcharm() throws RecognitionException {
		SetcharmContext _localctx = new SetcharmContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_setcharm);
		try {
			setState(524);
			switch (_input.LA(1)) {
			case T__170:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				match(T__170);
				}
				break;
			case T__171:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				match(T__171);
				setState(523);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetdurContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public SetdurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setdur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetdur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetdur(this);
		}
	}

	public final SetdurContext setdur() throws RecognitionException {
		SetdurContext _localctx = new SetdurContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_setdur);
		try {
			setState(531);
			switch (_input.LA(1)) {
			case T__172:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				match(T__172);
				}
				break;
			case T__173:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				match(T__173);
				}
				break;
			case T__174:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				match(T__174);
				setState(529);
				match(INT);
				setState(530);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetfeverflgContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public SetfeverflgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setfeverflg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetfeverflg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetfeverflg(this);
		}
	}

	public final SetfeverflgContext setfeverflg() throws RecognitionException {
		SetfeverflgContext _localctx = new SetfeverflgContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_setfeverflg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(T__175);
			setState(534);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SethouseContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public SethouseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sethouse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSethouse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSethouse(this);
		}
	}

	public final SethouseContext sethouse() throws RecognitionException {
		SethouseContext _localctx = new SethouseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_sethouse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(T__176);
			setState(537);
			match(INT);
			setState(538);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SethouselimitContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public SethouselimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sethouselimit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSethouselimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSethouselimit(this);
		}
	}

	public final SethouselimitContext sethouselimit() throws RecognitionException {
		SethouselimitContext _localctx = new SethouselimitContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_sethouselimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(T__177);
			setState(541);
			match(INT);
			setState(542);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetlevelContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public SetlevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setlevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetlevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetlevel(this);
		}
	}

	public final SetlevelContext setlevel() throws RecognitionException {
		SetlevelContext _localctx = new SetlevelContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_setlevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(T__178);
			setState(545);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetloginpointContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public SetloginpointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setloginpoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetloginpoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetloginpoint(this);
		}
	}

	public final SetloginpointContext setloginpoint() throws RecognitionException {
		SetloginpointContext _localctx = new SetloginpointContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_setloginpoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(T__179);
			setState(548);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetlpContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public SetlpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setlp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetlp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetlp(this);
		}
	}

	public final SetlpContext setlp() throws RecognitionException {
		SetlpContext _localctx = new SetlpContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_setlp);
		try {
			setState(553);
			switch (_input.LA(1)) {
			case T__180:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				match(T__180);
				}
				break;
			case T__181:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				match(T__181);
				setState(552);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetobjectContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public SetobjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setobject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetobject(this);
		}
	}

	public final SetobjectContext setobject() throws RecognitionException {
		SetobjectContext _localctx = new SetobjectContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_setobject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(T__182);
			setState(556);
			match(INT);
			setState(557);
			match(INT);
			setState(558);
			match(INT);
			setState(559);
			match(INT);
			setState(560);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetvisitorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public SetvisitorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setvisitor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetvisitor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetvisitor(this);
		}
	}

	public final SetvisitorContext setvisitor() throws RecognitionException {
		SetvisitorContext _localctx = new SetvisitorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_setvisitor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(T__183);
			setState(563);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapenextContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public ShapenextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapenext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterShapenext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitShapenext(this);
		}
	}

	public final ShapenextContext shapenext() throws RecognitionException {
		ShapenextContext _localctx = new ShapenextContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_shapenext);
		try {
			setState(568);
			switch (_input.LA(1)) {
			case T__184:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(T__184);
				}
				break;
			case T__185:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(T__185);
				setState(567);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShipchardownContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public ShipchardownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shipchardown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterShipchardown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitShipchardown(this);
		}
	}

	public final ShipchardownContext shipchardown() throws RecognitionException {
		ShipchardownContext _localctx = new ShipchardownContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_shipchardown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(T__186);
			setState(571);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShipchartakeContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public ShipchartakeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shipchartake; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterShipchartake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitShipchartake(this);
		}
	}

	public final ShipchartakeContext shipchartake() throws RecognitionException {
		ShipchartakeContext _localctx = new ShipchartakeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_shipchartake);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(T__187);
			setState(574);
			match(INT);
			setState(575);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShipgetstoptimeContext extends ParserRuleContext {
		public ShipgetstoptimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shipgetstoptime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterShipgetstoptime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitShipgetstoptime(this);
		}
	}

	public final ShipgetstoptimeContext shipgetstoptime() throws RecognitionException {
		ShipgetstoptimeContext _localctx = new ShipgetstoptimeContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_shipgetstoptime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(T__188);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkilllevelContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public SkilllevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skilllevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSkilllevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSkilllevel(this);
		}
	}

	public final SkilllevelContext skilllevel() throws RecognitionException {
		SkilllevelContext _localctx = new SkilllevelContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_skilllevel);
		try {
			setState(583);
			switch (_input.LA(1)) {
			case T__189:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(T__189);
				}
				break;
			case T__190:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				match(T__190);
				}
				break;
			case T__191:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				match(T__191);
				setState(582);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StackitemspaceContext extends ParserRuleContext {
		public StackitemspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackitemspace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterStackitemspace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitStackitemspace(this);
		}
	}

	public final StackitemspaceContext stackitemspace() throws RecognitionException {
		StackitemspaceContext _localctx = new StackitemspaceContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_stackitemspace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(T__192);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrcmpchatContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public StrcmpchatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strcmpchat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterStrcmpchat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitStrcmpchat(this);
		}
	}

	public final StrcmpchatContext strcmpchat() throws RecognitionException {
		StrcmpchatContext _localctx = new StrcmpchatContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_strcmpchat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_la = _input.LA(1);
			if ( !(_la==T__193 || _la==T__194) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(588);
			_la = _input.LA(1);
			if ( !(_la==ASSIGNEQUAL || _la==EQUAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(589);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrstrchatContext extends ParserRuleContext {
		public StrstrchatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strstrchat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterStrstrchat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitStrstrchat(this);
		}
	}

	public final StrstrchatContext strstrchat() throws RecognitionException {
		StrstrchatContext _localctx = new StrstrchatContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_strstrchat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(T__195);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemmessageContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public SystemmessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemmessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSystemmessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSystemmessage(this);
		}
	}

	public final SystemmessageContext systemmessage() throws RecognitionException {
		SystemmessageContext _localctx = new SystemmessageContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_systemmessage);
		try {
			setState(596);
			switch (_input.LA(1)) {
			case T__196:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				match(T__196);
				}
				break;
			case T__197:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				match(T__197);
				setState(595);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrueimageContext extends ParserRuleContext {
		public TrueimageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueimage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterTrueimage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitTrueimage(this);
		}
	}

	public final TrueimageContext trueimage() throws RecognitionException {
		TrueimageContext _localctx = new TrueimageContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_trueimage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(T__198);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WarpContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(GMSVParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GMSVParser.STRING, i);
		}
		public WarpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_warp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterWarp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitWarp(this);
		}
	}

	public final WarpContext warp() throws RecognitionException {
		WarpContext _localctx = new WarpContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_warp);
		try {
			setState(605);
			switch (_input.LA(1)) {
			case T__199:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				match(T__199);
				}
				break;
			case T__200:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				match(T__200);
				setState(602);
				match(STRING);
				setState(603);
				match(STRING);
				setState(604);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_noContext extends ParserRuleContext {
		public Window_noContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_no; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterWindow_no(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitWindow_no(this);
		}
	}

	public final Window_noContext window_no() throws RecognitionException {
		Window_noContext _localctx = new Window_noContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_window_no);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_la = _input.LA(1);
			if ( !(((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (T__201 - 202)) | (1L << (T__202 - 202)) | (1L << (T__203 - 202)) | (1L << (T__204 - 202)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_okContext extends ParserRuleContext {
		public Window_okContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_ok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterWindow_ok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitWindow_ok(this);
		}
	}

	public final Window_okContext window_ok() throws RecognitionException {
		Window_okContext _localctx = new Window_okContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_window_ok);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_la = _input.LA(1);
			if ( !(((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (T__205 - 206)) | (1L << (T__206 - 206)) | (1L << (T__207 - 206)) | (1L << (T__208 - 206)) | (1L << (T__209 - 206)) | (1L << (T__210 - 206)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_yesContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(GMSVParser.BOOLEAN, 0); }
		public Window_yesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_yes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterWindow_yes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitWindow_yes(this);
		}
	}

	public final Window_yesContext window_yes() throws RecognitionException {
		Window_yesContext _localctx = new Window_yesContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_window_yes);
		try {
			setState(617);
			switch (_input.LA(1)) {
			case T__211:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				match(T__211);
				}
				break;
			case T__212:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				match(T__212);
				}
				break;
			case T__213:
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				match(T__213);
				}
				break;
			case T__214:
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				match(T__214);
				}
				break;
			case T__215:
				enterOuterAlt(_localctx, 5);
				{
				setState(615);
				match(T__215);
				setState(616);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XposContext extends ParserRuleContext {
		public XposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xpos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterXpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitXpos(this);
		}
	}

	public final XposContext xpos() throws RecognitionException {
		XposContext _localctx = new XposContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_xpos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_la = _input.LA(1);
			if ( !(((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (T__216 - 217)) | (1L << (T__217 - 217)) | (1L << (T__218 - 217)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YesContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(GMSVParser.BOOLEAN, 0); }
		public YesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterYes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitYes(this);
		}
	}

	public final YesContext yes() throws RecognitionException {
		YesContext _localctx = new YesContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_yes);
		try {
			setState(624);
			switch (_input.LA(1)) {
			case T__219:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				match(T__219);
				}
				break;
			case T__220:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				match(T__220);
				setState(623);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0106\u0275\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\5\3\u00dc\n\3\3\4\3\4\3\4\3\4\5\4\u00e2\n\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00fc\n\f\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\5\21\u010a\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0111\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011b\n"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\5"+
		"\30\u012a\n\30\3\31\3\31\3\31\3\31\5\31\u0130\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u013a\n\32\3\33\3\33\3\33\3\33\5\33\u0140\n"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0148\n\34\3\35\3\35\3\35\3\35"+
		"\5\35\u014e\n\35\3\36\3\36\3\36\3\36\5\36\u0154\n\36\3\37\3\37\3\37\3"+
		"\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3"+
		"(\3(\3(\3)\3)\3)\3)\5)\u0175\n)\3*\3*\3*\3+\3+\3,\3,\3,\3,\5,\u0180\n"+
		",\3-\3-\3-\3-\5-\u0186\n-\3.\3.\3.\5.\u018b\n.\3/\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65\u019f"+
		"\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01a9\n\66\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u01b0\n\67\38\38\38\58\u01b5\n8\39\39\39\3:\3:\3"+
		":\3:\3:\5:\u01bf\n:\3;\3;\3;\3;\3;\5;\u01c6\n;\3<\3<\3=\3=\3>\3>\3?\3"+
		"?\3@\3@\3A\3A\3B\3B\3C\3C\3C\5C\u01d9\nC\3D\3D\3E\3E\3F\3F\3G\3G\3G\3"+
		"G\5G\u01e5\nG\3H\3H\3I\3I\3J\3J\3J\3J\3K\3K\3K\3K\5K\u01f3\nK\3L\3L\3"+
		"M\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\3O\3O\5O\u0204\nO\3P\3P\3P\3P\5P\u020a"+
		"\nP\3Q\3Q\3Q\5Q\u020f\nQ\3R\3R\3R\3R\3R\5R\u0216\nR\3S\3S\3S\3T\3T\3T"+
		"\3T\3U\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X\5X\u022c\nX\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\5[\u023b\n[\3\\\3\\\3\\\3]\3]\3]\3]\3^\3^\3_"+
		"\3_\3_\3_\5_\u024a\n_\3`\3`\3a\3a\3a\3a\3b\3b\3c\3c\3c\5c\u0257\nc\3d"+
		"\3d\3e\3e\3e\3e\3e\5e\u0260\ne\3f\3f\3g\3g\3h\3h\3h\3h\3h\3h\5h\u026c"+
		"\nh\3i\3i\3j\3j\3j\5j\u0273\nj\3j\2\2k\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\2\34\3\2\r\16\3\2\17\21\3\2\26\27\3\2\32"+
		"\34\3\2+,\3\2IK\3\2LM\3\2NO\3\2PQ\3\2ce\3\2fg\3\2hi\3\2jk\3\2\u0084\u0086"+
		"\3\2\u0087\u0088\3\2\u0089\u008a\3\2\u008b\u008c\3\2\u0093\u0094\3\2\u0095"+
		"\u0096\3\2\u009a\u009c\3\2\u00a2\u00a5\3\2\u00c4\u00c5\4\2\u00f1\u00f1"+
		"\u0106\u0106\3\2\u00cc\u00cf\3\2\u00d0\u00d5\3\2\u00db\u00dd\u0258\2\u00d4"+
		"\3\2\2\2\4\u00db\3\2\2\2\6\u00e1\3\2\2\2\b\u00e3\3\2\2\2\n\u00e5\3\2\2"+
		"\2\f\u00e9\3\2\2\2\16\u00eb\3\2\2\2\20\u00ef\3\2\2\2\22\u00f1\3\2\2\2"+
		"\24\u00f3\3\2\2\2\26\u00fb\3\2\2\2\30\u00fd\3\2\2\2\32\u00ff\3\2\2\2\34"+
		"\u0102\3\2\2\2\36\u0104\3\2\2\2 \u0109\3\2\2\2\"\u0110\3\2\2\2$\u011a"+
		"\3\2\2\2&\u011c\3\2\2\2(\u011f\3\2\2\2*\u0121\3\2\2\2,\u0123\3\2\2\2."+
		"\u0129\3\2\2\2\60\u012f\3\2\2\2\62\u0139\3\2\2\2\64\u013f\3\2\2\2\66\u0147"+
		"\3\2\2\28\u014d\3\2\2\2:\u0153\3\2\2\2<\u0155\3\2\2\2>\u0159\3\2\2\2@"+
		"\u015b\3\2\2\2B\u015f\3\2\2\2D\u0161\3\2\2\2F\u0163\3\2\2\2H\u0165\3\2"+
		"\2\2J\u0167\3\2\2\2L\u016a\3\2\2\2N\u016d\3\2\2\2P\u0174\3\2\2\2R\u0176"+
		"\3\2\2\2T\u0179\3\2\2\2V\u017f\3\2\2\2X\u0185\3\2\2\2Z\u018a\3\2\2\2\\"+
		"\u018c\3\2\2\2^\u018f\3\2\2\2`\u0191\3\2\2\2b\u0193\3\2\2\2d\u0195\3\2"+
		"\2\2f\u0197\3\2\2\2h\u019e\3\2\2\2j\u01a8\3\2\2\2l\u01af\3\2\2\2n\u01b4"+
		"\3\2\2\2p\u01b6\3\2\2\2r\u01be\3\2\2\2t\u01c5\3\2\2\2v\u01c7\3\2\2\2x"+
		"\u01c9\3\2\2\2z\u01cb\3\2\2\2|\u01cd\3\2\2\2~\u01cf\3\2\2\2\u0080\u01d1"+
		"\3\2\2\2\u0082\u01d3\3\2\2\2\u0084\u01d8\3\2\2\2\u0086\u01da\3\2\2\2\u0088"+
		"\u01dc\3\2\2\2\u008a\u01de\3\2\2\2\u008c\u01e4\3\2\2\2\u008e\u01e6\3\2"+
		"\2\2\u0090\u01e8\3\2\2\2\u0092\u01ea\3\2\2\2\u0094\u01f2\3\2\2\2\u0096"+
		"\u01f4\3\2\2\2\u0098\u01f6\3\2\2\2\u009a\u01fa\3\2\2\2\u009c\u0203\3\2"+
		"\2\2\u009e\u0209\3\2\2\2\u00a0\u020e\3\2\2\2\u00a2\u0215\3\2\2\2\u00a4"+
		"\u0217\3\2\2\2\u00a6\u021a\3\2\2\2\u00a8\u021e\3\2\2\2\u00aa\u0222\3\2"+
		"\2\2\u00ac\u0225\3\2\2\2\u00ae\u022b\3\2\2\2\u00b0\u022d\3\2\2\2\u00b2"+
		"\u0234\3\2\2\2\u00b4\u023a\3\2\2\2\u00b6\u023c\3\2\2\2\u00b8\u023f\3\2"+
		"\2\2\u00ba\u0243\3\2\2\2\u00bc\u0249\3\2\2\2\u00be\u024b\3\2\2\2\u00c0"+
		"\u024d\3\2\2\2\u00c2\u0251\3\2\2\2\u00c4\u0256\3\2\2\2\u00c6\u0258\3\2"+
		"\2\2\u00c8\u025f\3\2\2\2\u00ca\u0261\3\2\2\2\u00cc\u0263\3\2\2\2\u00ce"+
		"\u026b\3\2\2\2\u00d0\u026d\3\2\2\2\u00d2\u0272\3\2\2\2\u00d4\u00d5\7\u00e4"+
		"\2\2\u00d5\u00d6\7\u00e3\2\2\u00d6\3\3\2\2\2\u00d7\u00dc\7\3\2\2\u00d8"+
		"\u00dc\7\4\2\2\u00d9\u00da\7\5\2\2\u00da\u00dc\7\u00e0\2\2\u00db\u00d7"+
		"\3\2\2\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\5\3\2\2\2\u00dd"+
		"\u00e2\7\6\2\2\u00de\u00e2\7\7\2\2\u00df\u00e0\7\b\2\2\u00e0\u00e2\7\u00e0"+
		"\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\7\3\2\2\2\u00e3\u00e4\7\t\2\2\u00e4\t\3\2\2\2\u00e5\u00e6\7\n\2\2\u00e6"+
		"\u00e7\7\u00e5\2\2\u00e7\u00e8\7\u00e5\2\2\u00e8\13\3\2\2\2\u00e9\u00ea"+
		"\7\13\2\2\u00ea\r\3\2\2\2\u00eb\u00ec\7\f\2\2\u00ec\u00ed\7\u00e5\2\2"+
		"\u00ed\u00ee\7\u00e5\2\2\u00ee\17\3\2\2\2\u00ef\u00f0\t\2\2\2\u00f0\21"+
		"\3\2\2\2\u00f1\u00f2\t\3\2\2\u00f2\23\3\2\2\2\u00f3\u00f4\7\22\2\2\u00f4"+
		"\u00f5\7\u00e1\2\2\u00f5\25\3\2\2\2\u00f6\u00fc\7\23\2\2\u00f7\u00fc\7"+
		"\24\2\2\u00f8\u00f9\7\25\2\2\u00f9\u00fa\7\u00e5\2\2\u00fa\u00fc\7\u00e5"+
		"\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fc"+
		"\27\3\2\2\2\u00fd\u00fe\t\4\2\2\u00fe\31\3\2\2\2\u00ff\u0100\7\30\2\2"+
		"\u0100\u0101\7\u00e0\2\2\u0101\33\3\2\2\2\u0102\u0103\7\31\2\2\u0103\35"+
		"\3\2\2\2\u0104\u0105\t\5\2\2\u0105\37\3\2\2\2\u0106\u010a\7\35\2\2\u0107"+
		"\u0108\7\36\2\2\u0108\u010a\7\u00e0\2\2\u0109\u0106\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u010a!\3\2\2\2\u010b\u0111\7\37\2\2\u010c\u0111\7 \2\2\u010d"+
		"\u010e\7!\2\2\u010e\u010f\7\u00e5\2\2\u010f\u0111\7\u00e5\2\2\u0110\u010b"+
		"\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u010d\3\2\2\2\u0111#\3\2\2\2\u0112"+
		"\u011b\7\"\2\2\u0113\u011b\7#\2\2\u0114\u011b\7$\2\2\u0115\u011b\7%\2"+
		"\2\u0116\u011b\7&\2\2\u0117\u0118\7\'\2\2\u0118\u0119\7\u00e0\2\2\u0119"+
		"\u011b\7\u00e0\2\2\u011a\u0112\3\2\2\2\u011a\u0113\3\2\2\2\u011a\u0114"+
		"\3\2\2\2\u011a\u0115\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u0117\3\2\2\2\u011b"+
		"%\3\2\2\2\u011c\u011d\7(\2\2\u011d\u011e\7\u00e5\2\2\u011e\'\3\2\2\2\u011f"+
		"\u0120\7)\2\2\u0120)\3\2\2\2\u0121\u0122\7*\2\2\u0122+\3\2\2\2\u0123\u0124"+
		"\t\6\2\2\u0124-\3\2\2\2\u0125\u012a\7-\2\2\u0126\u012a\7.\2\2\u0127\u0128"+
		"\7/\2\2\u0128\u012a\7\u00e0\2\2\u0129\u0125\3\2\2\2\u0129\u0126\3\2\2"+
		"\2\u0129\u0127\3\2\2\2\u012a/\3\2\2\2\u012b\u0130\7\60\2\2\u012c\u012d"+
		"\7\61\2\2\u012d\u012e\7\u00e0\2\2\u012e\u0130\7\u00e0\2\2\u012f\u012b"+
		"\3\2\2\2\u012f\u012c\3\2\2\2\u0130\61\3\2\2\2\u0131\u013a\7\62\2\2\u0132"+
		"\u013a\7\63\2\2\u0133\u013a\7\64\2\2\u0134\u013a\7\65\2\2\u0135\u013a"+
		"\7\66\2\2\u0136\u0137\7\67\2\2\u0137\u0138\7\u00e5\2\2\u0138\u013a\7\u00e5"+
		"\2\2\u0139\u0131\3\2\2\2\u0139\u0132\3\2\2\2\u0139\u0133\3\2\2\2\u0139"+
		"\u0134\3\2\2\2\u0139\u0135\3\2\2\2\u0139\u0136\3\2\2\2\u013a\63\3\2\2"+
		"\2\u013b\u0140\78\2\2\u013c\u0140\79\2\2\u013d\u013e\7:\2\2\u013e\u0140"+
		"\7\u00e5\2\2\u013f\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2"+
		"\2\u0140\65\3\2\2\2\u0141\u0148\7;\2\2\u0142\u0148\7<\2\2\u0143\u0148"+
		"\7=\2\2\u0144\u0148\7>\2\2\u0145\u0146\7?\2\2\u0146\u0148\7\u00e5\2\2"+
		"\u0147\u0141\3\2\2\2\u0147\u0142\3\2\2\2\u0147\u0143\3\2\2\2\u0147\u0144"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0148\67\3\2\2\2\u0149\u014e\7@\2\2\u014a"+
		"\u014e\7A\2\2\u014b\u014c\7B\2\2\u014c\u014e\7\u00e5\2\2\u014d\u0149\3"+
		"\2\2\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014e9\3\2\2\2\u014f\u0154"+
		"\7C\2\2\u0150\u0154\7D\2\2\u0151\u0152\7E\2\2\u0152\u0154\7\u00e5\2\2"+
		"\u0153\u014f\3\2\2\2\u0153\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0154;\3"+
		"\2\2\2\u0155\u0156\7F\2\2\u0156\u0157\7\u00e5\2\2\u0157\u0158\7\u00e5"+
		"\2\2\u0158=\3\2\2\2\u0159\u015a\7G\2\2\u015a?\3\2\2\2\u015b\u015c\7H\2"+
		"\2\u015c\u015d\7\u00e0\2\2\u015d\u015e\7\u00e5\2\2\u015eA\3\2\2\2\u015f"+
		"\u0160\t\7\2\2\u0160C\3\2\2\2\u0161\u0162\t\b\2\2\u0162E\3\2\2\2\u0163"+
		"\u0164\t\t\2\2\u0164G\3\2\2\2\u0165\u0166\t\n\2\2\u0166I\3\2\2\2\u0167"+
		"\u0168\7R\2\2\u0168\u0169\7\u00e5\2\2\u0169K\3\2\2\2\u016a\u016b\7S\2"+
		"\2\u016b\u016c\7\u00e5\2\2\u016cM\3\2\2\2\u016d\u016e\7T\2\2\u016e\u016f"+
		"\7\u00e5\2\2\u016fO\3\2\2\2\u0170\u0175\7U\2\2\u0171\u0175\7V\2\2\u0172"+
		"\u0173\7W\2\2\u0173\u0175\7\u00e5\2\2\u0174\u0170\3\2\2\2\u0174\u0171"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0175Q\3\2\2\2\u0176\u0177\7X\2\2\u0177\u0178"+
		"\7\u00e5\2\2\u0178S\3\2\2\2\u0179\u017a\7Y\2\2\u017aU\3\2\2\2\u017b\u0180"+
		"\7Z\2\2\u017c\u0180\7[\2\2\u017d\u017e\7\\\2\2\u017e\u0180\7\u00e5\2\2"+
		"\u017f\u017b\3\2\2\2\u017f\u017c\3\2\2\2\u017f\u017d\3\2\2\2\u0180W\3"+
		"\2\2\2\u0181\u0186\7]\2\2\u0182\u0186\7^\2\2\u0183\u0184\7_\2\2\u0184"+
		"\u0186\7\u00e5\2\2\u0185\u0181\3\2\2\2\u0185\u0182\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0186Y\3\2\2\2\u0187\u018b\7`\2\2\u0188\u0189\7a\2\2\u0189\u018b"+
		"\7\u00e5\2\2\u018a\u0187\3\2\2\2\u018a\u0188\3\2\2\2\u018b[\3\2\2\2\u018c"+
		"\u018d\7b\2\2\u018d\u018e\7\u00e5\2\2\u018e]\3\2\2\2\u018f\u0190\t\13"+
		"\2\2\u0190_\3\2\2\2\u0191\u0192\t\f\2\2\u0192a\3\2\2\2\u0193\u0194\t\r"+
		"\2\2\u0194c\3\2\2\2\u0195\u0196\t\16\2\2\u0196e\3\2\2\2\u0197\u0198\7"+
		"l\2\2\u0198g\3\2\2\2\u0199\u019f\7m\2\2\u019a\u019f\7n\2\2\u019b\u019f"+
		"\7o\2\2\u019c\u019d\7p\2\2\u019d\u019f\7\u00e5\2\2\u019e\u0199\3\2\2\2"+
		"\u019e\u019a\3\2\2\2\u019e\u019b\3\2\2\2\u019e\u019c\3\2\2\2\u019fi\3"+
		"\2\2\2\u01a0\u01a9\7q\2\2\u01a1\u01a9\7r\2\2\u01a2\u01a9\7s\2\2\u01a3"+
		"\u01a9\7t\2\2\u01a4\u01a9\7u\2\2\u01a5\u01a9\7v\2\2\u01a6\u01a7\7w\2\2"+
		"\u01a7\u01a9\7\u00e5\2\2\u01a8\u01a0\3\2\2\2\u01a8\u01a1\3\2\2\2\u01a8"+
		"\u01a2\3\2\2\2\u01a8\u01a3\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a8\u01a5\3\2"+
		"\2\2\u01a8\u01a6\3\2\2\2\u01a9k\3\2\2\2\u01aa\u01b0\7x\2\2\u01ab\u01b0"+
		"\7y\2\2\u01ac\u01ad\7z\2\2\u01ad\u01ae\7\u00e5\2\2\u01ae\u01b0\7\u00e5"+
		"\2\2\u01af\u01aa\3\2\2\2\u01af\u01ab\3\2\2\2\u01af\u01ac\3\2\2\2\u01b0"+
		"m\3\2\2\2\u01b1\u01b5\7{\2\2\u01b2\u01b3\7|\2\2\u01b3\u01b5\7\u00e5\2"+
		"\2\u01b4\u01b1\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5o\3\2\2\2\u01b6\u01b7"+
		"\7}\2\2\u01b7\u01b8\7\u00e5\2\2\u01b8q\3\2\2\2\u01b9\u01bf\7~\2\2\u01ba"+
		"\u01bf\7\177\2\2\u01bb\u01bc\7\u0080\2\2\u01bc\u01bd\7\u00e5\2\2\u01bd"+
		"\u01bf\7\u00e5\2\2\u01be\u01b9\3\2\2\2\u01be\u01ba\3\2\2\2\u01be\u01bb"+
		"\3\2\2\2\u01bfs\3\2\2\2\u01c0\u01c6\7\u0081\2\2\u01c1\u01c6\7\u0082\2"+
		"\2\u01c2\u01c3\7\u0083\2\2\u01c3\u01c4\7\u00e5\2\2\u01c4\u01c6\7\u00e5"+
		"\2\2\u01c5\u01c0\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c6"+
		"u\3\2\2\2\u01c7\u01c8\t\17\2\2\u01c8w\3\2\2\2\u01c9\u01ca\t\20\2\2\u01ca"+
		"y\3\2\2\2\u01cb\u01cc\t\21\2\2\u01cc{\3\2\2\2\u01cd\u01ce\t\22\2\2\u01ce"+
		"}\3\2\2\2\u01cf\u01d0\7\u008d\2\2\u01d0\177\3\2\2\2\u01d1\u01d2\7\u008e"+
		"\2\2\u01d2\u0081\3\2\2\2\u01d3\u01d4\7\u008f\2\2\u01d4\u0083\3\2\2\2\u01d5"+
		"\u01d9\7\u0090\2\2\u01d6\u01d7\7\u0091\2\2\u01d7\u01d9\7\u00e5\2\2\u01d8"+
		"\u01d5\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u0085\3\2\2\2\u01da\u01db\7\u0092"+
		"\2\2\u01db\u0087\3\2\2\2\u01dc\u01dd\t\23\2\2\u01dd\u0089\3\2\2\2\u01de"+
		"\u01df\t\24\2\2\u01df\u008b\3\2\2\2\u01e0\u01e5\7\u0097\2\2\u01e1\u01e5"+
		"\7\u0098\2\2\u01e2\u01e3\7\u0099\2\2\u01e3\u01e5\7\u00e5\2\2\u01e4\u01e0"+
		"\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u008d\3\2\2\2\u01e6"+
		"\u01e7\t\25\2\2\u01e7\u008f\3\2\2\2\u01e8\u01e9\7\u009d\2\2\u01e9\u0091"+
		"\3\2\2\2\u01ea\u01eb\7\u009e\2\2\u01eb\u01ec\7\u00e5\2\2\u01ec\u01ed\7"+
		"\u00e5\2\2\u01ed\u0093\3\2\2\2\u01ee\u01f3\7\u009f\2\2\u01ef\u01f3\7\u00a0"+
		"\2\2\u01f0\u01f1\7\u00a1\2\2\u01f1\u01f3\7\u00e5\2\2\u01f2\u01ee\3\2\2"+
		"\2\u01f2\u01ef\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u0095\3\2\2\2\u01f4\u01f5"+
		"\t\26\2\2\u01f5\u0097\3\2\2\2\u01f6\u01f7\7\u00a6\2\2\u01f7\u01f8\7\u00e5"+
		"\2\2\u01f8\u01f9\7\u00e5\2\2\u01f9\u0099\3\2\2\2\u01fa\u01fb\7\u00a7\2"+
		"\2\u01fb\u01fc\7\u00e5\2\2\u01fc\u01fd\7\u00e5\2\2\u01fd\u01fe\7\u00e5"+
		"\2\2\u01fe\u009b\3\2\2\2\u01ff\u0204\7\u00a8\2\2\u0200\u0201\7\u00a9\2"+
		"\2\u0201\u0202\7\u00e5\2\2\u0202\u0204\7\u00e5\2\2\u0203\u01ff\3\2\2\2"+
		"\u0203\u0200\3\2\2\2\u0204\u009d\3\2\2\2\u0205\u020a\7\u00aa\2\2\u0206"+
		"\u020a\7\u00ab\2\2\u0207\u0208\7\u00ac\2\2\u0208\u020a\7\u00e5\2\2\u0209"+
		"\u0205\3\2\2\2\u0209\u0206\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u009f\3\2"+
		"\2\2\u020b\u020f\7\u00ad\2\2\u020c\u020d\7\u00ae\2\2\u020d\u020f\7\u00e0"+
		"\2\2\u020e\u020b\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u00a1\3\2\2\2\u0210"+
		"\u0216\7\u00af\2\2\u0211\u0216\7\u00b0\2\2\u0212\u0213\7\u00b1\2\2\u0213"+
		"\u0214\7\u00e5\2\2\u0214\u0216\7\u00e0\2\2\u0215\u0210\3\2\2\2\u0215\u0211"+
		"\3\2\2\2\u0215\u0212\3\2\2\2\u0216\u00a3\3\2\2\2\u0217\u0218\7\u00b2\2"+
		"\2\u0218\u0219\7\u00e5\2\2\u0219\u00a5\3\2\2\2\u021a\u021b\7\u00b3\2\2"+
		"\u021b\u021c\7\u00e5\2\2\u021c\u021d\7\u00e5\2\2\u021d\u00a7\3\2\2\2\u021e"+
		"\u021f\7\u00b4\2\2\u021f\u0220\7\u00e5\2\2\u0220\u0221\7\u00e5\2\2\u0221"+
		"\u00a9\3\2\2\2\u0222\u0223\7\u00b5\2\2\u0223\u0224\7\u00e5\2\2\u0224\u00ab"+
		"\3\2\2\2\u0225\u0226\7\u00b6\2\2\u0226\u0227\7\u00e5\2\2\u0227\u00ad\3"+
		"\2\2\2\u0228\u022c\7\u00b7\2\2\u0229\u022a\7\u00b8\2\2\u022a\u022c\7\u00e5"+
		"\2\2\u022b\u0228\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u00af\3\2\2\2\u022d"+
		"\u022e\7\u00b9\2\2\u022e\u022f\7\u00e5\2\2\u022f\u0230\7\u00e5\2\2\u0230"+
		"\u0231\7\u00e5\2\2\u0231\u0232\7\u00e5\2\2\u0232\u0233\7\u00e5\2\2\u0233"+
		"\u00b1\3\2\2\2\u0234\u0235\7\u00ba\2\2\u0235\u0236\7\u00e5\2\2\u0236\u00b3"+
		"\3\2\2\2\u0237\u023b\7\u00bb\2\2\u0238\u0239\7\u00bc\2\2\u0239\u023b\7"+
		"\u00e5\2\2\u023a\u0237\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u00b5\3\2\2\2"+
		"\u023c\u023d\7\u00bd\2\2\u023d\u023e\7\u00e5\2\2\u023e\u00b7\3\2\2\2\u023f"+
		"\u0240\7\u00be\2\2\u0240\u0241\7\u00e5\2\2\u0241\u0242\7\u00e5\2\2\u0242"+
		"\u00b9\3\2\2\2\u0243\u0244\7\u00bf\2\2\u0244\u00bb\3\2\2\2\u0245\u024a"+
		"\7\u00c0\2\2\u0246\u024a\7\u00c1\2\2\u0247\u0248\7\u00c2\2\2\u0248\u024a"+
		"\7\u00e5\2\2\u0249\u0245\3\2\2\2\u0249\u0246\3\2\2\2\u0249\u0247\3\2\2"+
		"\2\u024a\u00bd\3\2\2\2\u024b\u024c\7\u00c3\2\2\u024c\u00bf\3\2\2\2\u024d"+
		"\u024e\t\27\2\2\u024e\u024f\t\30\2\2\u024f\u0250\7\u00e0\2\2\u0250\u00c1"+
		"\3\2\2\2\u0251\u0252\7\u00c6\2\2\u0252\u00c3\3\2\2\2\u0253\u0257\7\u00c7"+
		"\2\2\u0254\u0255\7\u00c8\2\2\u0255\u0257\7\u00e0\2\2\u0256\u0253\3\2\2"+
		"\2\u0256\u0254\3\2\2\2\u0257\u00c5\3\2\2\2\u0258\u0259\7\u00c9\2\2\u0259"+
		"\u00c7\3\2\2\2\u025a\u0260\7\u00ca\2\2\u025b\u025c\7\u00cb\2\2\u025c\u025d"+
		"\7\u00e0\2\2\u025d\u025e\7\u00e0\2\2\u025e\u0260\7\u00e0\2\2\u025f\u025a"+
		"\3\2\2\2\u025f\u025b\3\2\2\2\u0260\u00c9\3\2\2\2\u0261\u0262\t\31\2\2"+
		"\u0262\u00cb\3\2\2\2\u0263\u0264\t\32\2\2\u0264\u00cd\3\2\2\2\u0265\u026c"+
		"\7\u00d6\2\2\u0266\u026c\7\u00d7\2\2\u0267\u026c\7\u00d8\2\2\u0268\u026c"+
		"\7\u00d9\2\2\u0269\u026a\7\u00da\2\2\u026a\u026c\7\u00e1\2\2\u026b\u0265"+
		"\3\2\2\2\u026b\u0266\3\2\2\2\u026b\u0267\3\2\2\2\u026b\u0268\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026c\u00cf\3\2\2\2\u026d\u026e\t\33\2\2\u026e\u00d1\3"+
		"\2\2\2\u026f\u0273\7\u00de\2\2\u0270\u0271\7\u00df\2\2\u0271\u0273\7\u00e1"+
		"\2\2\u0272\u026f\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u00d3\3\2\2\2\'\u00db"+
		"\u00e1\u00fb\u0109\u0110\u011a\u0129\u012f\u0139\u013f\u0147\u014d\u0153"+
		"\u0174\u017f\u0185\u018a\u019e\u01a8\u01af\u01b4\u01be\u01c5\u01d8\u01e4"+
		"\u01f2\u0203\u0209\u020e\u0215\u022b\u023a\u0249\u0256\u025f\u026b\u0272";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}