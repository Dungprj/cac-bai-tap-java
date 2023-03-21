import java.util.Scanner;

public class Bai_2 {
	public static void main(String[] args) {
		// Viet chuong trinh nhap vao mot so tu 2 --> 7 va in ra cac thu tuong ung
		int t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so :");
		t = sc.nextInt();
		if (t >= 2 && t <= 7) {
			System.out.println("Thu " + t);
		}
	}
}
