package com.Tourisme.microTourisme.Model.Services;

import java.io.Serializable;

import javax.persistence.Column;
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
@Table(name = "favoris")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Favoris implements Serializable {
	
	@Id
	@Column(name="id_favoris")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Integer id_favoris;
	 private int id_destination;
     private int idVoyageur; 
	 private String nom_favoris;
	 private int prix;
	 private String Description;
	 private String mail;
	
	 public Favoris(int id_destination, int idVoyageur, String nom_favoris, String description, int prix, String mail) {
			super();
			this.id_destination = id_destination;
			this.idVoyageur = idVoyageur;
			this.nom_favoris = nom_favoris;
			this.prix = prix;
			this.Description = description;
			this.mail=mail;
		}
}