package com.online.shop.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.shop.entity.CreateOrderReqDto;
import com.online.shop.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	public void createOrder(ArrayList<CreateOrderReqDto> orders) {
		orderRepository.insertOrderDetails(orders);
		
	}

}
