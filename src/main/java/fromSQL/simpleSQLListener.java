// Generated from C:/Users/tmstr/IdeaProjects/SQL_to_Java/simpleSQL.g4 by ANTLR 4.13.1
package fromSQL;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleSQLParser}.
 */
public interface simpleSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(simpleSQLParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(simpleSQLParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(simpleSQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(simpleSQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStatement(simpleSQLParser.CreateTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStatement(simpleSQLParser.CreateTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(simpleSQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(simpleSQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#primaryKeyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyDefinition(simpleSQLParser.PrimaryKeyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#primaryKeyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyDefinition(simpleSQLParser.PrimaryKeyDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#foreignKeyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyDefinition(simpleSQLParser.ForeignKeyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#foreignKeyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyDefinition(simpleSQLParser.ForeignKeyDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(simpleSQLParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(simpleSQLParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(simpleSQLParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(simpleSQLParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#keyConstraint}.
	 * @param ctx the parse tree
	 */
	void enterKeyConstraint(simpleSQLParser.KeyConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#keyConstraint}.
	 * @param ctx the parse tree
	 */
	void exitKeyConstraint(simpleSQLParser.KeyConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#columnConstraints}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraints(simpleSQLParser.ColumnConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#columnConstraints}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraints(simpleSQLParser.ColumnConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#primaryKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyConstraint(simpleSQLParser.PrimaryKeyConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#primaryKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyConstraint(simpleSQLParser.PrimaryKeyConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#foreignKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyConstraint(simpleSQLParser.ForeignKeyConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#foreignKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyConstraint(simpleSQLParser.ForeignKeyConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#uniqueConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueConstraint(simpleSQLParser.UniqueConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#uniqueConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueConstraint(simpleSQLParser.UniqueConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#notNullConstraint}.
	 * @param ctx the parse tree
	 */
	void enterNotNullConstraint(simpleSQLParser.NotNullConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#notNullConstraint}.
	 * @param ctx the parse tree
	 */
	void exitNotNullConstraint(simpleSQLParser.NotNullConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#defaultConstraint}.
	 * @param ctx the parse tree
	 */
	void enterDefaultConstraint(simpleSQLParser.DefaultConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#defaultConstraint}.
	 * @param ctx the parse tree
	 */
	void exitDefaultConstraint(simpleSQLParser.DefaultConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(simpleSQLParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(simpleSQLParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#checkConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckConstraint(simpleSQLParser.CheckConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#checkConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckConstraint(simpleSQLParser.CheckConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(simpleSQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(simpleSQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(simpleSQLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(simpleSQLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#createEnumStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateEnumStatement(simpleSQLParser.CreateEnumStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#createEnumStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateEnumStatement(simpleSQLParser.CreateEnumStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(simpleSQLParser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(simpleSQLParser.EnumNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(simpleSQLParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(simpleSQLParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#createDomainStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateDomainStatement(simpleSQLParser.CreateDomainStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#createDomainStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateDomainStatement(simpleSQLParser.CreateDomainStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#domainName}.
	 * @param ctx the parse tree
	 */
	void enterDomainName(simpleSQLParser.DomainNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#domainName}.
	 * @param ctx the parse tree
	 */
	void exitDomainName(simpleSQLParser.DomainNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(simpleSQLParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(simpleSQLParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(simpleSQLParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(simpleSQLParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#domainConstraint}.
	 * @param ctx the parse tree
	 */
	void enterDomainConstraint(simpleSQLParser.DomainConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#domainConstraint}.
	 * @param ctx the parse tree
	 */
	void exitDomainConstraint(simpleSQLParser.DomainConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#createTypeStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTypeStatement(simpleSQLParser.CreateTypeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#createTypeStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTypeStatement(simpleSQLParser.CreateTypeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(simpleSQLParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(simpleSQLParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinition(simpleSQLParser.FieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinition(simpleSQLParser.FieldDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleSQLParser#varcharType}.
	 * @param ctx the parse tree
	 */
	void enterVarcharType(simpleSQLParser.VarcharTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleSQLParser#varcharType}.
	 * @param ctx the parse tree
	 */
	void exitVarcharType(simpleSQLParser.VarcharTypeContext ctx);
}