/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero; //Declaro variables necesarias en el main
        boolean valido;

        do {
            numero = pedirNumero(); //Invocamos los métodos que declaramos posteriormente
            valido = esMayorQueCero(numero);
            if (!valido) { //Con un bucle aseguramos que el número sea mayor que cero
                System.out.println("ERROR: el numero debe ser mayor que 0. Intentelo de nuevo.");
            }
        } while (!valido);

        mostrarMultiplosDeTres(numero); //Invoco al método para mostar todo
    }
    
    public static int pedirNumero() { //Con este método, pedimos el número
        int numero;
        Scanner entrada = new Scanner(System.in); //Invoco Scanner
        System.out.print("Por favor, introduzca un numero mayor que 0: ");
        numero = entrada.nextInt();
        return numero;
    }
    
    public static boolean esMayorQueCero(int numero) { //Devuelvo un booleano para que siempre sea mayor que cero
        return numero > 0;
    }
    
    public static void mostrarMultiplosDeTres(int limite) { 
        int contador = 0; //Creo el contador

        System.out.println("Los multiplos de 3 entre 1 y " + limite + " son:"); 
        for (int i = 1; i <= limite; i++) { //Creo el bucle for para mostrar todo
            if (i % 3 == 0) {
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("Se han mostrado " + contador + " numeros."); //Mostramos por pantalla el resultado
    }
    
}
