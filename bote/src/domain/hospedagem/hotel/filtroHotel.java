package domain.hospedagem.hotel;

import java.util.ArrayList;import domain.hospedagem.filtroHospedagem;
import models.Hospedagem.Hospedagem;
import models.Hospedagem.HotelPousada.Hotel.Hotel;
import repo.utils.rangeChecker;

public class filtroHotel {
	rangeChecker range = new rangeChecker();
	filtroHospedagem filtroHosp = new filtroHospedagem();
	
	public ArrayList<Hotel> filtrarPorEstrelas(ArrayList<Hospedagem> hospedagens, int noMin) {
		ArrayList<Hotel> result = null;
		ArrayList<Hospedagem> hoteis =  filtroHosp.filtrarPorTipo(hospedagens, "hotel");
		if(range.temAlgo(hoteis)) {
			for(Hospedagem hosp : hoteis) {
				result.add((Hotel) hosp);
			}
			for(Hotel atual : result) {
				if(atual.getNumEstrelas() < noMin) {
					result.remove(atual);
				}
			}
		}
		return result;
	}
}
