/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frames1.repository;

import com.frames1.model.AreaModel;
import com.frames1.util.ConectorHibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Frank
 */
public class AreaRepository {
    // metodo de excluir, editar, buscarpornome, buscarporid, buscatodos.
    public void salvar(AreaModel areaModel){
        Session ses = ConectorHibernateUtil.getSessionFactory().openSession();
        Transaction tr = ses.beginTransaction();
        
        ses.save(areaModel);
       
        tr.commit();
        ses.close();
    }
    
    public List<AreaModel> buscarTodos(){
        Session ses = ConectorHibernateUtil.getSessionFactory().openSession();
        Transaction tr = ses.beginTransaction();
        
        List<AreaModel> listaDeAreas = ses.createQuery("from AreaModel").list();
       
        tr.commit();
        ses.close();
        return listaDeAreas;
    }
    
    public void remover(Long idArea){
        Session ses = ConectorHibernateUtil.getSessionFactory().openSession();
        Transaction tr = ses.beginTransaction();
        
        AreaModel area = (AreaModel) ses.get(AreaModel.class, idArea);
        ses.delete(area);
       
        tr.commit();
        ses.close();
    }
}
