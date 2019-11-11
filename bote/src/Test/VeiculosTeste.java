package Test;

import domain.veiculo.filtroVeiculo;
import models.Veiculo.Veiculo;
import repo.Veiculos.Veiculos;
import repo.utils.rangeChecker;

public class VeiculosTeste {
	public Veiculos veiculos;
	
	public VeiculosTeste() {
	
		veiculos = new Veiculos();
		Veiculo um = new Veiculo("Sandero", "PEK5996", "Basico", true, 5, "Flex", 300, true, true, 2012);
		Veiculo dois = new Veiculo("500", "PIS1408", "Luxo", true, 4, "Flex", 500, true, true, 2013);
		Veiculo tres = new Veiculo("M3", "KGH0078", "Luxo", true, 5, "Flex", 300, true, true, 2018);
		
		this.veiculos.add(um);
		this.veiculos.add(dois);
		this.veiculos.add(tres);
		
		
		
	}
	
	public Veiculos get() {
		return this.veiculos;
	}
}
