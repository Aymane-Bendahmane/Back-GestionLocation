package com.folder.Repository;

import com.folder.entities.Locataire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface LocataireRepository extends JpaRepository<Locataire,Long> {
}
