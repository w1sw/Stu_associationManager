package test;




import org.hibernate.Transaction;
import org.junit.Assert;

import service.AssociationapplistDAO;
import service.NewusersDAO;
import util.HibernateSessionFactory;
import entity.Associationapplist;
import entity.Newusers;


public class test {

	static AssociationapplistDAO associationapplistDAO = new AssociationapplistDAO();
	public static void main(String arg[]){
			//Newusers users = new Newusers("zhangsan", "123456", "����", "��", 30, "1233@163.com","1234567890", "����1��");
			Associationapplist associationapplist = new Associationapplist(
					"������",
					"����", 100, "����1��",
					"18976102422", "�˳̷�", "ssssssssssssss");
			Transaction tx = HibernateSessionFactory.getSession().beginTransaction();
			associationapplistDAO.save(associationapplist);
			tx.commit();
			HibernateSessionFactory.closeSession();

	}
}
	
	

