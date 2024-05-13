package kadai3;

public class kadai3_3 {
	public static void main(String args[]) {
		
		for(int i=1; i<=100; i++) {
			for(int n = i; n <= 100; n++) {
				if((i+n) % 3 == 0) {
					System.out.println("(" + i + "," + n + ")");
				}
			}
		}
	}
}
