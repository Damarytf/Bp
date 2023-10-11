/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulangandenganwhile;


public class PerulangandenganWhile {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Tampilkan Bilangan Ganjil dari 0-15 dengan While");
        System.out.print("Hasilnya : ");
        
        while(true)
        {
        if(i % 2 == 1){
            System.out.print(i + ",");
        }
        
        i += 1;
        
        if (i >=15){
            break;
        }
         
    }
        System.out.println("\n");
    }
    
    
}

