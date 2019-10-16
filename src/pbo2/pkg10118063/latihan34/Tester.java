/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan34;

import java.util.Scanner;
/**
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();
        
        System.out.println("====Aplikasi Kalkulator Bilangan");
        System.out.print("Masukkan angka ke-1 : " );
        kal.value1 = scanner.nextDouble();
        
        System.out.print("Masukkan angka ke-2 : " );
        kal.value2 = scanner.nextDouble();
        
        System.out.println("\nHasil Pertambahan : " + kal.tambahBilangan());
        System.out.println("\nHasil Pengurangan : " + kal.kurangBilangan());
        System.out.println("\nHasil Perkalian : " + kal.kaliBilangan());
        System.out.println("\nHasil Pembagian : " + kal.bagiBilangan());
        System.out.println("\nHasil Sisa : " + kal.sisaBilangan());
    }
    
}
