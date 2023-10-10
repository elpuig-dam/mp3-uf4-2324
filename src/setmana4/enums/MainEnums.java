package setmana4.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainEnums {

    public static void main(String[] args) {
        Alumne alumne = new Alumne("Eric", Alumne.Carrec.DELEGAT,"09929288PUIG");
        Alumne alumne2 = new Alumne("Anna", Alumne.Carrec.SUBDELEGAT,"03429288PUIG");
        UF mp3uf4 = new UF("003004","Introducció a la POO");
        UF mp3uf5 = new UF("003005","POO avançada");

        alumne.addNota(mp3uf4,Qualifier.EXCELLENT);
        alumne.addNota(mp3uf5,Qualifier.SATISFACTORI);
        alumne2.addNota(mp3uf4,Qualifier.NOTABLE);
        alumne2.addNota(mp3uf5,Qualifier.SATISFACTORI);

        List<Alumne> alumneList = new ArrayList<>();
        alumneList.add(alumne);
        alumneList.add(alumne2);


        //Llista de tots els valors possibles del Qualifier
        for(Qualifier q: Qualifier.values()) {
            System.out.printf("%s, %d, %d %n", q.name(), q.ordinal(), q.getValor());
        }

        //Notes de l'alumne 'alumne'
        System.out.println(alumne.getNom());
        for (Map.Entry entry : alumne.getNotes().entrySet()) {
            Qualifier qf = (Qualifier) entry.getValue();
            System.out.printf("%s:%s%n",entry.getKey(),qf.getCode());
        }

        //TODO Treure un llistat de notes de cada un dels alumnes


        //TODO Treure la nota mitja dels alumnes i llistat en ordre alfabètic

    }
}
