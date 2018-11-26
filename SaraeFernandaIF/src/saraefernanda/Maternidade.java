package saraefernanda;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Maternidade {
	
	@Id
	private Long id_mat;

	public Long getId_mat() {
		return id_mat;
	}

	public void setId_mat(Long id_mat) {
		this.id_mat = id_mat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_mat == null) ? 0 : id_mat.hashCode());
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
		if (id_mat == null) {
			if (other.id_mat != null)
				return false;
		} else if (!id_mat.equals(other.id_mat))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Maternidade [id_mat=" + id_mat + "]";
	}

	public Maternidade(Long id_mat) {
		super();
		this.id_mat = id_mat;
	}
	
}