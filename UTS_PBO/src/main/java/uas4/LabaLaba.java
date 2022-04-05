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
public class LabaLaba extends Hewan {

    public LabaLaba(String namaHewan, String makanan) {
        super(namaHewan, makanan);
    }

    public void berburu(){
        System.out.println(this.namaHewan + " sedang berburu " + super.makanan);
    }

    public void mengeluarkanJaring(){
        System.out.println(this.namaHewan  + " mengeluarkan jaring.");
    }
}