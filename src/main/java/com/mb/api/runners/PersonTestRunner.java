package com.mb.api.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mb.api.persistance.entity.Person;
import com.mb.api.persistance.repository.PanCardRepository;
import com.mb.api.persistance.repository.PersonRepository;

@Component
public class PersonTestRunner implements CommandLineRunner
{

	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private PanCardRepository panCardRepository;
	
	@Override
	public void run(String... args) throws Exception
	{
		Person ajay = new Person();
		
		ajay.setName("Ajay Jadhav");
		ajay.setAddress("Varud Bibi Umarkhed");
		ajay.setGender("Male");
		ajay.setPancard(panCardRepository.findByPanId(2));
		personRepository.save(ajay);
		
		
	}

}
