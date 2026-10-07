/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio18;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contrasenna = 1234; //Declaro variables
        int numero;
        int intentos = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Introduce la contraseña:"); //Pido un número, que debe ser la contraseña
            numero = entrada.nextInt();

            if (numero == contrasenna) {
                System.out.println("Acceso permitido."); //Es correcta, doy acceso
            } else {
                intentos++;
                System.out.println("Error."); //Incorrecta, pido de nuevo
            }

        } while (numero != contrasenna && intentos < 3); //Si no la acierta en tres intentos, deniego acceso

        if (numero != contrasenna) {
            System.out.println("Acceso denegado.");
        }
        
        
    }
    
}
