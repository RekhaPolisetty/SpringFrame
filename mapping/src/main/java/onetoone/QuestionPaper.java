package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class QuestionPaper {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		//create a question 
		Question q1 =new Question();
		q1.setQ_id(1);
		q1.setQuestion("what is java?");
		
		//create a answer
		Answer a1 = new Answer();
		a1.setA_id(123);
		a1.setAnswer("java is a programming language.");
		q1.setAnswer(a1);
		
		transaction.begin();
		manager.persist(q1);
		manager.persist(a1);
		transaction.commit();
	}

}
