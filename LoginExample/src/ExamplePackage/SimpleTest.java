package ExamplePackage;

import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;

public class SimpleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); 
		 Session session = sessionFactory.getCurrentSession(); 
		 Transaction tx = session.beginTransaction(); 
		 
		 UserBean bean1 = new UserBean();
		 bean1.setFirstName("Veer");
		 bean1.setLastName("singh");
		 bean1.setUsername("ve");
		 bean1.setPassword("vee");
		 
		 session.save(bean1); 
		 tx.commit();

	}

}
