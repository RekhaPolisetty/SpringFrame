package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DepartmentDriver {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Department d = new Department();
		d.setName("Accounts");
		
		Employee e1 = new Employee();
		e1.setName("ram");
		e1.setEmail("ram@gmail.com");
		
		Employee e2 = new Employee();
		e2.setName("sita");
		e2.setEmail("sita@gmail.com");
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		
		d.setEmployees(emp);
		e1.setDepartment(d);
		e2.setDepartment(d);
		
		transaction.begin();
		manager.persist(d);
		manager.persist(e1);
		manager.persist(e2);
		transaction.commit();
	}

}
