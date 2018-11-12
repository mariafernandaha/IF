package saraefernanda;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laboratorio {
	
	@Id
	private int id_lab;
	public int getId_lab() {
		return id_lab;
	}

	public void setId_lab(int id_lab) {
		this.id_lab = id_lab;
	}

	private String exames;

	public String getExames() {
		return exames;
	}

	public Laboratorio(String exames) {
		super();
		this.exames = exames;
	}

	@Override
	public String toString() {
		return "Laboratorio [exames=" + exames + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exames == null) ? 0 : exames.hashCode());
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
		Laboratorio other = (Laboratorio) obj;
		if (exames == null) {
			if (other.exames != null)
				return false;
		} else if (!exames.equals(other.exames))
			return false;
		return true;
	}

	public void setExames(String exames) {
		this.exames = exames;
	}
	

}
