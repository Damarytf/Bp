/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segitigaatas;

import java.util.Scanner;
public class SegitigaAtas {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int batas, i, j;
        System.out.println("Pola Segitiga Siku-siku dengan Angka ");
        System.out.print("Masukkan batas nilainya = ");
        batas = inputan.nextInt();
        System.out.println();
        
        for (i = 1; i <= batas; i++){
            for(j = 1; j <= i; j++){
                System.out.print(j+"");
        }
            System.out.println("");
        }
        System.out.println();
    }
    
}
