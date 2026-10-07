/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio15;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2; //Declaro variables
        Scanner entrada = new Scanner (System.in); //Creo un nuevo Scanner
        
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar:"); //ido un factor
        num1=entrada.nextInt();
        
        for(num2=0; num2<=10; num2++) { //Declaro cuantas veces se debe hacer
            System.out.println(num1+" x "+num2+" = "+(num1*num2)); //Doy resultado
            
            
            
        }
        
        
        
    }
    
}
