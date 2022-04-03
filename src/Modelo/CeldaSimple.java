package Modelo;

import java.util.Random;

public class CeldaSimple extends Celda{

	private int puntaje;
	
	public CeldaSimple(int X, int Y){
		super(new Ubicacion(X,Y));
		Random random = new Random();
		this.puntaje = (random.nextInt(10)-5);
		
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
}
