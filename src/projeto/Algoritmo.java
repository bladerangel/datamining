package projeto;

import java.util.ArrayList;
import java.util.List;

public class Algoritmo {

	private double distanciaEuclidiana(Iris irisTeste, Iris irisInicial) {
		double valor1 = Math.pow(irisTeste.getComprimentoPetala() - irisInicial.getComprimentoPetala(), 2);
		double valor2 = Math.pow(irisTeste.getLarguraPetala() - irisInicial.getLarguraPetala(), 2);
		double valor3 = Math.pow(irisTeste.getComprimentoSepala() - irisInicial.getComprimentoSepala(), 2);
		double valor4 = Math.pow(irisTeste.getLarguraSepala() - irisInicial.getLarguraSepala(), 2);
		return Math.sqrt(valor1 + valor2 + valor3 + valor4);
	}

	private double distanciaQuarteirao(Iris irisTeste, Iris irisInicial) {
		double valor1 = Math.abs(irisTeste.getComprimentoPetala() - irisInicial.getComprimentoPetala());
		double valor2 = Math.abs(irisTeste.getLarguraPetala() - irisInicial.getLarguraPetala());
		double valor3 = Math.abs(irisTeste.getComprimentoSepala() - irisInicial.getComprimentoSepala());
		double valor4 = Math.abs(irisTeste.getLarguraSepala() - irisInicial.getLarguraSepala());
		return Math.sqrt(valor1 + valor2 + valor3 + valor4);
	}

	private List<String> comparacao(String distancia) {
		double menor;
		int indice = 0;
		List<String> comparacao = new ArrayList<String>();
		for (int i = 0; i < BaseDados.baseTeste.size(); i++) {
			menor = Double.POSITIVE_INFINITY;
			for (int j = 0; j < BaseDados.baseInicial.size(); j++) {
				double valor = distancia.equals("Euclidiana")
						? distanciaEuclidiana(BaseDados.baseTeste.get(i), BaseDados.baseInicial.get(j))
						: distanciaQuarteirao(BaseDados.baseTeste.get(i), BaseDados.baseInicial.get(j));
				if (valor < menor) {
					menor = valor;
					indice = j;
				}
			}
			if (BaseDados.baseTeste.get(i).getTipo().equals(BaseDados.baseInicial.get(indice).getTipo())) {
				comparacao.add("igual");
			} else {
				comparacao.add("diferente");
			}
		}
		return comparacao;
	}

	public void resultado(String distancia) {
		int iguais = 0;
		int diferentes = 0;
		List<String> resultado = new Algoritmo().comparacao(distancia);
		for (String valor : resultado) {
			if (valor.equals("igual"))
				iguais++;
			else
				diferentes++;
		}
		System.out.println("Usando o calculo da distancia: "+ distancia);
		System.out.println("Quantidade de objetos iguais: " + iguais);
		System.out.println("Quantidade de objetos diferentes: " + diferentes);
	}
}
