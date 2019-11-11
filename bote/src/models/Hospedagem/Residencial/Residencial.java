package models.Hospedagem.Residencial;

import models.Agenda;
import models.Hospedagem.Hospedagem;

public class Residencial extends Hospedagem {
	private int numDeQuartos;
	private boolean comCozinha;
	
	public Residencial(String tipo,String nome, String local, float diaria, Agenda tempoDeHospMin,
			boolean cafeDaManha, Agenda horarioCheckIn, Agenda horarioCheckOut, boolean disponivel,
			boolean cancelGratis, String [] idiomas, int numDeQuartos, boolean comCozinha) {
		super(tipo,nome, local, diaria, tempoDeHospMin, cafeDaManha, horarioCheckIn,
				horarioCheckOut, disponivel, cancelGratis, idiomas);
		this.numDeQuartos = numDeQuartos;
		this.comCozinha = comCozinha;
	}

	public int getNumDeQuartos() {
		return numDeQuartos;
	}

	public void setNumDeQuartos(int numDeQuartos) {
		this.numDeQuartos = numDeQuartos;
	}

	public boolean isComCozinha() {
		return comCozinha;
	}

	public void setComCozinha(boolean comCozinha) {
		this.comCozinha = comCozinha;
	}
	
	
	
}
