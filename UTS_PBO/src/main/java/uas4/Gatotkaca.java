/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas4;

/**
 *
 * @author user
 */
public class Gatotkaca extends Burung implements Manusia, Mesin{
    private String namaOrang;
    private String pekerjaan;

    
    private int sisaEnergi = energi;

    public Gatotkaca(String namaOrang, String makanan, String pekerjaan) {
        super(namaOrang, makanan);
        this.namaOrang = namaOrang;
        this.pekerjaan = pekerjaan;
    }
    public void berubah(){
        System.out.println(this.namaOrang + " berubah menjadi GatotKaca.");
    }
    @Override
    public void membantumanusia() {
        sisaEnergi = sisaEnergi - costmembantumanusia;
        System.out.println(this.namaOrang + " membantu manusia (Sisa energi: " + sisaEnergi + ")dengan membajak sawah");
    }
    @Override
    public void bekerja() {
        System.out.println(this.namaOrang + " bekerja sebagai seorang " + this.pekerjaan + " saat tidak beraksi menjadi GatotKaca.");
    }
    @Override
    public void tidur() {
        System.out.println(this.namaOrang + " sedang tidur di rumah Pak Jono");
    }  
}
