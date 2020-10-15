import java.util.Scanner;
public class TugasPraktikumNomor1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int kecepatan ;
        int waktu ;
        System.out.println("masukkan waktu perjalanan:");
        waktu = input.nextInt();
        System.out.println("masukan kecepatan perjalanan");
        kecepatan = input.nextInt();
        float jarak = kecepatan * waktu;
        float bensin = jarak/14;
        System.out.println("total bensin yang digunakan ="+bensin+"L");
    }
}
