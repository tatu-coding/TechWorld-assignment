package kadai4;

public class kadai4_1_2 {
	public static void main(String args[]) {
		
		int scores[][] = {
				{92, 89, 98, 99},
				{78, 79, 94, 86},
				{95, 98, 89, 87}
		};
		
		String[] subjects = {"英語", "国語", "数学", "理科"};
		String[] students = {"生徒A", "生徒B", "生徒C"};
		int maxsumscores = 0;
		String maxstudents = "";
		int totalscores = 0;
		

		//生徒のループ
		for(int i=0; i<students.length; i++) {
			int sumscores = 0;
			
			//教科のループ
			for(int j=0; j<subjects.length; j++) {
				 sumscores += scores[i][j];
			}
			
			if(maxsumscores < sumscores) {
				 maxsumscores = sumscores;
				 maxstudents = students[i];
			}
			
			totalscores += sumscores;			
		}
		
		System.out.println("合計点の[最高点, 最高得点者, 平均点]は" + "[" + maxsumscores + ", " + maxstudents + ", " + totalscores/students.length + "]");
	}
}