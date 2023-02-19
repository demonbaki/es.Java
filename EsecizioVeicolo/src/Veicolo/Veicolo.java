package Veicolo;

public class Veicolo {
    String marca;
    String targa;
    double lunghezza;
    double altezza;
    double cilindrata;
    
    public Veicolo () {
    }
    
    public Veicolo ( String m, String t, double l, double h, double cc) {
    	marca = m;
    	targa = t;
    	lunghezza = l;
    	altezza = h;
    	cilindrata = cc;
    }
    
    void setMarca (String m) {
    	marca = m;
    }
    
    String getMarca() {
    	return marca;
    }
    
    void setTarga (String t) {
    	targa = t;
    }
    
    String getTarga() {
    	return targa;
    }
    
    void setLunghezza (double l) {
    	lunghezza = l;
    }
    
    double getLunghezza() {
    	return lunghezza;
    }
    
    void setAltezza (double h) {
    	altezza = h;
    }
    
    double getAltezza() {
    	return altezza;
    }
    
    void setCilindrata (int cc) {
    	cilindrata = cc;
    }
    
    double getCilindrata() {
    	return cilindrata;
    }
    
   public String toString() {
	   String v = " marca " + marca + "; ";
	   v = v + " targa " + targa + ";";
	   v = v + " lunghezza " + lunghezza  + "cm" + ";";
	   v = v + " altezza " + altezza + "cm" + ";";
	   v = v + " cilindrata " + cilindrata + "cc" + ";";
	return v;
   }
  }
