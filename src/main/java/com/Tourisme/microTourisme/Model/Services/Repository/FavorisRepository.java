package com.Tourisme.microTourisme.Model.Services.Repository;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.Tourisme.microTourisme.Model.Services.Favoris;

@CrossOrigin("*")
@RepositoryRestResource
public interface FavorisRepository extends JpaRepository<Favoris,Integer> {

	
	public ArrayList<Favoris> findAllByIdVoyageur(int i);
}

