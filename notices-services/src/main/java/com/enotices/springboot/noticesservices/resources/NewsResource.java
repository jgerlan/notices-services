package com.enotices.springboot.noticesservices.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enotices.springboot.noticesservices.repository.NewsRepository;
import com.enotices.springboot.noticesservices.models.News;

@RestController
@RequestMapping(value="/api")
public class NewsResource {
	
	@Autowired
	NewsRepository newsRepository;
	
	@GetMapping("/news")
	public List<News> listagemNews(){
		return newsRepository.findAll();
	}
	
	@GetMapping("/notice/{id}")
	public News listagemNewsJustOne(@PathVariable(value="id") long id){
		return newsRepository.findById(id);
	}
}
