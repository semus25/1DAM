/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio23;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, contador; //Declaro variable
        Scanner entrada = new Scanner(System.in);
        do {        //Pido número
            System.out.println("Introduce un número");
            x=entrada.nextInt();
        } while(x<=1);
       
               for(contador=1; contador<=x; contador++){ //Pongo el bucle con la condición
                   System.out.println(contador);
                } 
            }
            
            
    
    }
    

    
