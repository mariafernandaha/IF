package saraefernanda;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

 @Entity 
public class Hospital {
	 
	@Id
    private Long id_hos;
	
	@OneToOne
	@JoinColumn(name="id_maternidade")
	private Maternidade maternidade;
	
	@OneToMany
	@JoinColumn(name="id_laboratorio")
	private Set<Laboratorio> laboratorios;
	
	private String tipoUrgencia;
	private String especialidade;
	public Long getId_hos() {
		return id_hos;
	}
	public Maternidade getMaternidade() {
		return maternidade;
	}
	public void setMaternidade(Maternidade maternidade) {
		this.maternidade = maternidade;
	}
	public Set<Laboratorio> getLaboratorios() {
		return laboratorios;
	}
	public void setLaboratorios(Set<Laboratorio> laboratorios) {
		this.laboratorios = laboratorios;
	}
	public String getTipoUrgencia() {
		return tipoUrgencia;
	}
	public void setTipoUrgencia(String tipoUrgencia) {
		this.tipoUrgencia = tipoUrgencia;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public void setId_hos(Long id_hos) {
		this.id_hos = id_hos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_hos == null) ? 0 : id_hos.hashCode());
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
		Hospital other = (Hospital) obj;
		if (id_hos == null) {
			if (other.id_hos != null)
				return false;
		} else if (!id_hos.equals(other.id_hos))
			return false;
		return true;
	}
	
	

	
 }	