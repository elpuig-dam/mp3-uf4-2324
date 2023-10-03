package setmana2.e12;

import java.util.Scanner;

public class JocDaus {
    private Dau dau1;
    private Dau dau2;
    private Dau dau3;
    int guanyades;

    public JocDaus() {
        dau1 = new Dau();
        dau2 = new Dau();
        dau3 = new Dau();
        guanyades = 0;
    }
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("1. Tirar daus");
            System.out.println("0. Acabar");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    if(jugar()) {
                        guanyades++;
                    };
                    break;
                case 0:
                    System.out.printf("Has guanyat %d partides%n", guanyades);
                    break;

                default:
                    System.out.println("1 per tirar els dau, 0 per tornar al menú principal");
                    break;
            }


        } while(op != 0);
    }

    public boolean jugar() {
        dau1.tirar();
        dau2.tirar();
        dau3.tirar();
        System.out.printf("%s%n%s%n%s%n", dau1, dau2, dau3);
        if(dau1.equals(dau2) && dau2.equals(dau3)) return true;
        else return false;
    }

    public void start() {
        menu();
    }
}
