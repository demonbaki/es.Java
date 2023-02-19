package Veicolo;

public class Camion extends Veicolo {
    int assi;
    int passeggeri;
    int ruote;
    
    public Camion() {
    }
    
    public Camion( String m, String t, double l, double h, double cc, int a, int p, int r) {
     super(m,t,l,h,cc);
   	 assi = a;
   	 passeggeri = p;
   	 ruote = r;
    }
    
    void setAssi (int a) {
    	assi = a;
    }
    
    int getAssi() {
    	return assi;
    }
    
    void setPasseggeri (int p) {
    	passeggeri = p;
    }
    
    int getPasseggeri() {
    	return passeggeri;
    }
    
    void setRuote (int r) {
    	ruote = r;
    }
    
    int getRuote() {
    	return ruote;
    }
    
    
    public String toString() {
   	 String v = super.toString();
   	 v = v + " assi = " + assi + "; ";
   	 v = v + " passeggeri = " + passeggeri + "; " ;
   	 v = v + " ruote = " + ruote + "; ";
   	 return v;
    }
}