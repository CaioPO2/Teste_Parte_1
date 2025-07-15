package exercicio;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PessoaTest {
	
	@Test
    public void testSepararPorSexo() {
        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Ana", "F"),
            new Pessoa("Carlos", "M"),
            new Pessoa("Beatriz", "F"),
            new Pessoa("Pedro", "M")
        );

        List<Pessoa> mulheres = PessoaUtils.filtrarPorGenero(pessoas, "F");
        List<Pessoa> homens = PessoaUtils.filtrarPorGenero(pessoas, "M");

        assertEquals(2, mulheres.size());
        assertEquals(2, homens.size());
    }
}
