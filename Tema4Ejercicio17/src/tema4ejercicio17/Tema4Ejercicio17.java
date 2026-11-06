/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio17;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int letra = generarLetra (); //Declaro las variables convenientes
        int intento;
        int contador = 0;
        do { //Hago un do while, pues mínimo se ejecuta una vez
            intento = pedirLetra ();
            
            if (intento<letra){ //Damos las pistas según todo lo que nos pidan
                System.out.println("La letra está después en el abecedario"); 
                contador++;
            } else if (intento>letra) {
                System.out.println("La letra está antes en el abecedario");
                contador++;
            } else {
                contador++;
                System.out.println("Correcto. Número de intentos necesarios: "+contador);
            }
            
            
        } while (letra != intento);    
    }
    
    public static char generarLetra() { //Generamos una letra mayúscula vía ASCII
        char letra;
        letra = (char) ((Math.random() * 26) + 65);
        return letra;
    }
    
    public static char pedirLetra (){ //Pedimos la letra mayúscula
        Scanner entrada = new Scanner(System.in); //Creo Scanner
        System.out.println("Introduce una letra mayúscula");
        char intento = entrada.nextLine().charAt(0);
        return intento;
    }
}