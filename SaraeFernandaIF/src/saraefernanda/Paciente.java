package saraefernanda;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Paciente implements Identificavel {
	@Id
	private Long id;
	
	private int cpf;	
	private int nSus;
	private String nome;
	private String endereco;
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
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
