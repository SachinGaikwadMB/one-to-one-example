package com.mb.api.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "persons")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personId;
	
	@Column(name ="person_name")
	private String name;
	
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name ="address")
	private String address;
	
	@ManyToOne
	@JoinColumn(name = "pan_id", unique = true)
	private PanCard pancard;
	
}
