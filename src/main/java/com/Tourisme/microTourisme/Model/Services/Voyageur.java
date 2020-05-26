package com.Tourisme.microTourisme.Model.Services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "voyageur")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Voyageur {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVoyageur;
    private String nom;
    private String prenom;
    private int AnneeDeNaissance;
    private String LieuDeNaissance;
    private String mail;
    private int tel;
	private String motDePasse;
   
}
