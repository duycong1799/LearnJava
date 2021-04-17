package demoOOP;

public class Person {
	private String name;
	private int age;
	private float height;

	public Person(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public void eat(String foodname) {
		System.out.println(name + " is eating " + foodname);
	}

	public int showAge() {
		return age;
	}

	public float showHeight() {
		return height;
	}
	
	public void getInfo() {
		System.out.println("Her name : " + this.name);
		System.out.println("Her age : " + this.age);
		System.out.println("Her height : " + this.height);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	

}
