package saraefernanda;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Enfermeira {
	
	@Id
	private Long id_enf; 
	
	@ManyToMany()
	@JoinTable(
			name = "enf_ate", 
			joinColumns = @JoinColumn(name = "id_enf"), 
			inverseJoinColumns = @JoinColumn(name = "id_ate"))
	private Set<Atendimento> atendimentos;
	 
}
	
	
	
	
	