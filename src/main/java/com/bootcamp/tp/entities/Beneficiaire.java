/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.tp.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
@Table(name = "tp_beneficiaire")
@DiscriminatorValue("BENEFICIAIRE")
public class Beneficiaire extends Personne {

    public Beneficiaire() {
    }
    
    public Beneficiaire(int id, String nom) {
        super();
        this.id = id;
        this.nom = nom;
    }
    
    @OneToMany(mappedBy = "beneficiaire")
    private List<ProgrammeBeneficiaire> programmes;
            
    @ManyToMany(mappedBy = "beneficiaires")
    private List<Projet> projets = new ArrayList<Projet>();

    
    
}
