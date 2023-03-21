import java.util.Scanner;

public class Bai_6 {
	public static void main(String[] args) {
		int n;
		int s = 0;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Nhap n :");
			n = sc.nextInt();
		}while (n<=0);
		
		int a[] = new int[n];
		for (int i = 0 ;i<n;i++)
		{
			System.out.println("Nhap phan tu thu "+ (i+1));
			a[i] = sc.nextInt();
		}
		
		for (int i = 0;i<n;i++)
		{
			if (a[i]% 2 == 0)
			{
				s+=a[i];
			}
		}
		System.out.println("Tong cac so chan trong mang la : "+s);
	}
}
