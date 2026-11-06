/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio26;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Por favor, introduzca un numero entero: ");
        numero = entrada.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El numero " + numero + " es primo.");
        } else {
            System.out.println("El numero " + numero + " NO es primo.");
        }
    }
    
    //Un número es primo si solo es divisible por 1 y por sí mismo
    public static boolean esPrimo(int numero) {
        boolean primo = true;

        if (numero < 2) {
            primo = false; // 0, 1 y los negativos no son primos
        } else {
            // Se comprueba si tiene algún divisor a partir del 2
            for (int i = 2; i < numero && primo; i++) {
                if (numero % i == 0) {
                    primo = false;
                }
            }
        }
        return primo;
    }
}