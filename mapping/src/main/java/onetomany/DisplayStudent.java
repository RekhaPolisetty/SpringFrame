package onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DisplayStudent {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		Faculty f= manager.find(Faculty.class, 1);
		System.out.println(f.getName()+" "+f.getSubject());
		List<Student> students =  f.getStudents();
		for(Student s: students)
		{
			System.out.println(s.getName()+" "+s.getPhone());
		}

	}

}
