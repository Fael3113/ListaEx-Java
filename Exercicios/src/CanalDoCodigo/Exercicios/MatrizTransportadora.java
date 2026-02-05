package CanalDoCodigo.Exercicios;

import java.util.Random;

public class MatrizTransportadora {

	static int[][] criaMatriz(int n, int m){
		int[][] matriz = new int[n][m];
		for (int i = 0; i < matriz.length; i++) {
			Random gerador = new Random();
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = gerador.nextInt(100);
			}
		}
		return matriz;
	}

	static int[][] transposta(int[][] matriz){
		int [][] matrizTransposta = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matrizTransposta.length; i++) {
			for (int j = 0; j < matrizTransposta[0].length; j++) {
				matrizTransposta[i][j] = matriz[j][i];
			}
		}
		return matrizTransposta;
	}

	static void imprimeMatriz(int[][] matriz){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		int [][] matriz = criaMatriz(3,4);
		imprimeMatriz(matriz);
		System.out.println();
		int [][] matrizTransposta = transposta(matriz);
		imprimeMatriz(matrizTransposta);
	}
}
