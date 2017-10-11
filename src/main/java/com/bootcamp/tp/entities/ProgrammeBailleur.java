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
@Table(name = "tp_ProgrammeBailleur")
@IdClass(ProgrammeBailleurId.class)
public class ProgrammeBailleur {

    public ProgrammeBailleur(){
        
    }

    public ProgrammeBailleur(int programmeId, int bailleurId, double montantFinancement, Programme programme, Bailleur bailleur) {
        this.programmeId = programmeId;
        this.bailleurId = bailleurId;
        this.montantFinancement = montantFinancement;
        this.programme = programme;
        this.bailleur = bailleur;
    }
    
    @Id
    private int programmeId;
    
    @Id
    private int bailleurId;
    
    @Column
    private double montantFinancement;

    @ManyToOne
    @PrimaryKeyJoinColumn(name="PROGRAMMEID", referencedColumnName="ID")
    private Programme programme;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="BAILLEURID", referencedColumnName="ID")
    private Bailleur bailleur;

    public double getMontantFinancement() {
        return montantFinancement;
    }

    public void setMontantFinancement(double montantFinancement) {
        this.montantFinancement = montantFinancement;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.programmeId;
        hash = 53 * hash + this.bailleurId;
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
        final ProgrammeBailleur other = (ProgrammeBailleur) obj;
        if (this.programmeId != other.programmeId) {
            return false;
        }
        if (this.bailleurId != other.bailleurId) {
            return false;
        }
        return true;
    }

    
}
