import java.util.ArrayList;


public class List {
	public static void main(String[] args) {
		List list =new ArrayList();
		list.add("selamat datang");
		list.add("datang selamat");
		list.add("Selamat datang di java");
		
		System.out.println("Jumlah elemen"+list.size());
		
		for(int x=0;x<list.size();x++){
			System.out.println("element ke"+x+": "list.get(x));
		}
		for(int x=0;x<list.size();x++){
			System.out.println(list.getClass(x));
		}
	}

}
