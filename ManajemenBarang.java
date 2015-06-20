import java.util.*;
public class ManajemenBarang {
	//Inisialisasi Vector Barang
	public static Vector <String> id = new Vector <String>();
	public static Vector <String> namaBarang= new Vector <String>();
	public static Vector <Integer> hargabeli= new Vector <Integer>();
	public static Vector <Integer> hargajual= new Vector <Integer>();
	
	public static Scanner sc = new Scanner (System.in);
	public static void juragan (){
		boolean haljuragan=false;
		do {
			System.out.println ("");
			System.out.println ("======= Program Penjualan =======");
			System.out.println ("1. Manajemen Barang");
			System.out.println ("2. Manajemen Penjualan");
			System.out.println ("3. Laporan Penjualan");
			System.out.println ("4. Logout");
			System.out.print ("Pilih pilihan [1-3] : ");
			int Pil_Barang = sc.nextInt();
				boolean Barang=false;
				
			switch (Pil_Barang) {
				case 1:
					do {
						System.out.println ("");
						System.out.println ("======= Manajemen Barang =======");
						System.out.println ("1. Menambah Data Barang");
						System.out.println ("2. Menghapus Data Barang");
						System.out.println ("3. Mengganti Data Barang");
						System.out.println ("4. Menampilkan Data Barang");
						System.out.println ("5. Mencari Data Barang");
						System.out.println ("6. Exit");
						System.out.print ("Pilih pilihan [1-4] : ");
						int pilBarang = sc.nextInt();
						int urutan=-1;
						
							if (pilBarang == 1){
							boolean cekBarang = false;
								do {
								System.out.print ("");
								System.out.println ("> Menambah Data Barang ");
								System.out.print ("Masukkan ID : ");
								String ID = sc.next();
									if (id.contains(ID.toUpperCase()) == false){
										System.out.print ("Masukkan Nama Barang : ");
										String NAMA = sc.next();
										
										if (NAMA.contains(NAMA.toUpperCase()) == false){
											System.out.print ("Masukkan Harga Beli : ");
											int HARGA = sc.nextInt();
											
											id.add(ID.toUpperCase());
											namaBarang.add(NAMA.toUpperCase());
											hargabeli.add(HARGA);
											int hj = HARGA*10/100;
											hargajual.add(HARGA+hj);
											cekBarang = true;
										}
										else {
											System.out.println ("Nama Barang telah digunakan");}
									}
									else {
										System.out.println ("ID telah digunakan");}
								} while (cekBarang == false);
							}
							
							if (pilBarang == 2){
								System.out.println ("");
								System.out.print ("> Masukkan ID Barang yang ingin di hapus : ");
								String hapusBarang = sc.next();
								if (id.contains(hapusBarang.toUpperCase())){
									urutan = id.indexOf(hapusBarang.toUpperCase());
									System.out.println ("Apakah Anda akan menghapus");
									System.out.println (id.elementAt(urutan)+"\t"+namaBarang.elementAt(urutan));
									System.out.print ("[y/t]");
									String HapusBarang = sc.next();
									if (HapusBarang.equalsIgnoreCase("y")){
										id.remove(id.elementAt(urutan));
										namaBarang.remove(namaBarang.elementAt(urutan));
										hargabeli.remove(hargabeli.elementAt(urutan));
										hargajual.remove(hargajual.elementAt(urutan));
									}
									else {
									System.out.println ("Data ID "+id.elementAt(urutan)+" tidak terhapus");}
								}
								else {
								System.out.println ("ID tidak ditemukan"); }
							}
							
							if (pilBarang == 3){
								System.out.println ("");
								System.out.println ("> Mengganti Data Barang");
								System.out.print ("Masukkan ID Barang : ");
								String gantiID = sc.next();
								
								if (id.contains(gantiID.toUpperCase())){
									urutan = id.indexOf(gantiID.toUpperCase());
									System.out.println ("Mengganti Data Barang ");
									System.out.println (id.elementAt(urutan)+"\t"+namaBarang.elementAt(urutan)+"\t"+hargabeli.elementAt(urutan));
									System.out.print ("[y/t]");
									String GantiID = sc.next();
									if (GantiID.equalsIgnoreCase("y")){
										System.out.print ("Masukkan Nama Barang : ");
										String NAMA = sc.next();
										namaBarang.setElementAt(NAMA.toUpperCase(), urutan);

										System.out.print ("Masukkan Harga Beli : ");
										int HARGA = sc.nextInt();
										hargabeli.setElementAt(HARGA, urutan);
										//Menentukan harga jual
										int hj2 = (10/100)*Integer.parseInt(hargabeli.elementAt(urutan).toString());
										hargajual.setElementAt((HARGA+hj2), urutan);
									}
									else {
									System.out.println ("Data ID "+id.elementAt(urutan)+" tidak diganti");}
								}
								else {
									System.out.println ("ID Tidak ditemukan");}
							}
							
							if (pilBarang == 4){
								for (int i=0; i<id.size(); i++){
									System.out.println (id.elementAt(i)+"\t"+namaBarang.elementAt(i)+"\t"+hargabeli.elementAt(i)+"\t"+hargajual.elementAt(i));
								}
							}
							
							if (pilBarang == 5){
								int urutann = -1;
								System.out.print ("Masukkan Nama Barang yang ingin dicari : ");
									String NAMA1 = sc.next();
									if (namaBarang.contains(NAMA1.toUpperCase()) == true){
											urutann = namaBarang.indexOf(NAMA1.toUpperCase());
									System.out.println (id.elementAt(urutann)+"\t"+namaBarang.elementAt(urutann)+"\t"+hargabeli.elementAt(urutann)+"\t"+hargajual.elementAt(urutann));
								}else {
									System.out.println("Barang "+ NAMA1 +"tidak ditemukan");
								}
									
							}
							
							if (pilBarang == 6){
								Barang = true;
							}
							
					} while (Barang == false);
				break;
				
				case 2:
					ManajemenBarang.Penjualan();
				break;
				case 3:
					System.out.println ("======= Laporan Penjualan =======");
					System.out.println ("");
					System.out.println ("> Total penjualan");
					for (int k=0; k<4; k++) {
						System.out.println ("Total "+id2.elementAt(k)+" : "+total.elementAt(k));
						//(namaBarang2.elementAt(k).toString())
					}
					System.out.println ("");
					System.out.println ("> Total Keseluruhan "+alltotal.elementAt(0));
				break;
				case 4:
					haljuragan = true;
				break;
			}
		} while (haljuragan == false);
	}
	
	public static Vector total= new Vector();
	public static Vector <String> namaBarang2= new Vector <String>();
	public static Vector <String> id2 = new Vector <String>();
	public static Vector alltotal = new Vector();
	public static Vector totalTransaksi = new Vector();
	
	public static void Penjualan (){
		boolean halPenjualan = false;
		
		do {
			System.out.println ("");
			System.out.println ("======= Halaman Penjualan =======");
			System.out.println ("1. Penjualan");
			System.out.println ("2. exit");
			System.out.print ("Pilih pilihan [1-2] : ");
			int Pil_Penjualan = sc.nextInt();
			int Total=0;
			int TotalTransaksi=0;
			int AllTotal=0;
			
			switch (Pil_Penjualan) {
				case 1:
					boolean inputData = false;
						for (int k=0; k<4; k++) {
								do {
								System.out.print ("");
								System.out.println ("> Menambah Data Penjualan");
								System.out.print ("Masukkan ID : ");
								String ID = sc.next();
								int urutan2=-1;
									if (id.contains(ID.toUpperCase()) == false){
										System.out.print ("Masukkan Nama Barang : ");
										String NAMA = sc.next();
										if (namaBarang.contains(NAMA.toUpperCase()) == true){
											urutan2 = namaBarang.indexOf(NAMA.toUpperCase());
											namaBarang2.add(NAMA);
											
											System.out.print ("Input Jumlah : ");
											int jumlah = sc.nextInt();
											
											id2.add(ID.toUpperCase());
											namaBarang2.add(NAMA.toUpperCase());
											
											Total += jumlah*Integer.parseInt(hargajual.elementAt(urutan2).toString());
											}else
												{
													System.out.println ("nama barang tidak ada");
												}
									}
								} while (inputData == true);
									total.add(Total);
									TotalTransaksi += Total;
							}
									totalTransaksi.add(TotalTransaksi);
									AllTotal += TotalTransaksi;
									alltotal.add(AllTotal);
						
				break;
				
				case 2:
					halPenjualan = true;
				break;
			}
		}while (halPenjualan == false);
	}

}