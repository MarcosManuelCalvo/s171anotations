/*Exercici 1. Crea una jerarquia d'objectes Java on els objectes fill
 * sobreescriguin alguna funcionalitat de l'objecte pare emprant @Override.
 * Afegeix una classe que efectuï les invocacions necessàries demostrant el punt anterior.*/
public class S1711 {
	public static void main(String[] args) {

		
		Ibiza nou = new Ibiza();
		nou.accelerar();
		
		
		
	}

}

class Ibiza extends Vehicle{
	
	Ibiza(){
		System.out.println("constructorIbiza");
	}
	
	@Override
	public void accelerar() {
		System.out.println("mètodeIbiza");
	}
}

class Vehicle{
	
	Vehicle(){
		System.out.println("constructorVehicle");
	}

	public void accelerar() {
		System.out.println("mètodeVehicle");
	}

	public static void iniciar() {
		System.out.println("metodeEstaticVehicle");
	}
}