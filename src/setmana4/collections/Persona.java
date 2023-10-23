package setmana4.collections;

public class Persona implements Comparable<Persona> {
    private String nom;
    private int edat;

    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                '}';
    }

    
    @Override
    public int compareTo(Persona o) {
        if(this.edat < o.getEdat()) return 1;
        else if(this.edat > o.getEdat()) return -1;
        else return 0;
    }
}
