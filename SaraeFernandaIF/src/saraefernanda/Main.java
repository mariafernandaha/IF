package saraefernanda;

public class Main {

	public static void main(String[] args) {
		DAO <Paciente> dao = new DAO<Paciente>();
		Paciente p = new Paciente();
		p.setNome("fernandaesara");
		dao.save(p);
		Paciente p2 = new Paciente();
		p2.setId(23l);
		p2.setNome("fernandaesara");
		dao.save(p2);
		Paciente find = dao.find(Paciente.class, 22l);
		System.out.println(find.getNome());
	}
	
}
