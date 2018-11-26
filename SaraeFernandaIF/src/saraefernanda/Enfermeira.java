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
			name = "enf_pos", 
			joinColumns = @JoinColumn(name = "id_enf"), 
			inverseJoinColumns = @JoinColumn(name = "id_pos"))
	private Set<Posto> posto;
	
	@ManyToMany()
	@JoinTable(
			name = "enf_hos", 
			joinColumns = @JoinColumn(name = "id_enf"), 
			inverseJoinColumns = @JoinColumn(name = "id_hos"))
	private Set<Hospital> hospital;
	
	private String analiseUrgencia; 
	private String encaminhamento;
	private NivelGravidade nivelGravidade;
	@Override
	public String toString() {
		return "Enfermeira [id_enf=" + id_enf + ", posto=" + posto + ", hospital=" + hospital + ", analiseUrgencia="
				+ analiseUrgencia + ", encaminhamento=" + encaminhamento + ", nivelGravidade=" + nivelGravidade + "]";
	}
	public Long getId_enf() {
		return id_enf;
	}
	public void setId_enf(Long id_enf) {
		this.id_enf = id_enf;
	}
	public Set<Posto> getPosto() {
		return posto;
	}
	public void setPosto(Set<Posto> posto) {
		this.posto = posto;
	}
	public Set<Hospital> getHospital() {
		return hospital;
	}
	public void setHospital(Set<Hospital> hospital) {
		this.hospital = hospital;
	}
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
	public NivelGravidade getNivelGravidade() {
		return nivelGravidade;
	}
	public void setNivelGravidade(NivelGravidade nivelGravidade) {
		this.nivelGravidade = nivelGravidade;
	}
	public Enfermeira(Long id_enf, Set<Posto> posto, Set<Hospital> hospital, String analiseUrgencia,
			String encaminhamento, NivelGravidade nivelGravidade) {
		super();
		this.id_enf = id_enf;
		this.posto = posto;
		this.hospital = hospital;
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
		result = prime * result + ((hospital == null) ? 0 : hospital.hashCode());
		result = prime * result + ((id_enf == null) ? 0 : id_enf.hashCode());
		result = prime * result + ((nivelGravidade == null) ? 0 : nivelGravidade.hashCode());
		result = prime * result + ((posto == null) ? 0 : posto.hashCode());
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
		if (hospital == null) {
			if (other.hospital != null)
				return false;
		} else if (!hospital.equals(other.hospital))
			return false;
		if (id_enf == null) {
			if (other.id_enf != null)
				return false;
		} else if (!id_enf.equals(other.id_enf))
			return false;
		if (nivelGravidade == null) {
			if (other.nivelGravidade != null)
				return false;
		} else if (!nivelGravidade.equals(other.nivelGravidade))
			return false;
		if (posto == null) {
			if (other.posto != null)
				return false;
		} else if (!posto.equals(other.posto))
			return false;
		return true;
	}
	
}	
	