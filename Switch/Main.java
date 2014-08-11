import java.util.Scanner;
public class Main {
public static void main(String[] args) {
int pilihan;
Scanner sc = new Scanner (System.in);

System.out.println("Menu:");
System.out.println("1. Seleksi Lulus");
System.out.print("2. Soto\n3. Sate\nPilihan Anda : ");
pilihan = sc.nextInt();
switch(pilihan)
{
case 1:
int nilai;
System.out.print("Masukkan nilai : ");
nilai = sc.nextInt();
if (nilai >=70)
System.out.println("LULUS");
else if ((nilai == 0))
System.out.println("GAGAL");
break;
case 2: System.out.println("Soto Ayam"); break;
case 3: System.out.println("Sate Kambing"); break;
default: System.out.println("Menu tidak ada"); break;
}
System.out.println("Terima kasih");
}
}
