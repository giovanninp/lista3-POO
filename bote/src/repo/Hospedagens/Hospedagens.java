package repo.Hospedagens;

import java.util.ArrayList;

import domain.hospedagem.filtroHospedagem;
import models.Hospedagem.Hospedagem;
import repo.RepoInterface;
import repo.utils.rangeChecker;

public class Hospedagens implements RepoInterface {
	private filtroHospedagem filtro;
	private rangeChecker range;
	private ArrayList <Hospedagem> hospedagens;
	private int contador;
	
	public Hospedagens() {
		this.filtro = new filtroHospedagem();
		this.hospedagens = new ArrayList<Hospedagem>();
		range = new rangeChecker();
		this.contador = 0;
	}
	
	@Override
	public boolean add(Object element) {
		Hospedagem nova = (Hospedagem) element;
		nova.setId("" + this.contador++);
		return true;
	}

	@Override
	public boolean rem(int index) {
		boolean result = false;
		if(range.noLimite(this.hospedagens.size(),index)) {
			this.hospedagens.remove(index);
			result = true;
		}
		return result;
	}

	@Override
	public Object get(int index) {
		Hospedagem result = null;
		if(range.noLimite(this.hospedagens.size(), index)) {
			result = hospedagens.get(index);
		}
		return result;
	}

	@Override
	public Object[] list() {
		Hospedagem [] result = new Hospedagem [this.hospedagens.size()];
		for(int i = 0; i < result.length;i++) {
			result[i] =  (Hospedagem) this.get(i);
		}
		return result;
	}

	@Override
	public Object getByid(String id) {
		ArrayList<Hospedagem>tempList = null;
		Hospedagem result = null;
		if(id.charAt(0) == 'H' || id.charAt(0) == 'h') {
			tempList = this.filtro.filtrarPorTipo(this.hospedagens, "hotel");
		} else if(id.charAt(0) == 'P' || id.charAt(0) == 'p') {
			tempList = this.filtro.filtrarPorTipo(this.hospedagens, "pousada");
		} else if(id.charAt(0) == 'R' || id.charAt(0) == 'r') {
			tempList = this.filtro.filtrarPorTipo(this.hospedagens, "residencial");
		} else {
			tempList = this.filtro.filtrarPorTipo(this.hospedagens, "albergue");
		}
		for(Hospedagem atual : tempList) {
			if(atual.getId().equalsIgnoreCase(id)) {
				result = atual;
			}
		}
		return result;
	}
	
}
