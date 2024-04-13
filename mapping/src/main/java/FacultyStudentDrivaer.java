import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomany.Faculty;
import onetomany.Student;

public class FacultyStudentDrivaer {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Faculty faculty = new Faculty();
		faculty.setName("ram");
		faculty.setSubject("java");
		
		Student s1 = new Student();
		s1.setName("jay");
		s1.setPhone(147896325);
		
		Student s2= new Student();
		s2.setName("sema");
		s2.setPhone(1164544563);
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		
		faculty.setStudents(list);
		
		transaction.begin();
		manager.persist(faculty);
		manager.persist(s1);
		manager.persist(s2);
		transaction.commit();
	}

}
