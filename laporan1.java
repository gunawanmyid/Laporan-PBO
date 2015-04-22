/**
 * 
 */
package mariana;

/**
 * @author anha
 *
 */
public class laporan1 {

	/**
	 * @param args
	 */
	static String Praktikum = "Praktikum Pertama"; // berikan penjelasan disini
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ini adalah laporan pertama PBO"); // berikan penjelasan disini
		test(); // berikan penjelasan disini
		biodata(); // berikan penjelasan disini
		penjumlahan(); // berikan penjelasan disini
		pengurangan(); // berikan penjelasan disini
		perkalian(); // berikan penjelasan disini
		pembagian(); // berikan penjelasan disini
		
		
	}
	public static void test() // berikan penjelasan disini
	{
		System.out.println(Praktikum); // berikan penjelasan disini
	}
	//pemanggilan biodata
	public static void biodata()
	
	{
		String nama ="Mariana"; // berikan penjelasan disini
		String nim  ="60200112085";
		String matakuliah ="PBO";
		String jurusan ="Tekhnik Informatika";
		System.out.println("Nama"+":" + nama + "\nNIM "+ ":" + nim + "\nPraktikum "+matakuliah + "\njurusan "+":"+jurusan);
	}
	//penjumlahan
	public static void penjumlahan()
	{
		int i =20; // berikan penjelasan disini kenapa integer
		int j =30;
		System.out.print("hasil penjumlahan "  +i + "+" + j + "=");
		System.out.print(i+j); // berikan penjelasan disini
		
	}
	//pengurangan
	public static void pengurangan() // berikan penjelasan disini
	{
		int l =40;
		int k =30;
		System.out.print("\nhasil pengurangan "  +l+ "-" +k+ "=");
		System.out.print(l-k);
		
		
	}
	//perkalian
		public static void perkalian() // berikan penjelasan disini
		{
			int m =12;
			int n =13;
			System.out.print("\nhasil perkalian "  +m+ "*" +n+ "=");
			System.out.print(m*n);
			
			
		}
		//pembagian
		public static void pembagian() // berikan penjelasan disini
		{
			float g =60; // berikan penjelasan disini kenapa float
			float h =12;
			System.out.print("\nhasil pembagian " +g+ "/" +h+ "=");
			System.out.print(g/h);
			
			
		}
}
