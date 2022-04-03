package Modelo;

public class ControlRespuestaJugador {
	
	
	public boolean responder (String rta, CeldaConPregunta celda) {
		return celda.esCorrecta(rta);
	}

}
