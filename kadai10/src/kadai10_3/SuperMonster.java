package kadai10_3;

public class SuperMonster extends Monster {
	
	public SuperMonster(String name, int hp, int at, int df, int poisonAt, int poisonUses) {
		super(name, hp, at, df, poisonAt, poisonUses);
	}
	
	public void attack(Character_hero target) {
		int damage = Math.max(this.getAt() - target.getDf(), 0);
		target.setHp(target.getHp() - damage);
		System.out.println(this.getName() + "が" + target.getName() + "に" + damage + "のダメージを与えた!");
		
		if (this.getPoisonUses() > 0) {
			poisonAttack(target);
		}
	}
	
	
	public void poisonAttack(Character_hero target) {
		if (getPoisonUses() > 0) {
			int damage = getPoisonAt();
			target.setHp(target.getHp() - damage);
			setPoisonUses(getPoisonUses() - 1);
			System.out.println(this.getName() + "が" + target.getName() + "に毒攻撃を行い、" + damage + "のダメージを与えた!");
		} else {
			System.out.println(this.getName() + "は毒攻撃を行うことができない!");
		}
	}
}
