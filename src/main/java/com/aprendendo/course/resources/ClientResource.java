package com.aprendendo.course.resources;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprendendo.course.entities.Client;

	


@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	

	@GetMapping
	public ResponseEntity<Client> findAll(){
		Client u = new Client(1L, "Carlos Albert", 1578869, "Rua José Barra 1068", "Combo", 55.00, new Date());
		return ResponseEntity.ok().body(u);
	}
	
	
		
	
}
