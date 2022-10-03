/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.semana4;

import java.util.Scanner;

/**
 *
 * @author CARLOS
 */
public class Ej1 {

    public static void main(String[] args) {
       int [][] matriz=new int [10][10];
       int sumP=0,sumS=0,cont=9;
       Scanner sc=new Scanner(System.in);
    
       for (int i=0;i<10; i++){
           for(int j=0; j<10;j++) {
               System.out.print("Ingrese el numero en la posicion ("+i+")("+j+"):");
               matriz[i][j]=(int) (Math.random()*100);
               //matriz[i][j]=sc.nextInt();
               System.out.println(""+matriz[i][j]);
               if(i==j)
                   sumP=sumP+matriz[i][j];
               
           }
       }
               for (int i=0; i<10;i++) {
                   sumS=matriz [i][cont]+sumS;
                   cont--;
               }
               System.out.println("Diagonal principal :"+sumP);
               System.out.println("Diaginal Secundaria:"+sumS);
    }
}
