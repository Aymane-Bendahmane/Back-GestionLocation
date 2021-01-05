package com.folder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.folder.entities.Paiment;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface PaimantRepository extends JpaRepository<Paiment, Long>{

}
