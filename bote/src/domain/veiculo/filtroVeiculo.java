package domain.veiculo;

import java.util.ArrayList;

import models.Veiculo.Veiculo;
import repo.utils.rangeChecker;

public class filtroVeiculo {
	private rangeChecker range = new rangeChecker();
	
	public ArrayList<Veiculo> filtrarPorTipo(ArrayList<Veiculo> object, String tipo) {
		ArrayList<Veiculo> result = null;
		if(range.temAlgo(object)) {
			result = new ArrayList<Veiculo>();
			for(Veiculo atual : object) {
				Veiculo veiculo = atual;
				if(veiculo.getTipo().equalsIgnoreCase(tipo)) {
					result.add(veiculo);
				}
			}
		}
		return result;
	}
	
	public ArrayList<Veiculo> filtrarPorAnoDeFabricacao(ArrayList<Veiculo> veiculos, int ate) {
		ArrayList<Veiculo> result = null;
		if(range.temAlgo(veiculos)) {
			result = new ArrayList<Veiculo>();
			for(Veiculo atual : veiculos) {
				if(atual.getAnoFabricao() > ate) {
					result.add(atual);
				}
			}
		}
		return result;
	}
}
