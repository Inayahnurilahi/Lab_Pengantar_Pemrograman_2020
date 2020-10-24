import java.util.Scanner;

public class TugasPraktikumNomor1 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int a, b, c, d, e; 
			try {
				a = input.nextInt();
				b = input.nextInt();
				c = input.nextInt();
				d = input.nextInt();
				e = input.nextInt();
                System.out.println("Masukkan 5 Angka!");
				int genap = 0;
				int ganjil = 0;
				int positif = 0;
				int negatif = 0;
            // a
            if(a <= 0){
                if(a<0)
                negatif ++;
            }else{
                positif ++;
            }
            if (a % 2 == 0)
            genap ++;
            else
            ganjil ++;
            // b
            if(b <= 0){
                if(b<0)
                negatif ++;
            }else{
                positif ++;
            }
            if (b % 2 == 0)
            genap ++;
            else
            ganjil ++;
            // c
            if(c <= 0){
                if(c<0)
                negatif ++;
            }else{
                positif ++;
            }
            if (c % 2 == 0)
            genap ++;
            else
            ganjil ++;
            // d
            if(d <= 0){
                if(d<0)
                negatif ++;
            }else{
                positif ++;
            }
            if (d % 2 == 0)
            genap ++;
            else
            ganjil ++;
            // e
            if(e <= 0){
                if(e<0)
                negatif ++;
            }else{
                positif ++;
            }
            if (e % 2 == 0)
            genap ++;
            else
            ganjil ++;
            System.out.println(genap + " Angka Genap");
            System.out.println(ganjil + " Angka Ganjil");
            System.out.println(positif + " Angka Positif");
            System.out.println(negatif + " Angka Negatif");
        } catch (Exception er) {
            System.out.println("Inputan tidak Valid!");
        }
    }
}
				