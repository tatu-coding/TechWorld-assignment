package kadai12;

public class Magician extends Character{
	private int mp;
	
	public Magician(String name, int hp, int at, int df, int mp) {
		super(name, hp, at, df);
		this.mp = mp;
	}
	
	public void attack(Character target) {
		int damage = Math.max(this.getAt() - target.getDf(), 0);
		target.setHp(target.getHp() - damage);
		System.out.println(this.getName() + "が" + target.getName() + "に" + damage + "のダメージを与えた!");
	}
	
	public void magicAttack(Character target) {
		int requiredMp = 10;
		if (this.mp >= requiredMp) {
			int damage = 2 * this.getAt();
			target.setHp(target.getHp() - damage);
			this.setMp(this.mp - requiredMp);
			System.out.println(this.getName() + "が" + target.getName() + "に魔法攻撃を行い、" + damage + "のダメージを与えた");
		} else {
			System.out.println(this.getName() + "はMPが不足していて魔法攻撃ができない!");
		}
	}

	
	public int getMp() {
		return mp;
	}
	
	public void setMp(int mp) {
		this.mp = Math.max(mp, 0);
	}
}
