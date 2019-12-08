package bao;

public class D extends B {
	private A course;
	public String toString(){
		System.out.println("teather toString is operating");
		return id+name+sex+course;
	}
	public D(int id, String name, String sex,A course) {
		super(id, name, sex);
		this.course=course;
	}

}
