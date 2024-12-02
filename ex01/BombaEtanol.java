package ex01;

public class BombaEtanol extends Bomba implements IAbastecer {

	public BombaEtanol() {
		this.preco = 4.04;
		
	}
	
	@Override
	public double abastecerPorValor(double valor) {
		return valor/preco;
	}

	@Override
	public double abastercerPorLitro(double litro) {
		return litro*preco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaEtanol [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
