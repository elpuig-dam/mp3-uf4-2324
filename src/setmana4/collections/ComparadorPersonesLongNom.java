package setmana4.collections;


import java.util.Comparator;

public class ComparadorPersonesLongNom implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        if(p1.getNom().length() < p2.getNom().length()) return -1;
        else if (p1.getNom().length() > p2.getNom().length()) return 1;
        else return 0;
    }
}
