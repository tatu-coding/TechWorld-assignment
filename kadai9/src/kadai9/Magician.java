package kadai9;

public class Magician {

	private String name;
	private int hp;
	private int at;
	private int df;
	private int mp;
	
	Magician(String name, int hp, int at, int df, int mp){
		setName(name);
		setHp(hp);
		setAt(at);
		setDf(df);
		setMp(mp);
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
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = Math.max(hp, 0);
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
	
	public int getMp() {
		return mp;
	}
	
	public void setMp(int mp) {
		this.mp = Math.max(mp, 0);
	}
}
