package demoOOP;

public class Student extends Person {
	public String universityName;

	public Student(String name, int age, float height, String universityName) {
		super(name, age, height);
		this.universityName = universityName;
	}

	public void getInfo() {
		super.getInfo();
		System.out.println("Name University Her is : " + this.universityName);
	}

}
