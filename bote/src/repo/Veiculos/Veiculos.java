package repo.Veiculos;

import java.util.ArrayList;

import domain.veiculo.filtroVeiculo;
import models.Veiculo.Veiculo;
import repo.RepoInterface;
import repo.utils.rangeChecker;

public class Veiculos implements RepoInterface {
	private filtroVeiculo filtro;
	private rangeChecker range = new rangeChecker();
	private ArrayList <Veiculo> veiculos;
	private int contador;
	
	public Veiculos() {
		this.filtro = new filtroVeiculo();
		this.veiculos = new ArrayList<>();
		this.contador = 0;
	}

	@Override
	public boolean add(Object element) {
		Veiculo atual = (Veiculo) element;
		atual.setID("" + contador++);
		this.veiculos.add(atual);
		return true;
	}

	@Override
	public boolean rem(int index) {
		boolean result = false;
		if (range.noLimite(this.veiculos.size(),index)) {
			this.veiculos.remove(index);
			result = true;
		}
		return result;
	}

	@Override
	public Object get(int index) {
		Object result = null;
		if (range.noLimite(this.veiculos.size(), index)) {
			result = this.veiculos.get(index);
		}
		return result;
	}

	@Override
	public Object[] list() {
		Veiculo [] result = new Veiculo[this.veiculos.size()];
		if(this.veiculos.size() > 0) {
			for(int i = 0; i < result.length;i++) {
				result[i] = veiculos.get(i);
			}
		}
		return result;
	}
	
	public Veiculo procurarPorPlaca(String placa) {
		Veiculo result = null;
		for(Veiculo elemento : veiculos) {
			if(elemento.getPlaca().equalsIgnoreCase(placa)) {
				result = elemento;
			}
		}
		return result;
	}
	
	@Override
	public Object getByid(String id) {
		ArrayList<Veiculo>tempList = null;
		Veiculo result = null;
		
		if(id.charAt(0) == 'B' || id.charAt(0) == 'b' ) {
			tempList = filtro.filtrarPorTipo(this.veiculos, "basico");
		} else if(id.charAt(0) == 'C' || id.charAt(0) == 'c' ) {
			tempList = filtro.filtrarPorTipo(this.veiculos, "comum");
		} else if(id.charAt(0) == 'E' || id.charAt(0) == 'e' ) {
			tempList = filtro.filtrarPorTipo(this.veiculos, "executivo");
		} else {
			tempList = filtro.filtrarPorTipo(this.veiculos, "luxo");
		}
		for(Veiculo atual : tempList) {
			if(atual.getId().equalsIgnoreCase(id)) {
				result = atual;
			}
		}
		return result;
	}
	
	public ArrayList <Veiculo> arrayList() {
		ArrayList<Veiculo> list = new ArrayList<Veiculo>();
		list = this.veiculos;
		return list;
	}
	 

}
