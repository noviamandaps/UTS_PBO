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
public interface Parkour extends Manusia {
    int costMemanjat = 10;
    int costBerayun = 15;

    void memanjat();
    void berayun();
}
