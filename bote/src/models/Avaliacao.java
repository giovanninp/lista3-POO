package models;

public class Avaliacao {
	private String autorNome;
	private int autorId;
	private int nivel;
	
	public Avaliacao(String autorNome, int autorId,int nivel) {
		this.autorNome = autorNome;
		this.autorId = autorId;
		this.nivel = nivel;
	}

	public String getAutorNome() {
		return autorNome;
	}

	public void setAutorNome(String autorNome) {
		this.autorNome = autorNome;
	}

	public int getAutorId() {
		return autorId;
	}

	public void setAutorId(int autorId) {
		this.autorId = autorId;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	
}
