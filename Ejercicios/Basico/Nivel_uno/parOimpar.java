package Ejercicios.Basico.Nivel_uno;

import java.util.Scanner;

public class parOimpar {

    /*Par o impar: Lee un número y di si es par, impar, y si además es positivo o negativo.*/
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese un numero: ");
        int numero = teclado.nextInt();

        if(numero % 2 == 0){
            System.out.println("Su numero es par");
        }else{
            System.out.println("su numero es impar");
        }

        if(numero > 0){
            System.out.println("su numero es positivo");
        }else if (numero < 0){
            System.out.println("su numero es negativo");
        }else{
            System.out.println("su numero es cero");
        }
        teclado.close();
        
    }
    
}
