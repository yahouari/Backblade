package com.Tourisme.microTourisme.Model.Services;

import java.io.Serializable;
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
@Table(name = "evaluation")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Evaluation implements Serializable {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEvaluation;
	private int idVoyage;
	private int idVoyageur;
    private String noteVoyage;
    private String noteGuide;
    private String noteService;
    private String refaireExperience;
    private String mot;
   
}
