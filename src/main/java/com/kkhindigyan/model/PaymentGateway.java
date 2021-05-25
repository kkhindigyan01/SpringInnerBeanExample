package com.kkhindigyan.model;
/**
 *  * @author KK HindiGyan
 *This is PaymentGateway class
 */
public class PaymentGateway {
	
	private String paymentGatewayId;
	private Order order;
	
	public PaymentGateway(String paymentGatewayId, Order order) {
		super();
		this.paymentGatewayId = paymentGatewayId;
		this.order = order;
	}
	
	public Order getOrder() {
		return order;
	}
	
	public String getPaymentGatewayId() {
		return paymentGatewayId;
	}
	
	/*public String getPaymentGatewayId() {
		return paymentGatewayId;
	}
	public void setPaymentGatewayId(String paymentGatewayId) {
		this.paymentGatewayId = paymentGatewayId;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}*/
}
