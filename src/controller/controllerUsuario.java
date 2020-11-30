/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOUsuario;
import java.util.List;
import model.ModelUsuario;

/**
 *
 * @author casa
 */
public class controllerUsuario {
    
    DAOUsuario dAOUsuario = new DAOUsuario();
    /**
     * salvar um novo usuario no banco 
     * @param modelUsuario
     * @return boolean
     */
    public boolean salvarUsuarioController(ModelUsuario modelUsuario) {
        return this.dAOUsuario.salvarUsuarioDAO(modelUsuario);
        
    }

    public List<ModelUsuario> getListaUsuariosController() {
        return this.dAOUsuario.getListaUsuarioDao();
    }

    public boolean excluirUsuarioController(int pCodigo) {
        return this.dAOUsuario.excluirUsuarioDAO(pCodigo);
    }

    public ModelUsuario getUsuarioController(int pCodigo) {
        return this.dAOUsuario.getUsuarioDAO(pCodigo);
    }

    public boolean atualizarUsuarioController(ModelUsuario modelUsuario) {
        return this.dAOUsuario.atualizarUsuario(modelUsuario);
    }

    public boolean validarUsuarioController(ModelUsuario modelUsuario) {
        return this.dAOUsuario.validarUsuario(modelUsuario);
    }

}

        
    
    
    

