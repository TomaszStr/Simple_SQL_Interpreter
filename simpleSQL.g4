// simpleSQL.g4

grammar simpleSQL;

// Parser rules
startRule: statement+;

statement: createTableStatement
         | createEnumStatement
         | createDomainStatement
         | createTypeStatement;

// Create table statement
// Name + column definitions(at least 1) + eventually primary key definition at the end
createTableStatement: CREATE TABLE tableName LPAREN columnDefinition (COMMA columnDefinition)* (COMMA primaryKeyDefinition)? (COMMA foreignKeyDefinition)? RPAREN SEMICOLON;

// Future class name
tableName: IDENTIFIER;

// Primary key added after declaring columns, possible composite key
primaryKeyDefinition: (CONSTRAINT IDENTIFIER)? PRIMARY KEY LPAREN columnName (COMMA columnName)* RPAREN;

// Foreign key added after declaring columns, possible composite key
foreignKeyDefinition: (CONSTRAINT IDENTIFIER)? FOREIGN KEY LPAREN columnName (COMMA columnName)* RPAREN REFERENCES tableName LPAREN columnName (COMMA columnName)* RPAREN;

// Column definition NAME + TYPE + CONSTRAINTS?
columnDefinition: columnName dataType keyConstraint? columnConstraints*;

// Future variable name
columnName: IDENTIFIER;

// Key Consttraints
keyConstraint: primaryKeyConstraint
              | foreignKeyConstraint;

// Column Constraints
columnConstraints: uniqueConstraint
                 | notNullConstraint
                 | defaultConstraint
                 | checkConstraint;

// Primary key after column definition
primaryKeyConstraint: PRIMARY KEY;

// Foreign key after column definition (if the names of columns differ we can specify it)
foreignKeyConstraint: REFERENCES IDENTIFIER (LPAREN IDENTIFIER RPAREN)?;

uniqueConstraint: UNIQUE;

notNullConstraint: NOT NULL;

defaultConstraint: DEFAULT defaultValue;

// Declaring default value
defaultValue: INTEGER_LITERAL
            | STRING_LITERAL
            | FLOAT_LITERAL
            | booleanValue
            | NULL;

checkConstraint: CHECK LPAREN expression RPAREN;

// Expression to check (in future possible regular expressions for text types)
expression: IDENTIFIER (EQUALS | NOTEQUAL | LESS | GREATER | LESSEQUAL | GREATEREQUAL) value;

value: INTEGER_LITERAL
     | STRING_LITERAL
     | FLOAT_LITERAL
     | booleanValue;


// Create enum statement
createEnumStatement: CREATE TYPE enumName AS ENUM LPAREN enumValue (COMMA enumValue)* RPAREN SEMICOLON;

enumName: IDENTIFIER;

enumValue: STRING_LITERAL;

// Create domain statement
createDomainStatement: CREATE DOMAIN domainName dataType domainConstraints* SEMICOLON;

domainName: IDENTIFIER;

// Available data sql data types
dataType: INT_TYPE
        | varcharType
        | BOOLEAN_TYPE
        | DATE_TYPE
        | DOUBLE_TYPE
        | FLOAT_TYPE
        | TEXT_TYPE
        | IDENTIFIER;

booleanValue: TRUE
             | FALSE;

domainConstraints: checkConstraint
                | uniqueConstraint
                | defaultConstraint
                | notNullConstraint;

// Create type statement
createTypeStatement: CREATE TYPE typeName AS LPAREN fieldDefinition (COMMA fieldDefinition)* RPAREN SEMICOLON;

typeName: IDENTIFIER;

fieldDefinition: columnName dataType;

varcharType: VARCHAR LPAREN INTEGER_LITERAL RPAREN;


//======================================================
//                      TOKENS
//======================================================

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
REFERENCES: 'REFERENCES';
FOREIGN: 'FOREIGN';
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

INTEGER_LITERAL: ('-')?[0-9]+;
FLOAT_LITERAL: ('-')?[0-9]* '.' [0-9]+;
STRING_LITERAL: '\'' (~'\'')* '\'';
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [ \t\r\n]+ -> skip;