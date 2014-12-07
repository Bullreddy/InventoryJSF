/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reddys.rad.inventory.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

 
/**
 *
 * @author REDDYS
 */
public class JPAEntityManagerImpl implements EntityManager{
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("InventoryPU");
    static javax.persistence.EntityManager em;
    public static javax.persistence.EntityManager getEntityManager(){
        //if(em == null)
        em = null;
        em = emf.createEntityManager();
        return em;
    }
    
    public Object persist(Object entity){
        try{
            System.out.println(em);
       em = getEntityManager();
       System.out.println(em.getTransaction().isActive());
       if(!em.getTransaction().isActive())
        em.getTransaction().begin();
        em.persist(entity);
        em.flush();
        em.getTransaction().commit();
        em.close();
      }catch(Exception e){
          e.printStackTrace();
          if(em.getTransaction().isActive()){
          em.getTransaction().rollback();
          em.getTransaction().commit();
          em.close();
          }
      }
       return entity;
    }
    
  public Object merge(Object entity){
        try{
            System.out.println(em);
       em = getEntityManager();
       System.out.println(em.getTransaction().isActive());
       if(!em.getTransaction().isActive())
        em.getTransaction().begin();
        em.merge(entity);
        em.flush();
        em.getTransaction().commit();
        em.close();
      }catch(Exception e){
          e.printStackTrace();
          if(em.getTransaction().isActive()){
          em.getTransaction().rollback();
          em.getTransaction().commit();
          em.close();
          }
      }
       return entity;
    }

       
}
