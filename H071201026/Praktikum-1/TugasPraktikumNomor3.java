import java.util.Scanner;
public class TugasPraktikumNomor3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int h;
        int a;
        int b;
        System.out.println("masukkan tinggi menara:");
        h = input.nextInt();
        System.out.println("masukkan nilai sudut pengamat pada belakang kapal:");
        a = input.nextInt();
        System.out.println("masukkan nilai sudut pengamat pada depan kapal:");
        b = input.nextInt();
        double tanA = Math.tan(Math.toRadians(a));
        double tanB = Math.tan(Math.toRadians(b));
        double panjangkapal = (h * tanA) - (h * tanB);
        if (90 > a && a > b){
            System.out.printf("panjang kapal : %.1f meter", panjangkapal);
        }
        else {
            System.out.printf("Error : Data yang anda input salah. Jalankan ulang program.");
        }
    }    
}
