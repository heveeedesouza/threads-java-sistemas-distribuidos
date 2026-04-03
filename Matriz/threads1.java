package primeiraatv;

public class threads1 extends Thread{
	private int[] linha;
	private int id;
	
   public  threads1(int[]linha, int id) {
		this.linha= linha;
		this.id= id;
		
	}
   @Override
   public void run() {
	   int soma = 0;
	   
	   for (int x=0; x<linha.length; x++) {
		   soma+=linha[x];
	   }
	   
	   System.out.println("Linha " + id + " tem como soma = "+ soma);
   }
	

}

//por Hevellyn - 02/04/2026 v1
