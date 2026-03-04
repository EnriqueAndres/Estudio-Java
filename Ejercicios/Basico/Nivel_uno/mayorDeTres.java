package Ejercicios.Basico.Nivel_uno;

import java.util.Scanner;

public class mayorDeTres {

    /* Mayor de tres: Dados 3 números, imprime cuál es el mayor.*/

    public static void main(String[] args) {

    int numeros [] = new int [3];
    
    Scanner escribir = new Scanner(System.in);

    int mayor = 0;

    for(int i = 0;i<numeros.length;i++){
        System.out.println("ingrese el numero: ");
        numeros[i] = escribir.nextInt();
        if(mayor < numeros[i]){
            mayor = numeros[i];
        }
    }
    System.out.println("el mayor es: " + mayor);

    /*
        Primero llenas el array/////
        for (int i = 0; i < numeros.length; i++) {
        System.out.println("Ingrese el número: ");
        numeros[i] = escribir.nextInt();
        }

        // Luego inicializas mayor con el primer elemento
        int mayor = numeros[0];

        // Y comparas desde el segundo
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
    */
        
    }
  
}
