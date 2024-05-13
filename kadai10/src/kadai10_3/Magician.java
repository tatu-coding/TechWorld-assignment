package kadai10_3;

public class Magician extends Character_hero{
	private int mp;
	
	public Magician(String name, int hp, int at, int df, int mp) {
		setName(name);
		setHp(hp);
		setAt(at);
		setDf(df);
		this.mp = mp;
	}
	
	@Override
	public void attack(Character_monster target) {
		magicAttack(target);
	}

	@Override
	public void defend() {
		System.out.println(this.getName() + "が魔法のシールドで防御した!");
	}
	
	public void magicAttack(Character_monster target) {
		int requiredMp = 10;
		if (this.mp >= requiredMp) {
			int damage = this.getAt();
			target.setHp(target.getHp() - damage);
			this.setMp(this.mp - requiredMp);
			System.out.println(this.getName() + "が" + target.getName() + "に魔法攻撃を行い、" + damage + "のダメージを与えた!");
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
