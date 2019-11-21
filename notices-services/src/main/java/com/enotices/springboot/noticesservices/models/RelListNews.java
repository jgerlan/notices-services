package com.enotices.springboot.noticesservices.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_rel_ListNews")
public class RelListNews implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long relListNewsID;
	private Long newsID;
	private Long listNewsID;
	
	public Long getRelListNewsID() {
		return relListNewsID;
	}
	public void setRelListNewsID(Long relListNewsID) {
		this.relListNewsID = relListNewsID;
	}
	public Long getNewsID() {
		return newsID;
	}
	public void setNewsID(Long newsID) {
		this.newsID = newsID;
	}
	public Long getListNewsID() {
		return listNewsID;
	}
	public void setListNewsID(Long listNewsID) {
		this.listNewsID = listNewsID;
	}
	
	

}
