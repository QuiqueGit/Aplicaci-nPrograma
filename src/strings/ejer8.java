/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String frase, fraseInvertida="";
        
        System.out.println("Introduce frase: ");
        frase = teclado.nextLine();
        while (frase.isEmpty()){
            System.out.println("Por favor, introduce frase: ");
            frase = teclado.nextLine();            
        }
        
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida+frase.charAt(i);
        }
        System.out.println(fraseInvertida);      
    }
        
    
}
