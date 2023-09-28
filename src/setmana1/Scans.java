package setmana1;

import java.util.Scanner;

public class Scans {
    public static void main(String[] args) {
        Prints.sep(50,'*',"useDelimiter '-'");
        String s = "Hola-1-3-4,5-adeu";
        Scanner sc = new Scanner(s).useDelimiter("-");
        System.out.println(sc.next());
        System.out.println(sc.nextInt());
        System.out.println(sc.nextFloat());
        System.out.println(sc.nextFloat());
        System.out.println(sc.next());

        Prints.sep(50,'*',"scanner.nextLine()");
        sc = new Scanner("Hola 1 3 4,5 adeu");
        System.out.println(sc.nextLine());

        Prints.sep(50,'*',"useDelimiter per defecte = space");
        sc = new Scanner("Hola 1 3 4,5 adeu");
        System.out.println(sc.next());
        System.out.println(sc.nextInt());
        System.out.println(sc.nextFloat());
        System.out.println(sc.nextFloat());
        System.out.println(sc.next());

        sc = new Scanner(System.in);
        System.out.print("Entra un int: ");
        int n = sc.nextInt();
        System.out.print("Entra una string: ");
        String s2 = sc.next();//Prova-ho amb nextLine() per veure l'efecte del salt de línia
        System.out.println(n + ":" + s2);

        Prints.sep(50,'*',"efecte nextLine i el salt de línia");
        //sc.nextLine();
        String s3 = sc.nextLine();
        System.out.println(s3);
    }
}
