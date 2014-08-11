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
public class GarbageColector {
    public static void main(String[] args) {
        Date d= getDate();
        System.out.println(d);
    }
    public static Date getDate(){
        StringBuffer buffer=new StringBuffer("garbage colectro");
        Date date= new Date();
        return date;
    }
    
}
