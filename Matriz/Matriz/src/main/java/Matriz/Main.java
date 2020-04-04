/*Zavala Concha Silvia Nallely 2S11 TESOEM Turno Matutino*/
package Matriz;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Escriba un valor entero");
     int n =sc.nextInt();
     int matriz [ ][ ]= new int [n][n];
      int valor =0;
      for (int fila = 0; fila < n ; fila ++){
          for (int columna=0;columna<n;columna++){
              if(fila==columna){
                  valor++;
                  matriz [fila] [columna]=valor;
              }
          }
      }
     for (int fila = 0; fila < n ; fila++){
          for (int columna=0;columna<n;columna++){
             
                  System.out.print (matriz [fila] [columna]+"\t");
              }
          System.out.println(" ");
          }
      }
    }
    