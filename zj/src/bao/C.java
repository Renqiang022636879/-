package bao;

public class C extends B {


	private A course;
	private D teather;
	
	public A getCourse() {
		return course;
	}
	public void setCourse(A course) {
		this.course = course;
	}
	public D getTeather() {
		return teather;
	}
	public void setTeather(D teather) {
		this.teather = (D) teather;
	}
	public void putcourse(){
		if(course==null){
			System.out.println("Not to choose course");
		}else{
		this.toString();
		}
	}
	public String toString(){
	
//		System.out.println("Student toString is operating");
		return id+name+sex+course+teather.getName();
	}
		
	
	public C(int id, String name, String sex,A course,D teather) {
		super(id, name, sex);
		
			this.course=course;
			this.teather=teather;
		
	
	}
	public A delete() {
		return course=null;
	}}