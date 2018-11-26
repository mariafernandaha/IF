package saraefernanda;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Paciente {
	@Id
	private Long id_pac;
	
	@ManyToMany()
	@JoinTable(
			name = "enf_pac", 
			joinColumns = @JoinColumn(name = "id_enf"), 
			inverseJoinColumns = @JoinColumn(name = "id_pac"))
	private Set<Paciente> enfermeira;
	
	private int cpf;	
	private int nSus;
	private String nome;
	private String endereco;

	
	
	public Paciente() {
		super();
	}
	@Override
	
	public String toString() {
		
		return "Paciente [id_pac=" + id_pac + ", cpf=" + cpf + ", nSus=" + nSus + ", nome=" + nome + ", endereco="
				+ endereco + "]";
	}
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cpf;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((enfermeira == null) ? 0 : enfermeira.hashCode());
		result = prime * result + ((id_pac == null) ? 0 : id_pac.hashCode());
		result = prime * result + nSus;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (cpf != other.cpf)
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (enfermeira == null) {
			if (other.enfermeira != null)
				return false;
		} else if (!enfermeira.equals(other.enfermeira))
			return false;
		if (id_pac == null) {
			if (other.id_pac != null)
				return false;
		} else if (!id_pac.equals(other.id_pac))
			return false;
		if (nSus != other.nSus)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	public Long getId_pac() {
		return id_pac;
	}
	public void setId_pac(Long id_pac) {
		this.id_pac = id_pac;
	}
	public Set<Paciente> getEnfermeira() {
		return enfermeira;
	}
	public void setEnfermeira(Set<Paciente> enfermeira) {
		this.enfermeira = enfermeira;
	}
	

	

}
