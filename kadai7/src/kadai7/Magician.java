package kadai7;

public class Magician {
	
	String name;
	int hp;
	int at;
	int df;
	int mp;
	
	void attack() {
		System.out.println(this.name + "の攻撃!");
		System.out.println("敵にダメージを" + at + "与えた!!");
	}
	
	void defense() {
		System.out.println("勇者が防御をした");
		this.df = this.df + 10;
		System.out.println("防御力が10upし、" + this.df + "になった");
	}
	
	void heal() {
		System.out.println("勇者が休憩した");
		this.hp = this.hp + 10;
		System.out.println("hpが10回復し、" + this.hp + "になった");
	}
	
	void magic() {
		System.out.println("勇者が魔法を使った");
		this.at = this.at + 100;
		this.mp = this.mp - 10;
		System.out.println("攻撃力が100upし、" + this.at + "になった");
		System.out.println("mpを10消費し、" + this.mp + "になった");
	}

}
