package Basics;

public class DebugDemo {
public static void main(String[] args) {
	Calculator calc=new Calculator();
	int sum=calc.add(10,20);
	System.out.println("the sum is"+sum);
	for(int a=1;a<=5;a++)
		
	{
		int f=a+5*3;
		
		System.out.println("the number is"+f);
	}
	//throw new NullPointerException();
}
}
