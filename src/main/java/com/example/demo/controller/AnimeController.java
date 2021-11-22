package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.entity.Anime;
import com.example.demo.service.AnimeService;


@Controller 

//	@Autowired //他クラス呼び出し
//	AnimeService service;
	
//		@GetMapping("/list")
//		public String index(Model model) {
//		String sql = "SELECT * FROM favorite_anime";
//		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
//		model.addAttribute("favorite_anime", list);//タイムリーフに渡す
//		return "list";
//		}
	
	
@RequestMapping("Anime")
public class AnimeController {

	    @Autowired
	    AnimeService animeService;

	    @RequestMapping(value="list")
	    public String list(Model model) {
	        Collection<Product> products = animeService.findAll();
	        model.addAttribute("products", products);
	        return "list";
	    }
	
	
}
