package Nested_If;

import java.util.Scanner;

public class Nested_IF 
{
	public static void main(String []args)
	{
		//deklarasi
		Scanner scan = new Scanner(System.in);
		char kode_jaket, kode_ukuran;
		int harga = 0;
		
		//input
		System.out.println("Masukkan kode jaket = " );
		kode_jaket = scan.nextLine().charAt(0);
		
		System.out.println("Masukkan kode ukuran = ");
		kode_ukuran = scan.nextLine().charAt(0);
		
		//proses
		if (kode_jaket == 'E')
		{
			if (kode_ukuran == 'S')
			{
				harga = 150000;
			}
			else if (kode_ukuran == 'M')
			{
				harga = 220000;
			}
			else if (kode_ukuran == 'L')
			{
				harga = 250000;
			}
			else
			{
				harga = 0;
			}	
		}
		else if (kode_jaket == 'P')
		{
			if (kode_ukuran == 'S')
			{
				harga = 100000;
			}
			else if (kode_ukuran == 'M')
			{
				harga = 125000;
			}
			else if (kode_ukuran == 'L')
			{
				harga = 165000;	
			}
			else
			{
				harga = 0;
			}
				
		}
		else if (kode_jaket == 'H')
		{
			if (kode_ukuran == 'S')
			{
				harga = 110000;
			}	
			else if (kode_ukuran == 'M')
			{
				harga = 130000;
			}	
			else if (kode_ukuran == 'L')
			{
				harga = 170000;
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
		
		System.out.println("Kode Jaket Anda Adalah = " + kode_jaket);
		System.out.println("Ukuran Jaket Anda Adalah = " + kode_ukuran);
		System.out.println("Harga Yang Harus Dibayar = Rp." + harga);
	}
}
