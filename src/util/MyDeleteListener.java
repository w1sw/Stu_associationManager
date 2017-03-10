package util;

import org.hibernate.HibernateException;
import org.hibernate.event.DeleteEvent;
import org.hibernate.event.def.DefaultDeleteEventListener;

import entity.Newusers;

public class MyDeleteListener extends DefaultDeleteEventListener {
	public void onDelete(DeleteEvent arg0) throws HibernateException {  
        
        System.out.println("Delete EntityName:"+arg0.getEntityName());  
        Object object=arg0.getObject();  
        if(object instanceof Newusers)  
        {  
        	Newusers s=(Newusers)object;  
            System.out.println("name:"+s.getUsersName());  
            System.out.println("age:"+s.getUsersAge());  
            System.out.println("id:"+s.getUsersId());  
        }  
           //注意一定要调用父类的对应的方法  
           super.onDelete(arg0);  
	}
}
