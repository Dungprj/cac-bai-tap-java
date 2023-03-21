package a;

import java.util.Scanner;

public class hinhtron {

	
		public double bankinh;
		public double getChuvi()
		{
			return 2*Math.PI*this.bankinh;
		}
		public double getDientich()
		{
			return Math.PI*Math.pow(this.bankinh,2);
		}
		public void print()
		{
			System.out.println("Ban kinh "+ this.bankinh);
			System.out.println("Chu vi "+this.getChuvi());
			System.out.println("Dien tich "+this.getDientich());
		}
		public static void main(String[] args) {
			hinhtron a = new hinhtron();
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap ban kinh :");
			a.bankinh = sc.nextFloat();
			a.print();
		}
	

}










