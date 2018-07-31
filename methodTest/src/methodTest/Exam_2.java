package methodTest;

public class Exam_2 {
	
	public boolean pass1(int jum1, int jum2, int jum3){
		float avg = (jum1+jum2+jum3)/3;
		if(avg>=60){
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam_2 exam2 = new Exam_2();
		boolean isPass = exam2.pass1(100,70,80);
		if(isPass){
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
	}

}
