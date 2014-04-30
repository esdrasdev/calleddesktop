/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.calleddesktop.model.dao;

/**
 * Classe responsável por
 * @author Esdras França - <esdrasdev@gmail.com>
 * @since 30/04/2014 17:08:56
 */
public class Teste {
    
    public static void main(String[] args) {
        
        ChamadoEntityDAO dao = (ChamadoEntityDAO) DAOFactory.getBaseDAOImplementation(ChamadoEntityDAO.class);
        dao.teste();
        
    }
    
}
