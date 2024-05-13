package lesson_6;

public class Main {
	
	public static void main(String[] args) {
		
		int num1 = Getnum.getNumber();
		int num2 = Getnum.getNumber();
			
		int tasu = Cal.tasu(num1, num2);
		int hiku = Cal.hiku(num1, num2);
		int kakeru = Cal.kakeru(num1, num2);
		int waru = Cal.waru(num1, num2);
		
		OutNum.outmsg(tasu, hiku, kakeru, waru);
	}

}
