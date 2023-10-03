package setmana2.e11;

import java.util.Scanner;

public class e11 {
    public static void main(String[] args) {
        int[] freq = new int[12];
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantes vegades vols llançar els daus? ");
        int tirades = sc.nextInt();

        int d1,d2;
        for(int i = 0; i < 12; i++) {
            freq[i] = 0;
        }

        System.out.println("Llançament...");

        for(int i = 0; i < tirades; i++) {
            d1 = (int)(Math.random() * 6.0) + 1;
            d2 = (int)(Math.random() * 6.0) + 1;
            ++freq[d1 + d2 - 1];
        }

        System.out.println("Resultat");

        for(int i = 1; i < 12; i++) {
            System.out.println(i + 1 + " -->\t" + freq[i] + " vegades");
        }

    }
}
