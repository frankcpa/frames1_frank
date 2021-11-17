/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frames1.repository;

import com.frames1.model.CampusModel;
import com.frames1.util.ConectorHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Frank
 */
public class CampusRepository {
    // metodo de excluir, editar, buscarpornome, buscarporid, buscatodos.
    public void salvar(CampusModel campusModel){
        Session ses = ConectorHibernateUtil.getSessionFactory().openSession();
        Transaction tr = ses.beginTransaction();
        
        ses.save(campusModel);
       
        tr.commit();
        ses.close();
    }
    
}
