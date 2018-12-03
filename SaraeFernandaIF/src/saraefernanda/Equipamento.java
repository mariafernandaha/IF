package saraefernanda;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Equipamento {
	
	@Id
	private Long id_equ;
	
	private String medicamentos;
	private String curativos;
	
	@OneToOne
	@JoinColumn(name="id_hospital")
	private Hospital hospital;



	public Long getId_equ() {
		return id_equ;
	}

	public void setId_equ(Long id_equ) {
		this.id_equ = id_equ;
	}

	public String getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}

	public String getCurativos() {
		return curativos;
	}

	public void setCurativos(String curativos) {
		this.curativos = curativos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curativos == null) ? 0 : curativos.hashCode());
		result = prime * result + ((hospital == null) ? 0 : hospital.hashCode());
		result = prime * result + ((id_equ == null) ? 0 : id_equ.hashCode());
		result = prime * result + ((medicamentos == null) ? 0 : medicamentos.hashCode());
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
		Equipamento other = (Equipamento) obj;
		if (curativos == null) {
			if (other.curativos != null)
				return false;
		} else if (!curativos.equals(other.curativos))
			return false;
		if (hospital == null) {
			if (other.hospital != null)
				return false;
		} else if (!hospital.equals(other.hospital))
			return false;
		if (id_equ == null) {
			if (other.id_equ != null)
				return false;
		} else if (!id_equ.equals(other.id_equ))
			return false;
		if (medicamentos == null) {
			if (other.medicamentos != null)
				return false;
		} else if (!medicamentos.equals(other.medicamentos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Equipamento [id_equ=" + id_equ + ", medicamentos=" + medicamentos + ", curativos=" + curativos
				+ ", hospital=" + hospital + ", posto="+ "]";
	}

	public Equipamento(Long id_equ, String medicamentos, String curativos, Hospital hospital, Set<Posto> posto) {
		super();
		this.id_equ = id_equ;
		this.medicamentos = medicamentos;
		this.curativos = curativos;
		this.hospital = hospital;
	}

	
}