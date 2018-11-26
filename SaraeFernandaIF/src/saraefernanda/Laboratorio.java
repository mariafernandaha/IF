package saraefernanda;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laboratorio {
	
	@Id
	private Long id_lab;
	
	private String exames;

	public Long getId_lab() {
		return id_lab;
	}

	public void setId_lab(Long id_lab) {
		this.id_lab = id_lab;
	}

	public String getExames() {
		return exames;
	}

	public void setExames(String exames) {
		this.exames = exames;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exames == null) ? 0 : exames.hashCode());
		result = prime * result + ((id_lab == null) ? 0 : id_lab.hashCode());
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
		if (id_lab == null) {
			if (other.id_lab != null)
				return false;
		} else if (!id_lab.equals(other.id_lab))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laboratorio [id_lab=" + id_lab + ", exames=" + exames + "]";
	}

	public Laboratorio(Long id_lab, String exames) {
		super();
		this.id_lab = id_lab;
		this.exames = exames;
	}

}	