package action;

import org.hibernate.Transaction;

import service.AssociationapplistDAO;
import util.HibernateSessionFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.Associationapplist;

public class AssociationsAction extends SuperAction implements ModelDriven<Associationapplist>{

	Associationapplist associationapply = new Associationapplist();
	AssociationapplistDAO associationapplyDAO = new AssociationapplistDAO();
	public String AssoRegisted(){
		Transaction tx = HibernateSessionFactory.getSession().beginTransaction();
		associationapplyDAO.save(associationapply);
		tx.commit();
		HibernateSessionFactory.closeSession();
		return "assoregisted_success";
	}
	
	
	
	@Override
	public Associationapplist getModel() {
		return associationapply;
	}

}
