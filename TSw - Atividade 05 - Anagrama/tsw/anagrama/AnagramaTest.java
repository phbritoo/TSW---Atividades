package anagrama;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class AnagramaTest {
	Anagrama pString1, pString2;
	
	@Before
	public void Palindromo() {
		pString1 = new Anagrama();
		pString2 = new Anagrama();
	}
	@Test
	public void quandoPalavraAMORForAnagrama() {
		String palavra1 = "amor";
		String palavra2 = "roma";
		boolean resultado = pString1.isAnagrama(palavra1, palavra2);
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void quandoPalavraOLAForAnagrama() {
		String palavra1 = "ola";
		String palavra2 = "alo";
		boolean resultado = pString1.isAnagrama(palavra1, palavra2);
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void quandoPalavraCALOForAnagrama() {
		String palavra1 = "calo";
		String palavra2 = "cola";
		boolean resultado = pString1.isAnagrama(palavra1, palavra2);
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void quandoPalavraVOAForAnagrama() {
		String palavra1 = "voa";
		String palavra2 = "avo";
		boolean resultado = pString1.isAnagrama(palavra1, palavra2);
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void quandoPalavraPAULONaoForAnagrama() {
		String palavra1 = "paulo";
		String palavra2 = "olaup";
		boolean resultado = pString1.isAnagrama(palavra1, palavra2);
		Assert.assertFalse(resultado);		
	}

	
	@Test
	public void quandoPalavraCAFENaoForAnagrama() {
		String palavra1 = "cafe";
		String palavra2 = "efac";
		boolean resultado = pString1.isAnagrama(palavra1, palavra2);
		Assert.assertFalse(resultado);		
	}
	
	@Test()
	public void quandoPalavraNullNaoForAnagrama() {
		pString2.isAnagrama(null, null);
	}
}
