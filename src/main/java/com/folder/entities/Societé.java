package com.folder.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Societé implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_societé;
	private String nom_societé;
	private String patente;
	private String nom_reponsable;
	private String telephone;
	private String email;
	private String adresse;
	private String status;

	@OneToMany(mappedBy =  "societe")
	private Collection<Bien> biens ;

	@ManyToOne
	private Entreprise entreprise ;
}
