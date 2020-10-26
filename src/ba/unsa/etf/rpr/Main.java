package ba.unsa.etf.rpr;
import java.util.Scanner;
import java.lang.Exception;
public class Main {
    public static int SumaCifara (int broj) {
        int n = 0;
        int suma = 0;
        while (broj != 0) {
            n = broj % 10;
            suma = suma + n;
            broj = broj / 10;
        }
        return suma;
    }

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Unesite broj: ");
            int n = in.nextInt();
            for (int i = 1; i <= n; i++) {
                if (i % SumaCifara(i) == 0) System.out.print(i+" ");

            }
    }
}
