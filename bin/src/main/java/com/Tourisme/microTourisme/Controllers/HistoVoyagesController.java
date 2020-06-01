package com.example.blade.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.example.blade.Model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import com.example.blade.dao.*;
@RestController
public class HistoVoyagesController {
	    @Autowired
	    private VoyageDao DaovoyageDao;
	    

	    @CrossOrigin(origins="*")
	    @GetMapping("/histo")
	    public List<HistoVoyages>listeVoyages() {
	        return DaovoyageDao.findAll();
	        
	    }
	    @CrossOrigin(origins="*")
	    @GetMapping("/histosearch/{mot}")
	    public List<HistoVoyages> findbyusernameContaining(@PathVariable String mot){
	    	return DaovoyageDao.findByusernameContaining(mot);}
	    @CrossOrigin(origins="*")
	    @GetMapping("/histo/{id}")
	    public  Optional<HistoVoyages> findbyid(@PathVariable String id){	
	    	int histoId = Integer.parseInt(id);
	    	return DaovoyageDao.findById(histoId);
	    }
	    @CrossOrigin(origins="*")
	    @PostMapping("/histo")
	    public String createhisto(@RequestBody HistoVoyages voyage)
	    {DaovoyageDao.save(voyage);
	    return "bien recu";
	     }
	    @CrossOrigin(origins="*")
	    @DeleteMapping("/histo/{id}")
	    public boolean deletehisto(@PathVariable String id) {
	    	int histoId=Integer.parseInt(id);
	    	try {
	    	DaovoyageDao.deleteById(histoId);
	    	return true;
	    	
	    }
	    	catch(Exception ex)
	    	{return false;}
	    
	   	
	 




}}