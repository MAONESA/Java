package repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CosteViaje {

	 int costeHotel(int noches) {
		//Cada noche 140
		int dormir = 140;
		int resultado = noches* dormir;
		return resultado;
	}
	 public  int costeAvion(String destino) {
		 if (destino.equals("Tokyo")) {
			 return 700;
		 }else if (destino.equals("Barcelona") || (destino.equals("Madrid"))) {
			 return 90;
		 }else if(destino.equals("Oviedo")) {
			 return 15;
		 }else{
			 return 0;
		 }
		 
		
	}
	 public  int costeAlquilerDeCoches(int numNoches) {
		 int alquilerCoche = 40;
		 int resultado = 0;
		 if(numNoches >= 7) {
			 resultado = alquilerCoche * numNoches -50;
			 return resultado;
		 }else if (numNoches>=3) {
			 resultado = alquilerCoche * numNoches -20 ;
			 return resultado ;
		 }else if (numNoches <3){
			 resultado = numNoches * alquilerCoche;
			 return resultado;
		 }
		 return resultado;
		
	}
	
	
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Introduzca su nombre por favor: ");
	String nombrePersona = br.readLine();
	System.out.println("Introduzca el numero de noches: ");
	String numNochesTxt = br.readLine();
	
	int numNoches = Integer.parseInt(numNochesTxt);
	System.out.println("Introduzca el destino entre estos destinos: [Tokyo],[Madrid],[Barcelona],[Oviedo]: ");
	String destino = br.readLine();
	CosteViaje costeViaje = new CosteViaje();
	
	int resultado1 = costeViaje.costeHotel(numNoches);
	int resultado2 = costeViaje.costeAvion(destino);
	int resultado3 = costeViaje.costeAlquilerDeCoches(numNoches);
	
	int sumaCostes = resultado1+resultado2+resultado3;
	System.out.println("Señor: "+nombrePersona+"\n"+"Coste total: "+sumaCostes);
	
}
	
	
}
