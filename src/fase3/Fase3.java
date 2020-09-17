/**
 * M9 Lambdas
 * IT Academy
 * Barcelona Activa
 * Clase Fase3
 *
 */
package fase3;


/**
 * 
 * Declaramos un objeto de la interfaz funcional reversoInterfaz y con la expresión lambda implementamos
 *  el método abstracto. Recibe un String y devuelve también un String.
 *  utilizamos un objeto de tipo StringBuilder que nos facilita el método reverse().
 *  Luego lo transformamos en String para retornarlo.
 * 
 *  
 * @author Rubén Rodríguez Fernández
 *
 */
public class Fase3 {
	
	reversoInterfaz cadenaR = (cadena) -> {
	    return new StringBuilder(cadena).reverse().toString();			
	};
	
	public void exec() {
		
		String texto="Que es mi barco mi tesoro, que es mi dios la libertad, mi ley, la fuerza y el viento,mi única patria la mar. ";
		System.out.println("Cadena original:" +texto);
		System.out.println(cadenaR.reverse(texto));
	}

}
