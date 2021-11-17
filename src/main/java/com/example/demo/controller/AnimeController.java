package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Anime;

@Controller
public class AnimeController {

		@RequestMapping("/list")
		public String list(Model model) {
			List<Anime> result = new ArrayList<Anime>(); 
			
			Anime tensura = new Anime(1,"転スラ","スライム")；
			Anime kimetsu = new Anime(2,"鬼滅の刃","きめつ")；

			animes.add(tensura);
			animes.add(kimetsu);
			
			model.addAttribute("animes",animes);//タイムリーフに渡す
			
			return "list";
		}
	
	
	
}
