/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Palindromo;

import java.util.Scanner;

/**
 *
 * @author Pedro Blanco
 */
public class palindromo {
    
    public void pal (){
    // Crear un objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);
    
    // Leer una línea de entrada del usuario y convertirla a minúsculas
    String palabra = scanner.nextLine().toLowerCase().replace(" ", "");
    
    // Inicializar una cadena vacía para almacenar la versión invertida de la palabra
    String invertido = "";
    
    // Declarar una variable de tipo char para almacenar caracteres temporales
    char auxiliar;
    
    // Iterar a través de la palabra desde el último carácter hasta el primero
    for (int i = palabra.length() - 1; i >= 0; i--) {
        // Obtener el carácter en la posición actual
        auxiliar = palabra.charAt(i);
        
        // Agregar el carácter actual a la cadena invertida
        invertido = invertido + auxiliar;
    }
    
    // Comprobar si la palabra original es igual a la palabra invertida
    if (palabra.equals(invertido)) {
        System.out.println("Es un palíndromo"); // Imprimir si es un palíndromo
    } else {
        System.out.println("No es un palíndromo"); // Imprimir si no es un palíndromo
    }
    
    }
    
    
    
    
    
}
