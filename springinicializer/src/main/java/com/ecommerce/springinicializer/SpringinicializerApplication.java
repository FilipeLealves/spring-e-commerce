package com.ecommerce.springinicializer;

import org.springframework.boot.SpringApplication;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.springinicializer.models.Cliente;
import com.ecommerce.springinicializer.models.Endereco;
import com.ecommerce.springinicializer.repositories.ClienteRepository;
import com.ecommerce.springinicializer.repositories.EnderecoRepository;

@SpringBootApplication
public class SpringinicializerApplication implements CommandLineRunner{

	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringinicializerApplication.class, args);
	}

	public void run(String... args) throws Exception{

		Cliente clt1 = new Cliente(null, "Mauricio de Souza", "hotmart@gmail.com", "monicadentuca", "40203390890");
		Cliente clt2 = new Cliente(null, "Delegado da Cunha", "dl_bolado@gmail.com", "pracimadeles", "83759390480");

		Endereco end1 = new Endereco(null, "Paraiba", "Joao Pessoa", "58034020", "Av. Fernando Azevedo, 2025");
		Endereco end2 = new Endereco(null, "Paraiba", "Cabedelo", "3887380", "Av. Rio Branco Escuro, 305");
		Endereco end3 = new Endereco(null, "Sao Paulo", "Ribeirao Preto", "2005690", "Rua. Francisco Chagas, 7802");

		clt1.getEnderecos().addAll(Arrays.asList(end1, end2));
		clt1.getEnderecos().addAll(Arrays.asList(end3));

		end1.getClientes().addAll(Arrays.asList(clt1));
		end2.getClientes().addAll(Arrays.asList(clt1));
		end3.getClientes().addAll(Arrays.asList(clt1));

		enderecoRepository.saveAll(Arrays.asList(end1, end2, end3));
		clienteRepository.saveAll(Arrays.asList(clt1, clt2));
		
	}
}
