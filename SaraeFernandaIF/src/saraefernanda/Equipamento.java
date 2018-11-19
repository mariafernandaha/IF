package saraefernanda;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Equipamento {
	
	@Id
	private int id_equ;
	
	private String medicamentos;
	private String curativos;
	
	@ManyToOne
	@JoinColumn(name="id_equipamentos")
	private ArrayList <Hospital> equipamentos;
	
	@Override
	
	public String toString() {
		
		return "Equipamento [id_equ=" + id_equ + ", medicamentos=" + medicamentos + ", curativos=" + curativos + "]";
	}
	public Equipamento(String medicamentos, String curativos) {
		super();
		this.medicamentos = medicamentos;
		this.curativos = curativos;
	}
	    
	public String getMedicamentos() {
		return medicamentos;
	}
	@Override
	
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curativos == null) ? 0 : curativos.hashCode());
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
		if (medicamentos == null) {
			if (other.medicamentos != null)
				return false;
		} else if (!medicamentos.equals(other.medicamentos))
			return false;
		return true;
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
	public int getId_equ() {
		return id_equ;
	}
	public void setId_equ(int id_equ) {
		this.id_equ = id_equ;
	}
	public ArrayList <Hospital> getEquipamentos() {
		return equipamentos;
	}
	public void setEquipamentos(ArrayList <Hospital> equipamentos) {
		this.equipamentos = equipamentos;
	}
	

}
