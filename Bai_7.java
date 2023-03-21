import java.util.Scanner;

public class Bai_7 {
	public static void main(String[] args) {
		int sodong;
		int socot;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Nhap so dong :");
			sodong = sc.nextInt();
			
		}while(sodong<0);
		do
		{
			System.out.println("Nhap so cot:");
			socot = sc.nextInt();
			
		}while(socot<0);
		int a[][] = new int[sodong][socot];
		for (int i = 0;i<sodong;i++)
		{
			for (int j = 0;j<socot;j++)
			{
				System.out.println("Nhap phan tu thu A["+i+"]"+"["+j+"]");
				a[i][j] = sc.nextInt();
			}
		}
		
		
		int max = a[0][0];
		for (int i = 0;i<sodong;i++)
		{
			for (int j = 0;j<socot;j++)
			{
				if (a[i][j]>max)
				{
					max = a[i][j];
				}
			}
		}
		
		System.out.println("Max cua mang la : "+max);
	}
}
