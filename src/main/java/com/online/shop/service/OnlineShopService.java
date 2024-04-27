package com.online.shop.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.shop.entity.ItemEntity;
import com.online.shop.repository.OnlineShopMapper;

@Service
public class OnlineShopService {
	
	@Autowired
	OnlineShopMapper onlineShopMapper;
	
	public ArrayList<ItemEntity> getAllItems(){
		return onlineShopMapper.getAllItems();
	}
}
