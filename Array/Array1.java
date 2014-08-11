/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author aerdy
 */
public class Array1 {
    public static void main(String[] args) {

int[] values = {1, 3, 5, 7, 9};

int aveValue;
aveValue = getAveAverage (values);
System.out.println("Jumlah total:"+ aveValue);
}
    
public static int getAveAverage(int[] intArray){
int sum = 0;
for (int x =0; x < intArray.length; x++)
sum = sum + intArray [x];
return sum / intArray.length;
}}
