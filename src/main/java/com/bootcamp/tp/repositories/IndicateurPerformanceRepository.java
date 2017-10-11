/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.tp.repositories;

import com.bootcamp.tp.entities.IndicateurPerformance;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ARESKO
 */
public class IndicateurPerformanceRepository extends BaseRepository<IndicateurPerformance>{
    
    public IndicateurPerformanceRepository(String unitPersistence) {
        super(unitPersistence, IndicateurPerformance.class);
    }

    @Override
    public List<IndicateurPerformance> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
