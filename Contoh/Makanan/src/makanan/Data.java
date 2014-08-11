/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package makanan;

/**
 *
 * @author root
 */
public class Data {
    int makanan;
    String nama;
    int minuman;
    
    public void Data(int makanan,int minuman,String nama){
        this.nama = nama;
        this.makanan = makanan;
        this.minuman = minuman;
       
        
    }
    public void cetak(){
        System.out.println("Nama :"+nama);
        
         if(makanan==1){
        System.out.println("Makan :Nasi Rendang");
    }else if(makanan == 2){
        System.out.println("Makan :Nasi Telor");
    }else{
        System.out.println("Makan :Nasi Pindang");
    }
       if(minuman==1){
        System.out.println("Minum :Es Teh");
    }else{
        System.out.println("Minum :Es Jeruk");
    }
    }
}
