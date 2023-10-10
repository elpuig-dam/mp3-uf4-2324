package setmana4.enums;

import java.util.HashMap;
import java.util.Map;

public class Alumne {
    public enum Carrec {
        DELEGAT,
        SUBDELEGAT,
        SENSE_CARREC
    }
    private String nom;
    private String idalu;
    private Carrec carrec;
    private Map<UF,Qualifier> notes;

    public Alumne(String nom, Carrec carrec, String idalu) {
        this.nom = nom;
        this.idalu = idalu;
        this.carrec = carrec;
        notes = new HashMap<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIdalu() {
        return idalu;
    }

    public void setIdalu(String idalu) {
        this.idalu = idalu;
    }

    public Map<UF, Qualifier> getNotes() {
        return notes;
    }

    public void addNota(UF uf , Qualifier qf) {
        notes.put(uf,qf);
    }


}
