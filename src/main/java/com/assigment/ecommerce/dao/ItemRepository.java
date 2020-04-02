package com.assigment.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assigment.ecommerce.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {

	Item getItemByItemId(String id);

}
