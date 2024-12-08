package ex02;

public class Bispo extends Peca implements IMovimentacao {
	

	@Override
	public boolean validaMovimentacao(int x, int y) {
		int xAtual = this.getPosicaoAtualX();
		int yAtual = this.getPosicaoAtualY();
		
		if (x > 8 || x < 1 || y < 1 || y > 8) {
			System.out.println("Posição informada não está de acordo com o tabuleiro");
			return false;
		}
		else {
			for (int i = 1; i <= 8; i++) {
				if ((x == (xAtual + i) && y == (yAtual - i)) || (x == (xAtual + i) && y == (yAtual + i)) ||
						(x == (xAtual - i) && y == (yAtual - i)) || (x == (xAtual - i) && y == (yAtual + i))) {
					this.setPosicaoAtualX(x);
					this.setPosicaoAtualY(y);
					
					return true;
				}
			}
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bispo [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
