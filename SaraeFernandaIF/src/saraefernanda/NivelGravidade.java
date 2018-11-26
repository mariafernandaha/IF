package saraefernanda;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class NivelGravidade {
	
	@Id
	private Long id_gra;
	@ManyToMany()
	@JoinTable(
			name = "gra_enf", 
			joinColumns = @JoinColumn(name = "id_gra"), 
			inverseJoinColumns = @JoinColumn(name = "id_enf"))
	private Set<NivelGravidade> enfermeira;
	
	private String naoUrgente;
	private String poucoUrgente;
	private String urgente;
	private String emergencia;
	public Long getId_gra() {
		return id_gra;
	}
	public void setId_gra(Long id_gra) {
		this.id_gra = id_gra;
	}
	public Set<NivelGravidade> getEnfermeira() {
		return enfermeira;
	}
	public void setEnfermeira(Set<NivelGravidade> enfermeira) {
		this.enfermeira = enfermeira;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emergencia == null) ? 0 : emergencia.hashCode());
		result = prime * result + ((enfermeira == null) ? 0 : enfermeira.hashCode());
		result = prime * result + ((id_gra == null) ? 0 : id_gra.hashCode());
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
		if (enfermeira == null) {
			if (other.enfermeira != null)
				return false;
		} else if (!enfermeira.equals(other.enfermeira))
			return false;
		if (id_gra == null) {
			if (other.id_gra != null)
				return false;
		} else if (!id_gra.equals(other.id_gra))
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
	@Override
	public String toString() {
		return "NivelGravidade [id_gra=" + id_gra + ", enfermeira=" + enfermeira + ", naoUrgente=" + naoUrgente
				+ ", poucoUrgente=" + poucoUrgente + ", urgente=" + urgente + ", emergencia=" + emergencia + "]";
	}
	public NivelGravidade(Long id_gra, Set<NivelGravidade> enfermeira, String naoUrgente, String poucoUrgente,
			String urgente, String emergencia) {
		super();
		this.id_gra = id_gra;
		this.enfermeira = enfermeira;
		this.naoUrgente = naoUrgente;
		this.poucoUrgente = poucoUrgente;
		this.urgente = urgente;
		this.emergencia = emergencia;
	}
	
}	