package Arrays.ejerciciosArrays;

import java.util.Scanner;

public class ejercicioCuatro {


    /*
        Un empleado desea almacenar en un vector sus 12 sueldos del año. 
        A partir de esto, necesita un programa que determine y muestre por pantalla
        la suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.
    */
        public static void main(String[] args) {
            
            int sueldos[] = new int[12];
            Scanner ingresar = new Scanner(System.in);

            int sumaSueldos = 0;
            double promedio = 0;

            
            for(int i=0;i<12;i++){
                System.out.println("Ingresa tu sueldo de este mes " + (i+1));
                sueldos[i] = ingresar.nextInt();             
                sumaSueldos = sumaSueldos + sueldos[i];  
            }
            
            //promedio
            promedio = sumaSueldos/sueldos.length;
            System.out.println("tu sueldo total acumulado es de : " + sumaSueldos);
            System.out.println("el promedo de tu sueldo de los 12 meses es de : " + promedio);

            // para corregir deberia ser double en las variables.
        }


}
