package com.folder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.folder.entities.Affectation;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface AffectationRepository extends JpaRepository<Affectation,Long>{

}
