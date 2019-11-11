package models.Hospedagem.Albergue;

import models.Agenda;
import models.Hospedagem.Hospedagem;

public class Albergue extends Hospedagem {
	private int numHospQuarto;
	
	public Albergue(String tipo,String nome, String local, float diaria, Agenda tempoDeHospMin,
			boolean cafeDaManha, Agenda horarioCheckIn, Agenda horarioCheckOut, boolean disponivel,
			boolean cancelGratis, String [] idioma, int numHosp) {
		super(tipo,nome, local, diaria, tempoDeHospMin, cafeDaManha, horarioCheckIn,
				horarioCheckOut, disponivel, cancelGratis, idioma);
		this.numHospQuarto = numHosp;
	}
	
	public int getNumHospQuarto() {
		return this.numHospQuarto;
	}
	
	public void setNumHospQuarto(int num) {
		this.numHospQuarto = num;
	}
}
