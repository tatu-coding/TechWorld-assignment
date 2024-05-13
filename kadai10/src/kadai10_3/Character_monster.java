package kadai10_3;

public abstract class Character_monster {
	private int hp;
	private String name;
	private int at;
	private int df;

	// 抽象メソッド
	public abstract void attack(Character_hero target);
	public abstract void defend();
	
	// ゲッターとセッター	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = Math.max(hp, 0);
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException
			("名前がnullです。");
		}
		if(name.length() < 3 || name.length() > 10) {
			throw new IllegalArgumentException
			("名前は3文字以上、10文字以下である必要があります。");
		}
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
