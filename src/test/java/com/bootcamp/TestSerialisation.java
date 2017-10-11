/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import com.bootcamp.tp.entities.Bailleur;
import com.bootcamp.tp.entities.IndicateurPerformance;
import com.bootcamp.tp.entities.Personne;
import com.bootcamp.tp.entities.Programme;
import com.bootcamp.tp.entities.Projet;
import com.bootcamp.tp.enums.TypeBailleur;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ARESKO
 */
public class TestSerialisation {
    
    public static void main(final String[] args) {
//        final GsonBuilder builder = new GsonBuilder();
//        final Gson gson = builder.create();
//        
//        final IndicateurPerformance bailleur = new IndicateurPerformance();
//        final String json = gson.toJson(bailleur);
        
//        final Bailleur bailleur = new Bailleur();
//        bailleur.setTypeBailleur(TypeBailleur.Gouvernementale);
//        final GsonBuilder builder = new GsonBuilder();
//        final Gson gson = builder.create();
//
//        System.out.println(gson.toJson(bailleur));
        
//        System.out.println("Resultat = " + json);
        
        //---------------------------------------
        //Création de l'objet File
//        File f = new File("test.json");
//        System.out.println("Chemin absolu du fichier : " +f.getAbsolutePath());
//        System.out.println("Nom du fichier : " + f.getName());
//        System.out.println("Est-ce qu'il existe ? " + f.exists());
//        System.out.println("Est-ce un répertoire ? " + f.isDirectory());
//        System.out.println("Est-ce un fichier ? " + f.isFile());
//        System.out.println("Affichage des lecteurs à la racine du PC : ");
//        
//        for(File file : f.listRoots())
//        {
//            System.out.println(file.getAbsolutePath());
////            System.out.println(file.listFiles());
//            try {
//                int i = 1;
//                //On parcourt la liste des fichiers et répertoires
//                for(File nom : file.listFiles()){
//                    //S'il s'agit d'un dossier, on ajoute un "/"
//                    System.out.print("\t\t" + ((nom.isDirectory()) ?
//                    nom.getName()+"/" : nom.getName()));
//                    if((i%1) == 0){
//                    System.out.print("\n");
//                    }
//                    i++;
//                }
//                System.out.println("\n");
//            } catch (NullPointerException e) {
//            //L'instruction peut générer une NullPointerException
//            //s'il n'y a pas de sous-fichier !
//            }
//        }
        
        
        //-------------------------------------------------------
        
        // Nous déclarons nos objets en dehors du bloc try/catch
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
//        try {
//            // On instancie nos objets :
//            // fis va lire le fichier
//            // fos va écrire dans le nouveau !
//            fis = new FileInputStream(new File("test.txt"));
//            fos = new FileOutputStream(new File("test2.txt"));
//            // On crée un tableau de byte pour indiquer le nombre de bytes lus à chaque tour de boucle
//            byte[] buf = new byte[8];
//            // On crée une variable de type int pour y affecter le résultat de la lecture Vaut -1 quand c'est fini
//            int n = 0;
//            // Tant que l'affectation dans la variable est possible,on boucle
//            // Lorsque la lecture du fichier est terminée l'affectation n'est
//            // plus possible !
//            // On sort donc de la boucle
//            while ((n = fis.read(buf)) >= 0) {
//                // On écrit dans notre deuxième fichier avec l'objet adéquat
//                fos.write(buf);
//                // On affiche ce qu'a lu notre boucle au format byte et au format char
//                for (byte bit : buf) {
//                    System.out.print("\t" + bit + "(" + (char) bit +")");
//                    System.out.println("");
//                }
//                //Nous réinitialisons le buffer à vide
//                //au cas où les derniers byte lus ne soient pas un multiple de 8
//                //Ceci permet d'avoir un buffer vierge à chaque lecture et ne pas avoir de doublon en fin de fichier
//                buf = new byte[8];
//            }
//            System.out.println("Copie terminée !");
//            
//        } catch (FileNotFoundException e) {
//            // Cette exception est levée si l'objet FileInputStream ne trouve
//            // aucun fichier
//            e.printStackTrace();
//        } catch (IOException e) {
//            // Celle-ci se produit lors d'une erreur d'écriture ou de lecture
//            e.printStackTrace();
//        } finally {
//            // On ferme nos flux de données dans un bloc finally pour s'assurer
//            // que ces instructions seront exécutées dans tous les cas même si
//            // une exception est levée !
//            try {
//                if (fis != null)
//                fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            
//            try {
//                if (fos != null)
//                fos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            
//        }
        
        //------------------------------------
        
        //Nous déclarons nos objets en dehors du bloc try/catch
//        ObjectInputStream ois;
//        ObjectOutputStream oos = null;
//        
//        final GsonBuilder builder = new GsonBuilder();
//        final Gson gson = builder.create();
//        
//        Bailleur b = new Bailleur(1,"Assassin Creed", TypeBailleur.Privé);
//        Bailleur b1 = new Bailleur(2,"Advanger", TypeBailleur.Gouvernementale);
//        Bailleur b2 = new Bailleur(3,"Ipman", TypeBailleur.Partenaire_international);
//
////        System.out.println(gson.toJson(bailleur));
//        try {
//            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("json/gamer.json"))));
//            //Nous allons écrire chaque objet Game dans le fichier
//            oos.writeObject(gson.toJson(b)+"\n");
//            oos.writeObject(gson.toJson(b1)+"\n");
//            oos.writeObject(gson.toJson(b2)+"\n");
////            oos.writeObject(new Bailleur(2, "ZINSOU", TypeBailleur.Gouvernementale));
////            oos.writeObject(new Bailleur(3, "Tetris", TypeBailleur.Partenaire_international));
//            //Ne pas oublier de fermer le flux !
//            oos.close();
//            //On récupère maintenant les données !
//            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("game.json"))));
//            System.out.println("Affichage des objets :");
//            System.out.println("*************************\n");
//            System.out.println(gson.toJson(b));
//            System.out.println(gson.toJson(b));
//            System.out.println(gson.toJson(b));
//            ois.close();
//        } catch (FileNotFoundException e) {
//        e.printStackTrace();
//        } catch (IOException e) {
//        e.printStackTrace();
//        }
        
        //--------------------- Liste d'objets ---------------
        
        final GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();
        
        final List listeObjet = new ArrayList();
        listeObjet.add("chaine");
        listeObjet.add(123);
        Projet b = new Projet(1, "ok", "atteint", new Programme(), new IndicateurPerformance(5, "indic"));
        Projet b1 = new Projet(2, "ok", "atteint", new Programme(), new IndicateurPerformance(5, "indic"));
        listeObjet.add(b);
        listeObjet.add(b1);
        final String json = gson.toJson(listeObjet);
        System.out.println("Resultat = " + json + "\n\n");
        
        Bailleur ba = new Bailleur(1,"Assassin Creed", TypeBailleur.Privé, listeObjet);
        Bailleur ba1 = new Bailleur(2,"Advanger", TypeBailleur.Gouvernementale);
        Bailleur ba2 = new Bailleur(3,"Ipman", TypeBailleur.Partenaire_international);

        System.out.println(gson.toJson(ba));

    }
}
