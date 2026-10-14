/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio29;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Generamos un número aleatorio entre 1 y 100
        int numero = (int) (Math.random() * 100) + 1;
        int intento;
        int contador = 0;

        // Pedimos al usuario que adivine el número
        do {
            System.out.print("Adivina el numero: ");
            intento = teclado.nextInt();
            contador++;

            // Indicamos si el número es mayor o menor
            if (intento < numero) {
                System.out.println("El numero es mayor");
            } else if (intento > numero) {
                System.out.println("El numero es menor");
            } else {
                System.out.println("¡Correcto! Has adivinado el numero.");
                System.out.println("Numero de intentos: " + contador);
            }

        } while (intento != numero);
    }
    
}
