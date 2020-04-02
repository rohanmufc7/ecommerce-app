package com.assigment.ecommerce.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assigment.ecommerce.entity.OrderDetails;


@Service
public interface OrderService {

	public String placeOrder(String id,OrderDetails order);

	public List<OrderDetails> getAllOrders();

}
