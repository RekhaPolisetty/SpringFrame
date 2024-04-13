package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetQuestionAnswer {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		Question q = manager.find(Question.class, 1);
		
		if(q!=null) {
			System.out.println(q.getQ_id());
			System.out.println(q.getQuestion());
			System.out.println(q.getAnswer());
		}
		else {
			System.out.println("question not found");
		}
	}

}
