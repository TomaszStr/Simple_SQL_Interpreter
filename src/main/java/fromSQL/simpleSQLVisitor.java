// Generated from C:/Users/tmstr/IdeaProjects/SQL_to_Java/simpleSQL.g4 by ANTLR 4.13.1
package fromSQL;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(simpleSQLParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(simpleSQLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableStatement(simpleSQLParser.CreateTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(simpleSQLParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#primaryKeyDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyDefinition(simpleSQLParser.PrimaryKeyDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#foreignKeyDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyDefinition(simpleSQLParser.ForeignKeyDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(simpleSQLParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(simpleSQLParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#keyConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyConstraint(simpleSQLParser.KeyConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#columnConstraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraints(simpleSQLParser.ColumnConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#primaryKeyConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyConstraint(simpleSQLParser.PrimaryKeyConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#foreignKeyConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyConstraint(simpleSQLParser.ForeignKeyConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#uniqueConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueConstraint(simpleSQLParser.UniqueConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#notNullConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNullConstraint(simpleSQLParser.NotNullConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#defaultConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultConstraint(simpleSQLParser.DefaultConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(simpleSQLParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#checkConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckConstraint(simpleSQLParser.CheckConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(simpleSQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(simpleSQLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#createEnumStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateEnumStatement(simpleSQLParser.CreateEnumStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#enumName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumName(simpleSQLParser.EnumNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(simpleSQLParser.EnumValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#createDomainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDomainStatement(simpleSQLParser.CreateDomainStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#domainName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomainName(simpleSQLParser.DomainNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(simpleSQLParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(simpleSQLParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#domainConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomainConstraint(simpleSQLParser.DomainConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#createTypeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTypeStatement(simpleSQLParser.CreateTypeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(simpleSQLParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#fieldDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDefinition(simpleSQLParser.FieldDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleSQLParser#varcharType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarcharType(simpleSQLParser.VarcharTypeContext ctx);
}