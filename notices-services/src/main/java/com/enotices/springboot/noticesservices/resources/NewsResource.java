package com.enotices.springboot.noticesservices.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enotices.springboot.noticesservices.repository.NewsRepository;

@RestController
@RequestMapping(value="/api")
public class NewsResource {
	
	@Autowired
	NewsRepository newsRepository;

}
