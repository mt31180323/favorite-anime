package com.example.demo.controller;

//　アニメ画面を制御するController
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //DIにControllerとして登録
public class AnimeController {

		@RequestMapping("/list")
		public String list() {
			return "list";
		}
	
	
	
}
