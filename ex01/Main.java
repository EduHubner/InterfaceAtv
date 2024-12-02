package ex01;

public class Main {

	public static void main(String[] args) {

		BombaGasolina bg = new BombaGasolina();
		
		System.out.println("Quantidade de combustivel (Gasolina) pagando R$100,00: " + String.format("%.2f" , bg.abastecerPorValor(100)) + " Litros");
		System.out.println("Valor a pagar colocando 5L de gasolina: " + bg.abastercerPorLitro(5));
		System.out.println("\n");
		
		BombaEtanol be = new BombaEtanol();
		
		System.out.println("Quantidade de combustivel (Etanol) pagando R$100,00: " + String.format("%.2f" , be.abastecerPorValor(100)) + " Litros");
		System.out.println("Valor a pagar colocando 5L de etanol: " + be.abastercerPorLitro(5));
		System.out.println("\n");
		
		BombaDiesel bd = new BombaDiesel();
		
		System.out.println("Quantidade de combustivel (Diesel) pagando R$100,00: " + String.format("%.2f" , bd.abastecerPorValor(100)) + " Litros");
		System.out.println("Valor a pagar colocando 5L de diesel: " + bd.abastercerPorLitro(5));
	}

}
