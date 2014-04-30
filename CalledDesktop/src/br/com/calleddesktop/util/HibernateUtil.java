/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calleddesktop.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Classe responsável por realizar a conaxão com a base de dados.
 *
 * @author Esdras França - <esdrasdev@gmail.com>
 * @since 30/04/2014 16:37:24
 */
public class HibernateUtil {

    private static SessionFactory SESSION_FACTORY;

    static {
        try {
            SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
    
}
