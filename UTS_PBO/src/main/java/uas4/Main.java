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
public class Main {
    public static void main(String[] args) {
        SpiderMan spiderMan = new SpiderMan("Peter Parker", "Kalkun", "Jurnalis");
        Gatotkaca gatotkaca = new Gatotkaca("Bejo", "Kalkun", "Jurnalis");

        spiderMan.berubah();
        spiderMan.berburu();
        spiderMan.mengeluarkanJaring();
        spiderMan.makan();
        spiderMan.memanjat();
        spiderMan.berayun();
        spiderMan.bekerja();
        spiderMan.tidur();
        gatotkaca.membantumanusia();
        System.out.println();
    }
}