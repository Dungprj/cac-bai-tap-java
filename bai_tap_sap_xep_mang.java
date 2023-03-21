package bai_tap_mang;


import java.util.Scanner;

public class hiu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n :");
		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("a["+i+"] = ");
			a[i] = sc.nextInt();
		}
		System.out.println("Mang truoc khi sap xep la ");
		
		for (int i = 0; i < n; i++) {
			System.out.println("a["+i+"] = "+ a[i]);

		}
		
		int m  =a[0];
		for (int i = 1; i < n; i++) {
			if (a[i]>m)
			{
				m = a[i];
			}

		}
		
		System.out.println("Phan tu lon nhat la : "+m);
		
		
	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (a[i] > a[j]) {
	            	
	                int temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }
	    }
	    System.out.println("Mang sau khi sap xep la ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
