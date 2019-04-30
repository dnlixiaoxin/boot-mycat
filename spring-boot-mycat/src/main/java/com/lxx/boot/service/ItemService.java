package com.lxx.boot.service;

import com.lxx.boot.model.Item;

import java.util.List;

public interface ItemService {
	
	public void add(Item i);
	
	List<Item> find();
	
}
