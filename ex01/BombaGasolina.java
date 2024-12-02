package ex01;

public class BombaGasolina extends Bomba implements IAbastecer {

	public BombaGasolina() {
		this.preco = 6.10;
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
		builder.append("BombaGasolina [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
