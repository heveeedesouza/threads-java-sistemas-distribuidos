package primeiraatv;

public class QuestaoDois {
	public static void main (String[] args) {
		int distancia = 30;
		
		thread2 sapo1= new thread2(1,5,distancia);
		thread2 sapo2 = new thread2(2,3,distancia);
		thread2 sapo3 = new thread2(3, 7, distancia);
		thread2 sapo4 = new thread2(4,5,distancia);
		thread2 sapo5 = new thread2(5,4,distancia);
		
		sapo1.start();
		sapo2.start();
		sapo3.start();
		sapo4.start();
		sapo5.start();
	}

}
//por Hevellyn - 02/04/2026 v1
