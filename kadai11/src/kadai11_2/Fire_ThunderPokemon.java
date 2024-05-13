package kadai11_2;

public class Fire_ThunderPokemon implements FirePokemon,ThunderPokemon{
	public void thunderAttack() {
		System.out.println("Fire_thunderPokemonが電気ショックで攻撃した!");
	}
	
	public void fireAttack() {
		System.out.println("Fire_thunderPokemonが火炎攻撃で攻撃した!");		
	}
	
	public void attack() {
		System.out.println("Fire_thunderPokemonが通常攻撃を行った!");
	}
	
	public void defense() {
		System.out.println("Fire_thunderPokemonが防御姿勢を取った!");
	}
}
