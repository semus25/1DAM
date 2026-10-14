/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio24;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i, contador, numero;

        // Pedir un numero mayor que 0
        do {
            System.out.print("Introduce un numero mayor que 0: ");
            numero = entrada.nextInt();

            if (numero <= 0) {
                System.out.println("Error: el numero debe ser mayor que 0.");
            }
        } while (numero <= 0);

        contador = 0;

        // Mostrar los multiplos de 3
        System.out.println("Multiplos de 3 entre 1 y " + numero + ":");

        for (i=1; i <= numero; i++) {
            if (i%3==0) {
                System.out.println(i);
                contador++;
            }
        }

        // Mostrar el total de numeros
        System.out.println("Total de multiplos mostrados: " + contador);

        
    }
    
}
