package saraefernanda;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("fernandaesara");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Paciente p = new Paciente();
		p.setId_pac(1l);
		p.setNome("Fada");
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
}
