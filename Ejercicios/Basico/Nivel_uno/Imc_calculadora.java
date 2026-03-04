package Ejercicios.Basico.Nivel_uno;

import java.util.Scanner;

public class Imc_calculadora {

    public static void main(String[] args) {
     
        Scanner escribir = new Scanner(System.in);

        System.out.println("ingrese su peso: ");
        double peso = escribir.nextDouble();

        System.out.println("ingrese su altura: ");
        double altura = escribir.nextDouble();

        double imc = peso / (altura * altura);
        
        if (imc < 18.5) {
            System.out.printf("Bajo peso imc de: %.2f%n",imc);
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Obesidad grado 1");
        } else if (imc < 40) {
            System.out.println("Obesidad grado 2");
        } else {
            System.out.println("Obesidad grado 3");
        }

    }
    
}
