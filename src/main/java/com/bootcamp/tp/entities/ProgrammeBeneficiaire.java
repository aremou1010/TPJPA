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
@Table(name = "tp_ProgrammeBeneficiaire")
@IdClass(ProgrammeBeneficiaireId.class)
public class ProgrammeBeneficiaire {

    public ProgrammeBeneficiaire(){
        
    }

    public ProgrammeBeneficiaire(int programmeId, int beneficiaireId, int nombreBeneficiaire, Programme programme, Beneficiaire beneficiaire) {
        this.programmeId = programmeId;
        this.beneficiaireId = beneficiaireId;
        this.nombreBeneficiaire = nombreBeneficiaire;
        this.programme = programme;
        this.beneficiaire = beneficiaire;
    }
    
    
    @Id
    private int programmeId;
    @Id
    private int beneficiaireId;
    @Column
    private int nombreBeneficiaire;

    @ManyToOne
    @PrimaryKeyJoinColumn(name="PROGRAMMEID", referencedColumnName="ID")
    private Programme programme;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="BENEFICIAIREID", referencedColumnName="ID")
    private Beneficiaire beneficiaire;

    public int getNombreBeneficiaire() {
        return nombreBeneficiaire;
    }

    public void setNombreBeneficiaire(int nombreBeneficiaire) {
        this.nombreBeneficiaire = nombreBeneficiaire;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.programmeId;
        hash = 89 * hash + this.beneficiaireId;
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
        final ProgrammeBeneficiaire other = (ProgrammeBeneficiaire) obj;
        if (this.programmeId != other.programmeId) {
            return false;
        }
        if (this.beneficiaireId != other.beneficiaireId) {
            return false;
        }
        return true;
    }
    
}
