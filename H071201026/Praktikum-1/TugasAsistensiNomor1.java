import java.util.Scanner;
public class TugasAsistensiNomor1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int panjang;
        System.out.println("masukkan panjang rusuk kubus");
        panjang = input.nextInt();
        int luas = 6 * panjang * panjang;
        System.out.println("total luas permukaan kubus ="+luas);
    }
}
