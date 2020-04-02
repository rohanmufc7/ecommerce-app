package com.assigment.ecommerce.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assigment.ecommerce.entity.Item;

@Service
public interface ItemService {

	public String addItem(Item item);

	public Item getItemByItemId(String id);

	public List<Item> getAllItem();

	public String updateItem(Item item);
	
	public String deleteItem(String id);
}
