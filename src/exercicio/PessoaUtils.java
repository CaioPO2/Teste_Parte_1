package exercicio;

import java.util.List;
import java.util.stream.Collectors;

public class PessoaUtils {
	public static List<Pessoa> filtrarPorGenero(List<Pessoa> pessoas, String genero) {
		return pessoas.stream()
				.filter(pessoa -> pessoa.getGenero().contentEquals(genero))
				.collect(Collectors.toList());
	}
	
}
