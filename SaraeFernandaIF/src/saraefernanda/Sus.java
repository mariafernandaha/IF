package saraefernanda;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sus {
	@Id
	private int id_sus;
	private String endereco;
	private String tipoConsulta;
	private int id_s;
	ArrayList <Posto> postos;
	ArrayList <Hospital> hospitais;
	ArrayList <Maternidade> maternidades;
	ArrayList <Laboratorio> laboratorios;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((hospitais == null) ? 0 : hospitais.hashCode());
		result = prime * result + id_s;
		result = prime * result + ((laboratorios == null) ? 0 : laboratorios.hashCode());
		result = prime * result + ((maternidades == null) ? 0 : maternidades.hashCode());
		result = prime * result + ((pacientes == null) ? 0 : pacientes.hashCode());
		result = prime * result + ((postos == null) ? 0 : postos.hashCode());
		result = prime * result + ((tipoConsulta == null) ? 0 : tipoConsulta.hashCode());
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
		Sus other = (Sus) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (hospitais == null) {
			if (other.hospitais != null)
				return false;
		} else if (!hospitais.equals(other.hospitais))
			return false;
		if (id_s != other.id_s)
			return false;
		if (laboratorios == null) {
			if (other.laboratorios != null)
				return false;
		} else if (!laboratorios.equals(other.laboratorios))
			return false;
		if (maternidades == null) {
			if (other.maternidades != null)
				return false;
		} else if (!maternidades.equals(other.maternidades))
			return false;
		if (pacientes == null) {
			if (other.pacientes != null)
				return false;
		} else if (!pacientes.equals(other.pacientes))
			return false;
		if (postos == null) {
			if (other.postos != null)
				return false;
		} else if (!postos.equals(other.postos))
			return false;
		if (tipoConsulta == null) {
			if (other.tipoConsulta != null)
				return false;
		} else if (!tipoConsulta.equals(other.tipoConsulta))
			return false;
		return true;
	}
	ArrayList <Paciente> pacientes;
	
	public Sus(String endereco, String tipoConsulta, int id_s) {
		super();
		this.endereco = endereco;
		this.tipoConsulta = tipoConsulta;
		this.id_s = id_s;
	}
	@Override
	public String toString() {
		return "Sus [endereco=" + endereco + ", tipoConsulta=" + tipoConsulta + ", id_s=" + id_s + "]";
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTipoConsulta() {
		return tipoConsulta;
	}
	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}
	public int getId_s() {
		return id_s;
	}
	public void setId_s(int id_s) {
		this.id_s = id_s;
	}
	
}
