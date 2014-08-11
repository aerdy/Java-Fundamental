public class Scope{
static int x=10;
public static void main(String[] args){
int a = 5;
// variabel x dapat diakses
System.out.println("Nilai x="+x);
System.out.println("Nilai a="+a);
//nested blok
{
int b = 8;
// variabel x masih dikenali
System.out.println("Nilai x="+x);
// variabel a juga dikenali
System.out.println("Nilai a="+a);
System.out.println("Nilai b="+b);
}
//variabel tidak dikenali
System.out.println("Nilai b="+b);
}
}

