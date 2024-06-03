package SqlToJava;

import jakarta.persistence.*;

@Entity
@Table(name = "MyTable")
class MyTable {
	@Id
	@Column(name = "key1")
	private int key1;
	@Id
	@Column(name = "key2")
	private int key2;
	public MyTable(){}
	public MyTable(int key1,int key2){
		this.key1 = key1;
		this.key2 = key2;
	}
	public void setKey1(int key1){
		this.key1 = key1;
	}
	public void setKey2(int key2){
		this.key2 = key2;
	}
	public int getKey1(){
		return key1;
	}
	public int getKey2(){
		return key2;
	}
}