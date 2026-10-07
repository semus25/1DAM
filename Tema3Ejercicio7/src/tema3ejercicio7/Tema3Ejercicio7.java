/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diasemana; //Declaro las variables tanto enteras como booleanas
        boolean laborable = false;
        Scanner entrada = new Scanner(System.in); //Declaro el Scanner

        
        

        System.out.println("Introduce un día de la semana en su orden. Por ejemplo: Lunes es 1, Martes es 2... (1-7):"); //Le pido un día de la semana al usuario
        diasemana = entrada.nextInt();

        switch (diasemana) {
            case 1: 
            case 2:
            case 3:
            case 4:
            case 5:
                laborable = true;
                break;

            case 6:
            case 7:
                laborable = false;
        }

        System.out.println("¿Es laborable? " + laborable);
    }
    
}
