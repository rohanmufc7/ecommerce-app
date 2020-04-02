package com.assigment.ecommerce.servicesimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.assigment.ecommerce.dao.ItemRepository;
import com.assigment.ecommerce.entity.Item;
import com.assigment.ecommerce.exceptions.ItemNotFoundException;
import com.assigment.ecommerce.services.ItemService;

@Component
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public String addItem(Item item) {
		itemRepository.save(item);
		return "item added successfully";
	}

	@Override
	public List<Item> getAllItem() {
		return itemRepository.findAll();
	}

	@Override
	public Item getItemByItemId(String id) {
		Item item = itemRepository.getItemByItemId(id);
		if (item != null) {
			return item;
		} else {
			throw new ItemNotFoundException();
		}
	}

	@Override
	public String updateItem(Item item) {
		itemRepository.save(item);
		return "item updated successfully";
	}

	@Override
	public String deleteItem(String id) {
		itemRepository.deleteById(id);
		return "deleted item successfully";
	}
}
