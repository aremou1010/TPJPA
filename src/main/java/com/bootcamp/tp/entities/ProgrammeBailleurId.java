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
public class ProgrammeBailleurId implements Serializable {
    
    private int programmeId;
    
    private int bailleurId;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.programmeId;
        hash = 79 * hash + this.bailleurId;
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
        final ProgrammeBailleurId other = (ProgrammeBailleurId) obj;
        if (this.programmeId != other.programmeId) {
            return false;
        }
        if (this.bailleurId != other.bailleurId) {
            return false;
        }
        return true;
    }
    
}
