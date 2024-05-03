package com.online.shop.apiController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.shop.entity.ApiErrResponse;
import com.online.shop.entity.ApiResponse;
import com.online.shop.entity.CreateOrderReqDto;
import com.online.shop.service.OrderService;

import jakarta.annotation.PostConstruct;

@RestController
public class ItemController {
	
	@Autowired
	OrderService orderService;
	
	@PostConstruct
	public void init() {
	}
	
	@GetMapping("/test")
	public ResponseEntity<Object> test() {
		return ResponseEntity.ok("Hello api testing");
				
	}
	
	
	@PostMapping("/order")
    public ResponseEntity<Object> test(@RequestBody ArrayList<CreateOrderReqDto> order) {
        System.out.println("Received POST request with body: " + order);	
        orderService.createOrder(order);
        
        Map<String,String> errors = new HashMap<String,String>();
        errors.put("email", "Email Already Exist");
        return new ApiErrResponse(HttpStatus.CONFLICT, "NG", errors).response();
        //return new ResponseEntity(errors,HttpStatus.CONFLICT);
       
    }

}
