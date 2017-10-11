package com.bootcamp;

import com.bootcamp.tp.entities.Bailleur;
import com.bootcamp.tp.entities.IndicateurPerformance;
import com.bootcamp.tp.entities.Personne;
import com.bootcamp.tp.enums.TypeBailleur;
import com.bootcamp.tp.repositories.BailleurRepository;
import com.bootcamp.tp.repositories.IndicateurPerformanceRepository;
import java.sql.SQLException;
import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.testng.annotations.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by darextossa on 9/22/17.
 */


public class GenerateTableTest {

    @Test
    public void generateTables() throws SQLException{
        Persistence.generateSchema("TPPU", new Properties());
        
//        Bailleur b = new Bailleur();
//        b.setId(1);
//        b.setNom("AGOSSOU");
//        b.setTypeBailleur(TypeBailleur.Privé);
//        
//        BailleurRepository br = new BailleurRepository("TPPU");
//        br.create(b);
        
        IndicateurPerformance b = new IndicateurPerformance();
        b.setId(1);
        b.setNom("AGOSSOU");
        
        IndicateurPerformanceRepository br = new IndicateurPerformanceRepository("TPPU");
        br.create(b);
        
//        File file = generateF
        
        
        
//        IndicateurPerformance
    }
}
