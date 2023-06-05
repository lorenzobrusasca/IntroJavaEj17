/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej17;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/
    
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in);
        int cuenta1D = 0;
        int cuenta2D = 0;
        int cuenta3D = 0;
        int cuenta4D = 0;
        int cuenta5D = 0;
        
        
        
        
       int [] vector = new int [5];
       
        System.out.println("Ingrese 5 números para comprobar");
        for (int i = 0; i < 5; i++) {
            vector[i] = leer.nextInt();
        }
        
        
        
        for (int i = 0; i < 5; i++) {
           
           String numeroString = String.valueOf(vector[i]);
           int digitos = numeroString.length();
           
           switch (digitos){
               case 1:  cuenta1D = cuenta1D +1;
               break;
               case 2:  cuenta2D = cuenta2D +1;
               break;
               case 3:  cuenta3D = cuenta3D +1;
               break;
               case 4:  cuenta4D = cuenta4D +1;
               break;
               case 5:  cuenta5D = cuenta5D +1;
               break;
               
           }    
            
        }
        
             System.out.println("Ingresó "+cuenta1D+" números de 1 dígito");
             System.out.println("Ingresó "+cuenta2D+" números de 2 dígitos");
             System.out.println("Ingresó "+cuenta3D+" números de 3 dígitos");
             System.out.println("Ingresó "+cuenta4D+" números de 4 dígitos");
             System.out.println("Ingresó "+cuenta5D+" números de 5 dígitos");
        
    }
    
}
