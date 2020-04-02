package com.assigment.ecommerce.response;

import java.util.List;

import com.assigment.ecommerce.entity.Item;

public class ItemResponse {

	public List<Item> itemList;

	public ItemResponse() {

	}

	public ItemResponse(List<Item> itemList) {
		this.itemList = itemList;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

}
