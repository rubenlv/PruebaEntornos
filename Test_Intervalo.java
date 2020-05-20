/**
 * 
 */
package ejer3_1;

/**
 * @author Ruben
 *
 */


public class Test_Intervalo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Intervalo I1, I2; 
		I1 = new Intervalo(3.0, 9.0);
		I2 = new Intervalo(1.0, 6.0);

		System.out.println("inicio intervalo: " + I1.inicio);
		System.out.println("fin intervalo: " + I1.fin);
		System.out.println("la longitud del intervalo es: " + I1.longitud());
		//System.out.println("desplazamos el inicio en 2.5: " + I1.(2.5));
		System.out.println("�este valor pertenece al intervalo?\n" + I1.buscar(1.0));
	}

}
