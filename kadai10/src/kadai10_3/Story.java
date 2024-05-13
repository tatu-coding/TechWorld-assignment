package kadai10_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Story {
	private static final Random random = new Random();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//勇者チームを設定
		List<Character_hero> heroTeam = new ArrayList<>();
		heroTeam.add(new SuperHero("s勇者くん", 500, 80, 20));
		heroTeam.add(new SuperMagician("s魔法使い", 500, 50, 30, 60));
				
		//モンスターチームを設定
		List<Character_monster> monsterTeam = new ArrayList<>();
		monsterTeam.add(new SuperMonster("sモンスター", 900, 100, 40, 40, 4));
		
		//ターン数を記録
		int turn = 1;
			
		//戦闘開始
		while (!heroTeam.isEmpty() && !monsterTeam.isEmpty()) {
			System.out.println("ターン" + turn + "：勇者チームの攻撃");
			attackHeroesToMonsters(heroTeam, monsterTeam);
			
			if (!monsterTeam.isEmpty()) {
				System.out.println();
				System.out.println("ターン" + turn + "：モンスターチームの攻撃");
				attackMonstersToHeroes(monsterTeam, heroTeam);
			}
			
			turn++;
			System.out.println();
		}
		
		if (heroTeam.isEmpty()) {
			System.out.println("モンスター側の勝利!");
		} else {
			System.out.println("勇者側の勝利!");
		}
		
		scan.close();
	}
	
	private static void attackHeroesToMonsters(List<Character_hero> heroes, List<Character_monster> monsters) {
		for (Character_hero hero : new ArrayList<>(heroes)) {
			if(monsters.isEmpty()) break;
			Character_monster target = monsters.get(random.nextInt(monsters.size()));
			
			if (hero instanceof SuperHero) {
				((SuperHero) hero).doubleattack(target);
			} else if (hero instanceof SuperMagician) {
				if (random.nextBoolean()) {
					((SuperMagician) hero).superMagicAttack(target);
				} else {
					((SuperMagician) hero).magicAttack(target);
				}
			} else {
				hero.attack(target);	
			}
			
			if (target.getHp() <= 0) {
				System.out.println(target.getName() + "が倒れた!");
				monsters.remove(target);
			}
		}
	}
	
	private static void attackMonstersToHeroes(List<Character_monster> monsters, List<Character_hero> heroes) {
		for (Character_monster monster : new ArrayList<>(monsters)) {
			if(heroes.isEmpty()) break;
			
			Character_hero target = heroes.get(random.nextInt(heroes.size()));
			monster.attack(target);
			
			if (target.getHp() <= 0) {
				System.out.println(target.getName() + "が倒れた!");
				heroes.remove(target);
			}
		}
	}
}
