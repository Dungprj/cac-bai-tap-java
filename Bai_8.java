import java.util.Scanner;

public class Bai_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhap chuoi :");
		s = sc.nextLine();
		
		for (int i = 0;i<s.length();i++)
		{
			char kt = s.charAt(i);
			System.out.println(kt);
		}
			
	}
}
