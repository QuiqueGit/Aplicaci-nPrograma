package Strings;

import java.util.Scanner;

public class ejer2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        char caracter;
        int num;
        System.out.println("Introduce una frase: ");
        frase = teclado.nextLine();
        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();
          while (num < 0 || num > frase.length() - 1) {
            System.out.println("Error. Posición incorrecta");
            System.out.println("Introduce un numero: ");
            num = teclado.nextInt();
        }

        if (frase.length()
                - 1 < num || num < 0) {
            System.out.println("Error. Ese caracter no existe.");
        } else {
            caracter = frase.charAt(num);
            System.out.println("El caracter en la posición " + num + " es: " + caracter);
        }
    }
}
