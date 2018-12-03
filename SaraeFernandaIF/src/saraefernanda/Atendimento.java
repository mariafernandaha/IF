package saraefernanda;

public class Atendimento {
	private String nivelGravidade;

	public String getNivelGravidade() {
		return nivelGravidade;
	}

	public Atendimento(String nivelGravidade) {
		super();
		this.nivelGravidade = nivelGravidade;
	}

	@Override
	public String toString() {
		return "Atendimento [nivelGravidade=" + nivelGravidade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nivelGravidade == null) ? 0 : nivelGravidade.hashCode());
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
		Atendimento other = (Atendimento) obj;
		if (nivelGravidade == null) {
			if (other.nivelGravidade != null)
				return false;
		} else if (!nivelGravidade.equals(other.nivelGravidade))
			return false;
		return true;
	}

	public void setNivelGravidade(String nivelGravidade) {
		this.nivelGravidade = nivelGravidade;
	}

}
