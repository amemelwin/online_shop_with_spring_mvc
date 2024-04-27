package com.online.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.online.shop.service.OnlineShopService;

import jakarta.annotation.PostConstruct;

@Controller
public class OnlineShopController {
	
	@Autowired
	OnlineShopService onlineShopService;
	
//	@PostConstruct
//	public void init() {
//		System.out.println(onlineShopService.getAllItems());
//	}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("items", onlineShopService.getAllItems());
		return "screens/index";
	}
	
	@GetMapping("/items")
	public void getAllItems() {
		System.out.println(onlineShopService.getAllItems());
	}

}
