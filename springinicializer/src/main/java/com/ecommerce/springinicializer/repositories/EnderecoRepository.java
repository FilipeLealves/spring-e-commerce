package com.ecommerce.springinicializer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.springinicializer.models.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
    
}
