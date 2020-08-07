package com.aprendendo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendo.course.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>  {

}
