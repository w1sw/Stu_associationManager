package service;

import java.util.Date;
import java.util.List;


import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entity.Newslist;

/**
 * A data access object (DAO) providing persistence and search support for
 * Newslist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see entity.Newslist
 * @author MyEclipse Persistence Tools
 */

public class NewslistDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(NewslistDAO.class);
	// property constants
	public static final String NEWS_CURRENT_ADDRESS = "newsCurrentAddress";
	public static final String NEWS_AUTHOR = "newsAuthor";
	public static final String NEWS_CONTENT = "newsContent";
	public static final String NEWS_TITLE = "newsTitle";

	public void save(Newslist transientInstance) {
		log.debug("saving Newslist instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Newslist persistentInstance) {
		log.debug("deleting Newslist instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Newslist findById(java.lang.Integer id) {
		log.debug("getting Newslist instance with id: " + id);
		try {
			Newslist instance = (Newslist) getSession().get("service.Newslist",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Newslist instance) {
		log.debug("finding Newslist instance by example");
		try {
			List results = getSession().createCriteria("service.Newslist")
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
		log.debug("finding Newslist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Newslist as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNewsCurrentAddress(Object newsCurrentAddress) {
		return findByProperty(NEWS_CURRENT_ADDRESS, newsCurrentAddress);
	}

	public List findByNewsAuthor(Object newsAuthor) {
		return findByProperty(NEWS_AUTHOR, newsAuthor);
	}

	public List findByNewsContent(Object newsContent) {
		return findByProperty(NEWS_CONTENT, newsContent);
	}

	public List findByNewsTitle(Object newsTitle) {
		return findByProperty(NEWS_TITLE, newsTitle);
	}

	public List findAll() {
		log.debug("finding all Newslist instances");
		try {
			String queryString = "from Newslist";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Newslist merge(Newslist detachedInstance) {
		log.debug("merging Newslist instance");
		try {
			Newslist result = (Newslist) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Newslist instance) {
		log.debug("attaching dirty Newslist instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Newslist instance) {
		log.debug("attaching clean Newslist instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}