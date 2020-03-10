package pacote_principal;

public class Principal {
	public static void main(String [] args) {
		float resultado=0;
		int quantidade=0;
		float valor=0;
		int i=0;
		
		Compras c1= new Compras();
		
		c1.setQuantidade(quantidade);
		
		do {
			c1.setValor(valor);
			i++;
		}while(i<=quantidade);
		
	}
}
