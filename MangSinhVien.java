package HUMG;

import java.util.Scanner;

public class SinhVien {
	private String hoten;
	private int namsinh;
	private double diemtrungbinh;


	public String getHoten() {
		return this.hoten;
	}



	public void setHoten(String hoten) {
		this.hoten = hoten;
	}



	public int getNamsinh() {
		return this.namsinh;
	}



	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}



	public double getDiemtrungbinh() {
		return this.diemtrungbinh;
	}



	public void setDiemtrungbinh(double diemtrungbinh) {
		this.diemtrungbinh = diemtrungbinh;
	}

	

	public void Nhapthongtin()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ho ten :");
		this.hoten = sc.nextLine();
		do
		{
			System.out.println("Nhap nam sinh :");
			this.namsinh = sc.nextInt();
		}while(this.namsinh <= 0);
		
		do
		{
			System.out.println("Nhap diem trung binh :");
			this.diemtrungbinh = sc.nextDouble();
		}while(this.diemtrungbinh <0 || this.diemtrungbinh > 4);
		
	}
	
	
	public void Hienthi()
	{
		System.out.println("Ho ten la : "+this.hoten);
		System.out.println("Nam sinh la : "+this.namsinh);
		System.out.println("Diem trung binh la : "+this.diemtrungbinh);
		System.out.println("------------------------------------");
	}
	
	public String Phanloai()
	{
		String hocluc = "";
		if (this.diemtrungbinh < 1)
		{
			hocluc = "kem";
		}else if (this.diemtrungbinh >= 1 && this.diemtrungbinh < 2)
		{
			hocluc = "yeu";
		}else if (this.diemtrungbinh >=2 && this.diemtrungbinh < 2.5)
		{
			hocluc = "trungbinh";
		}else if (this.diemtrungbinh >=2.5 && this.diemtrungbinh < 3.2)
		{
			hocluc = "kha";
		}else if (this.diemtrungbinh >=3.2 && this.diemtrungbinh < 3.6)
		{
			hocluc = "gioi";
		}else
		{
			hocluc = "xuatsac";
		}
		return hocluc;
	}
	
	public boolean hocluctrenkha()
	{
		if (this.Phanloai() == "gioi" ||this.Phanloai() == "xuatsac" )
		{
			return true;
		}else return false;
	}
	
	public void swap(SinhVien a)
	{
		SinhVien tmp = new SinhVien();
		tmp.hoten = this.hoten;
		tmp.namsinh = this.namsinh;
		tmp.diemtrungbinh = this.diemtrungbinh;
		
		this.hoten = a.hoten;
		this.namsinh = a.namsinh;
		this.diemtrungbinh = a.diemtrungbinh;
		
		a.hoten = tmp.hoten;
		a.namsinh = tmp.namsinh;
		a.diemtrungbinh = tmp.diemtrungbinh;
		
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong sinh vien ");
		n = sc.nextInt();
		SinhVien a[] = new SinhVien[n];
		for (int i = 0; i < a.length; i++) {
			
			SinhVien tmp = new SinhVien();
			tmp.Nhapthongtin();
			a[i] = tmp;
		}
		while(true)
		{
			System.out.println("1.Hien thi thong tin cua toan bo sinh vien");
			System.out.println("2.Hien thi thong tin cua sinh vien hoc luc kha tro len ");
			System.out.println("3.Hien thi thong tin cua sinh vien theo diem trung binh giam dan ");
			System.out.println("4.Thoat");
			int lc;
			System.out.print("Nhap luc chon : ");
			lc = sc.nextInt();
			System.out.println();
			
			if (lc == 1)
			{
				for (int i = 0; i < a.length; i++) {
					a[i].Hienthi();
				}
			}else if (lc == 2)
			{
				for (int i = 0; i < a.length; i++) {
					if (a[i].hocluctrenkha())
					{
						a[i].Hienthi();
					}
				}
			}else if (lc == 3)
			{
				for (int i = 0;i<a.length-1;i++)
				{
					for (int j = i+1;j<a.length;j++)
					{
						if (a[i].getDiemtrungbinh() < a[j].getDiemtrungbinh())
						{
							a[i].swap(a[j]);
						}
					}
				}
				for (int i = 0; i < a.length; i++) {
					a[i].Hienthi();
				}
				
				
			}else
			{
				break;
			}
		}
	}
	
	
	
	
		
}
