/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulangandenganwhiledo;

public class PerulangandenganWhileDo {
    public static void main(String[] args) {
    int n = 0;
        System.out.println("Tampilkan bilangan ganjil 0-20");
        System.out.print("Hasilnya : ");
        
        do{
            if(n % 2 == 1)
            {    
                System.out.print(n+",");
            }
            n++;
       }
        
        while(n <= 20);
        System.out.print("\n");
  }

}
    

