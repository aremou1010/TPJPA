/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.tp.entities;

import java.io.Serializable;
import java.util.*;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ARESKO
 */
@Entity
@Table(name = "tp_fournisseur")
@DiscriminatorValue("FOURNISSEUR")
public class Fournisseur extends Personne {

    public Fournisseur() {
    }
    
    public Fournisseur(int id, String nom) {
        super();
        this.id = id;
        this.nom = nom;
    }
    
    @OneToMany(mappedBy = "fournisseur")
    private List<ProgrammeFournisseur> programmes;
    
    @ManyToMany(mappedBy = "fournisseurs")
    private List<Projet> projets = new ArrayList<Projet>();

}


