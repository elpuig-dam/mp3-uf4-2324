package setmana5.e14;

import java.util.*;

public class MainLlapissos {

    public static void main(String[] args) {
        List<Llapis> caixa1 = new ArrayList<>();
        List<Llapis> caixa2 = new ArrayList<>();

        for(int i=0; i<10; i++) {
            caixa1.add(new Llapis((int)(Math.random()*7)));
            caixa2.add(new Llapis((int)(Math.random()*7),(float)(Math.random()*3)));
        }

        System.out.println("Caixa 1");
        for(Llapis llapis : caixa1) System.out.println(llapis);
        System.out.println("Caixa 2");
        caixa2.forEach(System.out::println);

        //6. ordenar per color
        Collections.sort(caixa1);
        System.out.println("Caixa 1 per color");
        caixa1.forEach(System.out::println);

        //7. ordenar per gruix amb classe anònima
        Collections.sort(caixa2, new Comparator<Llapis>() {
            @Override
            public int compare(Llapis o1, Llapis o2) {
                return Float.compare(o2.getGruix(),o1.getGruix());
               /* if(o1.getGruix() < o2.getGruix()) return -1;
                else if(o1.getGruix() > o2.getGruix()) return 1;
                else return 0;*/
            }
        });
        System.out.println("Caixa 1 per gruix");
        caixa2.forEach(System.out::println);

        //8,9,10 LinkedList
        List<Llapis> caixa3 = new LinkedList<>(caixa2);
        caixa3.addAll(caixa2);
        System.out.println("Caixa 3 (linkedLilst):" + caixa3.size());
        caixa3.forEach(System.out::println);

        //11. Sense repetits per color
        Set<Llapis> caixa4 = new HashSet<>(caixa3); //Cal tenir implementat equals a la classe Llapis
        System.out.println("Caixa 4 (sense repes):" + caixa4.size());
        caixa4.forEach(System.out::println);

        //12
        Map<Integer,String> map_colors = new HashMap<>();
        //Afegim entrades al map
        map_colors.put(0,"Negre");
        map_colors.put(1,"Vermell");
        map_colors.put(2,"Groc");
        map_colors.put(3,"Verd");
        map_colors.put(4,"Verd");
        map_colors.put(3,"Blanc");

        //Resposta: el color 3 és el Blanc perquè la última línia actualitza la clau 3

        


    }
}
