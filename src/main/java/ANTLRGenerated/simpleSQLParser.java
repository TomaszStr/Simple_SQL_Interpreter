// Generated from C:/Users/tmstr/IdeaProjects/SQL_to_Java/simpleSQL.g4 by ANTLR 4.13.1
package ANTLRGenerated;
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
		LESSEQUAL=34, GREATEREQUAL=35, MINUS=36, INTEGER_LITERAL=37, FLOAT_LITERAL=38, 
		STRING_LITERAL=39, IDENTIFIER=40, WS=41;
	public static final int
		RULE_startRule = 0, RULE_statement = 1, RULE_createTableStatement = 2, 
		RULE_tableName = 3, RULE_primaryKeyDefinition = 4, RULE_foreignKeyDefinition = 5, 
		RULE_columnDefinition = 6, RULE_columnName = 7, RULE_keyConstraint = 8, 
		RULE_columnConstraints = 9, RULE_primaryKeyConstraint = 10, RULE_foreignKeyConstraint = 11, 
		RULE_uniqueConstraint = 12, RULE_notNullConstraint = 13, RULE_defaultConstraint = 14, 
		RULE_defaultValue = 15, RULE_checkConstraint = 16, RULE_expression = 17, 
		RULE_value = 18, RULE_createEnumStatement = 19, RULE_enumName = 20, RULE_enumValue = 21, 
		RULE_createDomainStatement = 22, RULE_domainName = 23, RULE_dataType = 24, 
		RULE_booleanValue = 25, RULE_domainConstraints = 26, RULE_createTypeStatement = 27, 
		RULE_typeName = 28, RULE_fieldDefinition = 29, RULE_varcharType = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "statement", "createTableStatement", "tableName", "primaryKeyDefinition", 
			"foreignKeyDefinition", "columnDefinition", "columnName", "keyConstraint", 
			"columnConstraints", "primaryKeyConstraint", "foreignKeyConstraint", 
			"uniqueConstraint", "notNullConstraint", "defaultConstraint", "defaultValue", 
			"checkConstraint", "expression", "value", "createEnumStatement", "enumName", 
			"enumValue", "createDomainStatement", "domainName", "dataType", "booleanValue", 
			"domainConstraints", "createTypeStatement", "typeName", "fieldDefinition", 
			"varcharType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CONSTRAINT'", "'AS'", "'('", "')'", "','", "';'", null, "'VARCHAR'", 
			"'BOOLEAN'", "'DATE'", "'DOUBLE'", "'FLOAT'", "'TEXT'", "'ENUM'", "'DOMAIN'", 
			"'TYPE'", "'CREATE'", "'TABLE'", "'PRIMARY'", "'REFERENCES'", "'FOREIGN'", 
			"'KEY'", "'UNIQUE'", "'NOT'", "'NULL'", "'TRUE'", "'FALSE'", "'DEFAULT'", 
			"'CHECK'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'-'"
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
			"GREATEREQUAL", "MINUS", "INTEGER_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", 
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
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				statement();
				}
				}
				setState(65); 
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
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				createTableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				createEnumStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				createDomainStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
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
			setState(73);
			match(CREATE);
			setState(74);
			match(TABLE);
			setState(75);
			tableName();
			setState(76);
			match(LPAREN);
			setState(77);
			columnDefinition();
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					match(COMMA);
					setState(79);
					columnDefinition();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(85);
				match(COMMA);
				setState(86);
				primaryKeyDefinition();
				}
				break;
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(89);
				match(COMMA);
				setState(90);
				foreignKeyDefinition();
				}
			}

			setState(93);
			match(RPAREN);
			setState(94);
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
			setState(96);
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
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(98);
				match(CONSTRAINT);
				setState(99);
				match(IDENTIFIER);
				}
			}

			setState(102);
			match(PRIMARY);
			setState(103);
			match(KEY);
			setState(104);
			match(LPAREN);
			setState(105);
			columnName();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(106);
				match(COMMA);
				setState(107);
				columnName();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
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
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(115);
				match(CONSTRAINT);
				setState(116);
				match(IDENTIFIER);
				}
			}

			setState(119);
			match(FOREIGN);
			setState(120);
			match(KEY);
			setState(121);
			match(LPAREN);
			setState(122);
			columnName();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(123);
				match(COMMA);
				setState(124);
				columnName();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(RPAREN);
			setState(131);
			match(REFERENCES);
			setState(132);
			tableName();
			setState(133);
			match(LPAREN);
			setState(134);
			columnName();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(135);
				match(COMMA);
				setState(136);
				columnName();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
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
		public KeyConstraintContext keyConstraint() {
			return getRuleContext(KeyConstraintContext.class,0);
		}
		public List<ColumnConstraintsContext> columnConstraints() {
			return getRuleContexts(ColumnConstraintsContext.class);
		}
		public ColumnConstraintsContext columnConstraints(int i) {
			return getRuleContext(ColumnConstraintsContext.class,i);
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
			setState(144);
			columnName();
			setState(145);
			dataType();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY || _la==REFERENCES) {
				{
				setState(146);
				keyConstraint();
				}
			}

			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 830472192L) != 0)) {
				{
				{
				setState(149);
				columnConstraints();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			setState(155);
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
	public static class KeyConstraintContext extends ParserRuleContext {
		public PrimaryKeyConstraintContext primaryKeyConstraint() {
			return getRuleContext(PrimaryKeyConstraintContext.class,0);
		}
		public ForeignKeyConstraintContext foreignKeyConstraint() {
			return getRuleContext(ForeignKeyConstraintContext.class,0);
		}
		public KeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterKeyConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitKeyConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitKeyConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyConstraintContext keyConstraint() throws RecognitionException {
		KeyConstraintContext _localctx = new KeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_keyConstraint);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				primaryKeyConstraint();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				foreignKeyConstraint();
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
	public static class ColumnConstraintsContext extends ParserRuleContext {
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
		enterRule(_localctx, 18, RULE_columnConstraints);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				uniqueConstraint();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				notNullConstraint();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				defaultConstraint();
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
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
		enterRule(_localctx, 20, RULE_primaryKeyConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(PRIMARY);
			setState(168);
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
		enterRule(_localctx, 22, RULE_foreignKeyConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(REFERENCES);
			setState(171);
			match(IDENTIFIER);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(172);
				match(LPAREN);
				setState(173);
				match(IDENTIFIER);
				setState(174);
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
		enterRule(_localctx, 24, RULE_uniqueConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		enterRule(_localctx, 26, RULE_notNullConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(NOT);
			setState(180);
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
		enterRule(_localctx, 28, RULE_defaultConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(DEFAULT);
			setState(183);
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
		public TerminalNode MINUS() { return getToken(simpleSQLParser.MINUS, 0); }
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
		enterRule(_localctx, 30, RULE_defaultValue);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(185);
					match(MINUS);
					}
				}

				setState(188);
				match(INTEGER_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(190);
					match(MINUS);
					}
				}

				setState(193);
				match(FLOAT_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				booleanValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				match(NULL);
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
		enterRule(_localctx, 32, RULE_checkConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(CHECK);
			setState(199);
			match(LPAREN);
			setState(200);
			expression();
			setState(201);
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
		enterRule(_localctx, 34, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(IDENTIFIER);
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(205);
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
		public TerminalNode MINUS() { return getToken(simpleSQLParser.MINUS, 0); }
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
		enterRule(_localctx, 36, RULE_value);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(207);
					match(MINUS);
					}
				}

				setState(210);
				match(INTEGER_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(212);
					match(MINUS);
					}
				}

				setState(215);
				match(FLOAT_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				booleanValue();
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
	public static class CreateEnumStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(simpleSQLParser.CREATE, 0); }
		public TerminalNode TYPE() { return getToken(simpleSQLParser.TYPE, 0); }
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(simpleSQLParser.AS, 0); }
		public TerminalNode ENUM() { return getToken(simpleSQLParser.ENUM, 0); }
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
		enterRule(_localctx, 38, RULE_createEnumStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(CREATE);
			setState(220);
			match(TYPE);
			setState(221);
			enumName();
			setState(222);
			match(AS);
			setState(223);
			match(ENUM);
			setState(224);
			match(LPAREN);
			setState(225);
			enumValue();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(226);
				match(COMMA);
				setState(227);
				enumValue();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			match(RPAREN);
			setState(234);
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
		enterRule(_localctx, 40, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		enterRule(_localctx, 42, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		public List<DomainConstraintsContext> domainConstraints() {
			return getRuleContexts(DomainConstraintsContext.class);
		}
		public DomainConstraintsContext domainConstraints(int i) {
			return getRuleContext(DomainConstraintsContext.class,i);
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
		enterRule(_localctx, 44, RULE_createDomainStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(CREATE);
			setState(241);
			match(DOMAIN);
			setState(242);
			domainName();
			setState(243);
			dataType();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 830472192L) != 0)) {
				{
				{
				setState(244);
				domainConstraints();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
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
		enterRule(_localctx, 46, RULE_domainName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
		enterRule(_localctx, 48, RULE_dataType);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(INT_TYPE);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				varcharType();
				}
				break;
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(BOOLEAN_TYPE);
				}
				break;
			case DATE_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				match(DATE_TYPE);
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				match(DOUBLE_TYPE);
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				match(FLOAT_TYPE);
				}
				break;
			case TEXT_TYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				match(TEXT_TYPE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
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
		enterRule(_localctx, 50, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
	public static class DomainConstraintsContext extends ParserRuleContext {
		public CheckConstraintContext checkConstraint() {
			return getRuleContext(CheckConstraintContext.class,0);
		}
		public UniqueConstraintContext uniqueConstraint() {
			return getRuleContext(UniqueConstraintContext.class,0);
		}
		public DefaultConstraintContext defaultConstraint() {
			return getRuleContext(DefaultConstraintContext.class,0);
		}
		public NotNullConstraintContext notNullConstraint() {
			return getRuleContext(NotNullConstraintContext.class,0);
		}
		public DomainConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainConstraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).enterDomainConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleSQLListener ) ((simpleSQLListener)listener).exitDomainConstraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleSQLVisitor ) return ((simpleSQLVisitor<? extends T>)visitor).visitDomainConstraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainConstraintsContext domainConstraints() throws RecognitionException {
		DomainConstraintsContext _localctx = new DomainConstraintsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_domainConstraints);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHECK:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				checkConstraint();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				uniqueConstraint();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				defaultConstraint();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				notNullConstraint();
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
		enterRule(_localctx, 54, RULE_createTypeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(CREATE);
			setState(273);
			match(TYPE);
			setState(274);
			typeName();
			setState(275);
			match(AS);
			setState(276);
			match(LPAREN);
			setState(277);
			fieldDefinition();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(278);
				match(COMMA);
				setState(279);
				fieldDefinition();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(RPAREN);
			setState(286);
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
		enterRule(_localctx, 56, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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
		enterRule(_localctx, 58, RULE_fieldDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			columnName();
			setState(291);
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
		enterRule(_localctx, 60, RULE_varcharType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(VARCHAR);
			setState(294);
			match(LPAREN);
			setState(295);
			match(INTEGER_LITERAL);
			setState(296);
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
		"\u0004\u0001)\u012b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0004\u0000@\b\u0000\u000b\u0000\f\u0000A\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001H\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002Q\b\u0002\n\u0002\f\u0002T\t\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002X\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\\\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004e\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004m\b\u0004\n\u0004\f\u0004p\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005v\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005~\b\u0005\n\u0005\f\u0005\u0081\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u008a\b\u0005\n\u0005\f\u0005\u008d\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0094\b\u0006\u0001\u0006"+
		"\u0005\u0006\u0097\b\u0006\n\u0006\f\u0006\u009a\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0003\b\u00a0\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00a6\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b0\b\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0003\u000f\u00bb\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00c0\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c5\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0003\u0012\u00d1"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d6\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00da\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u00e5\b\u0013\n\u0013\f\u0013\u00e8\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u00f6\b\u0016\n\u0016\f\u0016\u00f9\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0107\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u010f\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0119\b\u001b"+
		"\n\u001b\f\u001b\u011c\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0000\u0000\u001f"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<\u0000\u0002\u0001\u0000\u001e#\u0001\u0000"+
		"\u001a\u001b\u0136\u0000?\u0001\u0000\u0000\u0000\u0002G\u0001\u0000\u0000"+
		"\u0000\u0004I\u0001\u0000\u0000\u0000\u0006`\u0001\u0000\u0000\u0000\b"+
		"d\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000\u0000\f\u0090\u0001\u0000"+
		"\u0000\u0000\u000e\u009b\u0001\u0000\u0000\u0000\u0010\u009f\u0001\u0000"+
		"\u0000\u0000\u0012\u00a5\u0001\u0000\u0000\u0000\u0014\u00a7\u0001\u0000"+
		"\u0000\u0000\u0016\u00aa\u0001\u0000\u0000\u0000\u0018\u00b1\u0001\u0000"+
		"\u0000\u0000\u001a\u00b3\u0001\u0000\u0000\u0000\u001c\u00b6\u0001\u0000"+
		"\u0000\u0000\u001e\u00c4\u0001\u0000\u0000\u0000 \u00c6\u0001\u0000\u0000"+
		"\u0000\"\u00cb\u0001\u0000\u0000\u0000$\u00d9\u0001\u0000\u0000\u0000"+
		"&\u00db\u0001\u0000\u0000\u0000(\u00ec\u0001\u0000\u0000\u0000*\u00ee"+
		"\u0001\u0000\u0000\u0000,\u00f0\u0001\u0000\u0000\u0000.\u00fc\u0001\u0000"+
		"\u0000\u00000\u0106\u0001\u0000\u0000\u00002\u0108\u0001\u0000\u0000\u0000"+
		"4\u010e\u0001\u0000\u0000\u00006\u0110\u0001\u0000\u0000\u00008\u0120"+
		"\u0001\u0000\u0000\u0000:\u0122\u0001\u0000\u0000\u0000<\u0125\u0001\u0000"+
		"\u0000\u0000>@\u0003\u0002\u0001\u0000?>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"B\u0001\u0001\u0000\u0000\u0000CH\u0003\u0004\u0002\u0000DH\u0003&\u0013"+
		"\u0000EH\u0003,\u0016\u0000FH\u00036\u001b\u0000GC\u0001\u0000\u0000\u0000"+
		"GD\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000"+
		"\u0000H\u0003\u0001\u0000\u0000\u0000IJ\u0005\u0011\u0000\u0000JK\u0005"+
		"\u0012\u0000\u0000KL\u0003\u0006\u0003\u0000LM\u0005\u0003\u0000\u0000"+
		"MR\u0003\f\u0006\u0000NO\u0005\u0005\u0000\u0000OQ\u0003\f\u0006\u0000"+
		"PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SW\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000UV\u0005\u0005\u0000\u0000VX\u0003\b\u0004\u0000WU\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YZ\u0005"+
		"\u0005\u0000\u0000Z\\\u0003\n\u0005\u0000[Y\u0001\u0000\u0000\u0000[\\"+
		"\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005\u0004\u0000"+
		"\u0000^_\u0005\u0006\u0000\u0000_\u0005\u0001\u0000\u0000\u0000`a\u0005"+
		"(\u0000\u0000a\u0007\u0001\u0000\u0000\u0000bc\u0005\u0001\u0000\u0000"+
		"ce\u0005(\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fg\u0005\u0013\u0000\u0000gh\u0005\u0016\u0000"+
		"\u0000hi\u0005\u0003\u0000\u0000in\u0003\u000e\u0007\u0000jk\u0005\u0005"+
		"\u0000\u0000km\u0003\u000e\u0007\u0000lj\u0001\u0000\u0000\u0000mp\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005\u0004\u0000"+
		"\u0000r\t\u0001\u0000\u0000\u0000st\u0005\u0001\u0000\u0000tv\u0005(\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wx\u0005\u0015\u0000\u0000xy\u0005\u0016\u0000\u0000yz\u0005"+
		"\u0003\u0000\u0000z\u007f\u0003\u000e\u0007\u0000{|\u0005\u0005\u0000"+
		"\u0000|~\u0003\u000e\u0007\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\u0004\u0000\u0000\u0083\u0084\u0005\u0014"+
		"\u0000\u0000\u0084\u0085\u0003\u0006\u0003\u0000\u0085\u0086\u0005\u0003"+
		"\u0000\u0000\u0086\u008b\u0003\u000e\u0007\u0000\u0087\u0088\u0005\u0005"+
		"\u0000\u0000\u0088\u008a\u0003\u000e\u0007\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0004"+
		"\u0000\u0000\u008f\u000b\u0001\u0000\u0000\u0000\u0090\u0091\u0003\u000e"+
		"\u0007\u0000\u0091\u0093\u00030\u0018\u0000\u0092\u0094\u0003\u0010\b"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0098\u0001\u0000\u0000\u0000\u0095\u0097\u0003\u0012\t\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\r\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005(\u0000\u0000\u009c\u000f\u0001\u0000\u0000\u0000\u009d\u00a0"+
		"\u0003\u0014\n\u0000\u009e\u00a0\u0003\u0016\u000b\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u0011\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a6\u0003\u0018\f\u0000\u00a2\u00a6\u0003\u001a"+
		"\r\u0000\u00a3\u00a6\u0003\u001c\u000e\u0000\u00a4\u00a6\u0003 \u0010"+
		"\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u0013\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0013\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0016\u0000\u0000\u00a9\u0015\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005\u0014\u0000\u0000\u00ab\u00af\u0005(\u0000\u0000"+
		"\u00ac\u00ad\u0005\u0003\u0000\u0000\u00ad\u00ae\u0005(\u0000\u0000\u00ae"+
		"\u00b0\u0005\u0004\u0000\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u0017\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0005\u0017\u0000\u0000\u00b2\u0019\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0005\u0018\u0000\u0000\u00b4\u00b5\u0005\u0019\u0000\u0000\u00b5"+
		"\u001b\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u001c\u0000\u0000\u00b7"+
		"\u00b8\u0003\u001e\u000f\u0000\u00b8\u001d\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bb\u0005$\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00c5"+
		"\u0005%\u0000\u0000\u00bd\u00c5\u0005\'\u0000\u0000\u00be\u00c0\u0005"+
		"$\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c5\u0005&\u0000"+
		"\u0000\u00c2\u00c5\u00032\u0019\u0000\u00c3\u00c5\u0005\u0019\u0000\u0000"+
		"\u00c4\u00ba\u0001\u0000\u0000\u0000\u00c4\u00bd\u0001\u0000\u0000\u0000"+
		"\u00c4\u00bf\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u001f\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0005\u001d\u0000\u0000\u00c7\u00c8\u0005\u0003\u0000\u0000"+
		"\u00c8\u00c9\u0003\"\u0011\u0000\u00c9\u00ca\u0005\u0004\u0000\u0000\u00ca"+
		"!\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005(\u0000\u0000\u00cc\u00cd\u0007"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0003$\u0012\u0000\u00ce#\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d1\u0005$\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u00da\u0005%\u0000\u0000\u00d3\u00da\u0005\'\u0000\u0000\u00d4"+
		"\u00d6\u0005$\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0005&\u0000\u0000\u00d8\u00da\u00032\u0019\u0000\u00d9\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d3\u0001\u0000\u0000\u0000\u00d9\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da%\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0005\u0011\u0000\u0000\u00dc\u00dd\u0005\u0010\u0000"+
		"\u0000\u00dd\u00de\u0003(\u0014\u0000\u00de\u00df\u0005\u0002\u0000\u0000"+
		"\u00df\u00e0\u0005\u000e\u0000\u0000\u00e0\u00e1\u0005\u0003\u0000\u0000"+
		"\u00e1\u00e6\u0003*\u0015\u0000\u00e2\u00e3\u0005\u0005\u0000\u0000\u00e3"+
		"\u00e5\u0003*\u0015\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u0004\u0000\u0000\u00ea\u00eb"+
		"\u0005\u0006\u0000\u0000\u00eb\'\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005"+
		"(\u0000\u0000\u00ed)\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\'\u0000"+
		"\u0000\u00ef+\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0011\u0000\u0000"+
		"\u00f1\u00f2\u0005\u000f\u0000\u0000\u00f2\u00f3\u0003.\u0017\u0000\u00f3"+
		"\u00f7\u00030\u0018\u0000\u00f4\u00f6\u00034\u001a\u0000\u00f5\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005"+
		"\u0006\u0000\u0000\u00fb-\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005(\u0000"+
		"\u0000\u00fd/\u0001\u0000\u0000\u0000\u00fe\u0107\u0005\u0007\u0000\u0000"+
		"\u00ff\u0107\u0003<\u001e\u0000\u0100\u0107\u0005\t\u0000\u0000\u0101"+
		"\u0107\u0005\n\u0000\u0000\u0102\u0107\u0005\u000b\u0000\u0000\u0103\u0107"+
		"\u0005\f\u0000\u0000\u0104\u0107\u0005\r\u0000\u0000\u0105\u0107\u0005"+
		"(\u0000\u0000\u0106\u00fe\u0001\u0000\u0000\u0000\u0106\u00ff\u0001\u0000"+
		"\u0000\u0000\u0106\u0100\u0001\u0000\u0000\u0000\u0106\u0101\u0001\u0000"+
		"\u0000\u0000\u0106\u0102\u0001\u0000\u0000\u0000\u0106\u0103\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0105\u0001\u0000"+
		"\u0000\u0000\u01071\u0001\u0000\u0000\u0000\u0108\u0109\u0007\u0001\u0000"+
		"\u0000\u01093\u0001\u0000\u0000\u0000\u010a\u010f\u0003 \u0010\u0000\u010b"+
		"\u010f\u0003\u0018\f\u0000\u010c\u010f\u0003\u001c\u000e\u0000\u010d\u010f"+
		"\u0003\u001a\r\u0000\u010e\u010a\u0001\u0000\u0000\u0000\u010e\u010b\u0001"+
		"\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010d\u0001"+
		"\u0000\u0000\u0000\u010f5\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0011"+
		"\u0000\u0000\u0111\u0112\u0005\u0010\u0000\u0000\u0112\u0113\u00038\u001c"+
		"\u0000\u0113\u0114\u0005\u0002\u0000\u0000\u0114\u0115\u0005\u0003\u0000"+
		"\u0000\u0115\u011a\u0003:\u001d\u0000\u0116\u0117\u0005\u0005\u0000\u0000"+
		"\u0117\u0119\u0003:\u001d\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119"+
		"\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0004\u0000\u0000\u011e"+
		"\u011f\u0005\u0006\u0000\u0000\u011f7\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0005(\u0000\u0000\u01219\u0001\u0000\u0000\u0000\u0122\u0123\u0003\u000e"+
		"\u0007\u0000\u0123\u0124\u00030\u0018\u0000\u0124;\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0005\b\u0000\u0000\u0126\u0127\u0005\u0003\u0000\u0000\u0127"+
		"\u0128\u0005%\u0000\u0000\u0128\u0129\u0005\u0004\u0000\u0000\u0129=\u0001"+
		"\u0000\u0000\u0000\u001aAGRW[dnu\u007f\u008b\u0093\u0098\u009f\u00a5\u00af"+
		"\u00ba\u00bf\u00c4\u00d0\u00d5\u00d9\u00e6\u00f7\u0106\u010e\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}