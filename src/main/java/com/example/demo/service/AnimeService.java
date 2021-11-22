package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Anime;
import com.example.demo.mapper.AnimeMapper;

@Service 
public class AnimeService {

	@Autowired
	AnimeMapper Mapper;
	
	public List<Anime> getAnimeList(){
		return Mapper.selectAll();
	}
}
