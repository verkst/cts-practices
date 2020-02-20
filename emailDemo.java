package sop;

import java.util.Scanner;

public class emailDemo {


	public int otp;
	public int generateOTP() {
		otp=(int) (Math.random()*1000000);
			
			return otp;
		}

	public static void main(String[] args) {

		int userip;
		Scanner sc=new Scanner(System.in);
		emailDemo ed=new emailDemo();
		
		String to;
		System.out.println("Enter gmail id");
		to=sc.nextLine();
		String messag;
		System.out.println("Enter message");
		messag=sc.nextLine();
		if(EmailSender.sendMail("venkat96123@gmail.com", 
								"Verkst@12",
								messag,to ))
			System.out.println("email sent Successfully");
		else
			System.out.println("Some error Occurred");
		
	}

}
