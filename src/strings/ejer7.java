/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
       
     // frase= leeCadena():
     //quitaEspacios(frase);
        
        
        
        Scanner teclado = new Scanner (System.in);
        String frase, fraseSinEspacios ="";
        
        System.out.println("Introduce frase: ");
        frase = teclado.nextLine();
        while (frase.isEmpty()){
            System.out.println("Por favor, introduce frase: ");
            frase = teclado.nextLine();            
        }
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' '){
                fraseSinEspacios += frase.charAt(i);               
            }            
        }
        System.out.println(fraseSinEspacios); 
    }  
}
