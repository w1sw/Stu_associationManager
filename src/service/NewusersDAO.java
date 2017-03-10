package service;

import java.util.List;

import javax.persistence.Entity;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import util.HibernateSessionFactory;
import entity.Newusers;

/**
 * A data access object (DAO) providing persistence and search support for
 * Newusers entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see entity.Newusers
 * @author MyEclipse Persistence Tools
 */

public class NewusersDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(NewusersDAO.class);
	// property constants
	public static final String USERS_CODE = "usersCode";
	public static final String USERS_PASSWORD = "usersPassword";
	public static final String USERS_NAME = "usersName";
	public static final String USERS_SEX = "usersSex";
	public static final String USERS_AGE = "usersAge";
	public static final String USERS_EMAIL = "usersEmail";
	public static final String USERS_PHONE = "usersPhone";
	public static final String USERS_CLASS = "usersClass";

	public void save(Newusers transientInstance) {
		log.debug("saving Newusers instance");
		try {
			HibernateSessionFactory.getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Newusers persistentInstance) {
		log.debug("deleting Newusers instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Newusers findById(java.lang.Integer id) {
		log.debug("getting Newusers instance with id: " + id);
		try {
			Newusers instance = (Newusers) getSession().get("service.Newusers",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Newusers instance) {
		log.debug("finding Newusers instance by example");
		try {
			List results = getSession().createCriteria("service.Newusers")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Newusers instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Newusers as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUsersCode(Object usersCode) {
		return findByProperty(USERS_CODE, usersCode);
	}

	public List findByUsersPassword(Object usersPassword) {
		return findByProperty(USERS_PASSWORD, usersPassword);
	}

	public List findByUsersName(Object usersName) {
		return findByProperty(USERS_NAME, usersName);
	}

	public List findByUsersSex(Object usersSex) {
		return findByProperty(USERS_SEX, usersSex);
	}

	public List findByUsersAge(Object usersAge) {
		return findByProperty(USERS_AGE, usersAge);
	}

	public List findByUsersEmail(Object usersEmail) {
		return findByProperty(USERS_EMAIL, usersEmail);
	}

	public List findByUsersPhone(Object usersPhone) {
		return findByProperty(USERS_PHONE, usersPhone);
	}

	public List findByUsersClass(Object usersClass) {
		return findByProperty(USERS_CLASS, usersClass);
	}

	public List findAll() {
		log.debug("finding all Newusers instances");
		try {
			String queryString = "from Newusers";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Newusers merge(Newusers detachedInstance) {
		log.debug("merging Newusers instance");
		try {
			Newusers result = (Newusers) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Newusers instance) {
		log.debug("attaching dirty Newusers instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Newusers instance) {
		log.debug("attaching clean Newusers instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}