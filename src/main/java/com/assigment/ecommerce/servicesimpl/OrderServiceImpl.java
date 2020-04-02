package com.assigment.ecommerce.servicesimpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.assigment.ecommerce.dao.ItemRepository;
import com.assigment.ecommerce.dao.OrderRepository;
import com.assigment.ecommerce.dto.ItemDTO;
import com.assigment.ecommerce.entity.Item;
import com.assigment.ecommerce.entity.OrderDetails;
import com.assigment.ecommerce.exceptions.ItemNotFoundException;
import com.assigment.ecommerce.exceptions.NoOrderPresentException;
import com.assigment.ecommerce.services.OrderService;

@Component
public class OrderServiceImpl implements OrderService {

	@Autowired
	private ItemRepository itemRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public String placeOrder(String id, OrderDetails order) {
		Item item = itemRepository.getItemByItemId(id);
		if (item == null) {
			throw new ItemNotFoundException();
		}
		ModelMapper modelMapper = new ModelMapper();
		ItemDTO itemDTO = modelMapper.map(item, ItemDTO.class);
		order.setItemDTO(itemDTO);
		orderRepository.save(order);
		return "Order Placed Successfully";
	}

	@Override
	public List<OrderDetails> getAllOrders() {
		List<OrderDetails> list = orderRepository.findAll();
		if (list.size() == 0) {
			throw new NoOrderPresentException();
		} else {
			return list;
		}
	}

}
