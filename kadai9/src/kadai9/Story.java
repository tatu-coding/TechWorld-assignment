package kadai9;

import java.util.Scanner;

import kadai9.Hero;
import kadai9.Magician;
import kadai9.Monster;

public class Story {

	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		//魔法使いを設定
		Magician ma1 = new Magician("ケンユウ", 100, 80, 40, 40);
		Magician ma2 = new Magician("コンタ", 10, 30, 70, 20);
		Magician ma3 = new Magician("マキノ", 70, 40, 60, 20);
			
		//勇者を設定
		Hero h1 = new Hero("ユウキ", 100, 80, 40);
		Hero h2 = new Hero("ソノダ", 10, 30, 70);
		Hero h3 = new Hero("ケンタ", 70, 40, 60);
		
		//怪物を設定
		Monster m1 = new Monster("ノジリ", 100, 80, 40);
		Monster m2 = new Monster("カミノ", 10, 30, 70);
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
		System.out.println("名前:" + ma.getName());
		System.out.println("体力:" + ma.getHp());
		System.out.println("攻撃力:" + ma.getAt());
		System.out.println("防御力:" + ma.getDf());
		System.out.println("魔力:" + ma.getMp());
		System.out.println();
	}
	
	public static void printHeroInfo(Hero h) {
		System.out.println("勇者が誕生した");
		System.out.println("名前:" + h.getName());
		System.out.println("体力:" + h.getHp());
		System.out.println("攻撃力:" + h.getAt());
		System.out.println("防御力:" + h.getDf());
		System.out.println();
	}
	
	public static void printMonsterInfo(Monster m) {
		System.out.println("怪物が誕生した");
		System.out.println("名前:" + m.getName());
		System.out.println("体力:" + m.getHp());
		System.out.println("攻撃力:" + m.getAt());
		System.out.println("防御力:" + m.getDf());
		System.out.println();
	}
}
