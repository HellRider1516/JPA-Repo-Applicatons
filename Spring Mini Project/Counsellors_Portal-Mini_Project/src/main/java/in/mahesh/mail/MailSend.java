package in.mahesh.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class MailSend {
	
	@Autowired
	private JavaMailSender sender;
	
	public void mailSent(String to,String body,String sub) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("hellridermahesh@gmail.com");
		message.setTo(to);
		message.setText(body);
		message.setSubject(sub);
		sender.send(message);
	}

}
