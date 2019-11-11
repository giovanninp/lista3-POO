package models.Veiculo;


public class Veiculo {
	private String id;
	private String nome;
	private String tipo;
	private boolean arCondicionado;
	private int numPassageiros;
	private String combustivel;
	private float valorDiaria;
	private boolean disponivel;
	private boolean kmLivre;
	private String placa;
	private int anoFabricacao;
	
	public Veiculo(String nome,String placa, String tipo, boolean arCondicionado, int numPassageiros,
			String combustivel, float valorDiaria, boolean disponivel, boolean kmLivre, int anoFab) {
		this.nome = nome;
		this.placa = placa;
		this.id = ("" + tipo.charAt(0));
		this.tipo = tipo;
		this.arCondicionado = arCondicionado;
		this.numPassageiros = numPassageiros;
		this.combustivel = combustivel;
		this.valorDiaria = valorDiaria;
		this.disponivel = disponivel;
		this.kmLivre = kmLivre;
		this.anoFabricacao = anoFab;
	}
	
	public Veiculo(String placa,String tipo, int numPassageiros, float valorDiaria,
			String combustivel) {
		this.placa = placa;
		this.tipo = tipo;
		this.numPassageiros = numPassageiros;
		this.valorDiaria = valorDiaria;
		this.combustivel = combustivel;
		this.arCondicionado = true;
		this.disponivel = true;
		this.kmLivre = true;
	}
	
	public String toString() {
		String result = (this.id + "\t" + this.nome + "\t" + this.anoFabricacao + "\t" + this.valorDiaria);
		return result;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setID(String storageId) {
		this.id += storageId;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public boolean isKmLivre() {
		return kmLivre;
	}

	public void setKmLivre(boolean kmLivre) {
		this.kmLivre = kmLivre;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public String getPlaca() {
		return placa;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoFabricao() {
		return this.anoFabricacao;
	}
	
	public void setAnoFabricacao(int ano) {
		this.anoFabricacao = ano;
	}
}
