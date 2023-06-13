package day17This;
class Student {
	int rollno;
	float fee;
	Student(int rollno, float fee) {		
		rollno = rollno;
		fee = fee;
	}
	void display() {
		System.out.println(rollno + " " +  fee);
	}
}
class ThisKeyword1 {
	public static void main(String args[]) {
		Student s1 = new Student(111, 5000f);
		s1.display();//
		Student s2 = new Student(112, 6000f);
		s2.display();//
	}
}
