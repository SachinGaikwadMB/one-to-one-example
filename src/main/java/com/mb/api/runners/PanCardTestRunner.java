package com.mb.api.runners;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mb.api.persistance.entity.PanCard;
import com.mb.api.persistance.repository.PanCardRepository;

//@Component
public class PanCardTestRunner implements CommandLineRunner
{
	@Autowired
	private PanCardRepository panCardRepository;

	@Override
	public void run(String... args) throws Exception
	{
		PanCard pancard = new PanCard();
		
		pancard.setPancardHolderName("Vaibhav Walukkar");
		pancard.setPancardNumber("RR62TR87TEN");
		pancard.setIssuedDate(new Date(System.currentTimeMillis()));
		
		panCardRepository.save(pancard);
	}

}
