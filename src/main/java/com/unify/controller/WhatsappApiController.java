package com.unify.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;


@RequestMapping("/whatsapp/Api")
@RestController
public class WhatsappApiController {

	@PostMapping("/sentTextMsg")
	public Map<String, Object> textTypeTemplateMessage(@RequestBody Map<String, Object> body) {
		System.out.println(body);
		Gson gson=new Gson();
		String json=gson.toJson(body);
		System.out.println(json);
		return body;
	}
}
