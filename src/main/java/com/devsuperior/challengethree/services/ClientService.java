package com.devsuperior.challengethree.services;

import com.devsuperior.challengethree.dto.ClientDTO;
import com.devsuperior.challengethree.entities.Client;
import com.devsuperior.challengethree.repositories.ClientRepository;
import com.devsuperior.challengethree.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public ClientDTO findById (Long id){
        Client client = clientRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));

        return new ClientDTO(client);
    }




}
