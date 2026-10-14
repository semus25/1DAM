/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio26;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, suma = 0;

        for (i = 111; i <= 222; i++) {
            if (i % 2 != 0) {
                suma = suma + i;
            }
        }

        System.out.println("La suma total de los numeros impares entre 111 y 222 es: " + suma);
    }
    
}
