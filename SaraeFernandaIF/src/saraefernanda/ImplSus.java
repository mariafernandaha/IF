package saraefernanda;

import java.util.ArrayList;

public class ImplSus implements Sus  {

	@Override
	public Paciente cadastrarpaciente(String nome, String endereco, Integer cpf, int nSus, int id_pac) throws CPFInvalidoException {
		Paciente paciente = new Paciente();
		if(cpf == null) {
			throw new CPFInvalidoException();
		}
		return null;
	}

	@Override
	public void removepaciente(String nome) {
		
	}

	@Override
	public Posto cadastrarposto(String tipoUrgencia, String especialidade, ArrayList<Equipamento> equipamentos, int id_pos) throws TIPOURGENCIAInvalidoException{
		Posto posto = new Posto(null, especialidade, especialidade, null);
		if( tipoUrgencia == null) {
			throw new TIPOURGENCIAInvalidoException();
		}
		return null;
		
	}
	
	@Override
	public void removeposto(String tipoUrgencia, String especialidade) {
		
	}

	@Override
	public Hospital cadastrarhospital(String tipoUrgencia, String especialidade, ArrayList<Equipamento> equipamentos, int id_hos) throws TIPOURGENCIAInvalidoException{
		Hospital hospital = new Hospital();
		if( tipoUrgencia == null) {
			throw new TIPOURGENCIAInvalidoException();
		}
		return null;
		
	} 

	@Override
	public void removehospital(String tipoUrgencia, String especialidade) {

	}


}
