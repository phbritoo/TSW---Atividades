package palindromo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class PalindromoTest {

	Palindromo palindromo;
	
	@Before
	public void Palindromo() {
		palindromo = new Palindromo();
	}
	
	@Test
	public void quandoPalavraAMEForPolindromo() {
		String word = "ame";
		boolean resultado = palindromo.setarPalindromo(word);
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void quandoPalavraARARAForPolindromo() {
		String word = "arara";
		boolean resultado = palindromo.setarPalindromo(word);
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void quandoPalavraANAForPolindromo() {
		String word = "ana";
		boolean resultado = palindromo.setarPalindromo(word);
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void quandoPalavraNaoForPolidromo() {
		String word = "paulo";
		boolean resultado = palindromo.setarPalindromo(word);
		Assert.assertFalse(resultado);
	}
	@Test
	public void quandoForVazio() {
		palindromo.setarPalindromo("");
	}
	@Test()
	public void quandoPalavraforNula() {
		palindromo.setarPalindromo(null);
	}
}
