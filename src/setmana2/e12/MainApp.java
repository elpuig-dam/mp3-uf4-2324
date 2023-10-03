package setmana2.e12;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Daus");
            System.out.println("2. Parxis");
            System.out.println("3. Escacs");
            System.out.println("4. Fallguys");
            System.out.println("0. Acabar");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    //System.out.println("joc de daus en construcció");
                    JocDaus joc = new JocDaus();
                    joc.start();
                    break;
                case 2:
                    System.out.println("parxis en construcció");
                    break;
                case 3:
                    System.out.println("escacs en construcció");
                    break;
                case 4:
                    System.out.println("fallguys en construcció");
                    break;
                case 0:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Ha de ser un número entre 0 i 4");
            }

        } while (op != 0);


    }
}
