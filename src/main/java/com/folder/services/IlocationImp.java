package com.folder.services;

import com.folder.Repository.*;
import com.folder.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Stream;
@Service
@Transactional
public class IlocationImp implements IlocationService{
    @Autowired
    EntrepriseRepository entrepriseRepository ;
    @Autowired
    SocieteRepository societéRepository ;
    @Autowired
    LocataireRepository locataireRepository ;
    @Autowired
    BienRepository bienRepository ;
    @Autowired
    AffectationRepository affectationRepository;

    @Override
    public void initEntreprise() {
        Stream.of("HNFS").forEach(nom-> {
            Entreprise entreprise = new Entreprise();
            entreprise.setNom(nom);
            entrepriseRepository.save(entreprise);
        });
    }

    @Override
    public void initSociete() {
        entrepriseRepository.findAll().forEach(entreprise -> {
            Societé societé = new Societé();
            societé.setNom_societé("Fnac");
            societé.setAdresse("El jadida 315 hay salam");
            societé.setEmail("fnac@gmail.com");
            societé.setPatente("1234");
            societé.setTelephone("0699887733");
            societé.setNom_reponsable("Aymane bendahmane");
            societé.setStatus("SAS");
            societé.setEntreprise(entreprise);

            societéRepository.save(societé);
        });
    }

    @Override
    public void initBien() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        societéRepository.findAll().forEach(societé -> {
            Bien bien = new Bien();
            bien.setBalcon(true);
            try {
                bien.setDate_ajoute(dateFormat.parse("2020/09/6"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            bien.setDescription("great place in a calm neighborhood");
            bien.setDisponibilite(false);
            bien.setGarage(true);
            bien.setNb_chambre(2);
            bien.setNb_etage(9);
            bien.setParking(true);
            bien.setPrix(2000.0);
            bien.setNb_salon(5);
            bien.setQuartier("Hay salam");
            bien.setVille("El jadida");
            bien.setSurface(200.0);
            bien.setSociete(societé);
            /************************  Bien 2 ******************************/
            Bien bien1 = new Bien();
            bien.setBalcon(false);
            try {
                bien1.setDate_ajoute(dateFormat.parse("2020/09/6"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            bien1.setDescription("close to nature");
            bien1.setDisponibilite(false);
            bien1.setGarage(false);
            bien1.setNb_chambre(8);
            bien1.setNb_etage(1);
            bien1.setParking(false);
            bien1.setPrix(1500.0);
            bien1.setNb_salon(3);
            bien1.setQuartier("Had wlad fraj");
            bien1.setVille("El jadida");

            bien1.setSurface(600.0);
            bien1.setSociete(societé);

            bienRepository.save(bien);
            bienRepository.save(bien1);
        });
    }

    @Override
    public void initLocataire() {
        Locataire locataire = new Locataire();
        locataire.setNom("A1");
        locataire.setEmail("A1@test.com");
        locataire.setPrenom("AA1");

        Locataire locataire1 = new Locataire();
        locataire1.setNom("B2");
        locataire1.setEmail("B2@test.com");
        locataire1.setPrenom("B2");

        locataireRepository.save(locataire);
        locataireRepository.save(locataire1);
    }

    @Override
    public void initAffectation() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        bienRepository.findAll().forEach(bien -> {
            Affectation affectation = new Affectation();
            affectation.setBiens( bienRepository.findAll());
            try {
                affectation.setDate_aff(dateFormat.parse("2020/12/17"));
                affectation.setDate_fin_aff(dateFormat.parse("2021/12/17"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            affectation.setLocataire(locataireRepository.findById((long) 1).get());
            affectationRepository.save(affectation);
        });
    }
}
