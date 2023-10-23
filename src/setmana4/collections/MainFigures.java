package setmana4.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainFigures {
    public static void main(String[] args) {

        Persona p1 = new Persona("Iván", 18);
        Persona p2 = new Persona("Hao", 26);
        Persona p3 = new Persona("Jordi", 17);

        List<Persona> persones = new ArrayList<>();
        persones.add(p1);
        persones.add(p2);
        persones.add(p3);

        for(Persona p : persones) {
            System.out.println(p);
        }


        Collections.sort(persones);
        for(Persona p : persones) {
            System.out.println(p);
        }


        Collections.sort(persones,new ComparadorPersonesLongNom());

        Collections.sort(
                persones,
                new Comparator<Persona>() {
                @Override
                public int compare(Persona o1, Persona o2) {
                    if(p1.getNom().length() < p2.getNom().length()) return -1;
                    else if (p1.getNom().length() > p2.getNom().length()) return 1;
                    else return 0;
                }
            }
            );

        

        persones.forEach(System.out::println);


    }
}
