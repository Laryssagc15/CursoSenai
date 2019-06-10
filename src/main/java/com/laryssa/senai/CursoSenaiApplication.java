package com.laryssa.senai; 

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.laryssa.senai.domain.Estado;
import com.laryssa.senai.repositories.EstadoRepository;

@SpringBootApplication
public class CursoSenaiApplication implements CommandLineRunner{
	
   @Autowired
   private EstadoRepository estadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoSenaiApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		estadoRepository.saveAll(Arrays.asList(est1,est2));
	}
}
