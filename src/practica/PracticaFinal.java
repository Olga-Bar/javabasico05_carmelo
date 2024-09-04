package practica;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PracticaFinal {
public static void main(String[] args) {
    //por consola el usuario ingresa ciudades hasta que quiere salir (pulsas q)
    //no se permiten ciudades repetidas ->Set (HashSet - LinkedHashSet - TreeSet)
    //muestra la lista de ciudades ordenadas alfabeticamente ->TreeSet almacena en un orden natural
    //por ejemplo están diciendo las ciudades que has visitado de vacaciones
    //debes determinar qué estructura utilizas para almacenar y recomiendo utilizar programación funcional


    //en el caso de permitir duplicados, podrías usar List, ArrayList como LinkedList (soporta orden)
    Set<String> ciudades = new TreeSet<>();
    Scanner sc = new Scanner(System.in);
    String ciudad;
    System.out.println("Dime las ciudades que has visitado de vacaciones");
    do {
        System.out.println("Introduce una ciudad o pulsa 'q' para salir");
        ciudad = sc.nextLine();
        if (!ciudad.equalsIgnoreCase("q")) {
            ciudades.add(ciudad);
        }
    } while (!ciudad.equalsIgnoreCase("q"));

    //ya está ordenado porque TreeSet almacena en un orden natural
    //mostrar las ciudades por consola
   //mostrar ciudades con programación funcional
    //ciudades.forEach(System.out::println);

    //esta estructura de control podría sustutuirse por el la función forEach
    for(String c: ciudades) {
        System.out.println(c);
    }

}//cierra main

}//cierra clase
