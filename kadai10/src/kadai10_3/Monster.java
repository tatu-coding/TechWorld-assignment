package kadai10_3;

public class Monster extends Character_monster {
	private int poisonAt; //毒攻撃力
	private int poisonUses; //毒攻撃ができる回数
	
	public Monster(String name, int hp, int at, int df, int poisonAt, int poisonUses){
		setName(name);
		setHp(hp);
		setAt(at);
		setDf(df);
		setPoisonAt(poisonAt);
		setPoisonUses(poisonUses);
	}
	
    @Override
    public void attack(Character_hero target) {
        if (poisonUses > 0) {
            // 毒攻撃を行う場合
            int poisonDamage = poisonAt;
            target.setHp(target.getHp() - poisonDamage);
            poisonUses--;
            System.out.println(this.getName() + "が" + target.getName() + "に毒攻撃を行い、" + poisonDamage + "のダメージを与えた!");
        } else {
            // 通常の攻撃
            int damage = Math.max(this.getAt() - target.getDf(), 0);
            target.setHp(target.getHp() - damage);
            System.out.println(this.getName() + "が" + target.getName() + "に" + damage + "のダメージを与えた!");
        }
    }
    
    @Override
    public void defend() {
        System.out.println(this.getName() + "が防御姿勢を取った!");
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
