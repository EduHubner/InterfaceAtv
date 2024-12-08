package ex02;

public class Peca {

	private int posicaoAtualX;
	private int posicaoAtualY;
	
	public int getPosicaoAtualX() {
		return posicaoAtualX;
	}
	public void setPosicaoAtualX(int posicaoAtualX) {
		this.posicaoAtualX = posicaoAtualX;
	}
	public int getPosicaoAtualY() {
		return posicaoAtualY;
	}
	public void setPosicaoAtualY(int posicaoAtualY) {
		this.posicaoAtualY = posicaoAtualY;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Peca [posicaoAtualX=");
		builder.append(posicaoAtualX);
		builder.append(", posicaoAtualY=");
		builder.append(posicaoAtualY);
		builder.append("]");
		return builder.toString();
	}
	
	
}
