/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import com.bootcamp.tp.entities.Bailleur;
import com.bootcamp.tp.entities.IndicateurPerformance;
import com.bootcamp.tp.entities.Programme;
import com.bootcamp.tp.entities.Projet;
import com.bootcamp.tp.enums.TypeBailleur;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ARESKO
 */
//@test
public class Test {
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        final GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();

        //Création de projets
        Projet p1 = new Projet(1, "projet1", "atteint", new Programme(), new IndicateurPerformance(5, "indic"));
        Projet p2 = new Projet(2, "projet2", "atteint", new Programme(), new IndicateurPerformance(1, "indicat"));
        Projet p3 = new Projet(3, "projet3", "en cours", new Programme(), new IndicateurPerformance(2, "indic"));
        Projet p4 = new Projet(2, "projet4", "abandon", new Programme(), new IndicateurPerformance(3, "indic"));
        Projet p5 = new Projet(2, "projet5", "non-atteint", new Programme(), new IndicateurPerformance(5, "indic"));
        
        //Création de listes de projets
        final List listeProjet1 = new ArrayList();
        listeProjet1.add(p1);
        listeProjet1.add(p2);
        
        final List listeProjet2 = new ArrayList();
        listeProjet2.add(p1);
        listeProjet2.add(p4);
        listeProjet2.add(p5);
        
        final List listeProjet3 = new ArrayList();
        listeProjet1.add(p3);
        
        
        //Création d'objets de type Bailleur
        Bailleur b = new Bailleur(1,"Assassin Creed", TypeBailleur.Privé, listeProjet3);
        Bailleur b1 = new Bailleur(2,"Advanger", TypeBailleur.Gouvernementale, listeProjet1);
        Bailleur b2 = new Bailleur(3,"Ipman", TypeBailleur.Partenaire_international, listeProjet2);

        //Déclaration d'objets en dehors du bloc try/catch
        ObjectInputStream ois;
        ObjectOutputStream oos = null;

        try {
            // Création du fichier "bailleurJson.json" dans le dossier json
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("json/bailleurJson.json"))));
            
            //Ecriture de chaque objet Bailleur dans le fichier "bailleurJson.json"
            oos.writeObject(gson.toJson(b)+"\n");
            oos.writeObject(gson.toJson(b1)+"\n");
            oos.writeObject(gson.toJson(b2)+"\n");
    
            //Confirmation de la création
            System.out.println("----- Fichier \"bailleurJson.json\" créé ----- \n");
            
            //Fermeture du flux
            oos.close();
            
            //-----------------------------------------------------------
            // Création du fichier "projetJson.json" dans le dossier json
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("json/projetJson.json"))));
            
            //Ecriture de chaque objet Bailleur dans le fichier "bailleurJson.json"
            oos.writeObject(gson.toJson(p1)+"\n");
            oos.writeObject(gson.toJson(p2)+"\n");
            oos.writeObject(gson.toJson(p3)+"\n");
    
            //Confirmation de la création
            System.out.println("----- Fichier \"projetJson.json\" créé ----- \n");
            
            //Fermeture du flux
            oos.close();
            
            //--------------------------------------------------------------------
            
            //Récupération de données du fichier "bailleurJson.json"
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("json/bailleurJson.json"))));
            System.out.println("Affichage des objets bailleur :");
            System.out.println("*************************\n");
            ois.readObject();
            System.out.println(ois.readObject());
            
            //Fermeture du flux
            ois.close();
            
            //------------------------------------------------------------------
            
            //Récupération de données du fichier "bailleurJson.json"
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("json/projetJson.json"))));
            System.out.println("Affichage des objets projet :");
            System.out.println("*************************\n");
            ois.readObject();
            System.out.println(ois.readObject());
            
            //Fermeture du flux
            ois.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    } 
}
