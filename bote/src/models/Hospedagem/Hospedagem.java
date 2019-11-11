package models.Hospedagem;

import java.util.ArrayList;

import models.Agenda;
import models.Avaliacao;

public class Hospedagem {
	private String tipo;
	private String id;
	private String nome;
	private String local;
	private float diaria;
	private Agenda tempoDeHosMin;
	private boolean cafeDaManha;
	private Agenda horarioCheckIn;
	private Agenda horarioCheckOut;
	private boolean disponivel;
	private boolean cancelGratis;
	private String [] idiomas;
	private ArrayList <Avaliacao> avaliacoes;
	
	public Hospedagem(String tipo,String nome, String local, float diaria, Agenda tempoDeHospMin,
			boolean cafeDaManha, Agenda horarioCheckIn, Agenda horarioCheckOut, boolean disponivel,
			boolean cancelGratis, String [] idiomas) {
		this.tipo = tipo;
		this.id = ("" + tipo.charAt(0));
		this.diaria = diaria;
		this.local = local;
		this.tempoDeHosMin = tempoDeHospMin;
		this.cafeDaManha = cafeDaManha;
		this.horarioCheckIn = horarioCheckIn;
		this.horarioCheckOut = horarioCheckOut;
		this.disponivel = disponivel;
		this.cancelGratis = cancelGratis;
		this.idiomas = idiomas;
		this.avaliacoes = new ArrayList<Avaliacao>();
	}
	
	public String toString() {
		String result = (this.id + "\t" + this.tipo + "\t" + this.nome + "\t" + this.local + "\tRS " + this.diaria);
		return result;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setId(String idComplemento) {
		this.id += idComplemento;
	}
	
	public String getId() {
		return this.id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public float getDiaria() {
		return diaria;
	}

	public void setDiaria(float diaria) {
		this.diaria = diaria;
	}

	public Agenda getTempoDeHosMin() {
		return tempoDeHosMin;
	}

	public void setTempoDeHosMin(Agenda tempoDeHosMin) {
		this.tempoDeHosMin = tempoDeHosMin;
	}

	public boolean isCafeDaManha() {
		return cafeDaManha;
	}

	public void setCafeDaManha(boolean cafeDaManha) {
		this.cafeDaManha = cafeDaManha;
	}

	public Agenda getHorarioCheckIn() {
		return horarioCheckIn;
	}

	public void setHorarioCheckIn(Agenda horarioCheckIn) {
		this.horarioCheckIn = horarioCheckIn;
	}

	public Agenda getHorarioCheckOut() {
		return horarioCheckOut;
	}

	public void setHorarioCheckOut(Agenda horarioCheckOut) {
		this.horarioCheckOut = horarioCheckOut;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public boolean isCancelGratis() {
		return cancelGratis;
	}

	public void setCancelGratis(boolean cancelGratis) {
		this.cancelGratis = cancelGratis;
	}

	public String[] getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String[] idiomas) {
		this.idiomas = idiomas;
	}

	public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	
	
}
