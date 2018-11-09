package saraefernanda;

public class Enfermeira {
	private String analiseUrgencia; 
	private String encaminhamento;
	private NivelGravidade nivelGravidade;
	
	public String getAnaliseUrgencia() {
		return analiseUrgencia;
	}
	public void setAnaliseUrgencia(String analiseUrgencia) {
		this.analiseUrgencia = analiseUrgencia;
	}
	public String getEncaminhamento() {
		return encaminhamento;
	}
	public void setEncaminhamento(String encaminhamento) {
		this.encaminhamento = encaminhamento;
	}
	
	public Enfermeira(String analiseUrgencia, String encaminhamento, NivelGravidade nivelGravidade) {
		super();
		this.analiseUrgencia = analiseUrgencia;
		this.encaminhamento = encaminhamento;
		this.nivelGravidade = nivelGravidade;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((analiseUrgencia == null) ? 0 : analiseUrgencia.hashCode());
		result = prime * result + ((encaminhamento == null) ? 0 : encaminhamento.hashCode());
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
		Enfermeira other = (Enfermeira) obj;
		if (analiseUrgencia == null) {
			if (other.analiseUrgencia != null)
				return false;
		} else if (!analiseUrgencia.equals(other.analiseUrgencia))
			return false;
		if (encaminhamento == null) {
			if (other.encaminhamento != null)
				return false;
		} else if (!encaminhamento.equals(other.encaminhamento))
			return false;
		if (nivelGravidade == null) {
			if (other.nivelGravidade != null)
				return false;
		} else if (!nivelGravidade.equals(other.nivelGravidade))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Enfermeira [analiseUrgencia=" + analiseUrgencia + ", encaminhamento=" + encaminhamento
				+ ", nivelGravidade=" + nivelGravidade + "]";
	}

	public NivelGravidade getNivelGravidade() {
		return nivelGravidade;
	}
	public void setNivelGravidade(NivelGravidade nivelGravidade) {
		this.nivelGravidade = nivelGravidade;
	}
	
}
