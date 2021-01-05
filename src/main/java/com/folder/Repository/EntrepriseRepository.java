package com.folder.Repository;

import com.folder.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface EntrepriseRepository extends JpaRepository<Entreprise,Long> {
}
