package setmana5.e14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DausVersioMap {
    public static void main(String[] args) {
        Map<Integer,Integer> freq = new HashMap<>();
        int tirades, d1, d2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantes vegades vols llançar els daus? ");
        tirades = sc.nextInt();

        System.out.println("Llançament...");
        for(int i=0; i<tirades; i++) {
            d1 = (int) (Math.random()*6) + 1;
            d2 = (int) (Math.random()*6) + 1;
            if(freq.containsKey(d1+d2)) freq.put(d1+d2,freq.get(d1+d2)+1);
            else freq.put(d1+d2,1);
        }

        for(Map.Entry<Integer,Integer> entry: freq.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }


    }
}
