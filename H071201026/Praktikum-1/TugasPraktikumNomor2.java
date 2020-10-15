import java.util.Scanner;
public class TugasPraktikumNomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int detik;
        System.out.println("masukkan jumlah detik yang akan dikonversi :");
        detik = input.nextInt();
        int jamhasil = detik /3600;
        int menithasil = (detik%3600)/60;
        int detikhasil = (detik%3600)%60;
        System.out.print("hasil kovensi dari detik=");
        System.out.printf("%02d:", jamhasil);
        System.out.printf("%02d:", menithasil);
        System.out.printf("%02d\n", detikhasil);
    }
}
