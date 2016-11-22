/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author Quique
 */
public class ejer1 {
    static Scanner sc = new Scanner (System.in);
    public static void main (String[]args){
        //Empezamos con un main, donde pedimos la oracion y la palabra, y añadimos el directorio de un método
        String oracion, palabra, pal;
        int numeroDeVeces = 0, contador = 0;
       
        System.out.println("Introduce una oración:");
        oracion = sc.nextLine();
        System.out.println("Indica que palabra quieres contar:");
        palabra = sc.nextLine();
        oracion = oracion.toLowerCase();
        palabra = palabra.toLowerCase();
        if (oracion.startsWith(palabra) == true){
            contador ++;
        }       
        if (oracion.endsWith(palabra + ".") == true){
            contador ++;
        }
        pal = " " + palabra + " ";
        
        numeroDeVeces = cuentaPalabras(oracion, pal);
        contador = contador + numeroDeVeces;
        
        if (contador == 1){
        System.out.println("La palabra " + palabra + " aparece " + contador + " vez en la oración");
        }
        else{
            System.out.println("La palabra " + palabra + " aparece " + contador + " veces en la oración");
        }
    }
        //Empezamos un método cuentaPalabras, que será el que realize la operación
    public static int cuentaPalabras (String oracion, String pal){
            int posicion, contador = 0;
        //Uso el string indexOf para que busque la 1º posición dónde aparece, o -1 si no la encuentra
        posicion = oracion.indexOf(pal);
        //Mientras que la encuentre, que las vaya contando
        while (posicion != -1){
            contador ++;
            
        //Sigue buscando a partir de la 1º posición
            posicion = oracion.indexOf(pal, posicion + 1);
        }
        //Te devuelve el valor
        return contador;
    }
}
