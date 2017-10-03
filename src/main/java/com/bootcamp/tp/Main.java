/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.tp;

import com.bootcamp.tp.repositories.BailleurRepository;
import javax.persistence.*;

/**
 *
 * @author ARESKO
 */
public class Main {
    public  static  void main(String... args) {

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TPPU1") ;
//
//        EntityManager em = emf.createEntityManager() ;
//
//        Marin marin =  new Marin() ;
//        marin.setNom("Jean");
//        marin.setAge(24);
//        
//        em.getTransaction().begin() ;
//        em.persist(marin) ;
//        em.getTransaction().commit() ;
        
        BailleurRepository br = new BailleurRepository("TPPU");
        

        System.out.println("Hello World !") ;
    }
}
