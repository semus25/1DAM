/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio25;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, suma = 0;

        for (i = 17; i <= 139; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            }
        }

        System.out.println("La suma total de los numeros pares entre 17 y 139 es: " + suma);
    }
    
}
