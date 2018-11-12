package saraefernanda;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NivelGravidade {
	
	@Id
	private int id_gra;
	private String naoUrgente;
	private String poucoUrgente;
	private String urgente;
	private String emergencia;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emergencia == null) ? 0 : emergencia.hashCode());
		result = prime * result + ((naoUrgente == null) ? 0 : naoUrgente.hashCode());
		result = prime * result + ((poucoUrgente == null) ? 0 : poucoUrgente.hashCode());
		result = prime * result + ((urgente == null) ? 0 : urgente.hashCode());
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
		NivelGravidade other = (NivelGravidade) obj;
		if (emergencia == null) {
			if (other.emergencia != null)
				return false;
		} else if (!emergencia.equals(other.emergencia))
			return false;
		if (naoUrgente == null) {
			if (other.naoUrgente != null)
				return false;
		} else if (!naoUrgente.equals(other.naoUrgente))
			return false;
		if (poucoUrgente == null) {
			if (other.poucoUrgente != null)
				return false;
		} else if (!poucoUrgente.equals(other.poucoUrgente))
			return false;
		if (urgente == null) {
			if (other.urgente != null)
				return false;
		} else if (!urgente.equals(other.urgente))
			return false;
		return true;
	}
	public String getNaoUrgente() {
		return naoUrgente;
	}
	public void setNaoUrgente(String naoUrgente) {
		this.naoUrgente = naoUrgente;
	}
	public String getPoucoUrgente() {
		return poucoUrgente;
	}
	public void setPoucoUrgente(String poucoUrgente) {
		this.poucoUrgente = poucoUrgente;
	}
	public String getUrgente() {
		return urgente;
	}
	public void setUrgente(String urgente) {
		this.urgente = urgente;
	}
	public String getEmergencia() {
		return emergencia;
	}
	public void setEmergencia(String emergencia) {
		this.emergencia = emergencia;
	}
	
}
