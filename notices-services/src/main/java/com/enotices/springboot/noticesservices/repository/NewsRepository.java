package com.enotices.springboot.noticesservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enotices.springboot.noticesservices.models.News;

public interface NewsRepository extends JpaRepository<News, Long>{
	News findById(long id);
	
}
