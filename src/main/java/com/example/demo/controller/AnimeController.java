package com.example.demo.controller;

//@ƒAƒjƒ‰æ–Ê‚ğ§Œä‚·‚éController
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //DI‚ÉController‚Æ‚µ‚Ä“o˜^
public class AnimeController {

		@RequestMapping("/list")
		public String list() {
			return "list";
		}
	
	
	
}
