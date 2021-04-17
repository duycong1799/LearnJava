package tinhGiaiThua;

import java.util.Scanner;

public class main {

	/**
	 * main
	 * 
	 * @author viettuts.vn
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Menu");
		System.out.println("1.Nhập thông tin sinh viên");
		System.out.println("2.Chỉnh sửa thông tin sinh viên");
		
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		switch (select) {
		case 1:
			
			addStudent();
			break;
		case 2:
			updateStudent();
			break;
		default:
			break;
		}

	}
	
	public static void addStudent() {
		Person ptest = new Person();
		input(ptest);
		PersonDao personDao = new PersonDaoImpl();
		personDao.create(ptest);
		System.out.println("Them vao database thanh cong");
		
//		System.out.println("==============================");
//		System.out.println(" Id ban vua nhap la :" + p.getId());
//		System.out.println(" Ten ban vua nhap la :" + p.getName());
//		System.out.println(" Tuoi ban vua nhap la :" + p.getAge());
//		System.out.println(" Dia chi ban vua nhap la :" + p.getAddress());
//		System.out.println(" SSN ban vua nhap la :" + p.getSsn());
		
	}
	public static void updateStudent() {
		Scanner sc6 = new Scanner(System.in);
		Person pupdate = new Person();
		System.out.println("Nhap id can sua :");
		int id1 = sc6.nextInt();
		pupdate.setId(id1);
		
		input(pupdate);
		
		PersonDao person = new PersonDaoImpl();
		person.update(pupdate);
		
		System.out.println("Sua thanh cong!");
		
	}
	
	public static void input(Person p) {
//		 = new Person();
		
		Scanner sc0 = new Scanner(System.in);
		System.out.print("Nhap id sinh vien :");
		int id1 = sc0.nextInt();
		p.setId(id1);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Nhap ten sinh vien :");
		String nameInput = sc1.nextLine();
		p.setName(nameInput);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Nhap tuoi sinh vien :");
		int age1 = sc2.nextInt();
		p.setAge(age1);
		
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Nhap dia chi sinh vien :");
		String add1 = sc3.nextLine();
		p.setAddress(add1);
		
		Scanner sc4 = new Scanner(System.in);
		System.out.print("Nhap SSN sinh vien :");
		String ssn1 = sc4.nextLine();
		p.setSsn(ssn1);
	}
}