package studentManager;

import java.util.ArrayList;

import studentManager.model.Student;

public class StudentManager {
	public static void main(String args[]) {
		Student student1 = new Student(1, "ȫ�浿", 80, 70, 40, 100, 80);
		Student student2 = new Student(2, "�̼���", 100, 60, 70, 80, 70);
		Student student3 = new Student(3, "�庸��", 80, 80, 70, 90, 60);
		Student student4 = new Student(4, "���", 100, 70, 30, 80, 60);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		
		double koreanTotal = getKoreanTotalScore( list );
		
		System.out.println(koreanTotal);
	}
	
	/**
	 * �ѱ��� ���� ��������
	 * @param list<Student>
	 * @return double ����
	 */
	public static double getKoreanTotalScore(ArrayList<Student> list) {
		double totalScore = 0;
		
		for( Student s : list ) {
			totalScore += s.getKor();
		}
		
		return totalScore;
	}
}
