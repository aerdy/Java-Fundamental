public class ArrayAverage{
public static void main(String[] args){
int[] values = {1, 3, 5, 7, 9};
int aveValue;
aveValue = getAverage(values);
System.out.println("Jumlah total: " + aveValue);
}
public static int getAverage(int[] intArray){
int sum = 0;
// variabel lokal
for(int x = 0; x < intArray.length; x++)
sum = sum + intArray[x];
return sum / intArray.length;
}
}

