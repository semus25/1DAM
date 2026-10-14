/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio27;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedimos los dos números
        System.out.print("Introduce el primer numero: ");
        double num1 = teclado.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = teclado.nextDouble();

        int opcion;

        // Mostramos el menú hasta que el usuario elija salir
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();

            // Realizamos la operación elegida
            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case 4:
                    // Controlamos la división entre cero
                    try {
                        if (num2 == 0) {
                            throw new ArithmeticException("No se puede dividir entre cero");
                        }
                        System.out.println("Resultado: " + (num1 / num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intentalo de nuevo.");
            }

        } while (opcion != 5);
    }
    
}
