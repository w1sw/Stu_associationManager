package action;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import service.NewusersDAO;
import util.HibernateSessionFactory;








import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.Newusers;



public class UsersAction extends SuperAction implements ModelDriven<Newusers>{


	static Newusers newusers = new Newusers();
	static NewusersDAO newusersDAO = new NewusersDAO();
	
	//ע��
	public String registed(){
		Transaction tx = HibernateSessionFactory.getSession().beginTransaction();
		newusersDAO.save(newusers);
		tx.commit();
		HibernateSessionFactory.closeSession();
		return "registed_success";
	}
	//��ѯ�����û�
	public String query(){
		List<Newusers> list = newusersDAO.findAll();
		//�Ž�session��
		if(list!=null&&list.size()>0){
			session.setAttribute("users_list", list);
			
		}
		return "query_success";
	}
	
	@Override
	public Newusers getModel() {
		return newusers;
	}
	
}
