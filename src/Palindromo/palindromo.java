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
    Scanner scanner = new Scanner (System.in);
    
    String palabra = scanner.nextLine().toLowerCase().replace(" ", "");
    
    String invertido = "";
    
    char auxiliar;
        
    
        for (int i = palabra.length()-1; i>=0;i--) {
            auxiliar = palabra.charAt(i);
            
            invertido = invertido + auxiliar;
        }
    
        if (palabra.equals(invertido)) {
            System.out.println("es palindromo");
        }
        else{
            System.out.println("No es palindromo");
        }
    
    }
    
    
    
    
    
}
