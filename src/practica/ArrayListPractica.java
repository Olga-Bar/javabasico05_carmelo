package practica;

import java.util.ArrayList;

public class ArrayListPractica {
public static void main(String[] args){
    //En un AL vas a almacenar 8 numeros decimales - 7.1 - 6.5 - 7.1 - 3.5 - 4.2 - 5.1 - 6.5 - 7.1
    //muestra los datos del AL
    //muestra los datos pero ordenados de mayor a menor
    //Recuerda que le AL soporta duplicados y permite ordenar
    ArrayList<Float>numeros=new ArrayList<Float>();
    numeros.add(7.1f);
    numeros.add(6.5f);
    numeros.add(7.1f);
    numeros.add(3.5f);
    numeros.add(4.2f);
    numeros.add(5.1f);
    numeros.add(6.5f);
    numeros.add(7.1f);
    for(float n:numeros){
        System.out.println(n);//soporta duplicados y los muestra
    }
    //ordenar de mayor a menor
    numeros.sort(null);//AL soporta ordenar
    System.out.println("Ordenados de mayor a menor");
    for(float n:numeros){
        System.out.println(n);
    }
    //ArrayList pero no es demasiado eficiente para update - add - remove
    //LinkedList es más eficiente para update - add - remove
    numeros.add(9.5f);
    numeros.add(5, 6.5f);
    numeros.remove(6);
    System.out.println("Después de update - add - remove");
    for(float n:numeros){
        System.out.println(n);
    }
}//cierra main

}//cierra clase
