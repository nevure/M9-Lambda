/**
 * M9 Lambdas
 * IT Academy
 * Barcelona Activa
 * Clase Fase2
 *
 */
package fase2;


/**
 * 
 * Declaramos un objeto de la interfaz funcional Pi y con la expresión lambda implementamos
 *  el método abstracto, sin parámetros y con una operación que debe retornar un double
 * 
 *  
 * @author Rubén Rodríguez Fernández
 *
 */
public class Fase2 {
	
	PiInterfaz objPi = () -> {return 3.1415;};

	public void exec( ) {
		System.out.println(objPi.getPiValue());
	}
	
	
}
