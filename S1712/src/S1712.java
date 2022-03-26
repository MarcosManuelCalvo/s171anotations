
public class S1712 {
/*Exercici 2. Afegeix a les classes fills alguns mètodes deprecados, i utilitzi la anotacion corresponent.
 * Invoqui des d'una classe externa els
 * mètodes deprecados, suprimint mitjançant l'anotació corresponent
 * els warnings per ser deprecada la seva utilització.*/
public static void main(String[] args) {

		
		Ibiza nou = new Ibiza();
		nou.accelerar();
		nou.iniciar();
		
		
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
	
	@Deprecated
	public void iniciar() {
		System.out.println("metodeObsoletVehicle");
	}
}

class Vehicle{
	
	Vehicle(){
		System.out.println("constructorVehicle");
	}

	public void accelerar() {
		System.out.println("mètodeVehicle");
	}


}
