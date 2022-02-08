package com.redhat.demo.gateways;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.redhat.demo.entity.User;


public class BlackName {

	
	
	static RestTemplate restTemplate = new RestTemplate();
	
	static public Boolean check(User user) {
		
		String fooResourceUrl
		  = "http://611f1b779771bf001785c6c9.mockapi.io/api/v1/black";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(fooResourceUrl, String.class);
		
//		System.out.println(response.getBody().toString());
//		{"result":"yes"}
//		https://mockapi.io/
		System.out.println(response.getBody().toString().indexOf("yes"));
		
		if ( 0<response.getBody().toString().indexOf("yes")){
			return true;
		}else {
			return false;
		}
	    
	}
}
