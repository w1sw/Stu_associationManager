package service;

import java.util.List;


import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entity.Associationpersonlist;

/**
 * A data access object (DAO) providing persistence and search support for
 * Associationpersonlist entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see entity.Associationpersonlist
 * @author MyEclipse Persistence Tools
 */

public class AssociationpersonlistDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AssociationpersonlistDAO.class);
	// property constants
	public static final String ASSO_PERSON_CODE = "assoPersonCode";
	public static final String ASSO_PERSON_PASSWORD = "assoPersonPassword";
	public static final String ASSO_PERSON_NAME = "assoPersonName";
	public static final String ASSO_PERSON_SEX = "assoPersonSex";
	public static final String ASSO_PERSON_AGE = "assoPersonAge";
	public static final String ASSO_PERSON_EMAIL = "assoPersonEmail";
	public static final String ASSO_PERSON_PHONE = "assoPersonPhone";
	public static final String ASSO_PERSON_POSITION = "assoPersonPosition";
	public static final String ASSO_PERSON_COLLEGE = "assoPersonCollege";
	public static final String ASSOCIATION = "association";

	public void save(Associationpersonlist transientInstance) {
		log.debug("saving Associationpersonlist instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Associationpersonlist persistentInstance) {
		log.debug("deleting Associationpersonlist instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Associationpersonlist findById(java.lang.Integer id) {
		log.debug("getting Associationpersonlist instance with id: " + id);
		try {
			Associationpersonlist instance = (Associationpersonlist) getSession()
					.get("service.Associationpersonlist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Associationpersonlist instance) {
		log.debug("finding Associationpersonlist instance by example");
		try {
			List results = getSession()
					.createCriteria("service.Associationpersonlist")
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
		log.debug("finding Associationpersonlist instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Associationpersonlist as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAssoPersonCode(Object assoPersonCode) {
		return findByProperty(ASSO_PERSON_CODE, assoPersonCode);
	}

	public List findByAssoPersonPassword(Object assoPersonPassword) {
		return findByProperty(ASSO_PERSON_PASSWORD, assoPersonPassword);
	}

	public List findByAssoPersonName(Object assoPersonName) {
		return findByProperty(ASSO_PERSON_NAME, assoPersonName);
	}

	public List findByAssoPersonSex(Object assoPersonSex) {
		return findByProperty(ASSO_PERSON_SEX, assoPersonSex);
	}

	public List findByAssoPersonAge(Object assoPersonAge) {
		return findByProperty(ASSO_PERSON_AGE, assoPersonAge);
	}

	public List findByAssoPersonEmail(Object assoPersonEmail) {
		return findByProperty(ASSO_PERSON_EMAIL, assoPersonEmail);
	}

	public List findByAssoPersonPhone(Object assoPersonPhone) {
		return findByProperty(ASSO_PERSON_PHONE, assoPersonPhone);
	}

	public List findByAssoPersonPosition(Object assoPersonPosition) {
		return findByProperty(ASSO_PERSON_POSITION, assoPersonPosition);
	}

	public List findByAssoPersonCollege(Object assoPersonCollege) {
		return findByProperty(ASSO_PERSON_COLLEGE, assoPersonCollege);
	}

	public List findByAssociation(Object association) {
		return findByProperty(ASSOCIATION, association);
	}

	public List findAll() {
		log.debug("finding all Associationpersonlist instances");
		try {
			String queryString = "from Associationpersonlist";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Associationpersonlist merge(Associationpersonlist detachedInstance) {
		log.debug("merging Associationpersonlist instance");
		try {
			Associationpersonlist result = (Associationpersonlist) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Associationpersonlist instance) {
		log.debug("attaching dirty Associationpersonlist instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Associationpersonlist instance) {
		log.debug("attaching clean Associationpersonlist instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}