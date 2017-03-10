package service;

import java.util.List;

//import javax.persistence.Entity;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entity.Teacher;

/**
 * A data access object (DAO) providing persistence and search support for
 * Teacher entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see entity.Teacher
 * @author MyEclipse Persistence Tools
 */
//@Entity
public class TeacherDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(TeacherDAO.class);
	// property constants
	public static final String TEACHER_NAME = "teacherName";
	public static final String TEACHER_CODE = "teacherCode";
	public static final String TEACHER_PASSWORD = "teacherPassword";
	public static final String TEACHER_SEX = "teacherSex";
	public static final String TEACHER_AGE = "teacherAge";
	public static final String TEACHER_EMAIL = "teacherEmail";
	public static final String TEACHER_PHONE = "teacherPhone";
	public static final String TEACHER_POSITION = "teacherPosition";

	public void save(Teacher transientInstance) {
		log.debug("saving Teacher instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Teacher persistentInstance) {
		log.debug("deleting Teacher instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Teacher findById(java.lang.Integer id) {
		log.debug("getting Teacher instance with id: " + id);
		try {
			Teacher instance = (Teacher) getSession()
					.get("service.Teacher", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Teacher instance) {
		log.debug("finding Teacher instance by example");
		try {
			List results = getSession().createCriteria("service.Teacher")
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
		log.debug("finding Teacher instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Teacher as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTeacherName(Object teacherName) {
		return findByProperty(TEACHER_NAME, teacherName);
	}

	public List findByTeacherCode(Object teacherCode) {
		return findByProperty(TEACHER_CODE, teacherCode);
	}

	public List findByTeacherPassword(Object teacherPassword) {
		return findByProperty(TEACHER_PASSWORD, teacherPassword);
	}

	public List findByTeacherSex(Object teacherSex) {
		return findByProperty(TEACHER_SEX, teacherSex);
	}

	public List findByTeacherAge(Object teacherAge) {
		return findByProperty(TEACHER_AGE, teacherAge);
	}

	public List findByTeacherEmail(Object teacherEmail) {
		return findByProperty(TEACHER_EMAIL, teacherEmail);
	}

	public List findByTeacherPhone(Object teacherPhone) {
		return findByProperty(TEACHER_PHONE, teacherPhone);
	}

	public List findByTeacherPosition(Object teacherPosition) {
		return findByProperty(TEACHER_POSITION, teacherPosition);
	}

	public List findAll() {
		log.debug("finding all Teacher instances");
		try {
			String queryString = "from Teacher";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Teacher merge(Teacher detachedInstance) {
		log.debug("merging Teacher instance");
		try {
			Teacher result = (Teacher) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Teacher instance) {
		log.debug("attaching dirty Teacher instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Teacher instance) {
		log.debug("attaching clean Teacher instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}