/**
 * M9 Lambdas
 * IT Academy
 * Barcelona Activa
 * Clase Principal MAIN
 *
 */
package view;

import fase1.Fase1;
import fase2.Fase2;
import fase3.Fase3;

/**
 * Clase principal main 
 * 
 * Creamos los objetos de las fases y ejecutamos sus funciones imprimiendo por pantalla.
 * 
 * @author Rubén Rodríguez
 *
 */
public class m9APP {

	public static void main(String[] args) {

		Fase1 fase1 = new Fase1();
		Fase2 fase2 = new Fase2();
		Fase3 fase3 = new Fase3();
		
		System.out.println("Fase 1-----------------------------------------");
		System.out.println("Ejercicio 1");
				fase1.ejer1();
		System.out.println("Ejercicio1 versión 2");

		System.out.println(fase1.ejer1a().toString());
		
		System.out.println("Ejercicio 2");
		System.out.println(fase1.ejer2());
		System.out.println("Ejercicio 2a");
		fase1.ejer2a();
		System.out.println("Ejercicio 3");

		System.out.println(fase1.ejer3().toString());
		System.out.println("Ejercicio 4");
		System.out.println(fase1.ejer4().toString());
		System.out.println("Ejercicio 5");
		fase1.ejer5();
		System.out.println("\nEjercicio 5a");
		fase1.ejer5a();
		System.out.println("\nEjercicio 6");
		fase1.ejer6();
		
		System.out.println("\n\nFase 2-----------------------------------------");
		fase2.exec();
		
		System.out.println("\n\nFase 3-----------------------------------------");
		fase3.exec();
		
		
	}

}
