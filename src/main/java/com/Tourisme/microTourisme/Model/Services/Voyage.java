package com.Tourisme.microTourisme.Model.Services;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity
@Table(name = "voyage")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Voyage implements Serializable {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVoyage;
    private String categorie;
    private String destination;
    private int prix;
    private String Description;
   
}


