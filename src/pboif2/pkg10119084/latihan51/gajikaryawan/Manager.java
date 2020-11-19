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
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        tunjanganKehadiran = hadir * 10000;
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabatan){
        if (jabatan.equals("Manager")){
            tunjanganJabatan = 2000000;
        }else if (jabatan.equals("Kabag")){
            tunjanganJabatan =  1000000;
        }else {
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan){
       switch (golongan) {
           case 1:
               tunjanganGolongan = 500000;
               break;
           case 2:
               tunjanganGolongan = 1000000;
               break;
           case 3:
               tunjanganGolongan = 1500000;
               break;
           default:
               tunjanganGolongan = 0;
               break;
    }
       return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}