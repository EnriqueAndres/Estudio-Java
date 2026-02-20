package Arrays;

import java.util.Scanner;

public class EjemploMatrices {
    
    //matrices cuadradas cuando hay el mismo numero de filas y columnas
    public static void main(String[] args) {

        int matriz [][] = new int [3][5];
        Scanner escribir = new Scanner(System.in);

        //para saber el tamano de filas y columnas si son distintas y no cuadradas

        System.out.println("Tamano fila: "+matriz.length);
        System.out.println("Tamano columna: "+matriz[0].length);


        // cuando son distintas
        for(int f=0; f<matriz.length; f++){
            for(int c=0; c<matriz[0].length; c++){
                System.out.println("ingrese el valor para la fila: " + f + " y columna: " + c);
                matriz[f][c] = escribir.nextInt();
            }
        }



        // -------------------------------------------------
        //recorrido y cargas de matrices
        // tambien cuando son cuadradas se puede usar matriz.length
        // for(int f=0; f<matriz.length...
        /*for(int f=0; f<3; f++){
            for(int c=0; c<3; c++){
                System.out.println("ingrese el valor para la fila: " + f + "columna " + c);
                matriz[f][c] = escribir.nextInt();
            }
        }

        //recorrido y muestra
        for(int f=0; f<3; f++){
            for(int c=0; c<3; c++){
                System.out.println("Fila: " +f+ "Columna: "+c+ "valor: "+ matriz[f][c]);
            }
        }*/

    }     
}
