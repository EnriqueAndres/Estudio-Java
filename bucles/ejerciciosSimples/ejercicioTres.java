package bucles.ejerciciosSimples;

import java.util.Scanner;

public class ejercicioTres {
    
    //programa que muestre en pantalla palbras que sean ingresdas por teclado hasta que se ingrese la palabra "salir"
    public static void main(String[] args) {
        
        String palabra;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu palabra: ");
        //palabra = teclado.next(); // el next lee palabras solas no frases
        palabra = teclado.nextLine();// lee frases
        
        while (!palabra.equalsIgnoreCase("salir")) {
            System.out.println("tu palabra es: " + palabra);

            System.out.println("ingrese la palabra nueva: ");
            palabra = teclado.nextLine();

        }
        System.out.println("has salido del programa!!");
    }
}
