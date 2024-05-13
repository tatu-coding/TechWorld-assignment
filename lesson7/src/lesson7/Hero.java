package lesson7;

public class Hero {

	String name;
	int hp;
	int at;
	int df;
	static int money = 100;
	
	Hero(String name){
		this.hp = 20;
		this.name = name;
	}
	
	void attack() {
		System.out.println(this.name + "の攻撃+");
		System.out.println("敵にダメージを" + this.at + "与えた!!");
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
}
