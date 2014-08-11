/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

/**
 *
 * @author root
 */
public class BintangBesar {
    public static void main(String[] args) {
        //int i=0;
        for(int spasi = 10; spasi >=0; spasi--){
           System.out.println("\n");
            for(int cetak = 0; cetak <=spasi; cetak++){
                 System.out.print("*");    
            }
            //System.out.println("\n");
        }
    }
}
