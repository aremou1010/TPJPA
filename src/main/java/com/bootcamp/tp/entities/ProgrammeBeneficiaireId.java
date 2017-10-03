/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.tp.entities;

import java.io.Serializable;

/**
 *
 * @author ARESKO
 */
public class ProgrammeBeneficiaireId implements Serializable {
    
    private int programmeId;
    
    private int beneficiaireId;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.programmeId;
        hash = 67 * hash + this.beneficiaireId;
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
        final ProgrammeBeneficiaireId other = (ProgrammeBeneficiaireId) obj;
        if (this.programmeId != other.programmeId) {
            return false;
        }
        if (this.beneficiaireId != other.beneficiaireId) {
            return false;
        }
        return true;
    }
    
}
