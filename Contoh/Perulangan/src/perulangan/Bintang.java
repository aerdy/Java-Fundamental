/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Bintang {
    public static void main(String[] args) {
         //int i=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka= "));
        
        for(int spasi =0; spasi <=10; spasi++){
           System.out.println("\n");
            for(int cetak = 0; cetak <=spasi; cetak++){
                 System.out.print("*");
                 
            }
        }
    }
}
