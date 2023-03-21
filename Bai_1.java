import java.util.Scanner;

public class Bai_1 {
	public static void main(String[] args) {
		//viet chuong chinh nhap vao hai so va in ra so nho nhat
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a :");
		a = sc.nextInt();
		System.out.println("Nhap b :");
		b = sc.nextInt();

		if (a>b)
		{
			System.out.println("So nho hon la :"+ b);
		}else if (a<b)
		{
			System.out.println("So nho hon la : "+a);
		}else
		{
			System.out.println("Hai so bang nhau");
		}
		

		
	}
}
