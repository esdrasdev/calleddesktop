/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calleddesktop.model.dao;

import br.com.calleddomain.core.model.BaseEntity;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;

/**
 * Interface base para os DAO's.
 * @author DIGITACAOFUND
 */
public interface BaseDAO {
    
    Serializable salvar(BaseEntity entity) throws HibernateException;
    
    void atualizar(BaseEntity entity) throws HibernateException;
    
    void excluir(BaseEntity entity) throws HibernateException;
    
    List<BaseEntity> buscarTodos() throws HibernateException;
    
    BaseEntity buscarPorID(Serializable id);
    
}
