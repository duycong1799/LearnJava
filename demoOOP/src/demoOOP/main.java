package demoOOP;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person a = new Person();
//		a.name = "DuyCong";
//		a.age = 21;
//		a.height = 86.5f;
//		// tao doi tuong cach 2 
//		Person b = new Person("Ngoc", 20, 56);
//		//goi 1 phuong thuc va truyen tham so
//		b.eat("Meat");
//		//show age
//		int age = b.showAge();
//		System.out.println("Her Age : " + age);
//		//show height
//		System.out.println("Her Height : " + b.showHeight());
		Student b = new Student("Ngoc", 20, 56.6f, "PTIT");
		b.getInfo();
		System.out.println("=============");
		Person c = new Person("Duy", 22, 80.4f);
		c.setName("Duy_Cong_dz_nhat-vu_tru");
		System.out.println("He name : " + c.getName() );
		System.out.println("He age : " + c.getAge());
		System.out.println("He height : " + c.getHeight());
	}

}
