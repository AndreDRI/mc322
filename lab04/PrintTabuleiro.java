package mc322.lab04;

public class PrintTabuleiro {
	public static void printTabuleiro(Peca[][] tabuleiro) {
		for(int linha = 0; linha < 7; linha++) {
			for(int coluna = 0; coluna < 7; coluna++) {
				System.out.println(tabuleiro[linha][coluna].ocupado);
			}
		}
	}
}
