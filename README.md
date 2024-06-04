# SQL to Java Class Generator

## Project Description:
The project aims to develop an SQL interpreter that analyzes "CREATE" commands and generates Java class files based on them.

## Key Features:

### Console program:
- A simple console interface which lets decide whether read SQL commands from file or directly from console.
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
- jakarta.persistance annotations.
  
## Technologies:
- Programming Language: Java
- Build: Maven
- Annotations: jakarta.persistance
- SQL Parser: ANTLR
## TBA:
- composite foreign and primary keys

## Example:

### SQL Input:
```sql
CREATE TABLE Users (
    UserID INT PRIMARY KEY,
    UserName VARCHAR(50) DEFAULT 'John Smith',
    Email VARCHAR(50) UNIQUE,
    Age INT,
    DetailsId INT REFERENCES Details
);
```
### Java Output:
```java
import jakarta.persistence.*;

@Entity
@Table(name = "Users")
class Users {
	@Id
	@Column(name = "UserID")
	private int UserID;
	@Column(name = "UserName")
	private String UserName = "John Smith";
	@Column(name = "Email" ,unique = true)
	private String Email;
	@Column(name = "Age")
	private int Age;
	@ManyToOne
	@JoinColumn(name = "DetailsId")
	private Details DetailsId;
	public Users(){}
	public Users(int UserID,String UserName,String Email,int Age,Details DetailsId){
		this.UserID = UserID;
		this.UserName = UserName;
		this.Email = Email;
		this.Age = Age;
		this.DetailsId = DetailsId;
	}
	public void setUserID(int UserID){
		this.UserID = UserID;
	}
	public void setUserName(String UserName){
		this.UserName = UserName;
	}
	public void setEmail(String Email){
		this.Email = Email;
	}
	public void setAge(int Age){
		this.Age = Age;
	}
	public void setDetailsId(Details DetailsId){
		this.DetailsId = DetailsId;
	}
	public int getUserID(){
		return UserID;
	}
	public String getUserName(){
		return UserName;
	}
	public String getEmail(){
		return Email;
	}
	public int getAge(){
		return Age;
	}
	public Details getDetailsId(){
		return DetailsId;
	}
}
```
