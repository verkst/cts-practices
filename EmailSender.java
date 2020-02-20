package sop;

import java.util.Properties;

import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {

	public static boolean sendMail (String from,String password,String message,String to ) {
		String host="smtp.gmail.com";
		Properties props=System.getProperties();
		props.put("mail.smtp.starttls.enable", true);
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.user", from);
		props.put("mail.smtp.password", password);
		props.put("mail.smtp.port", 587);
		props.put("mail.smtp.auth", true);
		Session session=Session.getDefaultInstance(props,null);
		MimeMessage mimeMessage=new MimeMessage(session);
		try {
			mimeMessage.setFrom(new InternetAddress(from));
			//now get the address of recipient address
			InternetAddress toAddress=new InternetAddress[to.length()];
			//for(int i=0;i<to.length();i++) {
				toAddress=new InternetAddress(to);
			//}
			//Now add all the toAddress elements to MimeMessage
			for(int i=0;i<toAddress.length();i++) {
				mimeMessage.addRecipient(RecipientType.TO, toAddress[i]);
			}
			//add Subject
			mimeMessage.setSubject("mail using javaMail API");
			//set message to mimeMessage
			mimeMessage.setText(message);
			Transport transport=session.getTransport("smtp");
			transport.connect(host,from,password);
			transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
			transport.close();
			
			return true;
			
		}catch(MessagingException me) {
			me.printStackTrace();
		}
		
		return false;
	}

}
