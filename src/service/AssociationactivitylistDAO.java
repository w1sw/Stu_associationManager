package service;

import java.util.Date;
import java.util.List;


import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entity.Associationactivitylist;

/**
 * A data access object (DAO) providing persistence and search support for
 * Associationactivitylist entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see entity.Associationactivitylist
 * @author MyEclipse Persistence Tools
 */

public class AssociationactivitylistDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AssociationactivitylistDAO.class);
	// property constants
	public static final String ACTIVITY_NAME = "activityName";
	public static final String ACTIVITY_POSITION = "activityPosition";
	public static final String ACTIVITY_PERSON_NUM = "activityPersonNum";
	public static final String ACTIVITY_CONTENT = "activityContent";
	public static final String ASSOCIATION = "association";

	public void save(Associationactivitylist transientInstance) {
		log.debug("saving Associationactivitylist instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Associationactivitylist persistentInstance) {
		log.debug("deleting Associationactivitylist instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Associationactivitylist findById(java.lang.Integer id) {
		log.debug("getting Associationactivitylist instance with id: " + id);
		try {
			Associationactivitylist instance = (Associationactivitylist) getSession()
					.get("service.Associationactivitylist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Associationactivitylist instance) {
		log.debug("finding Associationactivitylist instance by example");
		try {
			List results = getSession()
					.createCriteria("service.Associationactivitylist")
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
		log.debug("finding Associationactivitylist instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Associationactivitylist as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByActivityName(Object activityName) {
		return findByProperty(ACTIVITY_NAME, activityName);
	}

	public List findByActivityPosition(Object activityPosition) {
		return findByProperty(ACTIVITY_POSITION, activityPosition);
	}

	public List findByActivityPersonNum(Object activityPersonNum) {
		return findByProperty(ACTIVITY_PERSON_NUM, activityPersonNum);
	}

	public List findByActivityContent(Object activityContent) {
		return findByProperty(ACTIVITY_CONTENT, activityContent);
	}

	public List findByAssociation(Object association) {
		return findByProperty(ASSOCIATION, association);
	}

	public List findAll() {
		log.debug("finding all Associationactivitylist instances");
		try {
			String queryString = "from Associationactivitylist";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Associationactivitylist merge(
			Associationactivitylist detachedInstance) {
		log.debug("merging Associationactivitylist instance");
		try {
			Associationactivitylist result = (Associationactivitylist) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Associationactivitylist instance) {
		log.debug("attaching dirty Associationactivitylist instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Associationactivitylist instance) {
		log.debug("attaching clean Associationactivitylist instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}