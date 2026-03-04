package Ejercicios.Basico.Nivel_uno;

import java.util.Scanner;

public class variableOperadorCondicional {

    /*
    Calculadora básica: Pide dos números y una operación (+, -, *, /) al usuario e imprime el resultado.
    Par o impar: Lee un número y di si es par, impar, y si además es positivo o negativo.
    Mayor de tres: Dados 3 números, imprime cuál es el mayor.
    Calculadora de IMC: Pide peso y altura, calcula el IMC e imprime la categoría (bajo peso, normal, sobrepeso, obesidad)
    */

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su primer número: ");
        double numeroUno = teclado.nextDouble();

        System.out.println("Ingrese su segundo número: ");
        double numeroDos = teclado.nextDouble();

        System.out.println("¿Qué operación desea?\n 1.Multiplicar\n 2.Dividir\n 3.Sumar\n 4.Restar");
        int opcion = teclado.nextInt();

        if (opcion == 1) {
            System.out.println("Resultado: " + (numeroUno * numeroDos));
        } else if (opcion == 2) {
            if (numeroDos == 0) {
                System.out.println("Error: no se puede dividir entre cero.");
            } else {
                System.out.println("Resultado: " + (numeroUno / numeroDos));
            }
        } else if (opcion == 3) {
            System.out.println("Resultado: " + (numeroUno + numeroDos));
        } else if (opcion == 4) {
            System.out.println("Resultado: " + (numeroUno - numeroDos));
        } else {
            System.out.println("Opción no válida.");
        }

        teclado.close();

        

        /* 
        int numeroUno , numeroDos, opcion;
        int sumar,multiplicar,dividir,restar;
        Scanner tecladoUno = new Scanner(System.in);
        Scanner tecladoDos = new Scanner(System.in);
        Scanner escribirOpcion = new Scanner(System.in);

        
        System.out.println("ingrese su primer numero: ");
        numeroUno = tecladoUno.nextInt();
        System.out.println("Ingerese su segundo Numero: ");
        numeroDos = tecladoDos.nextInt();

        System.out.println("Que operacion desea?\n 1.multiplicar\n 2.Dividir\n 3.sumar \n 4.restar");
        opcion = escribirOpcion.nextInt();

        if(opcion == 1){
            multiplicar = numeroUno * numeroDos;
            System.out.println("Resultado: " + multiplicar); 
        }else{
            if(opcion == 2){
                dividir = numeroUno / numeroDos;
                System.out.println("Resultado: " + dividir);
            }else{
                if(opcion == 3){
                    sumar = numeroUno + numeroDos;
                    System.out.println("Resultado: " + sumar);
                }else{
                    restar = numeroUno - numeroDos;
                    System.out.println("Resultado: "+ restar);
                }
                   
            }
        }*/ 
        
    }
    
}
