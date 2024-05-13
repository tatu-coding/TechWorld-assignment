package kadai12;

public class SuperMonster extends Monster {
	private int poisonAt;
	private int poisonUses;
	
	public SuperMonster(String name, int hp, int at, int df, int poisonAt, int poisonUses) {
		super(name, hp, at, df);
		this.poisonAt = poisonAt;
		this.poisonUses = poisonUses;
	}
	
	public void attack(Character target) {
		super.attack(target);
		if (getPoisonUses() > 0) {
			poisonAttack(target);
		}
	}
	
	public void poisonAttack(Character target) {
			int damage = getPoisonAt() - target.getDf();
			target.setHp(target.getHp() - damage);
			setPoisonUses(getPoisonUses() - 1);
			System.out.println(this.getName() + "が" + target.getName() + "に毒攻撃を行い、" + damage + "のダメージを与えた!");
	}
	
	public int getPoisonAt() {
		return poisonAt;
	}
	
	public void setPoisonAt(int poisonAt) {
		this.poisonAt = Math.max(poisonAt, 0);
	}
	
	public int getPoisonUses() {
		return poisonUses;
	}
	
	public void setPoisonUses(int poisonUses) {
		this.poisonUses = Math.max(poisonUses, 0);
	}
}
