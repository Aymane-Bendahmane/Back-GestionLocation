package com.folder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.folder.entities.Bien;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface BienRepository extends JpaRepository<Bien,Long>{

}
