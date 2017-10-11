/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.tp.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ARESKO
 */
@Entity
@Table(name = "tp_indicateurQuantitatif")
public class IndicateurQuantitatif implements Serializable {

    public IndicateurQuantitatif() {
    }

    public IndicateurQuantitatif(int id, String nom, String propriete, int valeur, IndicateurPerformance indicateurPerformance) {
        this.id = id;
        this.nom = nom;
        this.propriete = propriete;
        this.valeur = valeur;
        this.indicateurPerformance = indicateurPerformance;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nom;
    
    private String propriete;
    
    private int valeur;
    
    @ManyToOne
    @JoinColumn(name = "indicateurPerformance", referencedColumnName = "id")
    private IndicateurPerformance indicateurPerformance;

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

    public String getPropriete() {
        return propriete;
    }

    public void setPropriete(String propriete) {
        this.propriete = propriete;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
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
        if (!(object instanceof IndicateurQuantitatif)) {
            return false;
        }
        IndicateurQuantitatif other = (IndicateurQuantitatif) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bootcamp.tp.entities.IndicateurQuantitatif[ id=" + id + " ]";
    }
    
}
