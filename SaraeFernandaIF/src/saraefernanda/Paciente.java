package saraefernanda;

public class Paciente {
	private int cpf;
	private int nSus;
	private String nome;
	private String endereco;
	
	public Paciente(int cpf, int nSus, String nome, String endereco) {
		super();
		this.cpf = cpf;
		this.nSus = nSus;
		this.nome = nome;
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Paciente [cpf=" + cpf + ", nSus=" + nSus + ", nome=" + nome + ", endereco=" + endereco + "]";
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
		if (nSus != other.nSus)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	

}
