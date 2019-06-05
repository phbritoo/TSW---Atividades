package calculadora;

public class Calculadora implements ICalculadora {

	@Override
	public int somar(String um, String dois) {
		Integer dividendo = Integer.valueOf(um.toString());
		Integer divisor = Integer.valueOf(dois.toString());
		Integer resultado = (dividendo) + (divisor);
		
		return resultado;
	}

	@Override
	public Double dividir(String um, String dois) {
		Double dividendo = Double.valueOf(um.toString());
		Double divisor = Double.valueOf(dois.toString());
		
		Double resultado = (dividendo) / (divisor);
		return resultado;
	}

	@Override
	public Double raizQuadrada(String um) {
		Double dividendo = Double.valueOf(um.toString());
		Double resultado = Math.sqrt(dividendo);
		
		return resultado;
	}
}

