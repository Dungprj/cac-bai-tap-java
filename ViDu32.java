package slide32;

import java.util.Iterator;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	
		String name ;
		int age ;
		double  diem;
		String number;
		String sex;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Nhap ten sv : ");
		 name = sc.nextLine();
		 System.out.println("Nhap tuoi sv : ");
		 age = sc.nextInt();
		 System.out.println("Nhap diem sv : ");
		 diem = sc.nextDouble();
		 System.out.println("Nhap so dien thoai sv : ");
		 number = sc.next();
		 System.out.println("Nhap gioi tinh sv : ");
		 sex = sc.next();
		 System.out.println("in ra man hinh : "+  name +" "+ " "+age+ " " + " "+ diem +" "+" "+ number +" "+sex);
		
	}
}

