package com.folder;

import com.folder.services.IlocationImp;
import com.folder.services.IlocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FolderApplication implements CommandLineRunner {
    @Autowired
    private  IlocationImp ilocationImp;
    public static void main(String[] args) {
        SpringApplication.run(FolderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ilocationImp.initEntreprise();
        ilocationImp.initSociete();
        ilocationImp.initBien();
        ilocationImp.initLocataire();
        ilocationImp.initAffectation();
    }
}
