package com.example.blade.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="historiquevoyages")
public class HistoVoyages {
	@Id
	private int idparticipation;
	private String datedeparticipation;
	private String destination;
	private int nombredepersonnes;
	private String username;
	public HistoVoyages() {}
	
   

	public HistoVoyages(int idparticipation, String datedeparticipation, String destination, int nombredepersonnes,
			String username) {
		super();
		this.idparticipation = idparticipation;
		this.datedeparticipation = datedeparticipation;
		this.destination = destination;
		this.nombredepersonnes = nombredepersonnes;
		this.username = username;
	}
	
 public int getIdparticipation() {
		return idparticipation;
	}



	public void setIdparticipation(int idparticipation) {
		this.idparticipation = idparticipation;
	}



	public String getDatedeparticipation() {
		return datedeparticipation;
	}



	public void setDatedeparticipation(String datedeparticipation) {
		this.datedeparticipation = datedeparticipation;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public int getNombredepersonnes() {
		return nombredepersonnes;
	}



	public void setNombredepersonnes(int nombredepersonnes) {
		this.nombredepersonnes = nombredepersonnes;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	@Override
	public String toString() {
		return "HistoVoyages [idparticipation=" + idparticipation + ", datedeparticipation=" + datedeparticipation
				+ ", destination=" + destination + ", nombredepersonnes=" + nombredepersonnes + ", username=" + username
				+ "]";
	}


}

