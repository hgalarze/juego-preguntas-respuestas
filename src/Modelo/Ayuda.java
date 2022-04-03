package Modelo;

import java.util.Vector;

public class Ayuda {
	
	private Vector<String> imagen;
	private Vector<String> textoAyudaEjercicio;
	private Vector<String> textosAyudaGeneral;
	private String textoAyudaGeneral1 = "Haga click con el mouse sobre el dibujo del dado, verá lo que obtuvo automáticamente." +
			"\n1. Observará el valor que obtuvo, y se habilitarán las flechas para movimiento que corresponda según el valor." +
			"\n2. Haga click sobre un movimiento habilitado. El sistema moverá la ficha automáticamente." +
			"\n3. Visualice la nueva pregunta, seleccione su respuesta y presione el boton responder." +
			"\n4. Visualizará el puntaje que obtuvo al responder.";
	private String textoAyudaGeneral2 = "Celda Sin Pregunta:" +
			"\nSi el jugador cae en una celda sin pregunta debe tirar nuevamente el dado, pero obtiene un puntaje de la celda, que en algunos casos puede ser negativo." +
			"\nEl puntaje varia de -5 a 5";
	private String textoAyudaGeneral3 = "Celda Con Pregunta:" +
			"\nSi el jugador cae en una celda con pregunta, debe seleccionar una opción como respuesta, si acierta obtiene 12 puntos, si no acierta, obtiene 3 puntos." +
			"\nCada celda que dispone de una pregunta, también tiene un puntaje que va de -2 a 4. Este puntaje se multiplica por 1,2 si la celda tiene puntaje positivo, y sino por 0,25";
	private int pagina = 1;
	
	public Ayuda () {
		this.imagen = new Vector<String>();
		this.textoAyudaEjercicio = new Vector<String>();
		this.textosAyudaGeneral = new Vector<String>();
		this.CargarVector();
	}
	
	private void CargarVector () {
		String basePath = System.getProperty("user.dir") + "\\img\\";
		this.imagen.add(basePath + "dado2.png");
		this.imagen.add(basePath + "arriba.png");
		this.imagen.add(basePath + "Siguiente.png");
		this.imagen.add(basePath + "abajo.png");
		this.imagen.add(basePath + "Atras.png");
		this.imagen.add(basePath + "ficha.jpg");
		this.imagen.add(basePath + "salir.png");
		this.textoAyudaEjercicio.add("Permite tirar el dado.");
		this.textoAyudaEjercicio.add("Permite realizar un movimiento hacia arriba.");
		this.textoAyudaEjercicio.add("Permite realizar un movimiento hacia la derecha.");
		this.textoAyudaEjercicio.add("Permite realizar un movimiento hacia abajo.");
		this.textoAyudaEjercicio.add("Permite realizar un movimiento hacia la izquierda.");
		this.textoAyudaEjercicio.add("Permite visualizar en que casillero se encuentra posicionado la misma.");
		this.textoAyudaEjercicio.add("Permite salir del juego.");
		this.textosAyudaGeneral.add(this.textoAyudaGeneral1);
		this.textosAyudaGeneral.add(this.textoAyudaGeneral2);
		this.textosAyudaGeneral.add(this.textoAyudaGeneral3);
	}
	
	public String SiguientePagina (Vector<String> vector) {
		if ((this.pagina + 1) <= vector.size()) {
			this.pagina = this.pagina + 1;
			return vector.elementAt(this.pagina - 1);
		}
		return vector.elementAt(this.pagina - 1);
	}
	
	public String AnteriorPagina (Vector<String> vector) {
		if ((this.pagina - 1) > 0) {
			this.pagina = this.pagina - 1;
			return vector.elementAt(this.pagina - 1);
		}
		return vector.elementAt(this.pagina - 1);
	}
	
	public String ImagenAsociada (Vector<String> vector) {
		return vector.elementAt(this.pagina - 1);
	}

	public Vector<String> getTextoAyudaEjercicio() {
		return textoAyudaEjercicio;
	}

	public void setTextoAyudaEjercicio(Vector<String> textoAyudaEjercicio) {
		this.textoAyudaEjercicio = textoAyudaEjercicio;
	}

	public Vector<String> getTextosAyudaGeneral() {
		return textosAyudaGeneral;
	}

	public void setTextosAyudaGeneral(Vector<String> textosAyudaGeneral) {
		this.textosAyudaGeneral = textosAyudaGeneral;
	}

	public Vector<String> getImagen() {
		return imagen;
	}

	public void setImagen(Vector<String> imagen) {
		this.imagen = imagen;
	}

	public int getPagina() {
		return pagina;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}

}
