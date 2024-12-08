package ex02;

public class Main {

	public static void main(String[] args) {
		
		Bispo bispo = new Bispo();
		
		bispo.setPosicaoAtualX(5);
		bispo.setPosicaoAtualY(5);
		System.out.println(bispo);
		
		System.out.println(bispo.validaMovimentacao(6, 4));
		System.out.println(bispo);
		
		System.out.println();//------------------------------------------
		
		Peao peao = new Peao();
		
		peao.setPosicaoAtualX(2);
		peao.setPosicaoAtualY(1);
		System.out.println(peao);
		
		System.out.println(peao.validaMovimentacao(3, 1));
		System.out.println(peao);
		
		System.out.println();//------------------------------------------
		
		Torre torre = new Torre();
		
		torre.setPosicaoAtualX(4);
		torre.setPosicaoAtualY(6);
		System.out.println(torre);
		
		System.out.println(torre.validaMovimentacao(4, 1));
		System.out.println(torre);
		
		System.out.println();//------------------------------------------
		
		Rei rei = new Rei();
		
		rei.setPosicaoAtualX(7);
		rei.setPosicaoAtualY(2);
		System.out.println(rei);
		
		System.out.println(rei.validaMovimentacao(8, 1));
		System.out.println(rei);
		

	}

}
