package com.online.shop.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.online.shop.entity.ItemEntity;

@Mapper
public interface OnlineShopMapper {
	public ArrayList<ItemEntity> getAllItems();
}
