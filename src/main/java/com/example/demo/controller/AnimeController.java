package com.example.demo.controller;

//�@�A�j����ʂ𐧌䂷��Controller
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //DI��Controller�Ƃ��ēo�^
public class AnimeController {

		@RequestMapping("/list")
		public String list() {
			return "list";
		}
	
	
	
}
