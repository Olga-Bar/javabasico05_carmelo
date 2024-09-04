package practica;

public class ArrayPractica {
    public static void main(String[] args){
        //almacenar en un array unidimensional las notas de 5 alumnos. 5.7 - 7.8 - 6.5 - 4.9 - 8.14
        float[] notas={5.7f,7.8f,6.5f,4.9f,8.14f};
        //muestra en consola las notas de los alumnos
        float notamedia=0;
        for(float nota:notas){
            System.out.println("la nota es: "+nota);
            notamedia+=nota;
        }
        notamedia=notamedia/notas.length;
        float notamediaredondeada=0;
        notamediaredondeada=Math.round(notamedia);
        System.out.println("la nota media es: "+ notamediaredondeada);
        //muestra en consola la nota media de los alumnos
    } //cierra main
}//cierra clase
