package teoria;

import java.util.ArrayList;
import java.util.HashSet;

public class ColeccionesTeoria {

public static void main(String[]args){

    /*
    Colecciones: son estructuras de datos que permiten almacenar un conjunto de objetos.
    soportas diferetes tipos de datos en la misma colleción
    se puede repetir, ordenar, modificar una vez creados...
    Collection<E> es la interfaz que define los métodos comunes a todas las colecciones ->los métodos se llaman igual
    Collections es una clase que contiene métodos estáticos para trabajar con colecciones (add, remove, sort, filter...)
    Frameworks de colecciones: son un conjunto de interfaces y clases que permiten trabajar con colecciones
    Interfaces: Set, List, Queue, Map
    Clases: ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap
    List -> coleccion ordenada (sort) y permite duplicados -> ArrayList, LinkedList
    Set -> coleccion no ordenada y no permite duplicados -> HashSet, TreeSet
    Queue -> coleccion ordenada y permite duplicados -> LinkedList (FIFO)
    Map -> coleccion de pares clave-valor -> HashMap, TreeMap

     */
    ArrayList<Integer>numeros=new ArrayList<Integer>();
    numeros.add(7);
    numeros.add(14);
    numeros.add(312);
    numeros.add(485);
    numeros.add(562);
    numeros.add(485);//AL soporta duplicados

    //consultar una posición
    System.out.println(numeros.get(2));//método get permite consultar por posición (ordenados)
    for(int n:numeros){
        System.out.println(n);
    }
//AL soporta add, remove... pero NO es tan eficiente como LinkedList

    System.out.println("HastSet");
    //HashSet no permite duplicados - sí permite add pero luego solo muestra el último
    HashSet<String> jugadores=new HashSet<String>();
    jugadores.add("Messi");
    jugadores.add("Cristiano");
    jugadores.add("Neymar");
    jugadores.add("Messi");//duplicado
    jugadores.add("Neymar");//duplicado
    jugadores.add("Iniesta");
    for(String jugador:jugadores){
        System.out.println(jugador);
    }//no muestra duplicados
//HashSet No soporta orden. Al mostrarlos, aparecen en orden aleatorio.*
//HashSet es más eficiente que ArrayList para add, remove, update
    jugadores.add("Xavi");
    jugadores.remove("Neymar");
    System.out.println("Después de update - add - remove");
    for(String jugador:jugadores) {
        System.out.println(jugador);
    }

//HashMap
//HashMap es una colección de pares clave-valor - clave principal
//HashMap no permite duplicados en las claves
//HashMap no soporta orden. Al mostrarlos, aparecen en orden aleatorio.
    System.out.println("HashMap");
    java.util.HashMap<String, Integer> edades=new java.util.HashMap<String, Integer>();
    edades.put("Messi", 34);
    edades.put("Cristiano", 36);
    edades.put("Neymar", 29);
    edades.put("Messi", 35);//duplicado - update
    edades.put("Neymar", 30);//duplicado
    edades.put("Iniesta", 37);
    for(String jugador:edades.keySet()){
        System.out.println(jugador+" "+edades.get(jugador));
    }//no muestra duplicados
    edades.put("Xavi", 40);
    edades.remove("Neymar");
    System.out.println("Después de update - add - remove");
    for(String jugador:edades.keySet()){
        System.out.println(jugador+" "+edades.get(jugador));
    }


}//cierra main

}//cierra clase
