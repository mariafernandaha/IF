package saraefernanda;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Posto {
	
	@Id
	private int id_pos;
	
	private String tipoUrgencia;
	private String especialidade;
	@ManyToMany()
	@JoinTable(
			name = "pos_equ", 
			joinColumns = @JoinColumn(name = "id_pos"), 
			inverseJoinColumns = @JoinColumn(name = "id_equ"))
	private Set<Equipamento> equipamentos ;
	
	public int getId_pos() {
		return id_pos;
	}
	public void setId_pos(int id_pos) {
		this.id_pos = id_pos;
	}
	public Set<Equipamento> getEquipamentos() {
		return equipamentos;
	}
	public void setEquipamentos(Set<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}

	@Override 
	
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((equipamentos == null) ? 0 : equipamentos.hashCode());
		result = prime * result + ((especialidade == null) ? 0 : especialidade.hashCode());
		result = prime * result + id_pos;
		result = prime * result + ((tipoUrgencia == null) ? 0 : tipoUrgencia.hashCode());
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
		Posto other = (Posto) obj;
		if (equipamentos == null) {
			if (other.equipamentos != null)
				return false;
		} else if (!equipamentos.equals(other.equipamentos))
			return false;
		if (especialidade == null) {
			if (other.especialidade != null)
				return false;
		} else if (!especialidade.equals(other.especialidade))
			return false;
		if (id_pos != other.id_pos)
			return false;
		if (tipoUrgencia == null) {
			if (other.tipoUrgencia != null)
				return false;
		} else if (!tipoUrgencia.equals(other.tipoUrgencia))
			return false;
		return true;
	}
	
	public Posto(String tipoUrgencia, String especialidade) {
		
		super();
		this.tipoUrgencia = tipoUrgencia;
		this.especialidade = especialidade;
	}
	
	@Override
	
	public String toString() {
		
		return "Posto [tipoUrgencia=" + tipoUrgencia + ", especialidade=" + especialidade + "]";
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
	

}
