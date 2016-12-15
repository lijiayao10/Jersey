package com.cc.jersey.web;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/rest")
public class UserController {
	
	@ResponseBody
	@RequestMapping("/")
	public HashMap<String,String> list(){
		
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("k1", "v1");
		hashMap.put("k2", "v2");
		
		return hashMap;
	}
	
	
	@ResponseBody
	@RequestMapping("/{key}")
	public String list(@PathVariable String key){
		
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("k1", "v1");
		hashMap.put("k2", "v2");
		
		return hashMap.get(key);
	}
}

