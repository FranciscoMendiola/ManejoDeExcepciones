import java.util.Scanner;
import java.util.InputMismatchException;

public class Excepciones {

    // El objeto Scanner permite el ingreso de datos del usuario a traves del teclado.
    static Scanner teclado = new Scanner(System.in);
    
    /**
     * Obtiene la raiz de un número entero.
     * @param numero, es el número del cual se obtendra la raíz. 
     */
    public static double raiz (int numero) {
	double resultado = Math.sqrt(numero); 
    	return resultado;
    }

    /**
     * Método principal. Solicita al usuario un número entero manda a llamar a 
     * la función raiz, para obtener la raiz cuadrada del numero entero ingresado por el usuario.
     * @param args Para acceder a los argumentos. 
     */
    public static void main (String [] args) {
        int numero;
	System.out.println("Calcular la raíz cuadrada de un número en Java");
	System.out.println("");
	System.out.println("Ingrese un número entero");
	System.out.println("");

	try {	    
	    numero = teclado.nextInt();
	if (numero < 0) {
	    System.out.println("La raíz cuadrada de " + numero + " no esta definida");
	} else { 
	System.out.println("La raíz cuadrada de " + numero + " es " + raiz(numero));
	}
        } catch (InputMismatchException e) {
	    System.out.println("Solo se permite el ingreso de datos de tipo enteros");
	}
    }
}
