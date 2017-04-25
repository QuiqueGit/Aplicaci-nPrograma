/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

public class ejer4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0, posicion;
        String frase;
        char caracter;

        System.out.println("Introduce la frase: ");
        frase = teclado.nextLine();
       
        while (frase.isEmpty()) {
            System.out.println("Escribe una frase: ");
            frase = teclado.nextLine();
        }
      frase = frase.toLowerCase(); // Mejor cuando salga del while, asi lo hará siempre
        
  //      posicion = frase.indexOf(0);

        for (int i = 0; i < frase.length(); i++) {

     //       if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
     //           cont++;
                switch (frase.charAt(i)) {
                    case 'a':
                        cont++;
                        break;
                    case 'e':
                        cont++;
                        break;
                    case 'i':
                        cont++;
                        break;
                    case 'o':
                        cont++;
                        break;
                    case 'u':
                        cont++;
                        break;    
                }
            }
        
        System.out.println("El número de vocales es: " + cont);
    }
}
