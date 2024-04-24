# SQL to Java Class Generator

## Project Description:
The project aims to develop an SQL interpreter that analyzes "CREATE" commands and generates Java class files based on them.

## Key Features:

### SQL Command Analysis:
- Interpretation of "CREATE TABLE" and other SQL "CREATE" commands.

### Java Class File Generation:
- Generate Java class files based on the interpreted "CREATE" commands.
- Each table defined in a "CREATE TABLE" command should correspond to a Java class.
- SQL data types should be mapped to appropriate Java data types.

### Support for Keys and Indexes:
- Handle definitions of primary keys, foreign keys, and indexes.
- Annotations or methods in the generated Java class files to reflect these keys and indexes.

### Table Relationships:
- Generate appropriate relationships between Java classes based on foreign key definitions.

## Technologies:
- Programming Language: Java
- SQL Parser: ANTLR

## Example:

### SQL Input:
```sql
CREATE TABLE Users (
    UserID INT PRIMARY KEY,
    UserName VARCHAR(50),
    Email VARCHAR(50) UNIQUE,
    Age INT
);
```
### Java Output:
```java
public class Users {
    private int userID;
    private String userName;
    private String email;
    private int age;

    // Getters and Setters
    // ...

    // Constructors
    // ...
}
```
