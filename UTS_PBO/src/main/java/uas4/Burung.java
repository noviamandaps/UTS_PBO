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
public class Burung extends Hewan{
    public Burung(String namaHewan, String makanan) {
        super(namaHewan, makanan);
    }
    public void terbang(){
        System.out.println(this.namaHewan  + " sedang terbang");
    }
}
