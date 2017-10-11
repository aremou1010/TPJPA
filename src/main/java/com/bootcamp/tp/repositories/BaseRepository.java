/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.tp.repositories;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ARESKO
 */
public abstract class BaseRepository<T> {
    
    private EntityManager em;
    private String unitPersistence;
    private EntityManagerFactory emf;
    private Class entityClass;

    public BaseRepository(String unitPersistence, Class entityClass) {
        this.unitPersistence = unitPersistence;
        emf = Persistence.createEntityManagerFactory(this.unitPersistence);
        em = emf.createEntityManager() ;
        this.entityClass=entityClass;

    }

    /**
     * Méthode de création
     *
     * @param obj
     * @return boolean
     * @throws SQLException
     */
    public boolean create(T obj) throws SQLException {
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();

        return true;
    }

    /**
     * Méthode pour effacer
     *
     * @param obj
     * @return boolean
     */
    public boolean delete(T obj) throws SQLException {
        em.remove(obj);
        return true;
    }

    /**
     * Méthode de mise à jour
     *
     * @param obj
     * @return boolean
     */
    public boolean update(T obj) throws SQLException {
        em.merge(obj);
        return true;
    }

    /**
     * Méthode de recherche des informations
     *
     * @return T
     */
    public T findByProperty(String propertyName, Object value) throws SQLException {

        String className = entityClass.getClass().getSimpleName();
        String query = "select t from " + className + " t where t." + propertyName + "=:param";
        Query qry = getEm().createQuery(query);
        qry.setParameter("param", value);
        return (T) qry.getSingleResult();

    }

    /*
	  * Méthode de recherche de tous les objets
     */
    public abstract List<T> findAll() throws SQLException;

    public EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(getUnitPersistence());
        setEm(emf.createEntityManager());
        return getEm();
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }

    /**
     * @return the unitPersistence
     */
    public String getUnitPersistence() {
        return unitPersistence;
    }

    /**
     * @param unitPersistence the unitPersistence to set
     */
    public void setUnitPersistence(String unitPersistence) {
        this.unitPersistence = unitPersistence;
    }
    
}
