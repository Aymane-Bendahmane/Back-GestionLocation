package com.folder.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paiment implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_paiment;
	private Date date_paiment;
	private Float prix_loyer;
	private Float prix_taxes;
	private Float prix_syndic;

	@ManyToOne
	private Affectation affectation ;
}
