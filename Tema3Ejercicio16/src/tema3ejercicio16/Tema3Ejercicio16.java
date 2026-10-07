/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio16;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, contador; //Declaro variables
        num=20; //Les doy valor
        contador=0;
        
        while (num<=160){ //Pongo un bucle con la condición que se nos pide
            if (num%2==1){
                System.out.println(num);
                contador++;
            }
            num++;
            
        } 
        System.out.println("La cantidad de números impares impresos han sido: "+contador); //Muestro resultado
    }
    
}
