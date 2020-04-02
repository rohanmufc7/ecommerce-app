package com.assigment.ecommerce.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.assigment.ecommerce.dto.ItemDTO;

@Entity
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;

	@Embedded
	private ItemDTO itemDTO;

	private int quantity;

	private String email;

	public OrderDetails() {

	}

	public OrderDetails(int orderId, ItemDTO itemDTO, int quantity, String email) {
		super();
		this.orderId = orderId;
		this.itemDTO = itemDTO;
		this.quantity = quantity;
		this.email = email;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public ItemDTO getItemDTO() {
		return itemDTO;
	}

	public void setItemDTO(ItemDTO itemDTO) {
		this.itemDTO = itemDTO;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuanity(int quantity) {
		this.quantity = quantity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
