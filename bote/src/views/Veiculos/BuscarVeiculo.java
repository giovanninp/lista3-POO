package views.Veiculos;
import repo.Veiculos.Veiculos;

import java.util.ArrayList;
import java.util.Scanner;
import domain.veiculo.filtroVeiculo;
import models.Veiculo.Veiculo;

public class BuscarVeiculo {
	private filtroVeiculo filtro;
	private Veiculos veiculos;
	private Scanner s;
	
	public BuscarVeiculo(Veiculos veiculos) {
		filtro = new filtroVeiculo();
		s = new Scanner(System.in);
		this.veiculos = veiculos;
	}
	
	public boolean buscar() {
		boolean fim = false;
		
		String tipo = null;
		int filterChoice;
		String idChoice;
		int confirm;
		ArrayList<Veiculo> veiculosA;
		ArrayList <Veiculo> veiculosB;
		ArrayList <Veiculo> veiculosC;
		Veiculo chosenOne;
		System.out.println("| Digite o tipo de veiculo:\n[Basico | Comum | Executivo | Luxo]");
		tipo = s.next();
		veiculosA = filtro.filtrarPorTipo(this.veiculos.arrayList(), tipo);
		for(Veiculo a : veiculosA) {
			System.out.println(a.toString());
		}
		System.out.println("| Deseja filtrar por ano?\n[1 - Sim | 0 - Nao]");
		filterChoice = s.nextInt();
		switch (filterChoice) {
		case 0:
			int anoLim = 0;
			System.out.println("\t| Digite um ano como limite: ");
			anoLim = s.nextInt();
			veiculosB = veiculosA;
			veiculosA = filtro.filtrarPorAnoDeFabricacao(veiculosB, anoLim);
			break;
		case 1:
			
			break;
		default:
			System.out.println("! Opa, opcao invalida !");
			return false;
		}
		
		for(Veiculo a : veiculosA) {
			System.out.println(a.isDisponivel() ? a.toString() : null);
		}
		
		System.out.println("Digite o ID  do veiculo desejado:");
		idChoice = s.next();
		chosenOne = (Veiculo) this.veiculos.getByid(idChoice);
		
		System.out.println("nome: " + chosenOne.getNome() + "\ntipo: " + chosenOne.getTipo()
			+ "\nar-condicionado: " + chosenOne.isArCondicionado() + "\nCombustivel: " + chosenOne.getCombustivel()
			+ "\nNumero de passageiros: " + chosenOne.getNumPassageiros() + "\nValor da diaria:"
			+ chosenOne.getValorDiaria());
		System.out.println("Deseja confirmar o pedido? [1 - Sim | 0 - Nao ]");
		confirm = s.nextInt();
		if(confirm == 1 || confirm == 0) {
			if(confirm == 1) {
				chosenOne.setDisponivel(false);
				fim = true;
			}
		}
		else {
			System.out.println("! Opa, valor invalido !");
		}
		
		return fim;
	}
	
	

}
