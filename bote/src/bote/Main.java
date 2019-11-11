package bote;

import java.util.ArrayList;
import java.util.Scanner;

import Test.VeiculosTeste;
import models.Veiculo.Veiculo;
import repo.Veiculos.Veiculos;
import views.Veiculos.BuscarVeiculo;

public class Main {	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Object> obj = new ArrayList<>();
		VeiculosTeste testeV = new VeiculosTeste();
		
		
		Veiculos veiculos = testeV.get();
		BuscarVeiculo veiculo = new BuscarVeiculo(veiculos);
		
		while(veiculo.buscar());

		s.close();
	}
}
