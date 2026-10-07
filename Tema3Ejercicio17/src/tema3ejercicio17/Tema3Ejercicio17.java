/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio17;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double resultado;
        Scanner entrada = new Scanner (System.in); //Creo un nuevo Scanner
        System.out.println("Introduce un número para calcular"); //Pido un factor
        resultado = entrada.nextDouble();
        if (resultado>0) { //Hago que sea positivo
            resultado = Math.sqrt(resultado);
            System.out.println(resultado);
        } else {
            while (resultado<0) { //Si no es positivo, da error
                System.out.println("Introduce un número para calcular");
                resultado = entrada.nextDouble();
            }
            resultado = Math.sqrt(resultado); //Muestro el resultado
            System.out.println(resultado);
        }
    }         
            
               
        
    
}
