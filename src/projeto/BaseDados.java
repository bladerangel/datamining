package projeto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaseDados {

	public static List<Iris> baseInicial = new ArrayList<Iris>();
	public static List<Iris> baseTeste = new ArrayList<Iris>();

	static {
		try {
			FileReader arquivo = new FileReader("arquivo/dados");
			BufferedReader lerArq = new BufferedReader(arquivo);
			String linha = lerArq.readLine();
			while (linha != null) {
				String array[] = linha.split(",");
				BaseDados.baseInicial.add(new Iris(Double.parseDouble(array[0]), Double.parseDouble(array[1]),
						Double.parseDouble(array[2]), Double.parseDouble(array[3]), array[4]));
				linha = lerArq.readLine();
			}
			arquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static {
		Random random = new Random();
		for (int i = 0; i < 30; i++) {
			int numero = random.nextInt(baseInicial.size());
			baseTeste.add(baseInicial.get(numero));
			baseInicial.remove(numero);
		}
	}
}
