package com.clientes.clientes.services;

import com.clientes.clientes.dto.ClientDTO;
import com.clientes.clientes.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class ClientService {

    @Autowired
    public Client client;

    @Transactional(readOnly = true)
    public ClientDTO findClientById(int id){
        return new ClientDTO();
    }


}
