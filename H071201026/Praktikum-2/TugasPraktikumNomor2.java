import java.util.Scanner;

public class TugasPraktikumNomor2 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			try {	
				System.out.println("** Menu **");
				System.out.println("1. Mencari Luas Bangun Datar");
				System.out.println("2. Mencari Volume Bangun Ruang\n");
				System.out.println("Input angka sesuai dengan menu yang diinginkan :");
				int MenuUtama = input.nextInt();

		//		
				int Completion = 0;
				double Luas = 0.0;
				double Volume = 0.0;
				double Pi = 3.14159;
				String NamaBangun = "Bangun";
				String NamaRuang = "Ruang";
		//

				if (MenuUtama == 1) {
					System.out.println("\n** Pilih Bangun Datar**");
					System.out.println("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n");
					System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
					int MenuDatar = input.nextInt();

					if (MenuDatar == 1) {
						NamaBangun = "Persegi";
						System.out.println("\nInput Panjang Sisi");
						double Sisi = input.nextInt();
						Luas = Sisi * Sisi;
						Completion++;
					} else if (MenuDatar == 2) {
						NamaBangun = "Persegi Panjang";
						System.out.println("\nInput Panjang");
						double Panjang = input.nextDouble();
						System.out.println("Input Lebar");
						double Lebar = input.nextDouble();
						Luas = Panjang * Lebar;
						Completion++;
					} else if (MenuDatar == 3) {
						NamaBangun = "Segitiga";
						System.out.println("\nInput Alas");
						double Alas =9 09 input.nextDouble();
						System.out.println("Input Tinggi");
						double Tinggi = input.nextDouble();
						Luas = Alas * Tinggi;
						Completion++;
					} else if (MenuDatar == 4) {
						NamaBangun = "Lingkaran";
						System.out.println("\nInput Diameter");
						double Diameter = input.nextDouble();
						Luas = (Pi * (Diameter * Diameter)) / 4.0;
						Completion++;
					} else {
						System.out.println("Maaf! Pilihan tidak terdapat di menu.");
					}

					if (Completion == 1) {
						System.out.printf("\nLuas %s = %.1f\n", NamaBangun, Luas);
					}

				} else if (MenuUtama == 2){
					System.out.println("\n** Pilih Bangun Ruang**");
					System.out.println("1. Kubus\n2. Balok\n3. Kerucut\n4. Bola\n");
					System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
					int MenuRuang = input.nextInt();	

					if (MenuRuang == 1) {
						NamaRuang = "Kubus";
						System.out.println("\nInput Panjang Sisi");
						double Sisi = input.nextInt();
						Volume = Sisi * Sisi * Sisi;
						Completion++;
					} else if (MenuRuang == 2) {
						NamaRuang = "Balok";
						System.out.println("\nInput Panjang");
						double Panjang = input.nextDouble();
						System.out.println("Input Lebar");
						double Lebar = input.nextDouble();
						System.out.println("Input Tinggi");
						double Tinggi = input.nextDouble();
						Volume = Panjang * Lebar * Tinggi;
						Completion++;
					} else if (MenuRuang == 3) {
						NamaRuang = "Kerucut";
						System.out.println("\nInput Jari-jari");
						double Jari = input.nextDouble();
						System.out.println("Input Tinggi");
						double Tinggi = input.nextDouble();
						Volume = (Pi * (Jari * Jari) * Tinggi) / 3;
						Completion++;
					} else if (MenuRuang == 4) {
						NamaRuang = "Bola";
						System.out.println("\nInput Jari-jari");
						double Jari = input.nextDouble();
						Volume = (4 * Pi * (Jari * Jari)) / 3;
						Completion++;
					} else {
						System.out.println("Maaf! Pilihan tidak terdapat di menu.");
					}

					if (Completion == 1) {
						System.out.printf("\nVolume %s = %.1f\n", NamaRuang, Volume);
					}
				} else {
					System.out.println("Maaf! Pilihan tidak ada di menu.");
				}
			} catch (Exception e) {
				System.out.println("\nInput tidak valid!");
			}
			
		}
}
