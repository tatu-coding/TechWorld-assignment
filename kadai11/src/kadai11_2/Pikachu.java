package kadai11_2;

public class Pikachu implements ThunderPokemon {
	public void attack() {
		System.out.println("Pikachuが通常攻撃を行った!");
	}
	
	public void defense() {
		System.out.println("Pikachuが回避行動を取った!");
	}
	
	public void thunderAttack() {
		System.out.println("Pikachuが電気ショックで攻撃した!");
	}
}
