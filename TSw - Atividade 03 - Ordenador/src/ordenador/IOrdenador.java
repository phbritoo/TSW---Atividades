package ordenador;

import java.util.Collection;

public interface IOrdenador {

	public void setarCollection(Collection<String> setarColecao);
	public void setarValor(String setarValor);
	public double getValorMenor();
	public double getValorMaior();
	public double getValorMedio();
	public double getValorMediano();
}
