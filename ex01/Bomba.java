package ex01;

public class Bomba {

	private double quantLitroArmazena;
	protected double preco;
	
	public double getQuantLitroArmazena() {
		return quantLitroArmazena;
	}
	public void setQuantLitroArmazena(double quantLitroArmazena) {
		this.quantLitroArmazena = quantLitroArmazena;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [quantLitroArmazena=");
		builder.append(quantLitroArmazena);
		builder.append(", preco=");
		builder.append(preco);
		builder.append("]");
		return builder.toString();
	}

	
}
