class TestContinue{
public static void main(String[] args){
int x=10;
System.out.println(“Sebelum while”);
while(x<=50){
x++;
if(x%2==0)
continue;
System.out.println(“Nilai x : ”+x);
}
System.out.println(“Sesudah while”);
}
}

