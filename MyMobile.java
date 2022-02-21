package week1.day2;

public class MyMobile {

	private static final boolean Yes = false;
	static String modleName="RealmeXT";
	static long mobileNumber=9491976577l;
	static short mobilePrice=16453;
	static int imei=36956895;
	static double andriodVersion=10.5;
    static char name='l';
    static boolean isMobileVibrating=Yes;
    public void makecall() {
    	System.out.println("Calling Mom");
    }
    public void sendMsg() {
    	System.out.println("send message");
    }
    
    private void payBills() {
    	System.out.println("Bill Payment");
    }
    
			public static void main(String[] args) {
		System.out.println(modleName);
		System.out.println(mobileNumber);
		System.out.println(mobilePrice);
		System.out.println(imei);
		System.out.println(andriodVersion);
		System.out.println(name);
		MyMobile obj= new MyMobile();
		obj.makecall();
		obj.sendMsg();
		obj.payBills();
		
	}

}
