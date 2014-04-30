/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calleddesktop.model.dao;

import br.com.calleddomain.core.model.BaseEntity;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Classe responsável por
 *
 * @author Esdras França - <esdrasdev@gmail.com>
 * @since 30/04/2014 17:02:00
 */
public abstract class BaseDAOImplementation implements BaseDAO {

    private Session session;
    private Class persistentClass;

    public BaseDAOImplementation(Session session, Class persistentClass) {
        this.session = session;
        this.persistentClass = persistentClass;
    }

    @Override
    public Serializable salvar(BaseEntity entity) throws HibernateException {
        return this.session.save(entity);
    }

    @Override
    public void atualizar(BaseEntity entity) throws HibernateException {
        this.session.update(entity);
    }

    @Override
    public void excluir(BaseEntity entity) throws HibernateException {
        this.session.delete(entity);
    }

    @Override
    public List<BaseEntity> buscarTodos() throws HibernateException {
        return this.session.createCriteria(persistentClass).list();
    }

    @Override
    public BaseEntity buscarPorID(Serializable id) {
        return (BaseEntity) this.session.get(persistentClass, id);
    }
}
