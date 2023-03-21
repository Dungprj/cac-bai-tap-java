import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Bai_3 {
	//In ra tong cac so lon hon 100
	public static void main(String[] args) {
		int s = 0;
		Scanner sc = new Scanner(System.in);
		int tmp;
		while (s < 100)
		{
			System.out.println("Nhap so :");
			tmp = sc.nextInt();
			s+=tmp;
		}
		System.out.println("Tong cua ca so da nhap la :"+s);
	}
}
