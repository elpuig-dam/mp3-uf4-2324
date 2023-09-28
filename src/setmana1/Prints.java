package setmana1;

import java.util.Arrays;

public class Prints {
    public static void sep(int n, char c, String msg) {
        for (int i = 0; i < n / 2; i++)
            System.out.print(c);
        if (!msg.equals("")) System.out.print(" " + msg + " ");
        for (int i = 0; i < n / 2; i++)
            System.out.print(c);
        System.out.println();
    }

    public static void main(String[] args) {

        // Print amb salt de línia
        System.out.println("Hola Món!");
        Prints.sep(50, '*', "1");

        //Print amb formats
        //arguments % : %[flags][width][.precision]conversion-character
        String nom = "Joanna";
        int edat = 29;
        float pes = 66.5f;

        if (args.length > 0) {
            try {
                nom = args[0];
                edat = Integer.parseInt(args[1]);
                pes = Float.parseFloat(args[2]);
            } catch (NumberFormatException ex) {
                System.out.println("Algún argument no és del tipus correcte: " + ex);
            }
        }
        System.out.printf("Hola %S%n", nom);
        System.out.printf("Na %s té %d i pesa %.2f kilograms%n", nom, edat, pes);

        System.out.println("args = " + Arrays.deepToString(args));

        /** Per executar des de la línia de comandes indicant el path
         java -cp out/production/MP3-UF1-2021/ [package].Prints
         o bé
         java -cp out/production/MP3-UF1-2021/: [package].Prints
         No caldria posar class-path si executem desde el directori on hi ha la class
         */

    }
}
