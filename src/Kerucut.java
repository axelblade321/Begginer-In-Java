/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyle Rayner
 */
public class Kerucut {
    public static void main(String[] args) {
        float r, t, phi, volume;
        r = 4;
        t = 4;
        phi = 3.14f;
        
        volume = 0.3f * phi *((r*r)*t);
        System.out.println("Volume Kerucut = " + volume);
    }
}
