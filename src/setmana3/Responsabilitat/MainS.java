package setmana3.Responsabilitat;

import java.io.IOException;

public class MainS {

    public static void main(String[] args) throws IOException {
        Persona p = new Persona("Jordi",(short)45);
        PrinterPersona printerPersona = new PrinterPersona(p);

        printerPersona.output();
        System.out.println(printerPersona.toJson());
        System.out.println(printerPersona.toCSV(','));
        System.out.println(printerPersona.toXML());
    }
}
