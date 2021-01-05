package com.folder.Repository;

import com.folder.entities.Societé;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface SocieteRepository extends JpaRepository<Societé, Long>{

}
