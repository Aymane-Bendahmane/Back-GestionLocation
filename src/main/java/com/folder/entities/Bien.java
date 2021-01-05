package com.folder.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.core.sym.Name;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bien implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long refference;
	private Double prix;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_ajoute;
	private Double surface;
	private Integer nb_chambre;
	private Integer nb_etage;
	private Integer nb_salon;
	private Boolean balcon;
	private Boolean garage;
	private Boolean parking;
	private String description;
	private Boolean disponibilite;
	private String ville;
	private String quartier ;


	@ManyToOne
	private Societé societe ;

	@ManyToOne
	private Affectation affectation ;


}
