/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilihanmenu;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class PilihanMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        int pilihan = 9;
        do{
            System.out.println("\nMENU LUAS BANGUN\n");
            System.out.println("1. Menghitung Luas Persegi ");
            System.out.println("2. Menghitung Luas persegi Panjang ");
            System.out.println("3. Keluar ");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = masukan.nextInt();
            
        // Percabangan Switch Case
        switch(pilihan){
            case 1 : luasPersegi();break;
            case 2 : luasPersegiPanjang();break;
        }
        // Jika Percabangan Tidak Sama Dengan 3, Maka Akan Diulangi Lagi
        } while (pilihan != 3);
        }
    
    // Method Luas Persegi
    private static void luasPersegi(){
        Scanner masukan = new Scanner(System.in);
        float sisi, luas;
        System.out.print("Masukkan Nilai Sisi : ");
        sisi = masukan.nextFloat();
        luas = sisi * sisi;
        System.out.println("Luas Persegi adalah : " + luas);
    }
    
    // Method Luas Persegi Panjang 
    private static void luasPersegiPanjang(){
        Scanner masukan = new Scanner(System.in);
        float panjang, lebar, luas;
        System.out.print("Masukkan Nilai Panjang : ");
        panjang = masukan.nextFloat();
        System.out.print("Masukkan Nilai Lebar   : ");
        lebar = masukan.nextFloat();
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang adalah : " + luas);
    }
    
}
