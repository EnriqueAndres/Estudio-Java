package bucles.ejercicioPractica;

import java.util.Scanner;

/*el programas debe solicitar por teclado dos datos:
- la patente del vehiculo
- el tipo de estacionamiento

los tipo de estcionamientos son 3:
1. por hora (cuyo valor es de $3 por hora)
2. media jornada (cuyo valor es de $15  y posee 5% de descuento sobre el valor total) 5 horas
3. jornada completa (cuyo valor fijo es de $30 y posee 10% de descuento) 10 horas

el programa debe calcular el monto a pagar para cada cliennt en cundion del tipo de estacionamiento seleccionado. La carga de datos debe continuar hasta que el usuario ingrese la palabra "Fin" en lugar de la patente.

al finalizar el programa debe mostrar por pantalla:
- la cantidad total de estacionamientos por hora
- la cantidad total de estacionamientos de media jornada
- la cantidad total de estacionamientos de jornada completa
- la suma total de ingresos en usd $ que hubo durante el dia
 */

public class estacionamientoEjercicio {
    
    public static void main(String[] args) {
        
        String patente;
        Scanner escribir = new Scanner(System.in);
        Scanner escribirNumeroEsta = new Scanner(System.in);
        int tipoEstacionamiento;
        double mediaJornada = 15;
        double jornadaCompleta = 30;
        double montoAcumulado = 0;
        int estaPorHora = 0;
        int estaPorMediaJornada = 0;
        int estaPorJornadaCompleta = 0;

        System.out.println("digame su patente: ");
        patente = escribir.nextLine();

        while (!patente.equalsIgnoreCase("fin")) {
            int horas;
            double descuento;
            double descuentoJc;
            
            System.out.println("cuantas horas estara?: ");
            tipoEstacionamiento = escribirNumeroEsta.nextInt();

            if(tipoEstacionamiento != 5 && tipoEstacionamiento != 10){
                
                System.out.println("se le cobrara por hora $3");
                horas = tipoEstacionamiento * 3;
                System.out.println("total seran de: " + horas);

                estaPorHora ++;
                montoAcumulado += horas;

                System.out.println("ingrese su patente: ");
                patente = escribir.nextLine();

                
            }else{
                if(tipoEstacionamiento == 5){
                    
                    System.out.println("ha escogido media jornada, tiene un valor de $15 y con un descuento de %5");

                    descuento = mediaJornada * 0.05;
                    double descuentoMj = mediaJornada - descuento;

                    System.out.println("tiene un descuento de: " + descuento);
                    System.out.println("se le cobra:" + descuentoMj);

                    estaPorMediaJornada ++;
                    montoAcumulado += descuentoMj;
                    // ----------------------------------------

                    
                
                }if(tipoEstacionamiento == 10){
                        System.out.println("ha escogido jornada completa, tiene un valor de $30 usd y con un descuento de 10%");

                        descuento = jornadaCompleta * 0.10;
                        descuentoJc = jornadaCompleta - descuento;

                         System.out.println("tiene un descuento de: " + descuento);
                         System.out.println("se le cobra: " + descuentoJc);

                         estaPorJornadaCompleta ++;
                         montoAcumulado += descuentoJc;

                }

            System.out.println("ingrese su patente: ");
            patente = escribir.nextLine();
            }


        }
        System.out.println("Total estacionamientos por hora: " + estaPorHora);
        System.out.println("Total estacionamientos por media jornada: " + estaPorMediaJornada);
        System.out.println("Total estacionamiento por jorndad completa: " + estaPorJornadaCompleta);
        System.out.println("el monto total es de: " + montoAcumulado);




    }

}
