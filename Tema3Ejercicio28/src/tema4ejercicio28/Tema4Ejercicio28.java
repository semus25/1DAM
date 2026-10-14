/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio28;

/**
 *
 * @author alumno
 */
public class Tema4Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generamos un número aleatorio entre 1 y 100
        int numero = (int) (Math.random() * 100) + 1;

        // Mostramos el número por pantalla
        System.out.println("Numero aleatorio: " + numero);

        // Comprobamos si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
    
}
