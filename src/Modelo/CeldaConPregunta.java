package Modelo;

import java.util.Random;

public class CeldaConPregunta extends Celda{
	
	private String pregunta;
	private String respuesta1;
	private String respuesta2;
	private String respuesta3;
	private int respuestaCorrecta;
	private int puntaje;
	
	
	
	public CeldaConPregunta(String pregunta, String respuesta1,
			String respuesta2, String respuesta3, int respuestaCorrecta, int X, int Y) {
		super(new Ubicacion(X,Y));
		this.pregunta = pregunta;
		this.respuesta1 = respuesta1;
		this.respuesta2 = respuesta2;
		this.respuesta3 = respuesta3;
		this.respuestaCorrecta = respuestaCorrecta;
		Random random = new Random();
		int n = (random.nextInt(7)-2);
		if (this.isEntero(n)){
			this.puntaje=(int)(n*1.2);
			
		}else{
			this.puntaje=(int)(n*0.25);
			
		}
	}

	private boolean isEntero(int x) {
        if (x % 1 == 0) {
            return true;
        } else {
            return false;
        }
	}

	public boolean esCorrecta (String rta){
		
		switch(this.respuestaCorrecta){
		case 1:
			return rta.equals(respuesta1);
		case 2:
			return rta.equals(respuesta2);	
		case 3:
			return rta.equals(respuesta3);
		}
		return false;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuesta1() {
		return respuesta1;
	}

	public void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}

	public String getRespuesta2() {
		return respuesta2;
	}

	public void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}

	public String getRespuesta3() {
		return respuesta3;
	}

	public void setRespuesta3(String respuesta3) {
		this.respuesta3 = respuesta3;
	}

	public int getRespuestaCorrecta() {
		return respuestaCorrecta;
	}

	public void setRespuestaCorrecta(int respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	

}
