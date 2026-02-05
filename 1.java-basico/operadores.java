import java.util.Scanner;

public class operadores {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double num1, num2;

        System.out.println("ingrese el primer numero: ");
        num1 = teclado.nextDouble();
        System.out.println("ingrese el segundo numero: ");
        num2 = teclado.nextDouble();

        double suma = num1 + num2;

        System.out.println("La suma es : " + suma);

    }

}
