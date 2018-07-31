package methodTest;

public class Exam_1 {
	
	public void pass(int jum1, int jum2, int jum3){
		float avg = (jum1+jum2+jum3)/3;
		if(avg>=60){
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam_1 exam = new Exam_1();
		exam.pass(100,70,80);
		exam.pass(60,60,50);
	}

}
