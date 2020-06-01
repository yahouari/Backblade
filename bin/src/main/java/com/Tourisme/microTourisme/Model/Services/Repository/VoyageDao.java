package com.example.blade.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blade.Model.*;
public interface VoyageDao extends JpaRepository<HistoVoyages,Integer>
{public List<HistoVoyages> findByusernameContaining(String mot);
}
