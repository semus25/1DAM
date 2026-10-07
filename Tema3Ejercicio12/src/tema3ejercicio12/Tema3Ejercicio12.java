/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio12;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num; //Declaro variable
        num=11; //Le doy valor
        
        do { //Hasta que se cumpla la condición, se repite
            if (num%2==0){ 
                System.out.println(num); //Doy resultado
            }
            num++;
        } while (num<=133);
    }
    
}
