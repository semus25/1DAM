/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio16;

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int euros, billetes50, billetes10; //declaro las variables
        
        euros=130; //Le doy valor a euros
        
        billetes50=euros/50; //Calculo el mínimo de billetes de 50
        
        billetes10=(euros%50)/10; //Quitando lo ya calculado, calculo el mínimo de billetes de 10
        
        System.out.println(euros+" euros hacen un total de: "+billetes50+" billetes de 50 y "+billetes10+" billetes de 10");
    }
    
}
