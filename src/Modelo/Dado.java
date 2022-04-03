package Modelo;

import java.util.Random;

public class Dado {
	
	public int tirar(){
		Random random = new Random();
		return random.nextInt(6)+1;
	}

}
