/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.tp.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ARESKO
 */
@Entity
@Table(name = "tp_programme")
public class Programme implements Serializable {

    public Programme(){
        
    }

    public Programme(int id, String nom, String objectif, IndicateurPerformance indicateurPerformance) {
        this.id = id;
        this.nom = nom;
        this.objectif = objectif;
        this.indicateurPerformance = indicateurPerformance;
//        this.projets = projets;
//        this.bailleurs = bailleurs;
//        this.beneficiaires = beneficiaires;
//        this.fournisseurs = fournisseurs;
    }
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nom;
    
    private String objectif;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "programme")
    private List<Projet> projets;
    
    @OneToOne(fetch = FetchType.LAZY)
    private IndicateurPerformance indicateurPerformance;
    
    @OneToMany(mappedBy = "programme")
    private List<ProgrammeBailleur> bailleurs;
    
    @OneToMany(mappedBy = "programme")
    private List<ProgrammeBeneficiaire> beneficiaires;
    
    @OneToMany(mappedBy = "programme")
    private List<ProgrammeFournisseur> fournisseurs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Programme)) {
            return false;
        }
        Programme other = (Programme) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bootcamp.tp.entities.Programme[ id=" + id + " ]";
    }
    
}
