package com.assigment.ecommerce.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assigment.ecommerce.entity.Item;
import com.assigment.ecommerce.response.ItemResponse;
import com.assigment.ecommerce.services.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@PostMapping("/additem")
	public ResponseEntity<String> addItem(@RequestBody Item item) {
		String result = itemService.addItem(item);
		return new ResponseEntity<String>(result, HttpStatus.ACCEPTED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ItemResponse> getItemById(@PathVariable("id") String id) {
		Item item = itemService.getItemByItemId(id);
		ItemResponse itemResponse = new ItemResponse(Arrays.asList(item));
		return new ResponseEntity<ItemResponse>(itemResponse, HttpStatus.ACCEPTED);
	}

	@GetMapping("/getall")
	public ResponseEntity<ItemResponse> getAllItem() {
		List<Item> item = itemService.getAllItem();
		ItemResponse itemResponse = new ItemResponse(item);
		return new ResponseEntity<ItemResponse>(itemResponse, HttpStatus.ACCEPTED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateItem(@RequestBody Item item) {
		String result = itemService.updateItem(item);
		return new ResponseEntity<String>(result, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteItemById(@PathVariable("id") String id) {
		String result = itemService.deleteItem(id);
		return new ResponseEntity<String>(result, HttpStatus.ACCEPTED);
	}

}