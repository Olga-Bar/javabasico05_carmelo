package practica;

public class ColeccionesPractica {
public static void main(String[] args){
    //tenemos los días de la semana y cada día ha llovido. Quiero anotar los litros que han caído
    //muestra el listado de mayor a menor en base a los litros recogidos.

/*Solución 1 - Array multidimensional*/
    String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    float[] litros = {10.4f, 20, 30.5f, 40, 22.45f, 14.85f, 70};
    String[][]lluviaporDia=new String[diasSemana.length][2];//array multidimensional

    //guardar los datos de la semana y los litros en el array multidimensional
    for(int i=0;i<diasSemana.length;i++){
        lluviaporDia[i][0]=diasSemana[i];
        lluviaporDia[i][1]=String.valueOf(litros[i]);
    }

    System.out.println(diasSemana[2]+" "+litros[2]);
    //ordenar los litros de mayor a menor
    for(int i=0;i<lluviaporDia.length;i++){
        for(int j=0;j<lluviaporDia.length;j++){
            if(Float.parseFloat(lluviaporDia[i][1])>Float.parseFloat(lluviaporDia[j][1])){
                String[] aux=lluviaporDia[i];
                lluviaporDia[i]=lluviaporDia[j];
                lluviaporDia[j]=aux;
            }//cierra if
        }//cierra for j
    }//cierra for i
System.out.println("Listado de días de la semana ordenados de mayor a menor en base a los litros recogidos:");
    for(int i=0;i<lluviaporDia.length;i++){
        System.out.println(lluviaporDia[i][0]+" "+lluviaporDia[i][1]);
    }//cierra for
}//cierra main

}//cierra clase
