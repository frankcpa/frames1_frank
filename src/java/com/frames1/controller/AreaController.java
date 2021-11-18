/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frames1.controller;

import com.frames1.model.AreaModel;
import com.frames1.repository.AreaRepository;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Frank
 */
@ManagedBean
@ViewScoped
public class AreaController {

    private AreaModel areaModel = new AreaModel();
    private AreaRepository areaRepository = new AreaRepository();
    private List<AreaModel> listaDeAreas = new ArrayList<>();

    public AreaController() {
        this.listaDeAreas = areaRepository.buscarTodos();
    }

    public void salvar() {
        this.areaRepository.salvar(areaModel);
    }

    public String editar(long idArea) {
        return "editarArea.xhtml?faces-redirect=true&idArea=" + idArea;
    }

    public void remover(long idArea) {
        this.areaRepository.remover(idArea);
        this.listaDeAreas = areaRepository.buscarTodos();
    }

    public AreaModel getAreaModel() {
        return areaModel;
    }

    public void setAreaModel(AreaModel areaModel) {
        this.areaModel = areaModel;
    }

    public AreaRepository getAreaRepository() {
        return areaRepository;
    }

    public void setAreaRepository(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    public List<AreaModel> getListaDeAreas() {
        return listaDeAreas;
    }

    public void setListaDeAreas(List<AreaModel> listaDeAreas) {
        this.listaDeAreas = listaDeAreas;
    }

}
