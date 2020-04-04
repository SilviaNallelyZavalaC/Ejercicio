/*Zavala Concha Silvia Nallely TESOEM 2S11 Turno Matutino */
package Cuadro;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner (System.in);
        int tamanio=0;
        System.out.println("tamano del cuadro");
        tamanio = t.nextInt();
        for(int i = 1; i<= tamanio; i++){
            for(int j=1;j<=tamanio;j++){
                if(j==1||j== tamanio|| i==1||i==tamanio){
                    System.out.print("*");
                }else{
                    System.out.print (" ");
                }
            }
            System.out.println();
        }
    }
    
}
