package com.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "TOPIC")
public class Topic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;
	
	
	
	public Topic(Long topicId, String name, String description) {
		
		this.id = topicId;
		this.name = name;
		this.description = description;
	}
	
	public Topic(){
			
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
