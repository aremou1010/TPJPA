/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.tp.repositories;

import com.bootcamp.tp.entities.Bailleur;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ARESKO
 */
public class BailleurRepository extends BaseRepository<Bailleur> {
    public BailleurRepository(String unitPersistence) {
        super(unitPersistence, Bailleur.class);
    }

    public List<Bailleur> findAll() throws SQLException {
        return null;
    }
}
