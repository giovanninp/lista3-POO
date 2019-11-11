package models.Hospedagem.HotelPousada.Hotel;

import models.Agenda;
import models.Hospedagem.HotelPousada.HotelPousada;

public class Hotel extends HotelPousada {
	private int numEstrelas;
	
	public Hotel(String tipo,String nome, String local, float diaria, Agenda tempoDeHospMin,
			boolean cafeDaManha, Agenda horarioCheckIn, Agenda horarioCheckOut, boolean disponivel,
			boolean cancelGratis, String [] idiomas, boolean translado, int numEstrelas) {
		super(tipo,nome, local, diaria, tempoDeHospMin, cafeDaManha, horarioCheckIn,
				horarioCheckOut, disponivel, cancelGratis, idiomas, translado);
		this.numEstrelas = numEstrelas;
	}
	
	public int getNumEstrelas() {
		return this.numEstrelas;
	}
	
	public void setNumEstrelas(int num) {
		this.numEstrelas = num;
	}
}
