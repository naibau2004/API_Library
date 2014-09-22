package mail_Test;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class mail_Test 
{
	public static void main(String[] args)
	{
		try
		{
//			設定傳送基本資訊
			String host = "172.16.200.27" ;
			String from = "chichun_yu@syscom.com.tw" ;
			String to = "naibau2004@gmail.com" ;
			
//			這行不曉得幹啥用的
			Properties props = System.getProperties() ;
			
//			設定SMTP Server，前面的"mail.smtp.host"固定照抄
			props.put("mail.smtp.host", host ) ;
			
//			依據Properties建立一個session
			Session mailSession = Session.getDefaultInstance( props , null ) ;
			
//			把Session餵給Message(指定寄件mail Server，而Message用來建立信件)
			Message MailMessage = new MimeMessage (mailSession) ;
			
//			設定寄件者email
			MailMessage.setFrom( new InternetAddress(from) );
			
//			設定收件者email
			MailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to) ) ;
			
//			設定郵件標題
			MailMessage.setSubject( "Hello JavaMail" ) ;
			
//			設定郵件內文
			MailMessage.setText( "Wellcome to JavaMail...!" ) ;
			
//			傳送
			Transport.send( MailMessage );
			
//			成功後顯示傳送成功
			System.out.println ("Mail was sent successfully !\n" ) ;
			
		}catch ( Exception e)
		{
			System.out.println ( e.getMessage() ) ;
		}
	}
}
