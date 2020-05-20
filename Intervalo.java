/**
 * 
 */
package ejer3_1;

/**
 * @author Ruben
 *
 */
public class Intervalo {

	// propiedades
	double inicio;
	double fin;

	// constructor
	public Intervalo(double inicio, double fin) {
		this.inicio = inicio;
		this.fin = fin;
	}

	// metodos
	public double longitud() {
		double longitud;
		longitud = this.fin - this.inicio;
		return longitud;
	}

	public void desplazamiento(double cantidad) {
		this.inicio = inicio + cantidad;
		this.fin = fin + cantidad;
	}

	public boolean buscar(double valor) {
		// a�adir una condicion para boolean
		boolean buscar;
		if (valor>=this.inicio && valor<=this.fin) {
			buscar = true; 
		}else{buscar = false;
		}
		return buscar;
	
	}

	/*
	 * public boolean estaIncluido(Intervalo intervalo) {
	 *	
	   }
	 */
}
