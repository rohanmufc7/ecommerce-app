package com.assigment.ecommerce.dto;

import javax.persistence.Embeddable;

@Embeddable
public class ItemDTO {
	private String itemId;
	private String name;
	private String description;
	private String category;
	private String price;
	private float rating;

	public ItemDTO() {

	}

	public ItemDTO(String itemId, String name, String description, String category, String price, float rating) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
