/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author aerdy
 */
import java.util.Date;
public class EksperimenGarbageColector {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("jumlah memori awal"+rt.totalMemory());
        for(int n=1;n<1000000;n++){
            Date d= new Date();
            d=null;
        }
        System.out.println("Jumlah memori tersedia sebelum gc"+rt.freeMemory());
        System.gc();
        System.out.println("Jumlah memori tersedia setelah gc"+rt.freeMemory());
    }
    
}
