package com.aprendendo.course.config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aprendendo.course.entities.Client;
import com.aprendendo.course.repositories.ClientRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner{
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public void run(String... args) throws Exception {
	
		Client c1 = new Client(null, "Jaxson da Silva", 1859902 , "Rua Jao gomes 1068 ", "Combo", 55.00, new Date());
		Client c2 = new Client(null, "Cleiton meireles", 1575569, "Rua xamaws 1000", "AcessoVirtua", 35.00, new Date());
		
		clientRepository.saveAll(Arrays.asList(c1, c2));
	}
	
	

}
