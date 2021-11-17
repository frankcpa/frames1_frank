/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frames1.controller;

import com.frames1.model.EventoModel;
import com.frames1.repository.EventoRepository;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Frank
 */
@ManagedBean
@ViewScoped
public class EventoController {
    private EventoModel eventoModel = new EventoModel();
    private EventoRepository eventoRepository = new EventoRepository();
    
    public void salvar(){
        this.eventoRepository.salvar(eventoModel);
    }

    public EventoModel getEventoModel() {
        return eventoModel;
    }

    public void setEventoModel(EventoModel eventoModel) {
        this.eventoModel = eventoModel;
    }

    public EventoRepository getEventoRepository() {
        return eventoRepository;
    }

    public void setEventoRepository(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

}
