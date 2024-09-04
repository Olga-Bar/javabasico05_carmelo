package teoria;

public class ArrayMultidimensionalTeoria {
    public static void main(String[] args)
    {
        //declarar un array multidimensional - se denominan matrices
        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        //mostrar elemento de array multimensional
        System.out.println(matriz[1][2]); //6
        matriz[1][2]=14;
        System.out.println(matriz[1][2]); //14
    }//cierra main

}//cierra clase
