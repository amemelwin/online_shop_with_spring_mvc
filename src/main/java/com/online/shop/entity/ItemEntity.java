package com.online.shop.entity;

import lombok.Data;

@Data
public class ItemEntity {
	
	private int id;
	private String name;
	private int price;
	private String photoUrl;
	private int categoryId;
	private String createdAt;
	private String updatedAt;
	



}
