package kadai10_3;

public class Hero extends Character_hero {
	// コンストラクター
	public Hero(String name, int hp, int at, int df) {
		setName(name);
		setHp(hp);
		setAt(at);
		setDf(df);
	}

	// 攻撃メソッド
	@Override
	public void attack(Character_monster target) {
		int damage = Math.max(this.getAt() - target.getDf(), 0);
		target.setHp(target.getHp() - damage);
		System.out.println(this.getName() + "が" + target.getName() + "に" + damage + "のダメージを与えた!");
	}

	// 防御メソッド
	@Override
	public void defend() {
		System.out.println(this.getName() + "が防御した!");
	}
}