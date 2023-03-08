package com.ecommerce.springinicializer.services;

import com.ecommerce.springinicializer.repositories.ClienteRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.springinicializer.models.Cliente;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscar(Integer id){
        Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.orElse(null);
    }
}
