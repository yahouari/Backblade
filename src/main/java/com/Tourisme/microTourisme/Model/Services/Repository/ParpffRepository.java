package com.Tourisme.microTourisme.Model.Services.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.Tourisme.microTourisme.Model.Services.Parpff;


@CrossOrigin("*")
@RepositoryRestResource
public interface ParpffRepository extends JpaRepository<Parpff,Integer>  {

}