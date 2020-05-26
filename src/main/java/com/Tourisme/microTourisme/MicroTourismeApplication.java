package com.Tourisme.microTourisme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.Tourisme.microTourisme.Model.Services.Voyage;
import com.Tourisme.microTourisme.Model.Services.Repository.EvaluationRepository;
import com.Tourisme.microTourisme.Model.Services.Repository.VoyageRepository;
import com.Tourisme.microTourisme.Model.Services.Repository.VoyageurRepository;


@SpringBootApplication
public class MicroTourismeApplication implements CommandLineRunner {
	
	
	@Autowired
	private EvaluationRepository evaluationRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MicroTourismeApplication.class, args);
	}
	
	public void run (String... args) throws Exception{
		/*
		evaluationRepository.findAll().forEach(v->{
    System.out.println(v.toString());
});*/
		}
	

}
