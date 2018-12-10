package saraefernanda;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Paciente implements Identificavel {
	@Id
	private Long id;
	
	private Integer cpf;	
	private int nSus;
	private String nome;
	private String endereco;
	
	@ManyToMany()
	@JoinTable(
			name = "pac_ate", 
			joinColumns = @JoinColumn(name = "id_pac"), 
			inverseJoinColumns = @JoinColumn(name = "id_ate"))
	private Set<Atendimento> atendimentos;
	
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public int getnSus() {
		return nSus;
	}
	public void setnSus(int nSus) {
		this.nSus = nSus;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}
	public char[] getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
