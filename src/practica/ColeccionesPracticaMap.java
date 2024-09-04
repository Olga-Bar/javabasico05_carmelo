package practica;

import java.util.HashMap;

public class ColeccionesPracticaMap {
public static void main(String[] args){
    //tenemos los días de la semana y cada día ha llovido. Quiero anotar los litros que han caído
    //muestra el listado de mayor a menor en base a los litros recogidos.

/*Solución 2 - Map*/
    HashMap <String, Float> lluviaPorDia = new HashMap<String, Float>();
    lluviaPorDia.put("Lunes", 10.4f);
    lluviaPorDia.put("Martes", 20f);
    lluviaPorDia.put("Miércoles", 30.5f);
    lluviaPorDia.put("Jueves", 40f);
    lluviaPorDia.put("Viernes", 22.45f);
    lluviaPorDia.put("Sábado", 14.85f);
    lluviaPorDia.put("Domingo", 70f);

    System.out.println("Listado de días de la semana ordenados de mayor a menor en base a los litros recogidos:");
    lluviaPorDia.entrySet().stream()//programación funcional
            .sorted((dia1, dia2) -> dia2.getValue().compareTo(dia1.getValue()))
            .forEach(dia -> System.out.println(dia.getKey() + " " + dia.getValue()));
    /*funcion forEach "sustituye" al bucle for*/
}//cierra main

}//cierra clase
