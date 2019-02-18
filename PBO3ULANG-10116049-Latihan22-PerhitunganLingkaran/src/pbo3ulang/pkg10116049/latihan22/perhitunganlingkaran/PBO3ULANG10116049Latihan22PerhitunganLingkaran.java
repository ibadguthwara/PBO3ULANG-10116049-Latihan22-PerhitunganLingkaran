/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Membuat Program Perhitungan Lingkaran
 *  
 */
public class PBO3ULANG10116049Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String d;
          double r,L,diameter,K;
          
          Scanner baca = new Scanner (System.in);
    
    System.out.println("====PROGRAM PERHITUNGAN LINGKARAN====");
    System.out.println("");
          
    do{   
        System.out.print("Masukan Nilai Diameter Lingkaran : ");
        d = baca.nextLine();
        
        System.out.println((!d.matches("[0-9]*"))?"Nilai Diameter Tidak"
                + "Sesuai\n":"");
    }
    while (!d.matches("[0-9]*"));
    
        System.out.println("\n====HASIL PERHITUNGAN LINGKARAN====");
             diameter = Double.parseDouble(d);
             r = diameter / 2;
        System.out.printf("Jari-Jari Lingkaran = %.0f cm %n",r);
        L = Math.PI*r*r;
        System.out.printf("Luas Lingkaran = %.2f cm %n",L);
        K = 2*Math.PI*r;
        System.out.printf("Keliling Lingkaran = %.2f cm %n", K);
    }
}
    
    

