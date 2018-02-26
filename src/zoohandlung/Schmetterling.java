/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoohandlung;

/**
 *
 * @author l.brosswitz
 */
public class Schmetterling extends Tier implements Laufen, Fliegen {

    @Override
    public void laufe() {
        System.out.println("Ich laufe :)"); 
    }

    @Override
    public int getAnzahlBeine() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void setAnzahlBeine(int anzahl) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void fliegLos() {
        System.out.println("Ich fliege Los!");
    }

    @Override
    public void lande() {
        System.out.println("Ich lande!");
    }

   
}
