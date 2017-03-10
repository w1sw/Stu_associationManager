package service;

import java.util.Date;
import java.util.List;


import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entity.Associationinformation;

/**
 * A data access object (DAO) providing persistence and search support for
 * Associationinformation entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see entity.Associationinformation
 * @author MyEclipse Persistence Tools
 */

public class AssociationinformationDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AssociationinformationDAO.class);
	// property constants
	public static final String ASSO_NAME = "assoName";
	public static final String ASSO_POSITION = "assoPosition";
	public static final String ASSO_PERSON_NUM = "assoPersonNum";
	public static final String ASSO_RES_NAME = "assoResName";
	public static final String ASSO_INTRODUCE = "assoIntroduce";

	public void save(Associationinformation transientInstance) {
		log.debug("saving Associationinformation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Associationinformation persistentInstance) {
		log.debug("deleting Associationinformation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Associationinformation findById(java.lang.Integer id) {
		log.debug("getting Associationinformation instance with id: " + id);
		try {
			Associationinformation instance = (Associationinformation) getSession()
					.get("service.Associationinformation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Associationinformation instance) {
		log.debug("finding Associationinformation instance by example");
		try {
			List results = getSession()
					.createCriteria("service.Associationinformation")
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
		log.debug("finding Associationinformation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Associationinformation as model where model."
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

	public List findByAssoResName(Object assoResName) {
		return findByProperty(ASSO_RES_NAME, assoResName);
	}

	public List findByAssoIntroduce(Object assoIntroduce) {
		return findByProperty(ASSO_INTRODUCE, assoIntroduce);
	}

	public List findAll() {
		log.debug("finding all Associationinformation instances");
		try {
			String queryString = "from Associationinformation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Associationinformation merge(Associationinformation detachedInstance) {
		log.debug("merging Associationinformation instance");
		try {
			Associationinformation result = (Associationinformation) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Associationinformation instance) {
		log.debug("attaching dirty Associationinformation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Associationinformation instance) {
		log.debug("attaching clean Associationinformation instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}