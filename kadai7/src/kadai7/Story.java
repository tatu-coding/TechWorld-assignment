package kadai7;

import java.util.Scanner;

public class Story {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
			
			Magician m = new Magician();
			System.out.println("魔法使いの名前を設定してください");
			m.name = scan.nextLine();
		
			System.out.println("魔法使いの体力を設定してください");
			m.hp = scan.nextInt();
			scan.nextLine();
			
			System.out.println("魔法使いの攻撃力を設定してください");
			m.at = scan.nextInt();
			scan.nextLine();
			
			System.out.println("魔法使いの防御力を設定してください");
			m.df = scan.nextInt();
			scan.nextLine();
			
			System.out.println("魔法使いの魔力量を設定してください");
			m.mp = scan.nextInt();
			scan.nextLine();
			
			System.out.println("魔法使いが誕生した");
			System.out.println("名前:" + m.name);
			System.out.println("体力:" + m.hp);
			System.out.println("攻撃力" + m.at);
			System.out.println("防御力" + m.df);
			System.out.println("魔力" + m.mp);
			
			while(true){
				System.out.println("行動を選択してください:攻撃、防御、回復、魔法、終了");
				String action = scan.nextLine();
				if (action.equals("攻撃")) {
					m.attack();
				} else if (action.equals("防御")) { 
					m.defense();
				} else if (action.equals("回復")) {
					m.heal();
				} else if (action.equals("魔法")) {
					m.magic();
				} else if (action.equals("終了")) {
					System.out.println("ゲームを終了します");
					break;
				} else  {
					System.out.println("不明な行動です。");
				}
			}
	}
}	
