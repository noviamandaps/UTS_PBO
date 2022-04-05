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
public abstract class Hewan {
    String namaHewan;
    String makanan;

    public Hewan(String namaHewan, String makanan) {
        this.namaHewan = namaHewan;
        this.makanan = makanan;
    }

    public void makan(){
        System.out.println(this.namaHewan + " memakan " + this.makanan + ".");
    }
}