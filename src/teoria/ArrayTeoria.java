package teoria;

public class ArrayTeoria {

public static void main(String[] args){
    /*
    Array es una estructura de datos que almacena una colección de elementos del mismo tipo. (primitivo o objeto)
    Siempre puedes crear un array de Object, pero no es recomendable.
    Almacena items en posiciones consecutivas de memoria. (comienza desde la posición 0)
     */

    //declaración de un array
    int[] numeros; //array de enteros
   //inicializar el array
    numeros= new int[5]; //5 elementos //palabra clave new para inicilizar
    //asignar valores a los elementos del array
    numeros[0]=10;
    numeros[1]=20;
    numeros[2]=30;
    numeros[3]=40;
    numeros[4]=50;
    //acceder a los elementos del array
    System.out.println("el número en la posición 3 es: "+numeros[3]);

    //método directo
    String[] ciudades={"Madrid","Barcelona","Valencia","Sevilla","Bilbao"};//declaración, iniciarlización y asignación
    System.out.println("la ciudad en la posición 2 es: "+ciudades[2]);//acceder a un elemento
    System.out.println("las ciudades son "+ciudades);//imprimir el array

    //recorrer un array se puede utilizar bucles
    for(int i=0;i<ciudades.length;i++){
        System.out.println("la ciudad en la posición "+i+" es: "+ciudades[i]);
    }

    //otra forma de recorrer un array
    for(String ciudad:ciudades){ //for each
        System.out.println("la ciudad es: "+ciudad);
    }
}//cierra main

}//cierra clase ArrayTeoria
