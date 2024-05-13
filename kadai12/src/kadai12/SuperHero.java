package kadai12;

public class SuperHero extends Hero {
	public SuperHero(String name, int hp, int at, int df) {
		super(name, hp, at, df);
	}
	
	public void doubleAttack(Character target) {
		attack(target);
		attack(target);
	}
}
