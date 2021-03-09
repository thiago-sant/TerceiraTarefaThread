package view;

import controller.MatrizThread;

public class Main {
	public static void main(String[] args) {
		int x;
		int mat[][] = new int[3][5];
		for (int z = 0; z < 3; z++) {
			for (int y = 0; y < 5; y++) {
				int random = (int)(Math.random()* 91) + 10;
				mat[z][y] = random ;
				
			}
		}
		
		for (x = 0; x < 3; x++) {
			Thread matrizThread = new MatrizThread(x, mat);
			matrizThread.start();
		}
	}
}
