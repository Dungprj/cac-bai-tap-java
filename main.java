package bai_tap_mang;

import java.util.Iterator;
import java.util.Scanner;




public class main {
	 int data;
	    main(int dataValue){
	        data = dataValue;
	    }
	    public static void swap(main n1, main n2) {
	        int temp = n1.data;
	        n1.data = n2.data;
	        n2.data = temp;
	    }
	    
	    static int max(main a[],int n)
	    {
	    	int m = a[0].data;
	    	for (int i = 1;i<n;i++)
	    	{
	    		if (a[i].data > m)
	    		{
	    			m = a[i].data;
	    		}
	    	}
	    	return m;
	    }
	
	    static int partition_hoare(main a[],int l,int r) {
	    	int i = l-1;
	    	int j = r+1;
	    	int x = a[l].data;
	    	while (true)
	    	{
	    		do
		    	{
		    		++i;
		    	}while(a[i].data<x);
		    	do
		    	{
		    		--j;
		    	}while(a[j].data > x);
		    	if (i<j)
		    	{
		    		swap(a[i],a[j]);
		    	}else return j;
	    	}
	    	
	      }
	    static void quicksort(main a[],int l,int r)
	    {
	    	if (l>=r)return;
	    	int q = partition_hoare(a, l, r);
	    	quicksort(a, l, q);
	    	quicksort(a, q+1, r);
	    }
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong phan tu cho mang :");
		do
		{
			n = sc.nextInt();
		}while (n<0);
		main a[] = new main[n];
		for (int i = 0; i < n; i++) {
			System.out.println("a["+i+"] = ");
			int tmp;
			tmp = sc.nextInt();
			a[i] = new main(tmp);
		}
		System.out.println("Phan tu co gia tri lon nhat la : "+max(a,n));
		
		System.out.println("Mang truoc khi sap sep la :");
		for (int i = 0; i < n; i++) {
			System.out.println("a["+i+"] = "+a[i].data);
		}
		System.out.println("Mang sau khi sap sep la :");
		quicksort(a,0,n-1);
		for (int i = 0; i < n; i++) {
			System.out.println("a["+i+"] = "+a[i].data);
		}
	}
	
}


