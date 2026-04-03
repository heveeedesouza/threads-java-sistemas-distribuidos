package primeiraatv;

import java.util.Random;

public class matriz {
	
	public int[][]matriz1 () {
	
	int [][] matriz= new int[3][5];
	Random random = new Random();
	
	for (int x = 0;  x<matriz.length;  x++) {
		for (int y = 0; y<matriz[x].length; y++) {
		matriz[x][y] = random.nextInt(100);		
}}
	return matriz;
	}
}
//por Hevellyn - 02/04/2026 v1