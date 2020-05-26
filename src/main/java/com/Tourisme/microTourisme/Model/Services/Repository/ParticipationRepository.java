package com.Tourisme.microTourisme.Model.Services.Repository;

import com.Tourisme.microTourisme.Model.Services.Participation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@RepositoryRestResource
@CrossOrigin("*")
public interface ParticipationRepository extends JpaRepository<Participation,Integer> {
}
