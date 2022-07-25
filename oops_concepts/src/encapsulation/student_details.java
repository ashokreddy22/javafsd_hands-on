package encapsulation;

public class student_details {
	private int id;
	private String name;
	private double marks;
	void getid(int id) {
		this.id=id;
	}
	void getname(String na) {
		this.name=na;
	}
	void getmarks(int ma) {
		this.marks=ma;
	}
void details() {
	System.out.println("id= "+id+" name="+name+" `marks="+marks);
}

}

