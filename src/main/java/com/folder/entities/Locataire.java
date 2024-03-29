package com.folder.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Locataire implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_user;
	private String nom;
	private String prenom;
	private String email;

	@OneToMany(mappedBy = "locataire")
	private Collection<Affectation> affectations;



	
}
