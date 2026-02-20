package Arrays.ejerciciosArrays;

import java.util.Scanner;

public class ejercicioIntegradorMatrices {

    /*En una tabla de 4 filas y 3 columnas se guardan las notas de 4 alumnos de secundario. 
        Cada fila corresponde a las notas de cada alumno.
        
        Se necesita un programa que permita a un profesor cargar en las 3 primeras 
        posiciones de cada fila las notas del alumno y que en un vector diferente se calculen los promedios.
    */

    public static void main(String[] args) {
        
        
        double notas[][] = new double[4][3];
        double promedios[] = new double [4];
        Scanner teclado = new Scanner (System.in);
        
        //carga de las notas en la matriz
        for (int f=0;f<notas.length;f++) {
            System.out.println("Ingrese las 3 notas del alumno: " + (f+1));
            for (int c=0; c<notas[0].length;c++) { // aca es notas[0].length porque las filas no tienen la misma cantidad de columnas, pero si se pone notas.length se rompe el programa porque no hay 4 columnas, sino 3
                notas[f][c] = teclado.nextDouble();
            }
        }
        
        //calcular los promedios
        double total;
        //Este vector debe tener la misma cantidad de posiciones que alumnos y coincidir en sus índices
        for (int f=0;f<notas.length;f++) {
            total=0;
            for (int c=0; c<notas[0].length;c++) {  
                total = total + notas[f][c];
            }
            promedios[f] = total / notas[0].length;        
        }
        System.out.println("------------------------PROMEDIOS-------------------------------");
        //mostrar notas y promedio

        // este fragmento de codigo de forma detallada indica que se recorre cada fila de la matriz de notas, imprimiendo las notas de cada alumno y su promedio correspondiente.
         for (int f=0;f<notas.length;f++) {
             System.out.println("Las notas del alumno Nº " + (f+1) + " son: " );
             for (int c=0; c<notas[0].length;c++) { 
                 System.out.println(notas[f][c]);
             }
             System.out.println("El promedio fue de: " + promedios[f]);
             System.out.println("----------------------------------------------------------");
         }



    }
}
