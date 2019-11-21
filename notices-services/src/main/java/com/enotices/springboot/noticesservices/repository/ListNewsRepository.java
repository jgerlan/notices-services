package com.enotices.springboot.noticesservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enotices.springboot.noticesservices.models.ListNews;

public interface ListNewsRepository extends JpaRepository<ListNews, Long>{
	ListNews findById(long listId);
}
