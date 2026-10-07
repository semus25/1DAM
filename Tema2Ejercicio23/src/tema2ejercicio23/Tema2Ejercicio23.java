/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio23;

import java.util.Scanner; //Importo la utilidad Scanner

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio; //Declaro la variable del precio y las unidades
        int unidades;
        
        Scanner entrada = new Scanner (System.in); //Creo un nuevo Scanner
        
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar "); //Hago que el usuario me facilite un número
        
        precio=entrada.nextDouble(); //Hago que la variable obtenga el valor de lo último introducido por el usuario
        
        System.out.println("¿Cuántas unidades quiere llevarse?"); //Le pedimos otro número al usuario
        
        unidades=entrada.nextInt(); //Hago que la variable obtenga el valor de lo último introducido por el usuario
        
        precio=precio*unidades; //Hago la operación necesaria para el resultado
        
        System.out.println("El precio total de su compra: "+precio+" euros"); //Muestro resultado
        
        
    }
    
}
