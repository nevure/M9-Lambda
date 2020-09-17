/**
 * M9 Lambdas
 * IT Academy
 * Barcelona Activa
 * Clase Fase1
 *
 */

package fase1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.*;



/**
 * Clase para la resolución de los ejercicios de la Fase 1
 * 
 * 
 * @author Rubén Rodríguez
 *
 */
public class Fase1 {

	private List<String> lista1 = new ArrayList<String>(Arrays.asList("Jordi","Ana","Isabel","Gorka","Montse","Aina","Eunate","Rodrigo","Carles","Ane","Anabel","Antonio","Aba"));
	private List<Integer> lista2 = new ArrayList<Integer>(Arrays.asList(1,5,4,7,8,9,22,54,3,5134,13));
	private List<String> lista3 = new ArrayList<String>(Arrays.asList("Hola","Adios","EnerO","Puigmal","Montardo","Bastiments","Astazu","Matagalls","Aneto","Russell","Puigpedrós"));
	private List<String> lista5 = new ArrayList<String>(Arrays.asList("Enero, ","Febrero, ","Marzo, ","Abril, ","Mayo, ","Junio, ","Julio, ","Agosto, ","Septiembre, ","Octubre, ","Noviembre, ","Diciembre, "));
	private List<String> lista5a = new ArrayList<String>(Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"));

	String cadena2="";	
	
	/*
	 * Método que filtra un stream (con una expresión lambda de tipo predicado). La salida del primer filtro se vuelve a filtrar por la longitud. 
	 * La salida se recorre una a una para imprimir (por referencia a método estático)
	 */
	public void ejer1 () {
		lista1.stream().filter(nom -> nom.charAt(0) == 'A').filter(nom -> nom.length() == 3).forEach(System.out::println);
		//lista1.stream().filter(nom -> (nom.charAt(0) =='A') && nom.length() == 3).forEach(System.out::println);
	
	}
	
	/*
	 * Versión diferente. el resultado de los filtros se reduce/recoge en una lista List que retornamos.
	 */
	public List<String> ejer1a() {

		return lista1.stream().filter(nom -> nom.charAt(0) == 'A').filter(nom -> nom.length() == 3).collect(Collectors.toList());
		
	}
	
	/*
	 *que otras alternativas habría ? alguna más eficiente ?
	 * 
	 * ÇRecorremos uno a uno el stream y le aplicamos la expresión lambda a cada elemento.
	 * La expresión lambda verifica el tipo de número, par o impar, y alimenta un atributo de clase.
	 */
	public String ejer2() {
		lista2.stream().forEach(numero -> {

			if (numero % 2 == 0)
				this.cadena2+="e"+numero+",";
			else this.cadena2+="o"+numero+",";
			
		});
		return cadena2;
	}
	
	/*
	 * Otra manera utilizando la interfaz funcional Consumer. 
	 * al stream de la lista 2 lo recorremos pasandole los elementos al cosumidor. 
	 */
	public void ejer2a() {
		
		Consumer<Integer> consumidor = i -> {
		    if(i % 2 == 0) {
		        System.out.print("e" + i + ",");
		    } else {
		        System.out.print("o" + i+",");
		    }
		};
		 
		lista2.stream().forEach(consumidor);
	}
	
	/**
	 * aplicamos el filtro a la lista y la reducimo a una nueva lista que retornamos. 
	 */
	public List<String> ejer3() {
		return lista3.stream().filter(nom -> nom.toLowerCase().contains("o")).collect(Collectors.toList());
		
	}
	
	/**
	 * Similar al anterior. Varía el tipo de filtro a aplicar.
	 * 
	 */
	public List<String> ejer4() {
		return lista3.stream().filter(nom -> nom.length()>5).collect(Collectors.toList());

	}
	
	/*
	 * Referencia a un método estático.
	 */
	public void ejer5(){
		lista5.forEach(System.out::print);
		
	}
	
	/**
	 * otra manera de hacerlo con expresión lambda. 
	 */
	public void ejer5a(){
		lista5a.forEach(mes -> System.out.print(mes+", "));
		
	}
	
	/**
	 * Otra manera de hacerlo utilizando la interfaz funcional Consumer y una referencia a método (estático).
	 * 
	 */
	public void ejer6() {
		Consumer<List<String>> consumidor = System.out::println;
		consumidor.accept(lista5);
	}

}
