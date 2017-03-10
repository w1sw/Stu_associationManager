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
			//Newusers users = new Newusers("zhangsan", "123456", "李四", "男", 30, "1233@163.com","1234567890", "高三1班");
			Associationapplist associationapplist = new Associationapplist(
					"街舞社",
					"艺术", 100, "高三1班",
					"18976102422", "邓程夫", "ssssssssssssss");
			Transaction tx = HibernateSessionFactory.getSession().beginTransaction();
			associationapplistDAO.save(associationapplist);
			tx.commit();
			HibernateSessionFactory.closeSession();

	}
}
	
	

