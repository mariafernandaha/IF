package saraefernanda;

import java.util.ArrayList;

public interface ImplSus {
	
	public Paciente addpaciente (String nome, String endereco,int cpf, int nSus, int id_pac);
	
	public void removepaciente (String nome);
	
	public Posto addposto (String tipoUrgencia, String especialidade, ArrayList <Equipamento> equipamentos, NivelGravidade nivelGravidade, int id_pos);
	
	public void removeposto (String tipoUrgencia, String especialidade);
	
	public Hospital addhospital (String tipoUrgencia, String especialidade, ArrayList <Equipamento> equipamentos, NivelGravidade nivelGravidade, int id_hos);
	
	public void removehospital (String tipoUrgencia, String especialidade);
	
	public Enfermeira addenfermeira (String analiseUrgencia, String encaminhamento, NivelGravidade nivelGravidade, int id_gra);
	
	public void removeenfermeira (String analiseUrgencia, String encaminhamento);
	
	public Laboratorio addlaboratorio (String exames, int id_lab);
	
	public void removelaboratorio (String exames);
	
	public Maternidade addmaternidade (String partos, int id_mat);
	
	public void removematernidade (String partos);
	
	
}
