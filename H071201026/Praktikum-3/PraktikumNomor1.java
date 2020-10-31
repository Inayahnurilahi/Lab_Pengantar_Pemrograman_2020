import java.util.Scanner;
public class PraktikumNomor1 {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner (System.in);
            int X, Y;
            X = input.nextInt();
            Y = input.nextInt();
            for(int i = X<=Y? X:Y; i<=(X<=Y? Y:X); i++){
                if (i<=0)
                {
                    if(i==0) 
                        System.out.printf("%d nol\n",i); 
                    else if(i%2==0)
                        System.out.printf("%d genap negatif\n",i);
                    else
                        System.out.printf("%d ganjil negatif\n",i); 
                }
                else
                {
                    if(i%2==0)
                        System.out.printf("%d genap positif\n",i);
                    else
                        System.out.printf("%d ganjil positif\n",i);
                }
            }
        }
        catch (Exception e) {
            System.out.println("Data yang dimasukkan harus bilangan bulat!");
        }
    }
}
