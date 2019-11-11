package models.Hospedagem.HotelPousada;

import models.Agenda;
import models.Hospedagem.Hospedagem;

public class HotelPousada extends Hospedagem {
	private boolean translado;
	
	public HotelPousada(String tipo,String nome, String local, float diaria, Agenda tempoDeHospMin,
			boolean cafeDaManha, Agenda horarioCheckIn, Agenda horarioCheckOut, boolean disponivel,
			boolean cancelGratis, String [] idiomas, boolean translado) {
		
		super(tipo,nome, local, diaria, tempoDeHospMin, cafeDaManha,
				horarioCheckIn, horarioCheckOut, disponivel,
				cancelGratis, idiomas);
		
		this.translado = translado;
	}
	
	public boolean getTranslado() {
		return this.translado;
	}
	
	public void setTranslado(boolean translado) {
		this.translado = translado;
	}
}
