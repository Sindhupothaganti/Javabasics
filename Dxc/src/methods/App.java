package methods;

public class App {
	void login(String un,String pwd)
	{
System.out.println(un);
System.out.println(pwd);
	}
	void login(long phno,int otp)
	{
		System.out.println(phno);
		System.out.println(otp);
	}
	public static void main(String[] args) {
		App a=new App();
		a.login("sindhu","password");
		a.login(1232123432,2345);
	}
}
