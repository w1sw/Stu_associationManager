package service;

import java.util.List;


import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entity.Associationapplist;

/**
 * A data access object (DAO) providing persistence and search support for
 * Associationapplist entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see entity.Associationapplist
 * @author MyEclipse Persistence Tools
 */

public class AssociationapplistDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AssociationapplistDAO.class);
	// property constants
	public static final String ASSO_NAME = "assoName";
	public static final String ASSO_POSITION = "assoPosition";
	public static final String ASSO_PERSON_NUM = "assoPersonNum";
	public static final String ASSO_RES_CLASS = "assoResClass";
	public static final String ASSO_RES_PHONE = "assoResPhone";
	public static final String ASSO_RES_NAME = "assoResName";
	public static final String ASSO_INTRODUCE = "assoIntroduce";

	public void save(Associationapplist transientInstance) {
		log.debug("saving Associationapplist instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Associationapplist persistentInstance) {
		log.debug("deleting Associationapplist instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Associationapplist findById(java.lang.Integer id) {
		log.debug("getting Associationapplist instance with id: " + id);
		try {
			Associationapplist instance = (Associationapplist) getSession()
					.get("service.Associationapplist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Associationapplist instance) {
		log.debug("finding Associationapplist instance by example");
		try {
			List results = getSession()
					.createCriteria("service.Associationapplist")
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
		log.debug("finding Associationapplist instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Associationapplist as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAssoName(Object assoName) {
		return findByProperty(ASSO_NAME, assoName);
	}

	public List findByAssoPosition(Object assoPosition) {
		return findByProperty(ASSO_POSITION, assoPosition);
	}

	public List findByAssoPersonNum(Object assoPersonNum) {
		return findByProperty(ASSO_PERSON_NUM, assoPersonNum);
	}

	public List findByAssoResClass(Object assoResClass) {
		return findByProperty(ASSO_RES_CLASS, assoResClass);
	}

	public List findByAssoResPhone(Object assoResPhone) {
		return findByProperty(ASSO_RES_PHONE, assoResPhone);
	}

	public List findByAssoResName(Object assoResName) {
		return findByProperty(ASSO_RES_NAME, assoResName);
	}

	public List findByAssoIntroduce(Object assoIntroduce) {
		return findByProperty(ASSO_INTRODUCE, assoIntroduce);
	}

	public List findAll() {
		log.debug("finding all Associationapplist instances");
		try {
			String queryString = "from Associationapplist";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Associationapplist merge(Associationapplist detachedInstance) {
		log.debug("merging Associationapplist instance");
		try {
			Associationapplist result = (Associationapplist) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Associationapplist instance) {
		log.debug("attaching dirty Associationapplist instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Associationapplist instance) {
		log.debug("attaching clean Associationapplist instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}