package kadai12;

public class SuperMagician extends Magician {
	public SuperMagician(String name, int hp, int at, int df, int mp) {
		super(name, hp, at, df, mp);
	}

	public void superMagicAttack(Character target) {
		int requiredMp = 20;
		if (this.getMp() >= requiredMp) {
			int damage = 2 * getAt();
			target.setHp(target.getHp() - damage);
			this.setMp(this.getMp() - requiredMp);
			System.out.println(this.getName() + "が超魔法攻撃を行い、" + target.getName() + "に" + damage + "のダメージを与えた!");
		} else {
			System.out.println(this.getName() + "はMPが不足していて超魔法攻撃ができない!");
		}
	}
}
