/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import com.bootcamp.tp.entities.Bailleur;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 *
 * @author ARESKO
 */
public class TestDeserialisation {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
//        ObjectInputStream ois;
//        ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("game.json"))));
        
        File file = new File("game.json");
        FileReader fr;
        fr = new FileReader("game.json");
        
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        final Bailleur unInt = gson.fromJson(fr, Bailleur.class);
        
        int i = 0; String str = "";
        while((i = fr.read()) != -1){
            str += (char)i;
            
        }
            
        final Bailleur unInt = gson.fromJson(str, Bailleur.class);
        System.out.println(unInt);
        
        
        final Integer unInteger = gson.fromJson("1", Integer.class);
        System.out.println(unInteger);
        final Long unLong = gson.fromJson("1", Long.class);
        System.out.println(unLong);
        final Boolean booleen = gson.fromJson("false", Boolean.class);
        System.out.println(booleen);
        final String chaine = gson.fromJson("\"abc\"", String.class);
        System.out.println(chaine);
        final String[] chaine2 = gson.fromJson("[\"abc\",\"je comprend\"]", String[].class);
        System.out.println(Arrays.deepToString(chaine2));
        
    }
}
