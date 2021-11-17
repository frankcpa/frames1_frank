/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frames1.repository;

import com.frames1.model.cidadeModel;
import com.frames1.util.ConectorHibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class cidadeRepository {
    private Session session;
    private Transaction transaction;

    public List<cidadeModel> buscar(long IdEstado){
        this.session = ConectorHibernateUtil.getSessionFactory().openSession();
        this.transaction = session.beginTransaction();
        
        List<cidadeModel> listaDeCidades = this.session.createQuery("from cidadeModel where IdEstado = "+IdEstado).list();
        
        this.transaction.commit();
        this.session.close();
        return listaDeCidades;
    }
}
