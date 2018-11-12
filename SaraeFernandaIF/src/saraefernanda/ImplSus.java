package saraefernanda;

import java.util.ArrayList;

public interface ImplSus {
	public Paciente addpaciente (String nome, String endereco,int cpf, int nSus);
	
	public void removepaciente (String nome);
	
	public Posto addposto (String tipoUrgencia, String especialidade, ArrayList <Equipamento> equipamentos, NivelGravidade nivelGravidade);
	
	public void removeposto (String tipoUrgencia, String especialidade);
	
	public Hospital addhospital (String tipoUrgencia, String especialidade, ArrayList <Equipamento> equipamentos, NivelGravidade nivelGravidade);
	
	public void removehospital (String tipoUrgencia, String especialidade);
	
	public Enfermeira addenfermeira (String analiseUrgencia, String encaminhamento, NivelGravidade nivelGravidade);
	
	public void removeenfermeira (String analiseUrgencia, String encaminhamento);
	
	public Laboratorio addlaboratorio (String exames);
	
	public void removelaboratorio (String exames);
	
	public Maternidade addmaternidade (String partos);
	
	public void removematernidade (String partos);
	
	
}
