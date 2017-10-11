/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.tp.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author ARESKO
 */
@Entity
@Table(name = "tp_ProgrammeFournisseur")
@IdClass(ProgrammeFournisseurId.class)
public class ProgrammeFournisseur {
    
    public ProgrammeFournisseur (){
        
    }

    public ProgrammeFournisseur(int programmeId, int fournisseurId, double montantPrestation, Programme programme, Fournisseur fournisseur) {
        this.programmeId = programmeId;
        this.fournisseurId = fournisseurId;
        this.montantPrestation = montantPrestation;
        this.programme = programme;
        this.fournisseur = fournisseur;
    }
    
    @Id
    private int programmeId;
    
    @Id
    private int fournisseurId;
    
    @Column
    private double montantPrestation;

    @ManyToOne
    @PrimaryKeyJoinColumn(name="PROGRAMMEID", referencedColumnName="ID")
    private Programme programme;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="FOURNISSEURID", referencedColumnName="ID")
    private Fournisseur fournisseur;

    public double getMontantPrestation() {
        return montantPrestation;
    }

    public void setMontantPrestation(double montantPrestation) {
        this.montantPrestation = montantPrestation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.programmeId;
        hash = 29 * hash + this.fournisseurId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProgrammeFournisseur other = (ProgrammeFournisseur) obj;
        if (this.programmeId != other.programmeId) {
            return false;
        }
        if (this.fournisseurId != other.fournisseurId) {
            return false;
        }
        return true;
    }
    
    
}
