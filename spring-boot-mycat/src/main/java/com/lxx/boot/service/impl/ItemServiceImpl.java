package com.lxx.boot.service.impl;

import com.lxx.boot.mapper.ItemMapper;
import com.lxx.boot.model.Item;
import com.lxx.boot.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Resource
	private ItemMapper itemMapper;
	
	@Override
	public void add(Item i) {
		itemMapper.add(i);		
	}

	@Override
	public List<Item> find() {
		return itemMapper.find();
	}

	
	
}
