package com.enotices.springboot.noticesservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enotices.springboot.noticesservices.models.RelListNews;

public interface RelListNewsRepository extends JpaRepository<RelListNews, Long>{
	RelListNews findById(long relListId);
}
