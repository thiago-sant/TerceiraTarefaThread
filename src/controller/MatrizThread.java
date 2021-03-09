package controller;

public class MatrizThread extends Thread {
	private int x;
	private int mat [][] = new int [3][5];
	
	public MatrizThread (int x, int mat[][]){
		this.mat = mat;
		this.x = x;
	}
	
	@Override
	public void run() {
		somaMatriz();
	}
	
	public void somaMatriz () {
		int soma = 0;
		for (int y = 0; y < 5; y++) {
			soma = soma + mat [x][y];
		}
		System.out.println("A soma da linha "+ x + " é: "+ soma);
	}

}
