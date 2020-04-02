package com.assigment.ecommerce.response;

import java.util.List;

import com.assigment.ecommerce.entity.OrderDetails;

public class OrderResponse {

	private List<OrderDetails> ordersList;

	public OrderResponse(List<OrderDetails> ordersList) {
		super();
		this.ordersList = ordersList;
	}

	public List<OrderDetails> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<OrderDetails> ordersList) {
		this.ordersList = ordersList;
	}

}
