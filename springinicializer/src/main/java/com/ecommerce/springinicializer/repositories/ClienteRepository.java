package com.ecommerce.springinicializer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.springinicializer.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
}
