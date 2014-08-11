/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import com.sun.org.apache.xpath.internal.operations.Equals;
import javax.swing.JOptionPane;

/**
 *
 * @author aerdy
 */
public class PAsword {
    public static void main(String[] args) {
        String b;
        int a=Integer.parseInt(JOptionPane.showInputDialog("pasworrd"));
        b=JOptionPane.showInputDialog("Username");
        if(a==12345 && b.equals("dede")){
            System.out.println("benar");
        }
        else{
            System.out.println("Salah");
        }
    }
    
}
