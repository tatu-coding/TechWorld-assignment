package kadai10_1;

public class EvolvedPokemon extends Pokemon{
	
	public void heal() {
		System.out.println("回復した");
	}

	public void doubleAttack() {
		attack();
		attack();
	}
}

