/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan51.gajikaryawan;

/**
NAMA : MUHAMMAD IDRIS MERDEFI
KELAS : PBOIF2
NIM : 10119084
DESKRIPSI PROGAM : PROGRAM INI BERISI PROGRAM UNTUK MENGHITUNG GAJI KARYAWAN
 */

import java.util.Scanner;
public class PBOIF210119084Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---Program Perhitungan Gaji Karyawan---");
        System.out.print("Masukan NIK: ");
        manager.setNik(scanner.next());
        System.out.print("Masukkan Nama : ");
        manager.setNama(scanner.next());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(scanner.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(scanner.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(scanner.nextInt());
        
        System.out.println("\n----Hasil Perhitungan----");
        System.out.println("\nNIK      : "+manager.getNik());
        System.out.println("NAMA     : "+manager.getNama());
        System.out.println("GOLONGAN : "+manager.getGolongan());
        System.out.println("JABATAN  : "+manager.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN   : "+manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN    : "+manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN  : "+manager.tunjanganKehadiran(manager.getKehadiran()));
        
        System.out.println("\nGAJI TOTAL  : "+manager.gajiTotal());
        
    }
    
}
