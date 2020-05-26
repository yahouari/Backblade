package com.Tourisme.microTourisme.Model.Services.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.Tourisme.microTourisme.Model.Services.Voyage;
import com.Tourisme.microTourisme.Model.Services.Voyageur;
@CrossOrigin("*")
@RepositoryRestResource
public interface VoyageRepository extends JpaRepository<Voyage,Integer> {
	
	public Voyage findByDestinationContains(String dest);
	public Voyage findByIdVoyageContains(int i);

}
