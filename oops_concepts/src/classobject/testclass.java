package classobject;

public class testclass {

	public static void main(String[] args) {
		employee_details ed=new employee_details(35464,"xyz",35000.786);
		System.out.println("id:"+ed.id+" name:"+ed.name+" salary:"+ed.salary);
	int c=ed.add(10, 39);
	System.out.println("addition of a,b is:"+c);
	}

}
