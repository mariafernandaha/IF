package saraefernanda;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Maternidade {
	
	@Id
	private int id_mat;
	public int getId_mat() {
		return id_mat;
	}

	public void setId_mat(int id_mat) {
		this.id_mat = id_mat;
	}

	private String partos;

	public String getPartos() {
		return partos;
	}

	public void setPartos(String partos) {
		this.partos = partos;
	}

	@Override
	public String toString() {
		return "Maternidade [id_mat=" + id_mat + ", partos=" + partos + "]";
	}

	public Maternidade(String partos) {
		super();
		this.partos = partos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((partos == null) ? 0 : partos.hashCode());
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
		Maternidade other = (Maternidade) obj;
		if (partos == null) {
			if (other.partos != null)
				return false;
		} else if (!partos.equals(other.partos))
			return false;
		return true;
	}
	

}