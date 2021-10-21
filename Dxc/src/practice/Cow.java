package practice;

public class Cow extends Animal {
	String color="White"; 
	final int i=1;  //final variable 
	void printColor(){  
		System.out.println(color);
	System.out.println(super.color);
	// i=20; we cannot change the value of 'i' as it is final
	}  
    
	public static void main(String args[]){  
	Cow c=new Cow();  
	c.printColor();  
}}
