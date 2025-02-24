abstract class PetrolMAchine {

	public void PetrolMachine() {
		System.out.println("PetrolMAchine--Constructor");
	}

	public void Start() {
		System.out.println("Maching Starting");
	}

	public abstract void fuelFilling();
}

public class Machine extends PetrolMAchine {

	public Machine() {
		System.out.println("Machine--Constructor");
	}

	public void fuelFilling() {
		System.out.println("filling fuel in tank");
	}

	public static void main(String[] args) {
		Machine m = new Machine();
		m.fuelFilling();
		m.Start();
	}

}
