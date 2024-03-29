package com.moneymanager.hibernate.pojo;
// Generated Aug 11, 2012 4:29:03 PM by Hibernate Tools 3.4.0.CR1


import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Publisher52.
 * @see com.moneymanager.hibernate.pojo.Publisher52
 * @author Hibernate Tools
 */
public class Publisher52Home {

    private static final Log log = LogFactory.getLog(Publisher52Home.class);

    private final SessionFactory sessionFactory = getSessionFactory();
    
    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup("SessionFactory");
        }
        catch (Exception e) {
            log.error("Could not locate SessionFactory in JNDI", e);
            throw new IllegalStateException("Could not locate SessionFactory in JNDI");
        }
    }
    
    public void persist(Publisher52 transientInstance) {
        log.debug("persisting Publisher52 instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Publisher52 instance) {
        log.debug("attaching dirty Publisher52 instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Publisher52 instance) {
        log.debug("attaching clean Publisher52 instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Publisher52 persistentInstance) {
        log.debug("deleting Publisher52 instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Publisher52 merge(Publisher52 detachedInstance) {
        log.debug("merging Publisher52 instance");
        try {
            Publisher52 result = (Publisher52) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Publisher52 findById( long id) {
        log.debug("getting Publisher52 instance with id: " + id);
        try {
            Publisher52 instance = (Publisher52) sessionFactory.getCurrentSession()
                    .get("com.moneymanager.hibernate.pojo.Publisher52", id);
            if (instance==null) {
                log.debug("get successful, no instance found");
            }
            else {
                log.debug("get successful, instance found");
            }
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    public List findByExample(Publisher52 instance) {
        log.debug("finding Publisher52 instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.moneymanager.hibernate.pojo.Publisher52")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        }
        catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    } 
}

