/**
 * M9 Lambdas
 * IT Academy
 * Barcelona Activa
 * Interfaz Reverso Fase3
 *
 */
package fase3;


/**
 * Interfaz funcional.
 * método abstracto reversoInterfaz que recibe y devuelve un valor.
 * 
 * @author Rubén Rodríguez Fernández
 *
 */
@FunctionalInterface
public interface reversoInterfaz {

	String reverse(String cadena);
}
