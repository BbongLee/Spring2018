package methodTest;

public class Exam_3 {
	public String pass2(int jum1, int jum2, int jum3){
		float avg = (jum1+jum2+jum3)/3;
		if(avg>=60){
			return "�հ��Դϴ�";
		}else {
			return "���հ��Դϴ�";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam_3 exam3 = new Exam_3();
		System.out.println(exam3.pass2(100,70,80));
	}
}
