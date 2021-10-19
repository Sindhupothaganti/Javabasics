package ecommerrce;

public class TestShopping {
public static void main(String[] args) {
	Customer customerbindhu=new Customer();
	customerbindhu.walkin();
Security maxSecurity=new Security();
boolean isCustomer=maxSecurity.scan(customerbindhu);
if(isCustomer) {
	customerbindhu.shop();
}
customerbindhu.checkout();
}
}
