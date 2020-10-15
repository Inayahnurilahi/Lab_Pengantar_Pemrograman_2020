import java.util.Scanner;
public class TugasAsistensiNomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double diameter;
        double tinggi;
        System.out.println("masukkan diameter tabung:");
        diameter = input.nextInt();
        System.out.println("masukkan tinggi tabung:");
        tinggi = input.nextInt();
        double phi = 3.14159f;
        double r = diameter/2;
        double volume = (phi * r * r * tinggi);
        System.out.printf("volume tabung:" + "%.2f", volume);
    }
}
