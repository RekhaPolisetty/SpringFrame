package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AdharCard {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		//Create a person
		Person person = new Person();
		person.setName("ram");
		person.setAddress("tirupati");
		
		//create Adhar
		
		Adhar adhar =new Adhar();
		adhar.setAadhar_no(123456);
		
		person.setA(adhar);
		
		adhar.setP(person);
		
		transaction.begin();
		manager.persist(person);
		manager.persist(adhar);
		transaction.commit();
	}
	

}
