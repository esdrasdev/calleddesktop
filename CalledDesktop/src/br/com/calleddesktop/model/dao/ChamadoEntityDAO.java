/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.calleddesktop.model.dao;

import org.hibernate.Session;

/**
 * Classe responsável por
 * @author Esdras França - <esdrasdev@gmail.com>
 * @since 30/04/2014 17:07:23
 */
public class ChamadoEntityDAO extends BaseDAOImplementation {

    public ChamadoEntityDAO(Session session, Class persistentClass) {
        super(session, persistentClass);
    }

    public void teste() {
        System.out.println("Teste");
    }
    
}
