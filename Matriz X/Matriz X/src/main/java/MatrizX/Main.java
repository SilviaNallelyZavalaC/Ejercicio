/*Zavala Concha Silvia Nallely TESOEM 2S11 Turno Matutino */
package MatrizX;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        
        int i,j;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese las filas ");

        int n=teclado.nextInt();
        int y=n-1;
        System.out.println("Ingrese las columnas");

        int m=teclado.nextInt();

        String matriz [][]= new String [n][m];

        for( i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(i==j){
                    matriz[i][j]=" ";  
                }else{
                    matriz[i][j] = "x";
                }    
             }

            }
            for(j=0;j<m;j++){
                matriz[y][j]=" ";    
                y--;
           }

           for(i=0; i<n;i++){
            for(j=0;j<m;j++){
              System.out.print(" [ " + matriz[i][j] + "  ] ");
            }
            System.out.println();
         }
    }
    
}
