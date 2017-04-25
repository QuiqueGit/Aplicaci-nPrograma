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
public class ejer5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int posini = 0;
        String frase;
     //   char espacio = ' ';
                
        System.out.println("Introduce frase: ");
        frase = teclado.nextLine();
        while(frase.isEmpty()) {
            System.out.println("Error. Introduce frase: ");
            frase = teclado.nextLine();
        }
        frase += " ";
        
        int posfin = frase.indexOf(" ");
        while (posfin != -1) {
            String trozo = frase.substring(posini, posfin);
            int letras = trozo.length();
            System.out.println(trozo + "\t" + letras);
            
            posini = posfin + 1;
            posfin = frase.indexOf(" ", posfin + 1);//  posfin+1 no es posini ?            
        }           
    }  
}