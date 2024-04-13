package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BankingDisplay {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		PersonB person = new PersonB();
		person.setName("ram");
		person.setAge(25);
		
		Bank b1 = new Bank();
		b1.setBank_name("SBI");
		b1.setAccountnumber(123);
		
		Bank b2 = new Bank();
		b2.setBank_name("HDFC");
		b2.setAccountnumber(125);
		
		List<Bank> list = new ArrayList<Bank>();
		list.add(b1);
		list.add(b2);
		
		person.setBanks(list);
		b1.setPerson(person);
		b2.setPerson(person);
		
		transaction.begin();
		manager.persist(person);
		manager.persist(b1);
		manager.persist(b2);
		transaction.commit();

	}

}
