package ex02;

public class Cavalo extends Peca implements IMovimentacao {

	@Override
	public boolean validaMovimentacao(int x, int y) {
		int xAtual = this.getPosicaoAtualX();
		int yAtual = this.getPosicaoAtualY();
		
		if (x > 8 || x < 1 || y < 1 || y > 8) {
			System.out.println("Posição informada não está de acordo com o tabuleiro");
			return false;
		}
		else {
			if ((x == (xAtual + 2) && (y == (yAtual + 1) || y == (yAtual - 1))) || (x == (xAtual - 2) && (y == (yAtual + 1) || y == (yAtual - 1)))
					|| (y == (yAtual + 2) && (x == (xAtual + 1) || y == (xAtual - 1))) || (y == (yAtual - 2) && (x == (xAtual + 1) || y == (xAtual - 1)))) {
				
			}
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cavalo [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
