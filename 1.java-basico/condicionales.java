import java.util.Scanner;

public class condicionales {

    
   /*  public static void main(String[] args) {
        
        int edad;
        Scanner escribir = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = escribir.nextInt();

        if (edad >= 18) {
            System.out.println("eres mayor de edad");

        }
        else {
            System.out.println("eres menor de edad");
        }

        System.out.println("Programa finalizado");


    }*/
    // condicional multiple

    public static void main(String[] args) {
        Scanner escribir = new Scanner(System.in);
        int edad;

        System.out.println("Ingreda tu edad: ");
        edad = escribir.nextInt();

        if (edad > 18){
            System.out.println("eres mayor de edad");

            if(edad > 40){
                System.out.println("eres mayor de 40");
            }
            else{

                System.out.println("eres mayor");
            }
        }
        else{
            System.out.println("eres menor de edad");
        }
    }

}




