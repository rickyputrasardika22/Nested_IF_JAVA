package Nested_If;

import java.util.Scanner;

public class Nested_If_Diskusi2
{
	public static void main(String []args)
	{
		//deklarasi
		Scanner scan = new Scanner(System.in);
		char kode_jaket, kode_ukuran;
		String merk_jaket, ukuran;
		int harga = 0;
		double totalbayar;
		int totalbeli;
		
		
		//input
		System.out.println("Masukkan kode jaket = " );
		kode_jaket = scan.nextLine().charAt(0);
		
		System.out.println("Masukkan kode ukuran = ");
		kode_ukuran = scan.nextLine().charAt(0);
		
		System.out.println("Masukkan jumlah jaket yang hendak dibeli = ");
		totalbeli = scan.nextInt();
		
		//proses
		if (kode_jaket == 'E')
		{
			System.out.println("Merk Jaket Anda Adalah Eiger ");
				if(kode_ukuran == 'S')
				{
					harga = 150000;
					System.out.println("Jaket Anda Berukuran Small Dengan Harga " + harga);
				}	
				else if(kode_ukuran == 'M')
				{
					harga = 220000;
					System.out.println("Jaket Anda Berukuran Medium Dengan Harga " + harga);
				}
				else if(kode_ukuran == 'L')
				{
					harga = 250000;
					System.out.println("Jaket Anda Berukuran Large Dengan Harga " + harga);
				}	
				else
				{
					harga = 0;
				}
		}		
		else if (kode_jaket == 'P')
		{
			System.out.println("Merk Jaket Anda Adalah Polo");
				if(kode_ukuran == 'S')
				{
					harga = 100000;
					System.out.println("Jaket Anda Berukuran Small Dengan Harga " + harga);
				}	
				else if(kode_ukuran == 'M')
				{
					harga = 125000;
					System.out.println("Jaket Anda Berukuran Medium Dengan Harga " + harga);
				}
				else if(kode_ukuran == 'L')
				{
					harga = 165000;
					System.out.println("Jaket Anda Berukuran Large Dengan Harga " + harga);
				}	
				else
				{
					harga = 0;
				}
		}
		else if (kode_jaket == 'H')
		{
			System.out.println("Merk Jaket Anda Adalah Hammer ");
				if(kode_ukuran == 'S')
				{
					harga = 110000;
					System.out.println("Jaket Anda Berukuran Small Dengan Harga " + harga);
				}	
				else if(kode_ukuran == 'M')
				{
					harga = 130000;
					System.out.println("Jaket Anda Berukuran Medium Dengan Harga " + harga);
				}
				else if(kode_ukuran == 'L')
				{
					harga = 170000;
					System.out.println("Jaket Anda Berukuran Large Dengan Harga " + harga);
				}
				else
				{
					harga = 0;
				}
		}
		else
			{
				System.out.println("Kode Jaket Tidak Valid !!!!");	
			}
		
		totalbayar = totalbeli*harga; 
		
		//output
		System.out.println("Total Bayar Adalah = Rp." + totalbayar);
	}
}
