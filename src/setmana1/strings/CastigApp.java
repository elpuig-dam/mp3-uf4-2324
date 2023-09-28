package setmana1.strings;

import java.util.Date;

public class CastigApp {
    public static void main(String[] args) {
        final String MSG_A_COPIAR = "No tornaré a fer servir l'operador + per concatenar strings";
        final int NUM_LINIES = 10_000_000;
        String castig = "";

        StringBuilder sb = new StringBuilder(MSG_A_COPIAR.length() * NUM_LINIES);
        Date dateI = new Date();
        for (int i = 0; i < NUM_LINIES; i++) {
            //castig += MSG_A_COPIAR;
            //castig = castig.concat(MSG_A_COPIAR);
            sb.append(MSG_A_COPIAR);
        }
        sb.toString();
        Date dateF = new Date();


        System.out.printf("Ha acabat en %d miliseconds", dateF.getTime() - dateI.getTime());

    }
}
