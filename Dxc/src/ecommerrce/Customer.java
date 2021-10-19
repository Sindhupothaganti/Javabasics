package ecommerrce;

public class Customer {
	public void walkin() {
		System.out.println("bindhu is going inside bigbazar");
	}
public void shop() {
	System.out.println("customer is shopping");
}
public void checkout() {
	Cashier ansariCashier=new Cashier();
	ansariCashier.estimate();
}
}
