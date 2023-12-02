/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas.melany;

import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class T2_Dibujo {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); 
        
        int n;
        
        System.out.print("Ingrese N: ");
        n=sc.nextInt();
        
        String[][] matriz = new String [n][n];
        
     
        
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i==0||i==n-1) {
                    System.out.print("*");
                }
                else if(j==0||j==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
