package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.services.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/springaop/config.xml");
       PaymentService service = context.getBean("payment",PaymentService.class);
       service.makepament(10000);
    }
}