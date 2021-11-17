/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frames1.controller;

import com.frames1.model.CampusModel;
import com.frames1.repository.CampusRepository;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Frank
 */
@ManagedBean
@ViewScoped
public class CampusController {
    private CampusModel campusModel = new CampusModel();
    private CampusRepository campusRepository = new CampusRepository();
    
    public void salvar(){
        this.campusRepository.salvar(campusModel);
    }

    public CampusModel getCampusModel() {
        return campusModel;
    }

    public void setCampusModel(CampusModel campusModel) {
        this.campusModel = campusModel;
    }

    public CampusRepository getCampusRepository() {
        return campusRepository;
    }

    public void setCampusRepository(CampusRepository campusRepository) {
        this.campusRepository = campusRepository;
    }

}
