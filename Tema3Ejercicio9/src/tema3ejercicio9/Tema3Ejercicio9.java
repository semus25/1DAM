/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedimos los cuatro números
        System.out.print("Por favor, introduzca el primer numero: ");
        int num1 = teclado.nextInt();

        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = teclado.nextInt();

        System.out.print("Introduzca el tercer numero: ");
        int num3 = teclado.nextInt();

        System.out.print("Por ultimo, introduzca un cuarto numero: ");
        int num4 = teclado.nextInt();

        // Ordenamos los números de menor a mayor
        int aux;

        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }

        if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }

        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }

        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        // Mostramos los números ordenados
        System.out.println("El orden de los numeros introducidos es el "
                + num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }
    
}
