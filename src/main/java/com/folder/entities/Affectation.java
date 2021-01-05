package com.folder.entities;

import java.io.Serializable;
import java.util.Collection;

import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Affectation implements Serializable {
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id_aff;

		@DateTimeFormat(pattern = "yyyy-MM-dd")
		@Temporal(TemporalType.TIMESTAMP)
		private Date date_aff;

		@DateTimeFormat(pattern = "yyyy-MM-dd")
		@Temporal(TemporalType.TIMESTAMP)
		private Date date_fin_aff;
		
	
		@OneToMany(mappedBy = "affectation")
		private Collection<Bien> biens	;

		@ManyToOne
		private Locataire locataire;

		@OneToMany (mappedBy = "affectation")
		private Collection<Paiment>  Paiments ;
		
		
		

		
}
