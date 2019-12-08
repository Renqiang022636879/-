package bao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 A course=new A(1, "Japonese", "tokyo",3,3);
		 D teather=new D(1, "wang老师", "women",course);
		 C student=new C(1, "小王", "men",course,teather);
		 System.out.println(student.toString());
		 student.delete();
//		 student.setCourse(null);
//		 student.setTeather(null);
		 student.putcourse();
		 
	}
	

}
