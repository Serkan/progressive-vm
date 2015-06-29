// Generated from /home/serkan/dev/progressive-vm/src/main/resources/Massive.g4 by ANTLR 4.5
package org.test.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MassiveParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, BOOLEAN_LITERAL=6, STRING_LITERAL=7, 
		NUMBER_LITERAL=8, INTEGER_LITERAL=9, FLOAT_LITERAL=10, LITERAL=11, ARITHMETIC_OPERATOR=12, 
		RELATIONAL_OPERATOR=13, EQUALITY_OPERATOR=14, LOGICAL_OPERATOR=15, INTERNAL_TYPE=16, 
		ID=17, DIGIT=18, LETTER=19, WS=20;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_assign_stat = 2, RULE_return_stat = 3, 
		RULE_exp = 4, RULE_function_call = 5, RULE_operand = 6;
	public static final String[] ruleNames = {
		"program", "stat", "assign_stat", "return_stat", "exp", "function_call", 
		"operand"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'return'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "BOOLEAN_LITERAL", "STRING_LITERAL", 
		"NUMBER_LITERAL", "INTEGER_LITERAL", "FLOAT_LITERAL", "LITERAL", "ARITHMETIC_OPERATOR", 
		"RELATIONAL_OPERATOR", "EQUALITY_OPERATOR", "LOGICAL_OPERATOR", "INTERNAL_TYPE", 
		"ID", "DIGIT", "LETTER", "WS"
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Massive.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MassiveParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14); 
				stat();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==ID );
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

	public static class StatContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Assign_statContext assign_stat() {
			return getRuleContext(Assign_statContext.class,0);
		}
		public Return_statContext return_stat() {
			return getRuleContext(Return_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19); 
				function_call();
				setState(20); 
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22); 
				assign_stat();
				setState(23); 
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25); 
				return_stat();
				setState(26); 
				match(T__0);
				}
				break;
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

	public static class Assign_statContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MassiveParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Assign_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterAssign_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitAssign_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitAssign_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statContext assign_stat() throws RecognitionException {
		Assign_statContext _localctx = new Assign_statContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			match(ID);
			setState(31); 
			match(T__1);
			setState(32); 
			exp(0);
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

	public static class Return_statContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Return_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterReturn_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitReturn_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitReturn_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statContext return_stat() throws RecognitionException {
		Return_statContext _localctx = new Return_statContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_return_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			match(T__2);
			setState(35); 
			exp(0);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Logical_expContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LOGICAL_OPERATOR() { return getToken(MassiveParser.LOGICAL_OPERATOR, 0); }
		public Logical_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterLogical_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitLogical_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitLogical_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Operand_expContext extends ExpContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Operand_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterOperand_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitOperand_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitOperand_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Nested_expContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Nested_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterNested_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitNested_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitNested_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Equality_expContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQUALITY_OPERATOR() { return getToken(MassiveParser.EQUALITY_OPERATOR, 0); }
		public Equality_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterEquality_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitEquality_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitEquality_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Arithmetic_expContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ARITHMETIC_OPERATOR() { return getToken(MassiveParser.ARITHMETIC_OPERATOR, 0); }
		public Arithmetic_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterArithmetic_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitArithmetic_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitArithmetic_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_call_expContext extends ExpContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_call_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterFunction_call_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitFunction_call_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitFunction_call_exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Relational_expContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RELATIONAL_OPERATOR() { return getToken(MassiveParser.RELATIONAL_OPERATOR, 0); }
		public Relational_expContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterRelational_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitRelational_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitRelational_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new Operand_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(38); 
				operand();
				}
				break;
			case 2:
				{
				_localctx = new Function_call_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39); 
				function_call();
				}
				break;
			case 3:
				{
				_localctx = new Nested_expContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40); 
				match(T__3);
				setState(41); 
				exp(0);
				setState(42); 
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(58);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_expContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(46);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(47); 
						match(ARITHMETIC_OPERATOR);
						setState(48); 
						exp(8);
						}
						break;
					case 2:
						{
						_localctx = new Relational_expContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(49);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(50); 
						match(RELATIONAL_OPERATOR);
						setState(51); 
						exp(7);
						}
						break;
					case 3:
						{
						_localctx = new Equality_expContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(52);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(53); 
						match(EQUALITY_OPERATOR);
						setState(54); 
						exp(6);
						}
						break;
					case 4:
						{
						_localctx = new Logical_expContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(55);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(56); 
						match(LOGICAL_OPERATOR);
						setState(57); 
						exp(5);
						}
						break;
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MassiveParser.ID, 0); }
		public TerminalNode INTERNAL_TYPE() { return getToken(MassiveParser.INTERNAL_TYPE, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			match(ID);
			setState(64); 
			match(T__3);
			setState(65); 
			match(INTERNAL_TYPE);
			setState(66); 
			match(T__4);
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

	public static class OperandContext extends ParserRuleContext {
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	 
		public OperandContext() { }
		public void copyFrom(OperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Boolean_literalContext extends OperandContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(MassiveParser.BOOLEAN_LITERAL, 0); }
		public Boolean_literalContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Number_literalContext extends OperandContext {
		public TerminalNode NUMBER_LITERAL() { return getToken(MassiveParser.NUMBER_LITERAL, 0); }
		public Number_literalContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterNumber_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitNumber_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitNumber_literal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Id_operandContext extends OperandContext {
		public TerminalNode ID() { return getToken(MassiveParser.ID, 0); }
		public Id_operandContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterId_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitId_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitId_operand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class String_literalContext extends OperandContext {
		public TerminalNode STRING_LITERAL() { return getToken(MassiveParser.STRING_LITERAL, 0); }
		public String_literalContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MassiveListener ) ((MassiveListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MassiveVisitor ) return ((MassiveVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operand);
		try {
			setState(72);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				_localctx = new String_literalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68); 
				match(STRING_LITERAL);
				}
				break;
			case NUMBER_LITERAL:
				_localctx = new Number_literalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69); 
				match(NUMBER_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new Boolean_literalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70); 
				match(BOOLEAN_LITERAL);
				}
				break;
			case ID:
				_localctx = new Id_operandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(71); 
				match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: 
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: 
			return precpred(_ctx, 7);
		case 1: 
			return precpred(_ctx, 6);
		case 2: 
			return precpred(_ctx, 5);
		case 3: 
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26M\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6/\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\5\bK\n\b\3\b\2\3\n\t\2\4\6\b\n\f\16\2\2Q\2\21\3\2\2\2\4\36"+
		"\3\2\2\2\6 \3\2\2\2\b$\3\2\2\2\n.\3\2\2\2\fA\3\2\2\2\16J\3\2\2\2\20\22"+
		"\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3"+
		"\3\2\2\2\25\26\5\f\7\2\26\27\7\3\2\2\27\37\3\2\2\2\30\31\5\6\4\2\31\32"+
		"\7\3\2\2\32\37\3\2\2\2\33\34\5\b\5\2\34\35\7\3\2\2\35\37\3\2\2\2\36\25"+
		"\3\2\2\2\36\30\3\2\2\2\36\33\3\2\2\2\37\5\3\2\2\2 !\7\23\2\2!\"\7\4\2"+
		"\2\"#\5\n\6\2#\7\3\2\2\2$%\7\5\2\2%&\5\n\6\2&\t\3\2\2\2\'(\b\6\1\2(/\5"+
		"\16\b\2)/\5\f\7\2*+\7\6\2\2+,\5\n\6\2,-\7\7\2\2-/\3\2\2\2.\'\3\2\2\2."+
		")\3\2\2\2.*\3\2\2\2/>\3\2\2\2\60\61\f\t\2\2\61\62\7\16\2\2\62=\5\n\6\n"+
		"\63\64\f\b\2\2\64\65\7\17\2\2\65=\5\n\6\t\66\67\f\7\2\2\678\7\20\2\28"+
		"=\5\n\6\b9:\f\6\2\2:;\7\21\2\2;=\5\n\6\7<\60\3\2\2\2<\63\3\2\2\2<\66\3"+
		"\2\2\2<9\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\13\3\2\2\2@>\3\2\2\2A"+
		"B\7\23\2\2BC\7\6\2\2CD\7\22\2\2DE\7\7\2\2E\r\3\2\2\2FK\7\t\2\2GK\7\n\2"+
		"\2HK\7\b\2\2IK\7\23\2\2JF\3\2\2\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\17\3"+
		"\2\2\2\b\23\36.<>J";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}