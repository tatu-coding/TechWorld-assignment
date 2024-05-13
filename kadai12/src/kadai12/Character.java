package kadai12;

public abstract class Character {
	private String name;
	private int hp;
	private int at;
	private int df;
	
	public Character(String name, int hp, int at, int df) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.df = df;
	}
	
	public abstract void attack(Character target);
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = Math.max(hp, 0);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAt() {
		return at;
	}
	
	public void setAt(int at) {
		this.at = Math.max(at, 0);
	}
	
	public int getDf() {
		return df;
	}
	
	public void setDf(int df) {
		this.df = Math.max(df, 0);
	}
}
