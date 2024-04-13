package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddressDriver {
	public static void main(String[] args) {
		EntityManagerFactory factory=  Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		User u1 = new User();
		u1.setName("ram");
		u1.setAge(21);
		
		User u2 = new User();
		u2.setName("sita");
		u2.setAge(20);
		
		List<User> list = new ArrayList<User>();
		list.add(u1);
		list.add(u2);
		
		Address a1 = new Address();
		a1.setCity("tirupati");
		a1.setState("andhra");
		
		Address a2 = new Address();
		a2.setCity("kodur");
		a2.setState("Andhra");
		
		List<Address> ad = new ArrayList<Address>();
		ad.add(a1);
		ad.add(a2);
		
		u1.setAddresses(ad);
		u2.setAddresses(ad);
		
		a1.setUsers(list);
		a2.setUsers(list);
		
		transaction.begin();
		manager.persist(u1);
		manager.persist(u2);
		manager.persist(a1);
		manager.persist(a2);
		transaction.commit();
		
	}

}
