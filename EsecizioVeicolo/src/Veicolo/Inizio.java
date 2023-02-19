package Veicolo;

public class Inizio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Auto auto1 = new Auto (" Ford ", "EF762BN", 405.5, 146.6, 1.4, 4, 5, 4);
		Camion camion1 = new Camion (" Volvo ", " EY083MO ", 73.3, 30.6, 16.1, 3, 3, 4);
		Moto moto1 = new Moto (" Ducati "," EY97361 ", 217, 104.5, 937, 1, 2, 2);
		
		System.out.println(auto1.toString());
		System.out.println(camion1.toString());
		System.out.println(moto1.toString());
	}

}
