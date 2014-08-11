/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package makanan;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Makanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String nama  = JOptionPane.showInputDialog("Masukkan nama :");
    int makanan =Integer.parseInt( JOptionPane.showInputDialog("____Menu Makanan____\n"
            + "1. Nasi Rendang = Rp 10.000 \n"
            + "2. Nasi Telor = Rp 5.000\n"
            + "3. Nasi Pindang = Rp 8.000\n\n"
            + "Masukkan pilihan ="));
    
   
     int minuman =Integer.parseInt( JOptionPane.showInputDialog("____Menu Minuman____\n"
            + "1. Es Teh = Rp 2.000 \n"
            + "2. Es Jeruk = Rp 3.000\n"
            + "Masukkan pilihan ="));

    
    
    Data dt = new Data();
    dt.Data(makanan, minuman, nama);
    dt.cetak();
    } 
    
}