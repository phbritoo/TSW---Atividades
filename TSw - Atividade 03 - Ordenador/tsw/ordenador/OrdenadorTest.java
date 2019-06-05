package ordenador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class OrdenadorTest {
	Ordenador ordenador;
	
	@Before
	public void Ordenador() {
		ordenador = new Ordenador();
	};
	
	@Test
	public void quandoInserirNumerosInteiros() {
	
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("60");
		colecao.add("70");
		colecao.add("80");
		
		
		ordenador.setarCollection(colecao);
		
		
		assertEquals(3, ordenador.maiorValor);
	}
	
	@Test
	public void quandoInserirNumerosReais() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("10.12");
		colecao.add("20.2");
		colecao.add("30.1");
		
		
		ordenador.setarCollection(colecao);
		
		
		assertEquals(30.1, ordenador.maiorValor);
	}
	
	@Test
	public void quandoInserirNull() {
		
		ordenador.setarCollection(null);
	}
	
	@Test
	public void quandoNaoInserirNumeros() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("d");
		colecao.add("a");
		colecao.add("r");
		
		
		ordenador.setarCollection(colecao);
	}
	
	@Test
	public void quandoInserirValorMaior() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("20");
		colecao.add("30");
		colecao.add("40");
		String valor = "100";
		
		
		ordenador.setarCollection(colecao);
		ordenador.setarValor(valor);
		
		
		assertEquals(100, ordenador.maiorValor);
	}
	
	@Test
	public void quandoInserirValorMenor() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("70");
		colecao.add("80");
		colecao.add("90.4");
		String valor = "10";
		
		
		ordenador.setarCollection(colecao);
		ordenador.setarValor(valor);
		
		
		assertNotEquals(10,ordenador.maiorValor);
	}
	
	@Test
	public void quandoInserirDadoInvalido() {
		String valor = "a";
		ordenador.setarValor(valor);
	}
	
	@Test
	public void quandoInserirValorNull() {		
		ordenador.setarValor(null);
	}
	
	@Test
	public void quandoInserirValorMenorNaColecao() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("10");
		colecao.add("20");
		colecao.add("30");
		
		
		ordenador.setarCollection(colecao);
		
		
		assertEquals(10, ordenador.getValorMenor());
	}
	
	@Test
	public void quandoInserirValorMaiorNaColecao() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("40");
		colecao.add("19");
		colecao.add("20");
		String valAleatorio = "1.7";
		
		
		ordenador.setarCollection(colecao);
		ordenador.setarValor(valAleatorio);
		
		
		assertEquals(1.7, ordenador.getValorMenor());
		
	}
	
	@Test
	public void testarGetMenorValorEnviandoParametrosIguais() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("10");
		colecao.add("10");
		colecao.add("10");
		String valAleatorio = "10";
		
		
		ordenador.setarCollection(colecao);
		ordenador.setarValor(valAleatorio);
		
		
		assertEquals(10, ordenador.getValorMenor());
	}
	
	@Test
	public void testarGetMenorValorInserindoValorAleatorio() {
		
		String valAleatorio = "1000";
		String valAleatorio2 = "1001";
		String valAleatorio3 = "1002";
		String valAleatorio4 = "4";
		
		
		ordenador.setarValor(valAleatorio);
		ordenador.setarValor(valAleatorio2);
		ordenador.setarValor(valAleatorio3);
		ordenador.setarValor(valAleatorio4);
		
		
		assertEquals(4, ordenador.getValorMenor());
	}
	
	@Test
	public void quandoGetValorMenorNaColecaoComDadosInvalidos() {
		
		String valAleatorio = "Abobora";
		
		
		ordenador.setarValor(valAleatorio);
		
		
		assertEquals(0.0, ordenador.getValorMenor());
	}
	
	@Test
	public void quandoGetValorMenorNaColecaoComDadosNulo() {
		
		String valAleatorio = null;
		
		
		ordenador.setarValor(valAleatorio);
		
		
		assertEquals(0.0, ordenador.getValorMenor());
	}
	
	@Test
	public void quandoGetValorMaiorNaColecao() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("10");
		colecao.add("20");
		colecao.add("30");
		
		ordenador.setarCollection(colecao);
		
		
		assertEquals(30, ordenador.getValorMaior());
	}
	
	@Test
	public void quandoGetValorMaiorNaColecaoComDadosAleatorios() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("40");
		colecao.add("19");
		colecao.add("20");
		String valAleatorio = "1.7";
		
		
		ordenador.setarCollection(colecao);
		ordenador.setarValor(valAleatorio);
		
		
		assertEquals(40, ordenador.getValorMaior());
		
	}
	
	@Test
	public void quandoGetValorMaiorNaColecaoComDadosIguais() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("50");
		colecao.add("50");
		colecao.add("50");
		String valAleatorio = "50";
		
		
		ordenador.setarCollection(colecao);
		ordenador.setarValor(valAleatorio);
		
		
		assertEquals(10, ordenador.getValorMaior());
	}
	
	@Test
	public void testarGetMaiorValorInserindoValorAleatorio() {
		
		String valAleatorio = "1000";
		String valAleatorio2 = "1001";
		String valAleatorio3 = "1002";
		String valAleatorio4 = "4";
		
		
		ordenador.setarValor(valAleatorio);
		ordenador.setarValor(valAleatorio2);
		ordenador.setarValor(valAleatorio3);
		ordenador.setarValor(valAleatorio4);
		
		
		assertEquals(1002, ordenador.getValorMaior());
	}
	
	@Test
	public void testarGetMaiorValorInserindoDadosInvalidos() {
		
		String valAleatorio = "Abobora";
		
		
		ordenador.setarValor(valAleatorio);
		
		
		assertEquals(0.0, ordenador.getValorMaior());
	}
	
	@Test
	public void testarGetMaiorValorInserindoDadosNulos() {
		
		String valAleatorio = null;
		
		
		ordenador.setarValor(valAleatorio);
		
		
		assertEquals(0.0, ordenador.getValorMaior());
	}
	
	@Test
	public void testarGetValorMedioInserindoDadosInteiros() {
		
		Collection<String> colecao = new ArrayList<String>();
			colecao.add("2");
			colecao.add("4");
			
		
		ordenador.setarCollection(colecao);
		
		
		assertEquals(3, ordenador.getValorMedio());
			
	}
	
	@Test
	public void testarGetValorMedioInserindoDadosReais() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("3.5");
		colecao.add("1.5");
		
		
		ordenador.setarCollection(colecao);
		
		
		assertEquals(2.5, ordenador.getValorMedio());
	}
	
	@Test 
	public void testarGetValorMedioInserindoDadosInvalidos() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("a");
		colecao.add("b");
		
		
		ordenador.setarCollection(colecao);
	}
	
	@Test(expected = NullPointerException.class)
	public void testarGetValorMedioInserindoDadosNulos() {
		
		Collection<String> colecao = null;
		
		
		ordenador.setarCollection(colecao);
	}
	
	@Test
	public void testarGetValorMedioComNumeroAleatorio() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("8");
		String valAleatorio = "2";
		
		
		ordenador.setarCollection(colecao);
		ordenador.setarValor(valAleatorio);
		
		
		assertNotEquals(4, ordenador.getValorMedio());
	}
	
	@Test
	public void testarGetValorMedianoInserindoCollectionComSizeImpar() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("3");
		colecao.add("4");
		colecao.add("5");
		
		
		ordenador.setarCollection(colecao);
		
		
		assertEquals(4, ordenador.getValorMediano());
	}
	
	@Ignore
	public void testarGetValorMedianoInserindoMaisParametrosSizeImpar() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("1");
		colecao.add("2");
		colecao.add("3");
		colecao.add("4");
		colecao.add("5");
		colecao.add("6");
		colecao.add("7");
		colecao.add("8");
		colecao.add("9");
		
		
		ordenador.setarCollection(colecao);
		
		
		assertEquals(5, ordenador.getValorMediano());
	}
	
	@Test
	public void testarGetValorMedianoInserindoVariosDadosSizePar() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("4");
		colecao.add("6");
		colecao.add("8");
		
		
		ordenador.setarCollection(colecao);
		
		
		assertEquals(5, ordenador.getValorMediano());
	}
	
	@Test
	public void testarGetValorMedianoInserindoCollectionComSizePar() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("4");
		colecao.add("6");
		colecao.add("35");
		colecao.add("12");
		colecao.add("7");
		colecao.add("9.1");
		colecao.add("26");
		
		
		ordenador.setarCollection(colecao);
		
		
		assertEquals(23.5, ordenador.getValorMediano());
	}
	
	@Test
	public void testarGetValorMedianoInserindoValoresInvalidos() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("4");
		colecao.add("c");
		colecao.add("35");
		
		
		ordenador.setarCollection(colecao);
	}
	
	@Test
	public void testarGetValorMedianoInserindoValoresReais() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("5.7");
		colecao.add("14.4");
		colecao.add("35");
		
		
		ordenador.setarCollection(colecao);
		
		
		assertEquals(10.05, ordenador.getValorMediano());
	}
	
	@Test(expected = NullPointerException.class)
	public void testarGetValorMedianoInserindoValoresNulos() {
		
		Collection<String> colecao = null;
		
		
		ordenador.setarCollection(colecao);
	}
	
	@After
	public void destruirObjetoPersistido() {
		ordenador = null;
	}

}
