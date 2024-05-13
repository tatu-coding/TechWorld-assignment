package lesson7;

public class Monster {
	
	String name;
	int hp;
	int at;
	int df;
	
	void attack() {
		System.out.println(this.name + "の攻撃!");
		this.df = this.df + 10;
		System.out.println("防御力が10上がった");
	}
}
