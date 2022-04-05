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
public class SpiderMan extends LabaLaba implements Parkour {
    private String namaOrang;
    private String pekerjaan;

    private int sisaEnergi = energi;

    public SpiderMan(String namaOrang, String makanan, String pekerjaan) {
        super(namaOrang, makanan);
        this.namaOrang = namaOrang;
        this.pekerjaan = pekerjaan;
    }

    public void berubah(){
        System.out.println(this.namaOrang + " berubah menjadi Spider-Man.");
    }

    @Override
    public void berburu() {
        super.berburu();
    }

    @Override
    public void mengeluarkanJaring() {
        super.mengeluarkanJaring();
    }


    @Override
    public void memanjat() {
        sisaEnergi = sisaEnergi - costMemanjat;
        System.out.println(this.namaOrang + " memanjat gedung. (Sisa energi: " + sisaEnergi + ")");
    }

    @Override
    public void berayun() {
        sisaEnergi = sisaEnergi - costBerayun;
        System.out.println(this.namaOrang + " berayun dari satu gedung ke gedung lain. (Sisa energi: " + sisaEnergi + ")");
    }

    @Override
    public void bekerja() {
        System.out.println(this.namaOrang + " bekerja sebagai seorang " + this.pekerjaan + " saat tidak beraksi menjadi Spider-Man.");
    }

    @Override
    public void tidur() {
        System.out.println(this.namaOrang + " sedang tidur di rumah Bibi May.");
    }
}