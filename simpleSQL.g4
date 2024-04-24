// simpleSQL.g4

grammar simpleSQL;

// Parser rules
startRule: statement+;

statement: createTableStatement
         | createEnumStatement
         | createDomainStatement
         | createTypeStatement;

// Create table statement
// Name + column definitions + eventually primary key definition at the end
createTableStatement: CREATE TABLE tableName LPAREN columnDefinition (COMMA columnDefinition)* (COMMA primaryKeyDefinition)? RPAREN SEMICOLON;

tableName: IDENTIFIER;

primaryKeyDefinition: CONSTRAINT IDENTIFIER? PRIMARY KEY LPAREN columnName (COMMA columnName)* RPAREN;

// Column definition NAME + TYPE + CONSTRAINTS?
columnDefinition: columnName dataType columnConstraints?;

columnName: IDENTIFIER;

//CONSTRAINTS
columnConstraints: primaryKeyConstraint
                 | uniqueConstraint
                 | notNullConstraint
                 | defaultConstraint
                 | checkConstraint;

primaryKeyConstraint: PRIMARY KEY;

uniqueConstraint: UNIQUE;

notNullConstraint: NOT NULL;

defaultConstraint: DEFAULT defaultValue;

defaultValue: INTEGER_LITERAL
            | STRING_LITERAL
            | FLOAT_LITERAL
            | BOOLEAN_VALUE
            | NULL;

checkConstraint: CHECK LPAREN expression RPAREN;

expression: IDENTIFIER (EQUALS | NOTEQUAL | LESS | GREATER | LESSEQUAL | GREATEREQUAL) value;

value: INTEGER_LITERAL
     | STRING_LITERAL
     | FLOAT_LITERAL
     | BOOLEAN_VALUE;


// Create enum statement
createEnumStatement: CREATE ENUM enumName LPAREN enumValue (COMMA enumValue)* RPAREN SEMICOLON;

enumName: IDENTIFIER;

enumValue: STRING_LITERAL;

// Create domain statement
createDomainStatement: CREATE DOMAIN domainName dataType domainConstraint? SEMICOLON;

domainName: IDENTIFIER;

dataType: INT_TYPE
        | VARCHAR_TYPE
        | BOOLEAN_TYPE
        | DATE_TYPE
        | DOUBLE_TYPE
        | FLOAT_TYPE
        | TEXT_TYPE
        | IDENTIFIER;

BOOLEAN_VALUE: TRUE
             | FALSE;

domainConstraint: checkConstraint
                | uniqueConstraint
                | defaultConstraint;

// Create type statement
createTypeStatement: CREATE TYPE typeName AS LPAREN fieldDefinition (COMMA fieldDefinition)* RPAREN SEMICOLON;

typeName: IDENTIFIER;

fieldDefinition: columnName dataType;

VARCHAR_TYPE: VARCHAR LPAREN INTEGER_LITERAL RPAREN;


// TOKENS
CONSTRAINT: 'CONSTRAINT';
AS: 'AS';
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
SEMICOLON: ';';
INT_TYPE: 'INT' | 'INTEGER';
VARCHAR: 'VARCHAR';
BOOLEAN_TYPE: 'BOOLEAN';
DATE_TYPE: 'DATE';
DOUBLE_TYPE: 'DOUBLE';
FLOAT_TYPE: 'FLOAT';
TEXT_TYPE: 'TEXT';
ENUM: 'ENUM';
DOMAIN: 'DOMAIN';
TYPE: 'TYPE';
CREATE: 'CREATE';
TABLE: 'TABLE';
PRIMARY: 'PRIMARY';
KEY: 'KEY';
UNIQUE: 'UNIQUE';
NOT: 'NOT';
NULL: 'NULL';
TRUE: 'TRUE';
FALSE: 'FALSE';
DEFAULT: 'DEFAULT';
CHECK: 'CHECK';
EQUALS: '=';
NOTEQUAL: '<>';
LESS: '<';
GREATER: '>';
LESSEQUAL: '<=';
GREATEREQUAL: '>=';

INTEGER_LITERAL: [0-9]+;
FLOAT_LITERAL: [0-9]* '.' [0-9]+;
STRING_LITERAL: '\'' (~'\'')* '\'';
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [ \t\r\n]+ -> skip;