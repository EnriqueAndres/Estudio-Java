package Arrays.ejerciciosArrays;

import java.util.Scanner;

public class ejercicioDos {
    
    /*
        Realizar un programa que permita la carga de 10 números en un vector. 
        Una vez cargados, se necesita que el programa determine cual es el mayor 
        y cual es el menor de ellos.
    */

    public static void main(String[] args) {
        
        int numeros[] = new int[10];
        Scanner escribirNumero = new Scanner(System.in);

        
        //carga de numero
        for(int i = 0;i<10;i++){
            System.out.println("ingresa el valor para el indice: "+i);
            numeros[i] = escribirNumero.nextInt();
        }

        //recorrido
        for(int i=0;i<numeros.length;i++){
            System.out.println("indice: "+ i + " valor: " + numeros[i]);
        }

       
        //Integer es una clase envolvente que tiene constantes para el valor minimo y maximo de un entero, asi podemos usar esas constantes para comparar los numeros ingresados
        // que es una clase envolvente: que tiene constantes para el valor minimo y maximo de un entero, asi podemos usar esas constantes para comparar los numeros ingresados
        // que es una constante: un valor que no cambia, en este caso el valor minimo y maximo de un entero, que son valores fijos definidos por la clase Integer


         //busqueda del mayor
        int mayor = Integer.MIN_VALUE; //min_value es el valor mas bajo que puede tener un entero, asi cualquier numero ingresado va a ser mayor a este
            for(int i=0;i<10;i++){
                if(numeros[i] > mayor){
                    mayor = numeros[i];
                }
            }
        int menor = Integer.MAX_VALUE; //max_value es el valor mas alto que puede tener un entero, asi cualquier numero ingresado va a ser menor a este
            for(int i=0;i<10;i++){
                if(numeros[i] < menor){
                    menor = numeros[i];
                }
            }
        

        System.out.println("el mayor es: "+ mayor);
        System.out.println("El menor número es: " + menor);

    }

}
