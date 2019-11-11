package models;

public class Agenda {
	private int min;
	private int hor;
	private int dia;
	private int mes;
	private int ano;
	
	public Agenda(int min, int hora, int dia, int mes, int ano) {
		this.min = min;
		this.hor = hora;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Agenda(int min, int hor) {
		this.min = min;
		this.hor = hor;
	}
	
	public Agenda(int dia, int mes,int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getHor() {
		return hor;
	}

	public void setHor(int hor) {
		this.hor = hor;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
