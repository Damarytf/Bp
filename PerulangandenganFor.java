/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulangandenganfor;

import java.util.Scanner;
public class PerulangandenganFor {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int awal, akhir;
        System.out.println("Menampilkan bilangan ganjil 0-20");
        System.out.print("awal : ");
        awal = masuk.nextInt();
        System.out.print("akhir : ");
        akhir = masuk.nextInt();
        for(int n = awal; n<= akhir; n++){
            int hasil = n % 2;
            if(hasil ==1){
                System.out.print(n+" ");
              
            }
        }
        System.out.println("");
    }
    
}
