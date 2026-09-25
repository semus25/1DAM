/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio32;

import java.util.Scanner; //Importo la utilidad Scanner

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int euros, billetes50, billetes20, billetes10, billetes5, monedas2, monedas1; //Creo todas las variables necesarias
        
        Scanner entrada = new Scanner (System.in); //Creo un nuevo Scanner
        
        System.out.println("Por favor, indique una cantidad de dinero");
        
        euros=entrada.nextInt();
        
        billetes50=euros/50;
        billetes20=(euros-billetes50)/20;
        billetes10=(billetes50-billetes20)/10;
        billetes5=(billetes20-billetes10)/5;
        monedas2=(billetes10-billetes5)/2;
        monedas1=(billetes5-monedas2);
        
        System.out.println(euros+" Euros se descomponen en "+billetes50+" billetes de 50, "+billetes20+" billetes de 20, "+billetes10+" billetes de 10, "+billetes5+" billetes de 5, "+monedas2+" monedas de 2 euros y "+monedas1+" monedas de 1 euro.");
                
        
        
    }
    
}
