package com.springbootsecurity.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.springbootsecurity.entities.User;
import com.springbootsecurity.repository.UserRepository;

import jakarta.mail.internet.MimeMessage;
import jakarta.servlet.http.HttpSession;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private JavaMailSender mailSender;

	public User saveUser(User users,String url) throws Exception {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(users.getPassword());
		users.setPassword(encodedPassword);
		
		users.setEnable(false);
		users.setVerificationCode(UUID.randomUUID().toString());
		User newUser = userRepository.save(users);
		
		if(newUser!=null) {
		sendEmail(newUser, url);
		}
		return newUser;
	}

	public User selectByEmail(String email) {
		User user = userRepository.findByEmail(email);
		return user;
	}

	// make method for removing the session
	public void removeSessionMessage() {
		HttpSession session = ((ServletRequestAttributes) (RequestContextHolder.getRequestAttributes())).getRequest()
				.getSession();
		session.removeAttribute("msg");
	}

	// make method for sending email
	public void sendEmail(User user, String url) throws Exception {

		String from = "cmallick88@gmail.com";
		String to = user.getEmail();
		String subject = "Account Verification";
		String content = "Dear [[name]],<br>" + "Please chick the link bellow to verify your registration:<br>"
				+ "<h3><a href='[[URL]]' target='_self'>VERIFY</a></h3>" + "Thank You,<br>" + "simplilearn";
		
		try {
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message);

			helper.setFrom(from, "simplilearn");
			helper.setTo(to);
			helper.setSubject(subject);
			
			content = content.replace("[[name]]", user.getName());
			String siteUrl=url+"/verify?code="+user.getVerificationCode();
			content=content.replace("[[URL]]", siteUrl);
			
			helper.setText(content,true);
			mailSender.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// make method for verify account
	public boolean verifyAccount(String verficationCode) {
		
		User user = userRepository.findByVerificationCode(verficationCode);
		
		if(user==null) {
		return false;	
		}else {
			user.setEnable(true);
			user.setVerificationCode(null);
			userRepository.save(user);
		return true;
		}
	}
}
