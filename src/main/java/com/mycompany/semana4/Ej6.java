/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author CARLOS
 */
public class Ej6 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int [][] matriz= new int [10][10];
        int [] sumaColumnas= new int [10];
        int total=0;   
        for (int i=0; i < matriz.length;i++){
            for(int j=0;j < matriz.length;j++){
                int k= (int)(Math.random()*10 +1);
                
                   System.out.println("Ingrese el valor de la poscion :["+i+"]["+j+"]=" +k);
                matriz [i][j]=k;
                if (j%2==1) {
                sumaColumnas[i]+=matriz [i][j];
                }
}
        }
        for (int i = 0;1 < matriz.length; i++){
         System.out.println(Arrays.toString(matriz[i]));
        }
        
int contadorcolumnas = 1;
 for (int i = 0; 1 < matriz.length; i++){
            if (i%2==1){
                
               System.out.println("Suma de la columna "+ contadorcolumnas +" es" + sumaColumnas [i]);
            total +=sumaColumnas [i];
        }
            contadorcolumnas++;
            
 }
           System.out.println("La suma total de las columnas pares es" +total);
    }
}
            
    