package test;

public class helloworld {
	 
	public static void main(String args[]) {
		
		int[] numbers = {10,3,100,90,54};
		
		array_sort(numbers);
		
		System.out.println("昇順に並び替えた配列:");
		for(int number : numbers) {
			System.out.println(number + "");
		}
	}
	

	public static void array_sort(int[] array) {
		boolean discrimination = true;
		int box;
		
		while(discrimination) {
			discrimination = false;
			for(int i=1; i<array.length; i++) {
				if(array[i-1] > array[i]) {
					box = array[i];
					array[i] = array[i-1];
					array[i-1] = box;
					discrimination = true;
				}
			}
		}
	}
}
