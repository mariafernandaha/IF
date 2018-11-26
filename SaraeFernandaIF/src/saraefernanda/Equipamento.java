package saraefernanda;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Equipamento {
	
	@Id
	private Long id_equ;
	
	private String medicamentos;
	private String curativos;
	
	@ManyToOne
	@JoinColumn(name="id_equipamentos")
	private ArrayList <Hospital> equipamentos;
	
	@ManyToOne
	@JoinColumn(name="id_equipamentos")
	private ArrayList <Posto> equipamentos1;

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

	public ArrayList<Hospital> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(ArrayList<Hospital> equipamentos) {
		this.equipamentos = equipamentos;
	}

	public ArrayList<Posto> getEquipamentos1() {
		return equipamentos1;
	}

	public void setEquipamentos1(ArrayList<Posto> equipamentos1) {
		this.equipamentos1 = equipamentos1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curativos == null) ? 0 : curativos.hashCode());
		result = prime * result + ((equipamentos == null) ? 0 : equipamentos.hashCode());
		result = prime * result + ((equipamentos1 == null) ? 0 : equipamentos1.hashCode());
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
		if (equipamentos == null) {
			if (other.equipamentos != null)
				return false;
		} else if (!equipamentos.equals(other.equipamentos))
			return false;
		if (equipamentos1 == null) {
			if (other.equipamentos1 != null)
				return false;
		} else if (!equipamentos1.equals(other.equipamentos1))
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
				+ ", equipamentos=" + equipamentos + ", equipamentos1=" + equipamentos1 + "]";
	}

	public Equipamento(Long id_equ, String medicamentos, String curativos, ArrayList<Hospital> equipamentos,
			ArrayList<Posto> equipamentos1) {
		super();
		this.id_equ = id_equ;
		this.medicamentos = medicamentos;
		this.curativos = curativos;
		this.equipamentos = equipamentos;
		this.equipamentos1 = equipamentos1;
	}

}	