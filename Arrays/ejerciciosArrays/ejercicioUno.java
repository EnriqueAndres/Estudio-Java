package Arrays.ejerciciosArrays;

import java.util.Scanner;

public class ejercicioUno {
    
    /*llevar a cabo un programa que incluya un vector que alamacene los nombres: alejandra, leonardo, rosa, guillermo, gabriel, daniel, luisa y ludmila. Realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar los mismo por pantalla */
    public static void main(String[] args) {
        
        /*String nombres [] = {"alejandra","leonardo","rosa","guillermo","gabriel","daniel","luisa","ludmila"};

        for(int i=0;i<nombres.length;i++){
            System.out.println("Los nombres ingresados son: " + nombres[i]);
        */

        String nombres[] = new String [8];
        Scanner teclado = new Scanner (System.in);
         
         //carga de nombres
         for (int i=0; i<nombres.length;i++) {
            System.out.println("Ingrese el nombre que quiera guardar en el índice " + i);
            nombres[i] = teclado.nextLine();
         }
         
         //mostrar los nombres
         for (int i=0; i<nombres.length;i++) {
            System.out.println("índice: " + i + " Nombre guardado: " + nombres[i]);
         }
     }
}
    

