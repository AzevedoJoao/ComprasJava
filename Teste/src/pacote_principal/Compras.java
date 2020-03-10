package pacote_principal;

public class Compras {
	private int quantidade;
	//declaração de vetores e alocação de memoria par ao vetor
	private float valor[]= new float[quantidade];
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float[] getValor() {
		return valor;
	}
	public void setValor(float valor) {
		
		this.valor[quantidade] = valor;
	}
	
	
}
