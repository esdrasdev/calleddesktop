/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calleddesktop.model.dao;

import br.com.calleddesktop.util.HibernateUtil;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 * Classe responsável por criar as instancias das classes DAO's.
 *
 * @author Esdras França - <esdrasdev@gmail.com>
 * @since 30/04/2014 17:09:47
 */
public class DAOFactory {

    public static BaseDAOImplementation getBaseDAOImplementation(Class classeDAO) {

        BaseDAOImplementation dao = null;

        try {
            Constructor cons = classeDAO.getConstructor(Session.class, Class.class);
            Object obj = cons.newInstance(HibernateUtil.getSessionFactory().getCurrentSession(), classeDAO);
            dao = (BaseDAOImplementation) obj;

        } catch (InstantiationException ex) {
            Logger.getLogger(DAOFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DAOFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(DAOFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(DAOFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(DAOFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(DAOFactory.class.getName()).log(Level.SEVERE, null, ex);
        } 

        return dao;
    }
}
