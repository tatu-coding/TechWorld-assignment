package kadai12;

public class Hero extends Character {
	public Hero(String name, int hp, int at, int df) {
		super(name, hp, at, df);
	}
	
	public void attack(Character target) {
		int damage = Math.max(this.getAt() - target.getDf(), 0);
		target.setHp(target.getHp() - damage);
		System.out.println(this.getName() + "が" + target.getName() + "に" + damage + "のダメージを与えた!");
	}
}
