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
public class T3_Contiene {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); 
        
    
        int [][] matriz1 = {{1,2,3,4,5,6,7,8,9,0},
            {1,2,3,4,5,6,7,8,9,0},
            {1,2,3,4,5,6,7,8,9,0},
        {1,2,3,4,5,6,7,8,9,0},
            {1,2,3,4,5,6,7,8,9,0},
        {1,2,3,4,5,6,7,8,9,0},
            {1,2,3,4,5,6,7,8,9,0},
        {1,2,3,4,5,6,7,8,9,0},
            {1,2,3,4,5,6,7,8,9,0},
        {1,2,3,4,5,6,7,8,9,0}};
        
        int [][] matriz2 = {{1,2,3},{1,2,3},{1,2,3}};
        
        imprimir(matriz1);
        System.out.println("--------------------");
        imprimir(matriz2);
       System.out.println("--------------------");
        existeMatriz(matriz1, matriz2);
    } 
    
    public static void imprimir(int matriz[][]){
        
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[0].length; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    } 
    
    public static void existeMatriz(int m1[][],int m2[][]){
        int n=0;
        int m=0;
       
        for (int i=0; i<m1.length; i++){
            for (int j=0; j<m1[0].length; j++){
                if(m1[i][j]==m2[0][0]){
                    if(m1[i][j]==m2[n][m]){
                        System.out.print("*");
                        break;
                    }
                    m++;
                }
                
                
            }
            System.out.println("");
        }
    
    }
    
    
}
