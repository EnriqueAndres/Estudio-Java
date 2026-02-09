import java.util.Scanner;

public class operadorTernario {
    public static void main(String[] args) {
        
        // programa que dependiendo del promedio de un alumno, nos diga si aprobo o no una materia

        // declaración de variables

        double promedio;
        String condicionFinal;
        Scanner teclado = new Scanner(System.in);

        // pedirle a usuario que ingrese el promedio por teclado
        System.out.println("ingrese el promedio del alumno");
        promedio = teclado.nextDouble();

        condicionFinal = promedio >= 4 ? "aprobado" : "reprobado";
        
        System.out.println("el alumno a: "+ condicionFinal + " El promedio fue: " + promedio);
    }
}
