package calculadora;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest{

	private static ICalculadora aCalculadora;

	@BeforeClass
	public static void iniciarCalculadora() {
		aCalculadora = new Calculadora();
	}

	@Test(expected = NullPointerException.class, timeout = 1)
	public void testarSomaNullCom4() {
		String numeroUm = null;
		String numeroDois = "4";

		Integer resultado = aCalculadora.somar(numeroUm, numeroDois);
	}
	
	@Test(expected = NullPointerException.class, timeout = 1)
	public void testarSomaNullComNull() {
		String numeroUm = null;
		String numeroDois = null;

		Integer resultado = aCalculadora.somar(numeroUm, numeroDois);
	}
	
	@Test(expected=NumberFormatException.class, timeout = 1)
	public void testarSomaVazioComMenos1() {
		String numeroUm = "";
		String numeroDois = "-1";

		Integer resultado = aCalculadora.somar(numeroUm, numeroDois);
	}
	
	@Test(expected=NumberFormatException.class, timeout = 1)
	public void testarSomaLetraComMenos1() {
		String numeroUm = "b";
		String numeroDois = "-1";

		Integer resultado = aCalculadora.somar(numeroUm, numeroDois);
	}
	
	@Test(expected=NumberFormatException.class, timeout = 1)
	public void testarSoma1ComVazio() {
		String numeroUm = "1";
		String numeroDois = "";

		Integer resultado = aCalculadora.somar(numeroUm, numeroDois);
	}

	@Test(expected=NumberFormatException.class, timeout = 1)
	public void testarSomaVazioComVazio() {
		String numeroUm = "";
		String numeroDois = "";

		Integer resultado = aCalculadora.somar(numeroUm, numeroDois);
	}
	
	@Test(expected=NumberFormatException.class, timeout = 1)
	public void testarSomaEspacoComEspaco() {
		String numeroUm = "  ";
		String numeroDois = "  ";

		Integer resultado = aCalculadora.somar(numeroUm, numeroDois);
	}
	
	@Test(timeout = 1)
	public void testarSoma1Com1() {
		String numeroUm = "1";
		String numeroDois = "1";

		Integer resultado = aCalculadora.somar(numeroUm, numeroDois);
		assertEquals(new Integer("2"), resultado);
	}

	@Test(timeout = 1)
	public void testarSomaZeroComMenos1() {
		String numeroUm = "0";
		String numeroDois = "-1";

		Integer resultado = aCalculadora.somar(numeroUm, numeroDois);
		assertEquals(new Integer("-1"), resultado);
	}
	
	@Test(timeout = 1)
	public void testarSomaMenos44ComMenos50() {
		String numeroUm = "-44";
		String numeroDois = "-50";

		Integer resultado = aCalculadora.somar(numeroUm, numeroDois);
		assertEquals(new Integer("-94"), resultado);
	}
	
	@Test(timeout = 1)
	public void testarDividir4Com2() {
		String numeroUm = "4";
		String numeroDois = "2";

		Double resultado = aCalculadora.dividir(numeroUm, numeroDois);
		assertEquals(new Double("2"), resultado);
	}
	@Test(expected=NumberFormatException.class, timeout = 1)
	public void testarDivisaoEspacoComEspaco() {
		String numeroUm = "  ";
		String numeroDois = "  ";

		Double resultado = aCalculadora.dividir(numeroUm, numeroDois);
	}
	
	@Test(timeout = 1)
	public void testarDivisao1Com1() {
		String numeroUm = "1";
		String numeroDois = "1";

		Double resultado = aCalculadora.dividir(numeroUm, numeroDois);
		assertEquals(new Double("1"), resultado);
	}
	
	@Test(timeout = 1)
	public void testarRaizQuadradaDe49() {
		String numeroUm = "49";

		Double resultado = aCalculadora.raizQuadrada(numeroUm);
		assertEquals(new Double("7"), resultado);
	}

}
