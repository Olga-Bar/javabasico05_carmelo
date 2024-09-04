package practica;

public class ArrayMultiPractica {
    public static void main(String[] args)
    {
        //en una clase tenemos las notas de mates y las de lengua para 4 alumnos
        //alumno 1 : 6.5 mates, 7 lengua
        //alumno 2 : 8 mates, 6 lengua
        //alumno 3 : 5 mates, 9 lengua
        //alumno 4 : 7 mates, 8 lengua

        //almacena los datos y muestra la nota media total
        float[][] notas = {
            {6.5f, 7f},
            {8f, 6f},
            {5f, 9f},
            {7f, 8f}
        };
        float media = 0;//aumulador
        //bucle anidado
        for (int i = 0; i < notas.length; i++)//recorrer por alumno
        {
            float mediaAlumno = 0;
            for (int j = 0; j < notas[i].length; j++)//recorrer por asignatura
            {
                mediaAlumno += notas[i][j];
            }
            media += mediaAlumno;//almacena la suma total de la matriz
            System.out.println("Media alumno " + (i + 1) + ": " + mediaAlumno / notas[i].length);
        }
    }
}//cierra clase
