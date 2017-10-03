/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.tp.entities;

import com.bootcamp.tp.enums.TypeBailleur;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author ARESKO
 */
@Entity(name = "tp_bailleur")
@DiscriminatorValue("BAILLEUR")
public class Bailleur extends Personne {

    @Enumerated(EnumType.STRING)
    private TypeBailleur typeBailleur;
    
    @ManyToMany(mappedBy = "bailleurs")
    private List<Projet> projets = new ArrayList<Projet>();
    
    @OneToMany(mappedBy = "bailleur")
    private List<ProgrammeBailleur> programmes;

    public TypeBailleur getTypeBailleur() {
        return typeBailleur;
    }

    public void setTypeBailleur(TypeBailleur typeBailleur) {
        this.typeBailleur = typeBailleur;
    }

    
    
}
