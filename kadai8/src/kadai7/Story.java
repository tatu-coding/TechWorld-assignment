package kadai7;

import java.util.Scanner;

public class Story {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		//魔法使いを設定
		Magician ma1 = new Magician("リナ", 100, 80, 40, 40);
		Magician ma2 = new Magician("コウ", 10, 30, 70, 20);
		Magician ma3 = new Magician("ケンタ", 70, 40, 60, 20);
			
		//勇者を設定
		Hero h1 = new Hero("リナ", 100, 80, 40);
		Hero h2 = new Hero("コウ", 10, 30, 70);
		Hero h3 = new Hero("ケンタ", 70, 40, 60);
		
		//怪物を設定
		Monster m1 = new Monster("リナ", 100, 80, 40);
		Monster m2 = new Monster("コウ", 10, 30, 70);
		Monster m3 = new Monster("ケンタ", 70, 40, 60);
		
			printMagicianInfo(ma1);
			printMagicianInfo(ma2);
			printMagicianInfo(ma3);
			
			printHeroInfo(h1);
			printHeroInfo(h2);
			printHeroInfo(h3);
			
			printMonsterInfo(m1);
			printMonsterInfo(m2);
			printMonsterInfo(m3);
			
			scan.close();
	}
	
	public static void printMagicianInfo(Magician ma) {
		System.out.println("魔法使いが誕生した");
		System.out.println("名前:" + ma.name);
		System.out.println("体力:" + ma.hp);
		System.out.println("攻撃力:" + ma.at);
		System.out.println("防御力:" + ma.df);
		System.out.println("魔力:" + ma.mp);
		System.out.println();
	}
	
	public static void printHeroInfo(Hero h) {
		System.out.println("勇者が誕生した");
		System.out.println("名前:" + h.name);
		System.out.println("体力:" + h.hp);
		System.out.println("攻撃力:" + h.at);
		System.out.println("防御力:" + h.df);
		System.out.println();
	}
	
	public static void printMonsterInfo(Monster m) {
		System.out.println("怪物が誕生した");
		System.out.println("名前:" + m.name);
		System.out.println("体力:" + m.hp);
		System.out.println("攻撃力:" + m.at);
		System.out.println("防御力:" + m.df);
		System.out.println();
	}
}	
