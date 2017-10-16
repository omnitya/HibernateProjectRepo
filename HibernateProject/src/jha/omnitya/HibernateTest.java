/**
 * 
 */
package jha.omnitya;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author omnityajha
 *
 */
public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Address addr = new Address();
		addr.setCityName("Third City Name");
		addr.setPinCode("800023");
		addr.setStateName("Bihar");
		addr.setStreetName("Third Street");
		
		Skills skill = new Skills();
		skill.setExperience("5 years");
		skill.setLanguage("java");
		
		UserDetails user = new UserDetails();
//		user.setUserId(9);
		user.setUserName("Third User name");
		user.setJoiningDate(new Date());
		user.setHomeAddress(addr);
		user.getSkillList().add(skill);
		
		Address addr2 = new Address();
		addr2.setCityName("Another City Name");
		addr2.setPinCode("600085");
		addr2.setStateName("Tamilnadu");
		addr2.setStreetName("Another Street");
		
		Skills skill2 = new Skills();
		skill2.setExperience("2 years");
		skill2.setLanguage("J2EE");
		
		UserDetails user2 = new UserDetails();
//		user.setUserId(9);
		user2.setUserName("Another User name");
		user2.setJoiningDate(new Date());
		user2.setOfficeAddress(addr2);
		user2.getSkillList().add(skill2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		
		session.close();
//		user = null;
		
//		session = sessionFactory.openSession();
//		session.beginTransaction();
		
//		user = (UserDetails) session.get(UserDetails.class, 9);
//		System.out.println(user.getUserId());
//		System.out.println(user.getUserName());
//		System.out.println(user.getJoiningDate());
		
		
	}
}
