package Arrays;

import java.util.Scanner;

public class EjemploVectores {

    public static void main(String[] args) {
        
        /*int numeros[] = {10,20,30,40,50} cuando ya se tienen los valores */
        int numeros[] = new int[8];

        Scanner escribir = new Scanner(System.in);

       /* numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        numeros[5] = 60;
        numeros[6] = 70;
        numeros[7] = 80;*/
    
        /*for(int i = 0; i <numeros.length; i++){
            System.out.println("estoy en el indice: "+ i + " y el valor es: " + numeros[i]);
        }*/

            for(int i = 0; i<numeros.length; i++){
                System.out.println("ingrese el valor para el indice: " + i);
                numeros[i] = escribir.nextInt();
            }

            System.out.println("los valores ingresados son: ");
            for(int i = 0; i<numeros.length;i++){
                System.out.println("indice: " + i + " numero: " + numeros[i]);

            }

    }
}
