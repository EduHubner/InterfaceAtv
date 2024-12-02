package ex01;

public class BombaDiesel extends Bomba implements IAbastecer {

	public BombaDiesel() {
		this.preco = 5.96;
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
		builder.append("BombaDiesel [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
