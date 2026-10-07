/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner (System.in); //Creo un nuevo Scanner
        
        System.out.println("Por favor introduzca un número"); //Pido un dato al usuario
        num=entrada.nextInt();
        
        if (num>=0){    //Presentamos la condicional que determinará la salida final a través de la consola
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }
        
    }
    
}
