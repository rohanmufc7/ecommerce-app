package com.assigment.ecommerce.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Embeddable
public class Item {

	@Id
	@NotNull
	private String itemId;
	private String name;
	private String description;
	private String category;
	private String price;
	private float rating;

	public Item() {

	}

	public Item(String itemId, String name, String description, String price, float rating, String category) {

		this.itemId = itemId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.rating = rating;
		this.category = category;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
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

}
