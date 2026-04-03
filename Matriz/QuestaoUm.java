package primeiraatv;

public class QuestaoUm {

	public static void main(String[] args) {
		matriz m1 = new matriz();
		int [][] matriz= m1.matriz1();
		
		for (int x=0; x< matriz.length; x++) {
			for (int y=0; y<matriz[x].length; y++) {
				System.out.print(matriz[x][y] +"   ");
			}
			System.out.println();
		}
		
		System.out.println("Soma das linhas da matriz");
		for (int x=0; x<matriz.length; x++) {
			threads1 t= new threads1(matriz[x], x);
			t.start();
		}
}

}
//por Hevellyn - 02/04/2026 v1
