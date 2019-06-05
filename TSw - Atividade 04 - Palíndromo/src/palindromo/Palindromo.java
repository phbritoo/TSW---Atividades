package palindromo;

public class Palindromo implements IPalindromo {


	@Override
	public boolean setarPalindromo(String objetoString) {
		boolean setarPalindromo = false;
		try {
			String stringAux = objetoString;
			String invertida = new StringBuffer(stringAux).reverse().toString(); 
			if(stringAux.equals(invertida)){
				setarPalindromo = true;
			}else{
				setarPalindromo = false;
			}
			
		}catch (Exception e) {
			
		}
		return setarPalindromo;
		
	}
}
