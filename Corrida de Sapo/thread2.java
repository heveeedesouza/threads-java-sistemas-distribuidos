package primeiraatv;

import java.util.Random;

public class thread2 extends Thread{
	private int salto;
	private int d;
	private int percorrido;
	private int id;
	private static boolean acabou = false;

	public thread2 (int id,int salto, int d) {
		this.salto = salto;
		this.d = d;
		this.id = id;
	}
	@Override
public void run() {
	Random r= new Random();
	
	while (percorrido < d) {
	int saltoAleatorio = r.nextInt(salto)+1;
	percorrido = percorrido + saltoAleatorio;
	System.out.println("sapo " +id + " pulou: "+ saltoAleatorio + " total da distancia " + percorrido);
		
	}
	if (percorrido>= d && acabou == false) {
	acabou = true;
	System.out.println("Sapo:  "+ id+ " Chegou primeiro!");
	}
}
}
//por Hevellyn - 02/04/2026 v1
