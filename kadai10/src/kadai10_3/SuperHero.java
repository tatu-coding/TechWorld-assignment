package kadai10_3;

public class SuperHero extends Hero{
	
	public SuperHero(String name, int hp, int at, int df) {
		super(name, hp, at, df);
	}

	public void doubleattack(Character_monster target) {
		attack(target);
		attack(target);
	}
}
