package com.kkhindigyan.org;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kkhindigyan.model.PaymentGateway;
/**
 * @author Kishan Kumar
 *
 */
public class ClientTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext applicationContext = null;
		
		try {
			
			//Creating Instance of ApplicationContext Spring Container
			applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			PaymentGateway paymentGateway = applicationContext.getBean(PaymentGateway.class);
			System.out.println(paymentGateway.getPaymentGatewayId());
			System.out.println(paymentGateway.getOrder());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (applicationContext != null)
				applicationContext.close();
		}
	}
}
