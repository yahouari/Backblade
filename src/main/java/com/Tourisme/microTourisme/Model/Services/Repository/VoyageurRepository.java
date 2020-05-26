package com.Tourisme.microTourisme.Model.Services.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.Tourisme.microTourisme.Model.Services.Voyageur;

@CrossOrigin("*")
@RepositoryRestResource
public interface VoyageurRepository extends JpaRepository<Voyageur,Integer> {

	
	public Voyageur findByMailContains(String ml);
	
	public Voyageur findByIdVoyageurContains(int i);
}
