package saraefernanda;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

 @Entity 
public class Hospital {
	 
	@Id
    private Long id_hos;
	
	@ManyToOne
	@JoinColumn(name="id_hospital")
	private ArrayList <Maternidade> hospital;
	
	@ManyToOne
	@JoinColumn(name="id_hospital")
	private ArrayList <Laboratorio> hospital1;
	
	private String tipoUrgencia;
	private String especialidade;
	public Long getId_hos() {
		return id_hos;
	}
	public void setId_hos(Long id_hos) {
		this.id_hos = id_hos;
	}
	public ArrayList<Maternidade> getHospital() {
		return hospital;
	}
	public void setHospital(ArrayList<Maternidade> hospital) {
		this.hospital = hospital;
	}
	public ArrayList<Laboratorio> getHospital1() {
		return hospital1;
	}
	public void setHospital1(ArrayList<Laboratorio> hospital1) {
		this.hospital1 = hospital1;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((especialidade == null) ? 0 : especialidade.hashCode());
		result = prime * result + ((hospital == null) ? 0 : hospital.hashCode());
		result = prime * result + ((hospital1 == null) ? 0 : hospital1.hashCode());
		result = prime * result + ((id_hos == null) ? 0 : id_hos.hashCode());
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
		if (hospital == null) {
			if (other.hospital != null)
				return false;
		} else if (!hospital.equals(other.hospital))
			return false;
		if (hospital1 == null) {
			if (other.hospital1 != null)
				return false;
		} else if (!hospital1.equals(other.hospital1))
			return false;
		if (id_hos == null) {
			if (other.id_hos != null)
				return false;
		} else if (!id_hos.equals(other.id_hos))
			return false;
		if (tipoUrgencia == null) {
			if (other.tipoUrgencia != null)
				return false;
		} else if (!tipoUrgencia.equals(other.tipoUrgencia))
			return false;
		return true;
	}
	public Hospital(Long id_hos, ArrayList<Maternidade> hospital, ArrayList<Laboratorio> hospital1, String tipoUrgencia,
			String especialidade) {
		super();
		this.id_hos = id_hos;
		this.hospital = hospital;
		this.hospital1 = hospital1;
		this.tipoUrgencia = tipoUrgencia;
		this.especialidade = especialidade;
	}
 }	