package com.enotices.springboot.noticesservices.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enotices.springboot.noticesservices.models.ListNews;
import com.enotices.springboot.noticesservices.repository.ListNewsRepository;

// Classe que adiciona noticias e mostra fora de uma lista de noticias

@RestController
@RequestMapping(value="/api")
public class ListNewsResource {
	@Autowired
	ListNewsRepository listNewsRepository;
	
	@GetMapping("/ListNews")
	public List<ListNews> listagemListNews(){
		return listNewsRepository.findAll();
	}
	
	@GetMapping("/ListNews/{id}")
	public ListNews listagemListNewsOne(@PathVariable(value="listId") long listId) {
		return listNewsRepository.findById(listId);
	}
	
	@PostMapping("/ListNews")
	public ListNews saveListNews(@RequestBody ListNews listNews) {
		return listNewsRepository.save(listNews);
	}
}
