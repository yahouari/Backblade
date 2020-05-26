package com.Tourisme.microTourisme.Model.Services;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "Parpff")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Parpff implements Serializable {
	 
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpff;
	private String nom;
    private String destination;
    private int prix;
    private int nombreDePersonnes;
    @Column(name = "date_participation",updatable = false)
    @CreationTimestamp
    private Date dateParticipation;

    public Parpff(String nom2, String destination2, int prix2, int nombreDePersonnes2) {
		super();
		this.nom=nom2;
		this.destination=destination2;
		this.prix=prix2;
		this.nombreDePersonnes=nombreDePersonnes2;
	}

}