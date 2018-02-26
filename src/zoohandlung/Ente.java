package zoohandlung;

public class Ente extends Tier implements Laufen, Fliegen, Schwimmen{

    @Override
    public void laufe() {
        System.out.println("Ich laufe");
    }

    @Override
    public int getAnzahlBeine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAnzahlBeine(int anzahl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fliegLos() {
        System.out.println("Ich fliege los");
    }

    @Override
    public void lande() {
        System.out.println("Ich lande nun auf dem Boden"); 
    }

    @Override
    public void schwimmLos() {
        System.out.println("Ich bewege nun meine Flossen und stoße in weite Gewässer auf");
    }

    @Override
    public int getSchwimmgeschwindigkeit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int setSchwimmgeschwindigkeit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void schwimmStop() {
        System.out.println("Ich höre auf zu schwimmen"); 
    }

    @Override
    public void tauche() {
        System.out.println("Ich tauche"); 
    }
    
}
