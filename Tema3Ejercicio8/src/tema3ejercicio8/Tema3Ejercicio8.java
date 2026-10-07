/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int total, euros, billetes50, billetes20, billetes10, monedas2, monedas1; //Creo todas las variables necesarias
        
        Scanner entrada = new Scanner (System.in); //Creo un nuevo Scanner
        
        System.out.println("Por favor, indique una cantidad de dinero");
        
        euros=entrada.nextInt();
        
        total=euros;
        
        billetes50=euros/50;
        euros=euros%50;
                
        billetes20=euros/20;
        euros=euros%20;
                
        billetes10=euros/10;
        euros=euros%10;
                
        monedas2=euros/2;
        euros=euros%2;
        
        monedas1=euros;
        
        if (billetes50 == 0) {
            System.out.println(total+" Euros se descomponen en "+billetes20+" billetes de 20, "+billetes10+" billetes de 10, "+monedas2+" monedas de 2 euros y "+monedas1+" monedas de 1 euro.");
        } else if (billetes20 == 0) {
            System.out.println(total+" Euros se descomponen en "+billetes50+" billetes de 50, "+billetes10+" billetes de 10, "+monedas2+" monedas de 2 euros y "+monedas1+" monedas de 1 euro.");
        } else if (billetes10 == 0) {
            System.out.println(total+" Euros se descomponen en "+billetes50+" billetes de 50, "+billetes20+" billetes de 20, "+monedas2+" monedas de 2 euros y "+monedas1+" monedas de 1 euro.");
        } else if (monedas2 == 0) {
            System.out.println(total+" Euros se descomponen en "+billetes50+" billetes de 50, "+billetes20+" billetes de 20, "+billetes10+" billetes de 10 y "+monedas1+" monedas de 1 euro.");
        } else if (monedas1 == 0) {
            System.out.println(total+" Euros se descomponen en "+billetes50+" billetes de 50, "+billetes20+" billetes de 20, "+billetes10+" billetes de 10 y "+monedas2+" monedas de 2 euros");
        } else {
            System.out.println(total+" Euros se descomponen en "+billetes50+" billetes de 50, "+billetes20+" billetes de 20, "+billetes10+" billetes de 10, "+monedas2+" monedas de 2 euros y "+monedas1+" monedas de 1 euro.");
        } 
        
        
       
    
    
}
