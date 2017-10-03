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
public class ProgrammeFournisseurId implements Serializable {
    
    private int programmeId;
    
    private int fournisseurId;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.programmeId;
        hash = 47 * hash + this.fournisseurId;
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
        final ProgrammeFournisseurId other = (ProgrammeFournisseurId) obj;
        if (this.programmeId != other.programmeId) {
            return false;
        }
        if (this.fournisseurId != other.fournisseurId) {
            return false;
        }
        return true;
    }
    
}
