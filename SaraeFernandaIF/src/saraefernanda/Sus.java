package saraefernanda;

import java.util.ArrayList;

public interface Sus {
	
	public Paciente cadastrarpaciente (String nome, String endereco,Integer cpf, int nSus, int id_pac) throws CPFInvalidoException;
	
	public void removepaciente (String nome);
	
	public Posto cadastrarposto (String tipoUrgencia, String especialidade, ArrayList <Equipamento> equipamentos, int id_pos) throws TIPOURGENCIAInvalidoException;
	
	public void removeposto (String tipoUrgencia, String especialidade);
	
	public Hospital cadastrarhospital (String tipoUrgencia, String especialidade, ArrayList <Equipamento> equipamentos, int id_hos) throws TIPOURGENCIAInvalidoException;
	
	public void removehospital (String tipoUrgencia, String especialidade);
	

	
}
