/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana4;

import java.util.Scanner;

/**
 *
 * @author CARLOS
 */
public class EJ3 {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int [][] matriz= new int [10][10];
        int []sumaFilas= new int [10];
        int total =0;
        
        
        for (int i=0; i < matriz.length;i++){
            for(int j=0;j < matriz.length;j++){
                int k= (int)(Math.random()*10 +1);
                System.out.println("Ingrese el valor de la poscion :["+i+"]["+j+"]=" +k);
                matriz [i][j]=k;
                sumaFilas[i]+=matriz [i][j];
            }             
        }
        for (int i =0; i< matriz.length;i++){
            System.out.println("La suma de filas"+i+"es :" +sumaFilas [i]);
            total += sumaFilas [i];
        }
        System.out.println("La suma toatal de filas es :" +total);
    }
}
