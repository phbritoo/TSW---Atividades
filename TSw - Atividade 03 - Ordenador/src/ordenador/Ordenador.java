package ordenador;

import java.util.Collection;

public class Ordenador implements IOrdenador{

	double maiorValor;
	double valorMenor;
	double valorMedio;
	double valorMediano;

	@Override
	public void setarCollection(Collection<String> setarColecao) {
		double valorAcumulado = 0;
		int colSize = setarColecao.size();
		try {
			for(String valor : setarColecao) {
				
				double valorDouble = Double.parseDouble(valor);
				
				valorMenor = (valorMenor == 0.0) ? valorDouble : valorMenor;
				
				if(valorDouble > maiorValor){
					maiorValor = valorDouble;
				}
				
				if(valorDouble < valorMenor) {
					valorMenor = valorDouble;
				}
				valorAcumulado += valorDouble;
			}	
			valorMedio = valorAcumulado / colSize;
			
			if(setarColecao.size() % 2 != 0) {
				valorMediano = Double.parseDouble((String) setarColecao.toArray()[(int)(0+colSize)/2]);
			}else {
				double v1 = Double.parseDouble((String) setarColecao.toArray()[colSize/2 - 1]);
				double v2 = Double.parseDouble((String) setarColecao.toArray()[(colSize/2)]);
				valorMediano = (v1 + v2) / 2;
			}
			
		}catch(NumberFormatException n) {
			System.err.println("setarCollection - Erro na formatacao\n");
		}catch (NullPointerException e) {
			System.err.println("Pasando nullo\n");
		}
	}
	
	@Override
	public void setarValor (String pValor) {
		try {
			
			double valorConvertido = Double.parseDouble(pValor); 
			
			valorMenor = (valorMenor == 0.0) ? valorConvertido : valorMenor;
			
			if(valorConvertido > maiorValor) {
				maiorValor = valorConvertido;
			}
			
			if(valorConvertido < valorMenor){
				valorMenor = valorConvertido;
			}
			
		}catch(NumberFormatException n) {
			System.err.println("setarValor - Erro na formatacao\n");
		}catch (NullPointerException e) {
			System.err.println("Pasando nullo\n");
		}
	}
	
	@Override
	public double getValorMenor() {
		return this.valorMenor;
	}
	
	@Override
	public double getValorMaior() {
		return this.maiorValor;
	}
	
	@Override
	public double getValorMedio() {
		return this.valorMedio;
	}
	
	@Override
	public double getValorMediano() {
		return this.valorMediano;
	}

}

