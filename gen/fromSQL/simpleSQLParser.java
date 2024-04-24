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
		BOOLEAN_VALUE=1, VARCHAR_TYPE=2, CONSTRAINT=3, AS=4, LPAREN=5, RPAREN=6, 
		COMMA=7, SEMICOLON=8, INT_TYPE=9, VARCHAR=10, BOOLEAN_TYPE=11, DATE_TYPE=12, 
		DOUBLE_TYPE=13, FLOAT_TYPE=14, TEXT_TYPE=15, ENUM=16, DOMAIN=17, TYPE=18, 
		CREATE=19, TABLE=20, PRIMARY=21, KEY=22, UNIQUE=23, NOT=24, NULL=25, TRUE=26, 
		FALSE=27, DEFAULT=28, CHECK=29, EQUALS=30, NOTEQUAL=31, LESS=32, GREATER=33, 
		LESSEQUAL=34, GREATEREQUAL=35, INTEGER_LITERAL=36, FLOAT_LITERAL=37, STRING_LITERAL=38, 
		IDENTIFIER=39, WS=40;
	public static final int
		RULE_startRule = 0, RULE_statement = 1, RULE_createTableStatement = 2, 
		RULE_tableName = 3, RULE_primaryKeyDefinition = 4, RULE_columnDefinition = 5, 
		RULE_columnName = 6, RULE_columnConstraints = 7, RULE_primaryKeyConstraint = 8, 
		RULE_uniqueConstraint = 9, RULE_notNullConstraint = 10, RULE_defaultConstraint = 11, 
		RULE_defaultValue = 12, RULE_checkConstraint = 13, RULE_expression = 14, 
		RULE_value = 15, RULE_createEnumStatement = 16, RULE_enumName = 17, RULE_enumValue = 18, 
		RULE_createDomainStatement = 19, RULE_domainName = 20, RULE_dataType = 21, 
		RULE_domainConstraint = 22, RULE_createTypeStatement = 23, RULE_typeName = 24, 
		RULE_fieldDefinition = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "statement", "createTableStatement", "tableName", "primaryKeyDefinition", 
			"columnDefinition", "columnName", "columnConstraints", "primaryKeyConstraint", 
			"uniqueConstraint", "notNullConstraint", "defaultConstraint", "defaultValue", 
			"checkConstraint", "expression", "value", "createEnumStatement", "enumName", 
			"enumValue", "createDomainStatement", "domainName", "dataType", "domainConstraint", 
			"createTypeStatement", "typeName", "fieldDefinition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'CONSTRAINT'", "'AS'", "'('", "')'", "','", "';'", 
			null, "'VARCHAR'", "'BOOLEAN'", "'DATE'", "'DOUBLE'", "'FLOAT'", "'TEXT'", 
			"'ENUM'", "'DOMAIN'", "'TYPE'", "'CREATE'", "'TABLE'", "'PRIMARY'", "'KEY'", 
			"'UNIQUE'", "'NOT'", "'NULL'", "'TRUE'", "'FALSE'", "'DEFAULT'", "'CHECK'", 
			"'='", "'<>'", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN_VALUE", "VARCHAR_TYPE", "CONSTRAINT", "AS", "LPAREN", 
			"RPAREN", "COMMA", "SEMICOLON", "INT_TYPE", "VARCHAR", "BOOLEAN_TYPE", 
			"DATE_TYPE", "DOUBLE_TYPE", "FLOAT_TYPE", "TEXT_TYPE", "ENUM", "DOMAIN", 
			"TYPE", "CREATE", "TABLE", "PRIMARY", "KEY", "UNIQUE", "NOT", "NULL", 
			"TRUE", "FALSE", "DEFAULT", "CHECK", "EQUALS", "NOTEQUAL", "LESS", "GREATER", 
			"LESSEQUAL", "GREATEREQUAL", "INTEGER_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", 
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
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				statement();
				}
				}
				setState(55); 
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
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				createTableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				createEnumStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				createDomainStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
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
			setState(63);
			match(CREATE);
			setState(64);
			match(TABLE);
			setState(65);
			tableName();
			setState(66);
			match(LPAREN);
			setState(67);
			columnDefinition();
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					match(COMMA);
					setState(69);
					columnDefinition();
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(75);
				match(COMMA);
				setState(76);
				primaryKeyDefinition();
				}
			}

			setState(79);
			match(RPAREN);
			setState(80);
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
			setState(82);
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
		public TerminalNode CONSTRAINT() { return getToken(simpleSQLParser.CONSTRAINT, 0); }
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
			setState(84);
			match(CONSTRAINT);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(85);
				match(IDENTIFIER);
				}
			}

			setState(88);
			match(PRIMARY);
			setState(89);
			match(KEY);
			setState(90);
			match(LPAREN);
			setState(91);
			columnName();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(92);
				match(COMMA);
				setState(93);
				columnName();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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
		enterRule(_localctx, 10, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			columnName();
			setState(102);
			dataType();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 832569344L) != 0)) {
				{
				setState(103);
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
		enterRule(_localctx, 12, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
		enterRule(_localctx, 14, RULE_columnConstraints);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				primaryKeyConstraint();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				uniqueConstraint();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				notNullConstraint();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				defaultConstraint();
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
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
		enterRule(_localctx, 16, RULE_primaryKeyConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(PRIMARY);
			setState(116);
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
		enterRule(_localctx, 18, RULE_uniqueConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
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
		enterRule(_localctx, 20, RULE_notNullConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(NOT);
			setState(121);
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
		enterRule(_localctx, 22, RULE_defaultConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(DEFAULT);
			setState(124);
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
		public TerminalNode BOOLEAN_VALUE() { return getToken(simpleSQLParser.BOOLEAN_VALUE, 0); }
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
		enterRule(_localctx, 24, RULE_defaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 481069891586L) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_checkConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(CHECK);
			setState(129);
			match(LPAREN);
			setState(130);
			expression();
			setState(131);
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
		enterRule(_localctx, 28, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(IDENTIFIER);
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
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
		public TerminalNode BOOLEAN_VALUE() { return getToken(simpleSQLParser.BOOLEAN_VALUE, 0); }
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
		enterRule(_localctx, 30, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337154L) != 0)) ) {
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
		enterRule(_localctx, 32, RULE_createEnumStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(CREATE);
			setState(140);
			match(ENUM);
			setState(141);
			enumName();
			setState(142);
			match(LPAREN);
			setState(143);
			enumValue();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(145);
				enumValue();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(RPAREN);
			setState(152);
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
		enterRule(_localctx, 34, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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
		enterRule(_localctx, 36, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		enterRule(_localctx, 38, RULE_createDomainStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(CREATE);
			setState(159);
			match(DOMAIN);
			setState(160);
			domainName();
			setState(161);
			dataType();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 813694976L) != 0)) {
				{
				setState(162);
				domainConstraint();
				}
			}

			setState(165);
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
		enterRule(_localctx, 40, RULE_domainName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		public TerminalNode VARCHAR_TYPE() { return getToken(simpleSQLParser.VARCHAR_TYPE, 0); }
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
		enterRule(_localctx, 42, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 549755877892L) != 0)) ) {
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
		enterRule(_localctx, 44, RULE_domainConstraint);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHECK:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				checkConstraint();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				uniqueConstraint();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
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
		enterRule(_localctx, 46, RULE_createTypeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(CREATE);
			setState(177);
			match(TYPE);
			setState(178);
			typeName();
			setState(179);
			match(AS);
			setState(180);
			match(LPAREN);
			setState(181);
			fieldDefinition();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(182);
				match(COMMA);
				setState(183);
				fieldDefinition();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(RPAREN);
			setState(190);
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
		enterRule(_localctx, 48, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
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
		enterRule(_localctx, 50, RULE_fieldDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			columnName();
			setState(195);
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

	public static final String _serializedATN =
		"\u0004\u0001(\u00c6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0004\u00006\b\u0000\u000b\u0000"+
		"\f\u00007\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		">\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002G\b\u0002\n\u0002\f\u0002J\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002N\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"W\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004_\b\u0004\n\u0004\f\u0004b\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005i\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007r\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0093\b\u0010\n\u0010\f\u0010\u0096\t\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00a4\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00af\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u00b9\b\u0017\n\u0017\f\u0017\u00bc\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000"+
		"\u0004\u0003\u0000\u0001\u0001\u0019\u0019$&\u0001\u0000\u001e#\u0002"+
		"\u0000\u0001\u0001$&\u0004\u0000\u0002\u0002\t\t\u000b\u000f\'\'\u00bd"+
		"\u00005\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004?"+
		"\u0001\u0000\u0000\u0000\u0006R\u0001\u0000\u0000\u0000\bT\u0001\u0000"+
		"\u0000\u0000\ne\u0001\u0000\u0000\u0000\fj\u0001\u0000\u0000\u0000\u000e"+
		"q\u0001\u0000\u0000\u0000\u0010s\u0001\u0000\u0000\u0000\u0012v\u0001"+
		"\u0000\u0000\u0000\u0014x\u0001\u0000\u0000\u0000\u0016{\u0001\u0000\u0000"+
		"\u0000\u0018~\u0001\u0000\u0000\u0000\u001a\u0080\u0001\u0000\u0000\u0000"+
		"\u001c\u0085\u0001\u0000\u0000\u0000\u001e\u0089\u0001\u0000\u0000\u0000"+
		" \u008b\u0001\u0000\u0000\u0000\"\u009a\u0001\u0000\u0000\u0000$\u009c"+
		"\u0001\u0000\u0000\u0000&\u009e\u0001\u0000\u0000\u0000(\u00a7\u0001\u0000"+
		"\u0000\u0000*\u00a9\u0001\u0000\u0000\u0000,\u00ae\u0001\u0000\u0000\u0000"+
		".\u00b0\u0001\u0000\u0000\u00000\u00c0\u0001\u0000\u0000\u00002\u00c2"+
		"\u0001\u0000\u0000\u000046\u0003\u0002\u0001\u000054\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008\u0001\u0001\u0000\u0000\u00009>\u0003\u0004\u0002\u0000"+
		":>\u0003 \u0010\u0000;>\u0003&\u0013\u0000<>\u0003.\u0017\u0000=9\u0001"+
		"\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		"=<\u0001\u0000\u0000\u0000>\u0003\u0001\u0000\u0000\u0000?@\u0005\u0013"+
		"\u0000\u0000@A\u0005\u0014\u0000\u0000AB\u0003\u0006\u0003\u0000BC\u0005"+
		"\u0005\u0000\u0000CH\u0003\n\u0005\u0000DE\u0005\u0007\u0000\u0000EG\u0003"+
		"\n\u0005\u0000FD\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IM\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000KL\u0005\u0007\u0000\u0000LN\u0003\b\u0004\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OP\u0005\u0006\u0000\u0000PQ\u0005\b\u0000\u0000Q\u0005\u0001\u0000"+
		"\u0000\u0000RS\u0005\'\u0000\u0000S\u0007\u0001\u0000\u0000\u0000TV\u0005"+
		"\u0003\u0000\u0000UW\u0005\'\u0000\u0000VU\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0005\u0015\u0000\u0000"+
		"YZ\u0005\u0016\u0000\u0000Z[\u0005\u0005\u0000\u0000[`\u0003\f\u0006\u0000"+
		"\\]\u0005\u0007\u0000\u0000]_\u0003\f\u0006\u0000^\\\u0001\u0000\u0000"+
		"\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0005"+
		"\u0006\u0000\u0000d\t\u0001\u0000\u0000\u0000ef\u0003\f\u0006\u0000fh"+
		"\u0003*\u0015\u0000gi\u0003\u000e\u0007\u0000hg\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000i\u000b\u0001\u0000\u0000\u0000jk\u0005\'\u0000"+
		"\u0000k\r\u0001\u0000\u0000\u0000lr\u0003\u0010\b\u0000mr\u0003\u0012"+
		"\t\u0000nr\u0003\u0014\n\u0000or\u0003\u0016\u000b\u0000pr\u0003\u001a"+
		"\r\u0000ql\u0001\u0000\u0000\u0000qm\u0001\u0000\u0000\u0000qn\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\u000f"+
		"\u0001\u0000\u0000\u0000st\u0005\u0015\u0000\u0000tu\u0005\u0016\u0000"+
		"\u0000u\u0011\u0001\u0000\u0000\u0000vw\u0005\u0017\u0000\u0000w\u0013"+
		"\u0001\u0000\u0000\u0000xy\u0005\u0018\u0000\u0000yz\u0005\u0019\u0000"+
		"\u0000z\u0015\u0001\u0000\u0000\u0000{|\u0005\u001c\u0000\u0000|}\u0003"+
		"\u0018\f\u0000}\u0017\u0001\u0000\u0000\u0000~\u007f\u0007\u0000\u0000"+
		"\u0000\u007f\u0019\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u001d\u0000"+
		"\u0000\u0081\u0082\u0005\u0005\u0000\u0000\u0082\u0083\u0003\u001c\u000e"+
		"\u0000\u0083\u0084\u0005\u0006\u0000\u0000\u0084\u001b\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005\'\u0000\u0000\u0086\u0087\u0007\u0001\u0000\u0000"+
		"\u0087\u0088\u0003\u001e\u000f\u0000\u0088\u001d\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0007\u0002\u0000\u0000\u008a\u001f\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0005\u0013\u0000\u0000\u008c\u008d\u0005\u0010\u0000\u0000"+
		"\u008d\u008e\u0003\"\u0011\u0000\u008e\u008f\u0005\u0005\u0000\u0000\u008f"+
		"\u0094\u0003$\u0012\u0000\u0090\u0091\u0005\u0007\u0000\u0000\u0091\u0093"+
		"\u0003$\u0012\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0096\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005\u0006\u0000\u0000\u0098\u0099\u0005"+
		"\b\u0000\u0000\u0099!\u0001\u0000\u0000\u0000\u009a\u009b\u0005\'\u0000"+
		"\u0000\u009b#\u0001\u0000\u0000\u0000\u009c\u009d\u0005&\u0000\u0000\u009d"+
		"%\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0013\u0000\u0000\u009f\u00a0"+
		"\u0005\u0011\u0000\u0000\u00a0\u00a1\u0003(\u0014\u0000\u00a1\u00a3\u0003"+
		"*\u0015\u0000\u00a2\u00a4\u0003,\u0016\u0000\u00a3\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005\b\u0000\u0000\u00a6\'\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0005\'\u0000\u0000\u00a8)\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0007\u0003\u0000\u0000\u00aa+\u0001\u0000\u0000\u0000\u00ab\u00af"+
		"\u0003\u001a\r\u0000\u00ac\u00af\u0003\u0012\t\u0000\u00ad\u00af\u0003"+
		"\u0016\u000b\u0000\u00ae\u00ab\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af-\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005\u0013\u0000\u0000\u00b1\u00b2\u0005\u0012"+
		"\u0000\u0000\u00b2\u00b3\u00030\u0018\u0000\u00b3\u00b4\u0005\u0004\u0000"+
		"\u0000\u00b4\u00b5\u0005\u0005\u0000\u0000\u00b5\u00ba\u00032\u0019\u0000"+
		"\u00b6\u00b7\u0005\u0007\u0000\u0000\u00b7\u00b9\u00032\u0019\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005\u0006\u0000\u0000\u00be\u00bf\u0005\b\u0000\u0000\u00bf/"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\'\u0000\u0000\u00c11\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0003\f\u0006\u0000\u00c3\u00c4\u0003*"+
		"\u0015\u0000\u00c43\u0001\u0000\u0000\u0000\f7=HMV`hq\u0094\u00a3\u00ae"+
		"\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}