package saraefernanda;

import javax.persistence.Entity;
import javax.persistence.Id;

 @Entity 
public class Hospital {
	 
	@Id
    private int id_hos;
	
	private String tipoUrgencia;
	private String especialidade;
	
	 public int getId_hos() {
		return id_hos;
	}
	public void setId_hos(int id_hos) {
		this.id_hos = id_hos;
	}
	
	@Override
	
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((especialidade == null) ? 0 : especialidade.hashCode());
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
		Hospital other = (Hospital) obj;
		if (especialidade == null) {
			if (other.especialidade != null)
				return false;
		} else if (!especialidade.equals(other.especialidade))
			return false;
		if (tipoUrgencia == null) {
			if (other.tipoUrgencia != null)
				return false;
		} else if (!tipoUrgencia.equals(other.tipoUrgencia))
			return false;
		return true;
	}
	public Hospital(String tipoUrgencia, String especialidade) {
		super();
		this.tipoUrgencia = tipoUrgencia;
		this.especialidade = especialidade;
	}
	@Override
	
	public String toString() {
		
		return "Hospital [tipoUrgencia=" + tipoUrgencia + ", especialidade=" + especialidade + "]";
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
