package com.assigment.ecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.assigment.ecommerce.entity.OrderDetails;
import com.assigment.ecommerce.response.OrderResponse;
import com.assigment.ecommerce.services.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;


	@PostMapping("/{id}")
	ResponseEntity<String> placeOrder(@PathVariable("id") String id, @RequestBody OrderDetails order) {
	
		String result = orderService.placeOrder(id,order);
		return new ResponseEntity<String>(result, HttpStatus.ACCEPTED);

	}

	@GetMapping("/")
	ResponseEntity<OrderResponse> getAllOrders() {
		List<OrderDetails> list = orderService.getAllOrders();
		OrderResponse orderResponse = new OrderResponse(list);
		return new ResponseEntity<OrderResponse>(orderResponse, HttpStatus.OK);
	}
}
