package domain.hospedagem;

import java.util.ArrayList;

import models.Hospedagem.Hospedagem;
import repo.utils.rangeChecker;

public class filtroHospedagem {
	rangeChecker range = new rangeChecker();
	
	public ArrayList<Hospedagem> filtrarPorValor(ArrayList<Hospedagem> hospedagens,float ate) {
		ArrayList<Hospedagem> result = null;
		if(range.temAlgo(hospedagens)) {
			result = new ArrayList<Hospedagem>();
			for(Hospedagem atual : hospedagens ) {
				if(atual.getDiaria() <= ate) {
					result.add(atual);
				}
			}
		}
		return result;
	}
	
	public ArrayList<Hospedagem> filtrarPorTipo(ArrayList<Hospedagem> hospedagens, String tipo) {
		ArrayList <Hospedagem> result = null;
		if(range.temAlgo(hospedagens)) {
			for(Hospedagem atual : hospedagens) {
				if(atual.getTipo().equalsIgnoreCase(tipo)) {
					result.add(atual);
				}
			}
		}
		return result;
	}
}
