package kadai4;

public class kadai4_1_1 {
	public static void main(String args[]) {
		
		int[][] scores = {
				{92, 89, 98, 99}, //生徒A {英語, 国語, 数学, 理科}
				{78, 79, 94, 86}, //生徒B 
				{95, 98, 89, 87}  //生徒C 
		};
		
		String[] subjects = {"英語", "国語", "数学", "理科"};
		
		String[] students = {"生徒A", "生徒B", "生徒C"};
		
		//教科のループ
		for(int i=0; i < subjects.length; i++) {
			int maxscores = 0;
			String maxstudents = "";
			int sumscores = 0;
			
			//生徒のループ
			for(int j=0; j < students.length; j++) {			
					if(maxscores < scores[j][i]) {
						maxscores = scores[j][i];
						maxstudents = students[j];
					}
					
					sumscores += scores[j][i];
			}
			System.out.println(subjects[i] + "の[最高点, 最高得点者, 平均点]は" + "[" + maxscores + ", " + maxstudents + ", " + sumscores/students.length + "]");
		}		
	}	
}
