package CollectionConcept;

public class Student {
	int marks;
	String sname;
	
	public Student(String name, int mrks) {
		marks=mrks;
		sname=name;
	}
	
	public void studentDetails() {
		System.out.println(sname+" - "+marks);
	}

}
