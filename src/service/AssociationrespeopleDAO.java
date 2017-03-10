package service;

import java.util.List;


import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entity.Associationrespeople;

/**
 * A data access object (DAO) providing persistence and search support for
 * Associationrespeople entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see entity.Associationrespeople
 * @author MyEclipse Persistence Tools
 */

public class AssociationrespeopleDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AssociationrespeopleDAO.class);
	// property constants
	public static final String ASSO_RES_CODE = "assoResCode";
	public static final String ASSO_RES_PASSWORD = "assoResPassword";
	public static final String ASSO_RES_NAME = "assoResName";
	public static final String ASSO_RES_SEX = "assoResSex";
	public static final String ASSO_RES_AGE = "assoResAge";
	public static final String ASSO_RES_EMAIL = "assoResEmail";
	public static final String ASSO_RES_PHONE = "assoResPhone";
	public static final String ASSO_RES_POSITION = "assoResPosition";
	public static final String ASSO_RES_CLASS = "assoResClass";
	public static final String ASSOCIATION = "association";

	public void save(Associationrespeople transientInstance) {
		log.debug("saving Associationrespeople instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Associationrespeople persistentInstance) {
		log.debug("deleting Associationrespeople instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Associationrespeople findById(java.lang.Integer id) {
		log.debug("getting Associationrespeople instance with id: " + id);
		try {
			Associationrespeople instance = (Associationrespeople) getSession()
					.get("service.Associationrespeople", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Associationrespeople instance) {
		log.debug("finding Associationrespeople instance by example");
		try {
			List results = getSession()
					.createCriteria("service.Associationrespeople")
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
		log.debug("finding Associationrespeople instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Associationrespeople as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAssoResCode(Object assoResCode) {
		return findByProperty(ASSO_RES_CODE, assoResCode);
	}

	public List findByAssoResPassword(Object assoResPassword) {
		return findByProperty(ASSO_RES_PASSWORD, assoResPassword);
	}

	public List findByAssoResName(Object assoResName) {
		return findByProperty(ASSO_RES_NAME, assoResName);
	}

	public List findByAssoResSex(Object assoResSex) {
		return findByProperty(ASSO_RES_SEX, assoResSex);
	}

	public List findByAssoResAge(Object assoResAge) {
		return findByProperty(ASSO_RES_AGE, assoResAge);
	}

	public List findByAssoResEmail(Object assoResEmail) {
		return findByProperty(ASSO_RES_EMAIL, assoResEmail);
	}

	public List findByAssoResPhone(Object assoResPhone) {
		return findByProperty(ASSO_RES_PHONE, assoResPhone);
	}

	public List findByAssoResPosition(Object assoResPosition) {
		return findByProperty(ASSO_RES_POSITION, assoResPosition);
	}

	public List findByAssoResClass(Object assoResClass) {
		return findByProperty(ASSO_RES_CLASS, assoResClass);
	}

	public List findByAssociation(Object association) {
		return findByProperty(ASSOCIATION, association);
	}

	public List findAll() {
		log.debug("finding all Associationrespeople instances");
		try {
			String queryString = "from Associationrespeople";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Associationrespeople merge(Associationrespeople detachedInstance) {
		log.debug("merging Associationrespeople instance");
		try {
			Associationrespeople result = (Associationrespeople) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Associationrespeople instance) {
		log.debug("attaching dirty Associationrespeople instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Associationrespeople instance) {
		log.debug("attaching clean Associationrespeople instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}