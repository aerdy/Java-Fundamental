import java.io.*;
 
public class MainSuit {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        // cetak aturan main dan input dari user
        System.out.println("Permainan suit");
        System.out.println("==============");
        System.out.println("Masukkan salah satu dari 3 kemungkinan :");
        System.out.println("J untuk Jempol");
        System.out.println("T untuk Telunjuk");
        System.out.println("K untuk Kelingking");
        System.out.println(""); // baris kosong
 
        // variabel untuk mengambil input dari user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
 
        // Kita gunakan pernyataan while hingga user betul
        // memasukkan salah satu dari J, T, atau K
        boolean inputvalid = false;
 
        int suitKomputer = 0;
        int suitUser = 0;
 
        // selama input tidak valid, jalankan perulangan ini
        while (!inputvalid) {
            System.out.print("Masukkan suit Anda ");
            try {
                input = br.readLine();
            } catch (IOException ioe) {
                System.out.println("Kesalahan IO, program berhenti");
                System.exit(1);
            }
 
            // pastikan bahwa user memasukkan sesuatu dengan mengecek
            // apakah panjang input > 0
            // jika tidak, maka perulangan akan dilanjutkan
            if (input.length() > 0) {
                switch (input.charAt(0)) {
                    case 'j' :
                    case 'J' :
                        suitUser = 0;
                        inputvalid = true;  // kita ganti inputvalid agar perulangan selesai
                        break;
                    case 't' :
                    case 'T' :
                        suitUser = 1;
                        inputvalid = true;  // kita ganti inputvalid agar perulangan selesai
                        break;
                    case 'k' :
                    case 'K' :
                        suitUser = 2;
                        inputvalid = true;  // kita ganti inputvalid agar perulangan selesai
                        break;
                }
            }
        }
 
        // sekarang menghitung suit komputer
        // Math.random() menghasilkan nilai acak antara 0 dan 1
        // jika kita kali 3, berarti menghasilkan nilai acak antara 0 dan 3
        // perintah (int) untuk mengubah bilangan real menjadi bilangan bulat
        // dengan cara menghilangkan semua digit di belakang koma
        // misalnya 1.0232323 menjadi 1
        suitKomputer = (int)(Math.random()*3);
 
        // suatu saat "mungkin" nilai random bernilai 3
        // karena 3 tidak ada dalam suit kita, maka kita harus ubah menjadi
        // salah satu suit yang valid, yaitu 0, 1, atau 2
        // dalam hal ini kita ganti jadi 2
        if (suitKomputer == 3) {
            suitKomputer = 2;
        }
 
        // menghitung siapa yang menang
        switch (suitKomputer) {
            // jika komputer Jempol
            case 0:
                // cetak suit Komputer
                System.out.println("Suit komputer = Jempol");
                switch (suitUser) {
                    // jika user Jempol
                    case 0:
                        System.out.println("Seri");
                        break;
                    // jika user Telunjuk
                    case 1:
                        System.out.println("Anda kalah");
                        break;
                    // jika user Kelingking
                    case 2:
                        System.out.println("Anda menang");
                        break;
                }
                break; // dari switch(suitKomputer)
            // jika komputer Telunjuk
            case 1:
                // cetak suit Komputer
                System.out.println("Suit komputer = Telunjuk");
                switch (suitUser) {
                    // jika user Jempol
                    case 0:
                        System.out.println("Anda menang");
                        break;
                    // jika user Telunjuk
                    case 1:
                        System.out.println("Seri");
                        break;
                    // jika user Kelingking
                    case 2:
                        System.out.println("Anda kalah");
                        break;
                }
                break; // dari switch(suitKomputer)
            // jika komputer Kelingking
            case 2:
                // cetak suit Komputer
                System.out.println("Suit komputer = Kelingking");
                switch (suitUser) {
                    // jika user Jempol
                    case 0:
                        System.out.println("Anda kalah");
                        break;
                    // jika user Telunjuk
                    case 1:
                        System.out.println("Anda menang");
                        break;
                    // jika user Kelingking
                    case 2:
                        System.out.println("Seri");
                        break;
                }
                break; // dari switch(suitKomputer)
        }
    }
}
