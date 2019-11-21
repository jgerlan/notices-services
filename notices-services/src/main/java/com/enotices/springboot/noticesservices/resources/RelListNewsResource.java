package com.enotices.springboot.noticesservices.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enotices.springboot.noticesservices.models.RelListNews;
import com.enotices.springboot.noticesservices.repository.RelListNewsRepository;

@RestController
@RequestMapping(value="/api")
public class RelListNewsResource {
	
	@Autowired
	RelListNewsRepository relListNewsRepository;
	
	

}
