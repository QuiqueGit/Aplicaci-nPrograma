/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class ejer6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int posfin = 0, cont = 0, p;
        String nombre, nom = "";
        //      char esp = ' ';

        System.out.println("Introduce tu nombre completo: ");
        nombre = teclado.nextLine();
        while (nombre.isEmpty()) {
            System.out.println("Por favor, introduce tu nombre completo: ");
            nombre = teclado.nextLine();
        }
        nombre = nombre.toUpperCase();
        Ejer3 ejer3 = new Ejer3();
        cont = ejer3.cuentaPalabras(nombre);
        // comprueba que el nombre sea  compuesto 
        if (cont > 2) {
            cont= nombre.indexOf(" ");
            nom = nom + nombre.charAt(0) + nombre.charAt(cont + 1);
            System.out.print(nom + ".");
            p=cont+1;
            //         System.out.print(".");
        } else {
            System.out.print(nombre.charAt(0) + ".");
            p=2;
        }
        for (int i = p; i < nombre.length(); i++) {
            if (nombre.charAt(i) == ' ') {
                System.out.print(nombre.charAt(i + 1));
                System.out.print(".");
            }
        }
    }
}
