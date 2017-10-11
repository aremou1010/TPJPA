/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.tp.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ARESKO
 */
@Entity
@Table(name = "tp_livrable")
public class Livrable implements Serializable {
    
    public Livrable(){
    
    }

    public Livrable(int id, String nom, Projet projet, IndicateurPerformance indicateurPerformance) {
        this.id = id;
        this.nom = nom;
        this.projet = projet;
        this.indicateurPerformance = indicateurPerformance;
    }

    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nom;
    
    @ManyToOne
    @JoinColumn(name = "projet", referencedColumnName = "id")
    private Projet projet;
    
    @OneToOne(fetch = FetchType.LAZY)
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livrable)) {
            return false;
        }
        Livrable other = (Livrable) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bootcamp.tp.entities.Livrable[ id=" + id + " ]";
    }
    
}
