/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio20;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4Ejercicio20 {
    
    //Soluciones guardadas como constantes
    public static final String RESPUESTA1 = "Madrid";
    public static final String RESPUESTA2 = "Colón";
    
    
    public static void main(String[] args) {
        int nota;

        System.out.println("EXAMEN DE CULTURA GENERAL");
        nota = pregunta1();
        nota = nota + pregunta2();
        mostrarNota(nota);
    }
    
    //Pregunta 1: devuelve 5 si acierta y 0 si falla
    public static int pregunta1() {
        Scanner entrada = new Scanner(System.in);
        int puntos = 0;

        System.out.print("1ª PREGUNTA: ¿Cuál es la capital de España?: ");
        String respuesta = entrada.nextLine();

        if (respuesta.equalsIgnoreCase(RESPUESTA1)) {
            System.out.println("Muy bien, respuesta correcta.");
            puntos = 5;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + RESPUESTA1);
        }
        return puntos;
    }
    
    //Pregunta 2: devuelve 5 si acierta y 0 si falla
    public static int pregunta2() {
        Scanner entrada = new Scanner(System.in);
        int puntos = 0;

        System.out.print("2ª PREGUNTA: ¿Quién descubrió América?: ");
        String respuesta = entrada.nextLine();

        if (respuesta.equalsIgnoreCase(RESPUESTA2)) {
            System.out.println("Muy bien, respuesta correcta.");
            puntos = 5;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + RESPUESTA2);
        }
        return puntos;
    }
    
    //Muestra la nota final
    public static void mostrarNota(int nota) {
        System.out.println("NOTA DEL EXAMEN: " + nota);
    }
    
    
}

