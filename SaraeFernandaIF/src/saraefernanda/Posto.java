package saraefernanda;

import java.util.ArrayList;

public class Posto {
	private String tipoUrgencia;
	private String especialidade;
	ArrayList <Equipamento> equipamentos;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((equipamentos == null) ? 0 : equipamentos.hashCode());
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
