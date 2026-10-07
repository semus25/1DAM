/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio13;

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2; //Declaro las dos variables
        int intermedio; //Declaro una extra para que haga de puente
        
        num1=1; //Les doy sus valores originales
        num2=2;
        
        System.out.println("La variable num1 contiene el valor "+num1+" y la variable num2 el valor "+num2);
        
        intermedio=num1; //Hago que el contenido de la variable 1 pase al intermedio
        num1=num2; //Hago que el contenido de la variable 2 pase a la variable1
        num2=intermedio; //Hago que el contenido del intermedio pase a la variable 2
        
        System.out.println("Ahora la variable num1 contiene el valor "+num1+" y la variable num2 el valor "+num2);
                
                
        
    }
    
}
