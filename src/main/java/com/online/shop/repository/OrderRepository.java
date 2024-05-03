package com.online.shop.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.online.shop.entity.CreateOrderReqDto;

@Mapper
public interface OrderRepository {
	public void insertOrderDetails(ArrayList<CreateOrderReqDto> orders) ;

}
