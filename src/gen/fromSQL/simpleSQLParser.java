// Generated from C:/Users/tmstr/IdeaProjects/SQL_to_Java/simpleSQL.g4 by ANTLR 4.13.1
package fromSQL;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class simpleSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONSTRAINT=1, AS=2, LPAREN=3, RPAREN=4, COMMA=5, SEMICOLON=6, INT_TYPE=7, 
		VARCHAR=8, BOOLEAN_TYPE=9, DATE_TYPE=10, DOUBLE_TYPE=11, FLOAT_TYPE=12, 
		TEXT_TYPE=13, ENUM=14, DOMAIN=15, TYPE=16, CREATE=17, TABLE=18, PRIMARY=19, 
		REFERENCES=20, FOREIGN=21, KEY=22, UNIQUE=23, NOT=24, NULL=25, TRUE=26, 
		FALSE=27, DEFAULT=28, CHECK=29, EQUALS=30, NOTEQUAL=31, LESS=32, GREATER=33, 
		LESSEQUAL=34, GREATEREQUAL=35, INTEGER_LITERAL=36, FLOAT_LITERAL=37, STRING_LITERAL=38, 
		IDENTIFIER=39, WS=40;
	public static final int
		RULE_startRule = 0, RULE_statement = 1, RULE_createTableStatement = 2, 
		RULE_tableName = 3, RULE_primaryKeyDefinition = 4, RULE_foreignKeyDefinition = 5, 
		RULE_columnDefinition = 6, RULE_columnName = 7, RULE_columnConstraints = 8, 
		RULE_primaryKeyConstraint = 9, RULE_foreignKeyConstraint = 10, RULE_uniqueConstraint = 11, 
		RULE_notNullConstraint = 12, RULE_defaultConstraint = 13, RULE_defaultValue = 14, 
		RULE_checkConstraint = 15, RULE_expression = 16, RULE_value = 17, RULE_createEnumStatement = 18, 
		RULE_enumName = 19, RULE_enumValue = 20, RULE_createDomainStatement = 21, 
		RULE_domainName = 22, RULE_dataType = 23, RULE_booleanValue = 24, RULE_domainConstraint = 25, 
		RULE_createTypeStatement = 26, RULE_typeName = 27, RULE_fieldDefinition = 28, 
		RULE_varcharType = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "statement", "createTableStatement", "tableName", "primaryKeyDefinition", 
			"foreignKeyDefinition", "columnDefinition", "columnName", "columnConstraints", 
			"primaryKeyConstraint", "foreignKeyConstraint", "uniqueConstraint", "notNullConstraint", 
			"defaultConstraint", "defaultValue", "checkConstraint", "expression", 
			"value", "createEnumStatement", "enumName", "enumValue", "createDomainStatement", 
			"domainName", "dataType", "booleanValue", "domainConstraint", "createTypeStatement", 
			"typeName", "fieldDefinition", "varcharType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CONSTRAINT'", "'AS'", "'('", "')'", "','", "';'", null, "'VARCHAR'", 
			"'BOOLEAN'", "'DATE'", "'DOUBLE'", "'FLOAT'", "'TEXT'", "'ENUM'", "'DOMAIN'", 
			"'TYPE'", "'CREATE'", "'TABLE'", "'PRIMARY'", "'REFERENCES'", "'FOREIGN'", 
			"'KEY'", "'UNIQUE'", "'NOT'", "'NULL'", "'TRUE'", "'FALSE'", "'DEFAULT'", 
			"'CHECK'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONSTRAINT", "AS", "LPAREN", "RPAREN", "COMMA", "SEMICOLON", "INT_TYPE", 
			"VARCHAR", "BOOLEAN_TYPE", "DATE_TYPE", "DOUBLE_TYPE", "FLOAT_TYPE", 
			"TEXT_TYPE", "ENUM", "DOMAIN", "TYPE", "CREATE", "TABLE", "PRIMARY", 
			"REFERENCES", "FOREIGN", "KEY", "UNIQUE", "NOT", "NULL", "TRUE", "FALSE", 
			"DEFAULT", "CHECK", "EQUALS", "NOTEQUAL", "LESS", "GREATER", "LESSEQUAL", 
			"GREATEREQUAL", "INTEGER_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", 
			"IDENTIFIER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "simpleSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpleSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartRuleContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitStartRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitStartRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				statement();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CREATE );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public CreateTableStatementContext createTableStatement() {
			return getRuleContext(CreateTableStatementContext.class,0);
		}
		public CreateEnumStatementContext createEnumStatement() {
			return getRuleContext(CreateEnumStatementContext.class,0);
		}
		public CreateDomainStatementContext createDomainStatement() {
			return getRuleContext(CreateDomainStatementContext.class,0);
		}
		public CreateTypeStatementContext createTypeStatement() {
			return getRuleContext(CreateTypeStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				createTableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				createEnumStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				createDomainStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				createTypeStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(simpleSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(simpleSQLParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(simpleSQLParser.LPAREN, 0); }
		public List<ColumnDefinitionContext> columnDefinition() {
			return getRuleContexts(ColumnDefinitionContext.class);
		}
		public ColumnDefinitionContext columnDefinition(int i) {
			return getRuleContext(ColumnDefinitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(simpleSQLParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(simpleSQLParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(simpleSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(simpleSQLParser.COMMA, i);
		}
		public PrimaryKeyDefinitionContext primaryKeyDefinition() {
			return getRuleContext(PrimaryKeyDefinitionContext.class,0);
		}
		public ForeignKeyDefinitionContext foreignKeyDefinition() {
			return getRuleContext(ForeignKeyDefinitionContext.class,0);
		}
		public CreateTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterCreateTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitCreateTableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitCreateTableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableStatementContext createTableStatement() throws RecognitionException {
		CreateTableStatementContext _localctx = new CreateTableStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createTableStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(CREATE);
			setState(72);
			match(TABLE);
			setState(73);
			tableName();
			setState(74);
			match(LPAREN);
			setState(75);
			columnDefinition();
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					match(COMMA);
					setState(77);
					columnDefinition();
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(83);
				match(COMMA);
				setState(84);
				primaryKeyDefinition();
				}
				break;
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(87);
				match(COMMA);
				setState(88);
				foreignKeyDefinition();
				}
			}

			setState(91);
			match(RPAREN);
			setState(92);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(simpleSQLParser.IDENTIFIER, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyDefinitionContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(simpleSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(simpleSQLParser.KEY, 0); }
		public TerminalNode LPAREN() { return getToken(simpleSQLParser.LPAREN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(simpleSQLParser.RPAREN, 0); }
		public TerminalNode CONSTRAINT() { return getToken(simpleSQLParser.CONSTRAINT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(simpleSQLParser.IDENTIFIER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(simpleSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(simpleSQLParser.COMMA, i);
		}
		public PrimaryKeyDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterPrimaryKeyDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitPrimaryKeyDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitPrimaryKeyDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyDefinitionContext primaryKeyDefinition() throws RecognitionException {
		PrimaryKeyDefinitionContext _localctx = new PrimaryKeyDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primaryKeyDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(96);
				match(CONSTRAINT);
				setState(97);
				match(IDENTIFIER);
				}
			}

			setState(100);
			match(PRIMARY);
			setState(101);
			match(KEY);
			setState(102);
			match(LPAREN);
			setState(103);
			columnName();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(104);
				match(COMMA);
				setState(105);
				columnName();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForeignKeyDefinitionContext extends ParserRuleContext {
		public TerminalNode FOREIGN() { return getToken(simpleSQLParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(simpleSQLParser.KEY, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(simpleSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(simpleSQLParser.LPAREN, i);
		}
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(simpleSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(simpleSQLParser.RPAREN, i);
		}
		public TerminalNode REFERENCES() { return getToken(simpleSQLParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(simpleSQLParser.CONSTRAINT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(simpleSQLParser.IDENTIFIER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(simpleSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(simpleSQLParser.COMMA, i);
		}
		public ForeignKeyDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterForeignKeyDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitForeignKeyDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitForeignKeyDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyDefinitionContext foreignKeyDefinition() throws RecognitionException {
		ForeignKeyDefinitionContext _localctx = new ForeignKeyDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_foreignKeyDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(113);
				match(CONSTRAINT);
				setState(114);
				match(IDENTIFIER);
				}
			}

			setState(117);
			match(FOREIGN);
			setState(118);
			match(KEY);
			setState(119);
			match(LPAREN);
			setState(120);
			columnName();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(121);
				match(COMMA);
				setState(122);
				columnName();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(RPAREN);
			setState(129);
			match(REFERENCES);
			setState(130);
			tableName();
			setState(131);
			match(LPAREN);
			setState(132);
			columnName();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(133);
				match(COMMA);
				setState(134);
				columnName();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ColumnConstraintsContext columnConstraints() {
			return getRuleContext(ColumnConstraintsContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			columnName();
			setState(143);
			dataType();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 832045056L) != 0)) {
				{
				setState(144);
				columnConstraints();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(simpleSQLParser.IDENTIFIER, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnConstraintsContext extends ParserRuleContext {
		public PrimaryKeyConstraintContext primaryKeyConstraint() {
			return getRuleContext(PrimaryKeyConstraintContext.class,0);
		}
		public ForeignKeyConstraintContext foreignKeyConstraint() {
			return getRuleContext(ForeignKeyConstraintContext.class,0);
		}
		public UniqueConstraintContext uniqueConstraint() {
			return getRuleContext(UniqueConstraintContext.class,0);
		}
		public NotNullConstraintContext notNullConstraint() {
			return getRuleContext(NotNullConstraintContext.class,0);
		}
		public DefaultConstraintContext defaultConstraint() {
			return getRuleContext(DefaultConstraintContext.class,0);
		}
		public CheckConstraintContext checkConstraint() {
			return getRuleContext(CheckConstraintContext.class,0);
		}
		public ColumnConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterColumnConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitColumnConstraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitColumnConstraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnConstraintsContext columnConstraints() throws RecognitionException {
		ColumnConstraintsContext _localctx = new ColumnConstraintsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columnConstraints);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				primaryKeyConstraint();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				foreignKeyConstraint();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				uniqueConstraint();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				notNullConstraint();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				defaultConstraint();
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				checkConstraint();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyConstraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(simpleSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(simpleSQLParser.KEY, 0); }
		public PrimaryKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterPrimaryKeyConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitPrimaryKeyConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitPrimaryKeyConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyConstraintContext primaryKeyConstraint() throws RecognitionException {
		PrimaryKeyConstraintContext _localctx = new PrimaryKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primaryKeyConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(PRIMARY);
			setState(158);
			match(KEY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForeignKeyConstraintContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(simpleSQLParser.REFERENCES, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(simpleSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(simpleSQLParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(simpleSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(simpleSQLParser.RPAREN, 0); }
		public ForeignKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterForeignKeyConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitForeignKeyConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitForeignKeyConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyConstraintContext foreignKeyConstraint() throws RecognitionException {
		ForeignKeyConstraintContext _localctx = new ForeignKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_foreignKeyConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(REFERENCES);
			setState(161);
			match(IDENTIFIER);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(162);
				match(LPAREN);
				setState(163);
				match(IDENTIFIER);
				setState(164);
				match(RPAREN);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class UniqueConstraintContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(simpleSQLParser.UNIQUE, 0); }
		public UniqueConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterUniqueConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitUniqueConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitUniqueConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniqueConstraintContext uniqueConstraint() throws RecognitionException {
		UniqueConstraintContext _localctx = new UniqueConstraintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_uniqueConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(UNIQUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NotNullConstraintContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(simpleSQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(simpleSQLParser.NULL, 0); }
		public NotNullConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notNullConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterNotNullConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitNotNullConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitNotNullConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotNullConstraintContext notNullConstraint() throws RecognitionException {
		NotNullConstraintContext _localctx = new NotNullConstraintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_notNullConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(NOT);
			setState(170);
			match(NULL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultConstraintContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(simpleSQLParser.DEFAULT, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public DefaultConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterDefaultConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitDefaultConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitDefaultConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultConstraintContext defaultConstraint() throws RecognitionException {
		DefaultConstraintContext _localctx = new DefaultConstraintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defaultConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(DEFAULT);
			setState(173);
			defaultValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(simpleSQLParser.INTEGER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(simpleSQLParser.STRING_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(simpleSQLParser.FLOAT_LITERAL, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode NULL() { return getToken(simpleSQLParser.NULL, 0); }
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_defaultValue);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(INTEGER_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(STRING_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(FLOAT_LITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				booleanValue();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				match(NULL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CheckConstraintContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(simpleSQLParser.CHECK, 0); }
		public TerminalNode LPAREN() { return getToken(simpleSQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(simpleSQLParser.RPAREN, 0); }
		public CheckConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterCheckConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitCheckConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitCheckConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckConstraintContext checkConstraint() throws RecognitionException {
		CheckConstraintContext _localctx = new CheckConstraintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_checkConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(CHECK);
			setState(183);
			match(LPAREN);
			setState(184);
			expression();
			setState(185);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(simpleSQLParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(simpleSQLParser.EQUALS, 0); }
		public TerminalNode NOTEQUAL() { return getToken(simpleSQLParser.NOTEQUAL, 0); }
		public TerminalNode LESS() { return getToken(simpleSQLParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(simpleSQLParser.GREATER, 0); }
		public TerminalNode LESSEQUAL() { return getToken(simpleSQLParser.LESSEQUAL, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(simpleSQLParser.GREATEREQUAL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(IDENTIFIER);
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(189);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(simpleSQLParser.INTEGER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(simpleSQLParser.STRING_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(simpleSQLParser.FLOAT_LITERAL, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_value);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(INTEGER_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(STRING_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(FLOAT_LITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				booleanValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateEnumStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(simpleSQLParser.CREATE, 0); }
		public TerminalNode ENUM() { return getToken(simpleSQLParser.ENUM, 0); }
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(simpleSQLParser.LPAREN, 0); }
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(simpleSQLParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(simpleSQLParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(simpleSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(simpleSQLParser.COMMA, i);
		}
		public CreateEnumStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createEnumStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterCreateEnumStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitCreateEnumStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitCreateEnumStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateEnumStatementContext createEnumStatement() throws RecognitionException {
		CreateEnumStatementContext _localctx = new CreateEnumStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_createEnumStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(CREATE);
			setState(198);
			match(ENUM);
			setState(199);
			enumName();
			setState(200);
			match(LPAREN);
			setState(201);
			enumValue();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(202);
				match(COMMA);
				setState(203);
				enumValue();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(RPAREN);
			setState(210);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(simpleSQLParser.IDENTIFIER, 0); }
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitEnumName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitEnumName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(simpleSQLParser.STRING_LITERAL, 0); }
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateDomainStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(simpleSQLParser.CREATE, 0); }
		public TerminalNode DOMAIN() { return getToken(simpleSQLParser.DOMAIN, 0); }
		public DomainNameContext domainName() {
			return getRuleContext(DomainNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(simpleSQLParser.SEMICOLON, 0); }
		public DomainConstraintContext domainConstraint() {
			return getRuleContext(DomainConstraintContext.class,0);
		}
		public CreateDomainStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDomainStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterCreateDomainStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitCreateDomainStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitCreateDomainStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDomainStatementContext createDomainStatement() throws RecognitionException {
		CreateDomainStatementContext _localctx = new CreateDomainStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_createDomainStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(CREATE);
			setState(217);
			match(DOMAIN);
			setState(218);
			domainName();
			setState(219);
			dataType();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 813694976L) != 0)) {
				{
				setState(220);
				domainConstraint();
				}
			}

			setState(223);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DomainNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(simpleSQLParser.IDENTIFIER, 0); }
		public DomainNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterDomainName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitDomainName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitDomainName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainNameContext domainName() throws RecognitionException {
		DomainNameContext _localctx = new DomainNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_domainName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(simpleSQLParser.INT_TYPE, 0); }
		public VarcharTypeContext varcharType() {
			return getRuleContext(VarcharTypeContext.class,0);
		}
		public TerminalNode BOOLEAN_TYPE() { return getToken(simpleSQLParser.BOOLEAN_TYPE, 0); }
		public TerminalNode DATE_TYPE() { return getToken(simpleSQLParser.DATE_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(simpleSQLParser.DOUBLE_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(simpleSQLParser.FLOAT_TYPE, 0); }
		public TerminalNode TEXT_TYPE() { return getToken(simpleSQLParser.TEXT_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(simpleSQLParser.IDENTIFIER, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dataType);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(INT_TYPE);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				varcharType();
				}
				break;
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(BOOLEAN_TYPE);
				}
				break;
			case DATE_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				match(DATE_TYPE);
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				match(DOUBLE_TYPE);
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				match(FLOAT_TYPE);
				}
				break;
			case TEXT_TYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(233);
				match(TEXT_TYPE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(simpleSQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(simpleSQLParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DomainConstraintContext extends ParserRuleContext {
		public CheckConstraintContext checkConstraint() {
			return getRuleContext(CheckConstraintContext.class,0);
		}
		public UniqueConstraintContext uniqueConstraint() {
			return getRuleContext(UniqueConstraintContext.class,0);
		}
		public DefaultConstraintContext defaultConstraint() {
			return getRuleContext(DefaultConstraintContext.class,0);
		}
		public DomainConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterDomainConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitDomainConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitDomainConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainConstraintContext domainConstraint() throws RecognitionException {
		DomainConstraintContext _localctx = new DomainConstraintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_domainConstraint);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHECK:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				checkConstraint();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				uniqueConstraint();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				defaultConstraint();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTypeStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(simpleSQLParser.CREATE, 0); }
		public TerminalNode TYPE() { return getToken(simpleSQLParser.TYPE, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(simpleSQLParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(simpleSQLParser.LPAREN, 0); }
		public List<FieldDefinitionContext> fieldDefinition() {
			return getRuleContexts(FieldDefinitionContext.class);
		}
		public FieldDefinitionContext fieldDefinition(int i) {
			return getRuleContext(FieldDefinitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(simpleSQLParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(simpleSQLParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(simpleSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(simpleSQLParser.COMMA, i);
		}
		public CreateTypeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTypeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterCreateTypeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitCreateTypeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitCreateTypeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTypeStatementContext createTypeStatement() throws RecognitionException {
		CreateTypeStatementContext _localctx = new CreateTypeStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_createTypeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(CREATE);
			setState(245);
			match(TYPE);
			setState(246);
			typeName();
			setState(247);
			match(AS);
			setState(248);
			match(LPAREN);
			setState(249);
			fieldDefinition();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(250);
				match(COMMA);
				setState(251);
				fieldDefinition();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(RPAREN);
			setState(258);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(simpleSQLParser.IDENTIFIER, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public FieldDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterFieldDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitFieldDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitFieldDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDefinitionContext fieldDefinition() throws RecognitionException {
		FieldDefinitionContext _localctx = new FieldDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fieldDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			columnName();
			setState(263);
			dataType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarcharTypeContext extends ParserRuleContext {
		public TerminalNode VARCHAR() { return getToken(simpleSQLParser.VARCHAR, 0); }
		public TerminalNode LPAREN() { return getToken(simpleSQLParser.LPAREN, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(simpleSQLParser.INTEGER_LITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(simpleSQLParser.RPAREN, 0); }
		public VarcharTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varcharType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterVarcharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitVarcharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitVarcharType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarcharTypeContext varcharType() throws RecognitionException {
		VarcharTypeContext _localctx = new VarcharTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_varcharType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(VARCHAR);
			setState(266);
			match(LPAREN);
			setState(267);
			match(INTEGER_LITERAL);
			setState(268);
			match(RPAREN);
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
		"\u0004\u0001(\u010f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0004\u0000"+
		">\b\u0000\u000b\u0000\f\u0000?\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001F\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002O\b\u0002\n\u0002"+
		"\f\u0002R\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002V\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002Z\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004c\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004k\b\u0004\n\u0004\f\u0004n\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005t\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005|\b\u0005"+
		"\n\u0005\f\u0005\u007f\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0088\b\u0005\n"+
		"\u0005\f\u0005\u008b\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0092\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009c\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a6\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b5"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00c4\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00cd"+
		"\b\u0012\n\u0012\f\u0012\u00d0\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00de\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u00ec\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u00f3\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u00fd\b\u001a"+
		"\n\u001a\f\u001a\u0100\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0000\u001e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:\u0000\u0002\u0001\u0000\u001e#\u0001\u0000"+
		"\u001a\u001b\u0116\u0000=\u0001\u0000\u0000\u0000\u0002E\u0001\u0000\u0000"+
		"\u0000\u0004G\u0001\u0000\u0000\u0000\u0006^\u0001\u0000\u0000\u0000\b"+
		"b\u0001\u0000\u0000\u0000\ns\u0001\u0000\u0000\u0000\f\u008e\u0001\u0000"+
		"\u0000\u0000\u000e\u0093\u0001\u0000\u0000\u0000\u0010\u009b\u0001\u0000"+
		"\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u00a0\u0001\u0000"+
		"\u0000\u0000\u0016\u00a7\u0001\u0000\u0000\u0000\u0018\u00a9\u0001\u0000"+
		"\u0000\u0000\u001a\u00ac\u0001\u0000\u0000\u0000\u001c\u00b4\u0001\u0000"+
		"\u0000\u0000\u001e\u00b6\u0001\u0000\u0000\u0000 \u00bb\u0001\u0000\u0000"+
		"\u0000\"\u00c3\u0001\u0000\u0000\u0000$\u00c5\u0001\u0000\u0000\u0000"+
		"&\u00d4\u0001\u0000\u0000\u0000(\u00d6\u0001\u0000\u0000\u0000*\u00d8"+
		"\u0001\u0000\u0000\u0000,\u00e1\u0001\u0000\u0000\u0000.\u00eb\u0001\u0000"+
		"\u0000\u00000\u00ed\u0001\u0000\u0000\u00002\u00f2\u0001\u0000\u0000\u0000"+
		"4\u00f4\u0001\u0000\u0000\u00006\u0104\u0001\u0000\u0000\u00008\u0106"+
		"\u0001\u0000\u0000\u0000:\u0109\u0001\u0000\u0000\u0000<>\u0003\u0002"+
		"\u0001\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0001\u0001\u0000\u0000"+
		"\u0000AF\u0003\u0004\u0002\u0000BF\u0003$\u0012\u0000CF\u0003*\u0015\u0000"+
		"DF\u00034\u001a\u0000EA\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000F\u0003\u0001\u0000"+
		"\u0000\u0000GH\u0005\u0011\u0000\u0000HI\u0005\u0012\u0000\u0000IJ\u0003"+
		"\u0006\u0003\u0000JK\u0005\u0003\u0000\u0000KP\u0003\f\u0006\u0000LM\u0005"+
		"\u0005\u0000\u0000MO\u0003\f\u0006\u0000NL\u0001\u0000\u0000\u0000OR\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QU\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\u0005\u0000"+
		"\u0000TV\u0003\b\u0004\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VY\u0001\u0000\u0000\u0000WX\u0005\u0005\u0000\u0000XZ\u0003\n\u0005"+
		"\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\\\u0005\u0004\u0000\u0000\\]\u0005\u0006\u0000\u0000]\u0005"+
		"\u0001\u0000\u0000\u0000^_\u0005\'\u0000\u0000_\u0007\u0001\u0000\u0000"+
		"\u0000`a\u0005\u0001\u0000\u0000ac\u0005\'\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0005\u0013"+
		"\u0000\u0000ef\u0005\u0016\u0000\u0000fg\u0005\u0003\u0000\u0000gl\u0003"+
		"\u000e\u0007\u0000hi\u0005\u0005\u0000\u0000ik\u0003\u000e\u0007\u0000"+
		"jh\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000op\u0005\u0004\u0000\u0000p\t\u0001\u0000\u0000\u0000qr\u0005"+
		"\u0001\u0000\u0000rt\u0005\'\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\u0015\u0000\u0000"+
		"vw\u0005\u0016\u0000\u0000wx\u0005\u0003\u0000\u0000x}\u0003\u000e\u0007"+
		"\u0000yz\u0005\u0005\u0000\u0000z|\u0003\u000e\u0007\u0000{y\u0001\u0000"+
		"\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005\u0004\u0000\u0000\u0081\u0082\u0005"+
		"\u0014\u0000\u0000\u0082\u0083\u0003\u0006\u0003\u0000\u0083\u0084\u0005"+
		"\u0003\u0000\u0000\u0084\u0089\u0003\u000e\u0007\u0000\u0085\u0086\u0005"+
		"\u0005\u0000\u0000\u0086\u0088\u0003\u000e\u0007\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\u0004\u0000\u0000\u008d\u000b\u0001\u0000\u0000\u0000\u008e\u008f\u0003"+
		"\u000e\u0007\u0000\u008f\u0091\u0003.\u0017\u0000\u0090\u0092\u0003\u0010"+
		"\b\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\r\u0001\u0000\u0000\u0000\u0093\u0094\u0005\'\u0000\u0000"+
		"\u0094\u000f\u0001\u0000\u0000\u0000\u0095\u009c\u0003\u0012\t\u0000\u0096"+
		"\u009c\u0003\u0014\n\u0000\u0097\u009c\u0003\u0016\u000b\u0000\u0098\u009c"+
		"\u0003\u0018\f\u0000\u0099\u009c\u0003\u001a\r\u0000\u009a\u009c\u0003"+
		"\u001e\u000f\u0000\u009b\u0095\u0001\u0000\u0000\u0000\u009b\u0096\u0001"+
		"\u0000\u0000\u0000\u009b\u0097\u0001\u0000\u0000\u0000\u009b\u0098\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u0011\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"\u0013\u0000\u0000\u009e\u009f\u0005\u0016\u0000\u0000\u009f\u0013\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0005\u0014\u0000\u0000\u00a1\u00a5\u0005"+
		"\'\u0000\u0000\u00a2\u00a3\u0005\u0003\u0000\u0000\u00a3\u00a4\u0005\'"+
		"\u0000\u0000\u00a4\u00a6\u0005\u0004\u0000\u0000\u00a5\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u0015\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005\u0017\u0000\u0000\u00a8\u0017\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0005\u0018\u0000\u0000\u00aa\u00ab\u0005\u0019"+
		"\u0000\u0000\u00ab\u0019\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u001c"+
		"\u0000\u0000\u00ad\u00ae\u0003\u001c\u000e\u0000\u00ae\u001b\u0001\u0000"+
		"\u0000\u0000\u00af\u00b5\u0005$\u0000\u0000\u00b0\u00b5\u0005&\u0000\u0000"+
		"\u00b1\u00b5\u0005%\u0000\u0000\u00b2\u00b5\u00030\u0018\u0000\u00b3\u00b5"+
		"\u0005\u0019\u0000\u0000\u00b4\u00af\u0001\u0000\u0000\u0000\u00b4\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u001d"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u001d\u0000\u0000\u00b7\u00b8"+
		"\u0005\u0003\u0000\u0000\u00b8\u00b9\u0003 \u0010\u0000\u00b9\u00ba\u0005"+
		"\u0004\u0000\u0000\u00ba\u001f\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"\'\u0000\u0000\u00bc\u00bd\u0007\u0000\u0000\u0000\u00bd\u00be\u0003\""+
		"\u0011\u0000\u00be!\u0001\u0000\u0000\u0000\u00bf\u00c4\u0005$\u0000\u0000"+
		"\u00c0\u00c4\u0005&\u0000\u0000\u00c1\u00c4\u0005%\u0000\u0000\u00c2\u00c4"+
		"\u00030\u0018\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4#\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0011"+
		"\u0000\u0000\u00c6\u00c7\u0005\u000e\u0000\u0000\u00c7\u00c8\u0003&\u0013"+
		"\u0000\u00c8\u00c9\u0005\u0003\u0000\u0000\u00c9\u00ce\u0003(\u0014\u0000"+
		"\u00ca\u00cb\u0005\u0005\u0000\u0000\u00cb\u00cd\u0003(\u0014\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0005\u0004\u0000\u0000\u00d2\u00d3\u0005\u0006\u0000\u0000\u00d3"+
		"%\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\'\u0000\u0000\u00d5\'\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005&\u0000\u0000\u00d7)\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005\u0011\u0000\u0000\u00d9\u00da\u0005\u000f\u0000"+
		"\u0000\u00da\u00db\u0003,\u0016\u0000\u00db\u00dd\u0003.\u0017\u0000\u00dc"+
		"\u00de\u00032\u0019\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0005\u0006\u0000\u0000\u00e0+\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		"\'\u0000\u0000\u00e2-\u0001\u0000\u0000\u0000\u00e3\u00ec\u0005\u0007"+
		"\u0000\u0000\u00e4\u00ec\u0003:\u001d\u0000\u00e5\u00ec\u0005\t\u0000"+
		"\u0000\u00e6\u00ec\u0005\n\u0000\u0000\u00e7\u00ec\u0005\u000b\u0000\u0000"+
		"\u00e8\u00ec\u0005\f\u0000\u0000\u00e9\u00ec\u0005\r\u0000\u0000\u00ea"+
		"\u00ec\u0005\'\u0000\u0000\u00eb\u00e3\u0001\u0000\u0000\u0000\u00eb\u00e4"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e5\u0001\u0000\u0000\u0000\u00eb\u00e6"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000\u00eb\u00e8"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec/\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007"+
		"\u0001\u0000\u0000\u00ee1\u0001\u0000\u0000\u0000\u00ef\u00f3\u0003\u001e"+
		"\u000f\u0000\u00f0\u00f3\u0003\u0016\u000b\u0000\u00f1\u00f3\u0003\u001a"+
		"\r\u0000\u00f2\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f33\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0005\u0011\u0000\u0000\u00f5\u00f6\u0005\u0010\u0000\u0000"+
		"\u00f6\u00f7\u00036\u001b\u0000\u00f7\u00f8\u0005\u0002\u0000\u0000\u00f8"+
		"\u00f9\u0005\u0003\u0000\u0000\u00f9\u00fe\u00038\u001c\u0000\u00fa\u00fb"+
		"\u0005\u0005\u0000\u0000\u00fb\u00fd\u00038\u001c\u0000\u00fc\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101\u0001"+
		"\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0102\u0005"+
		"\u0004\u0000\u0000\u0102\u0103\u0005\u0006\u0000\u0000\u01035\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0005\'\u0000\u0000\u01057\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0003\u000e\u0007\u0000\u0107\u0108\u0003.\u0017\u0000"+
		"\u01089\u0001\u0000\u0000\u0000\u0109\u010a\u0005\b\u0000\u0000\u010a"+
		"\u010b\u0005\u0003\u0000\u0000\u010b\u010c\u0005$\u0000\u0000\u010c\u010d"+
		"\u0005\u0004\u0000\u0000\u010d;\u0001\u0000\u0000\u0000\u0014?EPUYbls"+
		"}\u0089\u0091\u009b\u00a5\u00b4\u00c3\u00ce\u00dd\u00eb\u00f2\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}