package com.devsuperior.challengethree.repositories;

import com.devsuperior.challengethree.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
