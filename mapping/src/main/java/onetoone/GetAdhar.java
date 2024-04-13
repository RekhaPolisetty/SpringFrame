package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetAdhar {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		Person p = manager.find(Person.class, 1);
		
		if(p != null)
		{
			System.out.println(p.getAddress());
			System.out.println(p.getA());
			System.out.println(p.getName());
		}
		else
		{
			System.out.println("perosn not found");
		}
		
	}

}
