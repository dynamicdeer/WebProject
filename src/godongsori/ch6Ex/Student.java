package godongsori.ch6Ex;

public class Student {
	String name;	//학생이름
	int ban;		//반
	int no;			//번호
	int kor;		//국어점수
	int eng;		//영어점수
	int math;		//수학점수
	
	public Student(String name, int ban, int no, int kor, 
			int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Student() {
	}

	int getTotal(){
		return kor + eng + math;
	}
	
	float getAverage(){
		float average = (float)getTotal() / 3;
		return (float) (Math.round(average * 10.0) / 10.0);
	}

	public String info() {
		return String.format("%s,%d,%d,%d,%d,%d,%d,%.1f", 
				name, ban, no, kor, eng, math, getTotal(),
				getAverage());
	}
}
