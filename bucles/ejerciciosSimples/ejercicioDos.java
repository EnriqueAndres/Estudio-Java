package bucles.ejerciciosSimples;

import java.util.Scanner;

public class ejercicioDos {
    
    // programa que dado por un teclaado un limete numerico(por ejemplo 100) muestre en pantalla todos los numeros hasta ese limite(empezando por 1)
    public static void main(String[] args) {
        
        int numeroMaximo;
        Scanner teclado = new Scanner(System.in);


        System.out.println("ingrese el numero hasta donde quiere que llegue el bucle: ");
        numeroMaximo = teclado.nextInt();

        System.out.println("tu numero maximo es: " + numeroMaximo);
        for(int contador = 1; contador < numeroMaximo+1; contador++){
            System.out.println("Numero actual: " + contador);
        }

    }

}
