package config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayRegioes {

	public static void main(String[] args) {
		arrayRegioes d = new arrayRegioes();
		System.out.println(d.regiao());
	}

	public String regiao() {
		List<String> regioes = new ArrayList<>();

		regioes.add("CENTRO-OESTE");
		regioes.add("NORDESTE");
		regioes.add("NORTE");
		regioes.add("SUDESTE");
		regioes.add("SUL");
		Collections.shuffle(regioes);

		return regioes.get(0);

	}

}
