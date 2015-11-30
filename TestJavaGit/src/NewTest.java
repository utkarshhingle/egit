import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.jboss.aerogear.security.otp.Totp;
import org.jboss.aerogear.security.otp.api.Clock;


public class NewTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
//		
//		     String sharedSecret = "B2374TNIQ3HKC446";
//		     Totp totp = new Totp(sharedSecret);
////		        String url = String.format("otpauth://totp/%s?secret=%s", "john%23doe", sharedSecret);
////
////		 System.out.println(url + " " + totp.uri("john#doe"));  
//		     
//		     Clock customClock = new Clock(10);
//		     
//	        totp = new Totp(sharedSecret, customClock);
//	        String otp =  totp.now();
//	        Thread.sleep(1000);
//	        System.out.println(totp.verify(otp));
	        
		Clock customClock = new Clock(5);
	        String secret = "xxxxxxxxxxxxxxxxxxxxxxxxxxxx";
	        Totp totp = new Totp(secret,customClock);
	        String otp =  totp.now(); // 427773
	        
System.out.println(otp);
	        System.out.println(totp.verify(otp)); // true
	        try {
	         Thread.sleep(10000);
	        } catch (InterruptedException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	        }
	        System.out.println(totp.verify(otp)); // false
	        

	}
	
	public void genericOTP(){
		Clock customClock = new Clock(5);
		String secret = "B2374TNIQ3HKC446";
		Totp totp = new Totp(secret,customClock);
		String otp =  totp.now();
		
	}
	


}
