package com.lxx.boot.mapper;

import com.lxx.boot.model.Item;

import java.util.List;

public interface ItemMapper {

    void add(Item i);
	
	List<Item> find();
	
}
