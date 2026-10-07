/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio22;

import java.util.Scanner; //Importamos Scanner

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado, area, perimetro; //Declaramos variables
        
        Scanner entrada = new Scanner (System.in); //Creo un nuevo Scanner
        
        System.out.println("Por favor, introduzca la medida de un lado "); //Hago que el usuario me facilite un número
        
        lado=entrada.nextDouble();
        area=lado*lado*1.732/4;
        perimetro=lado*3;
        
        System.out.println("El área de un triángulo de lado: "+lado+" es: "+area+"\nEl perímetro de un triangulo de lado: "+lado+" es: "+perimetro2);
        
        
    }
    
}
