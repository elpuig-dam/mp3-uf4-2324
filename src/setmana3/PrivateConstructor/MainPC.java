package setmana3.PrivateConstructor;

public class MainPC {

    public static void main(String[] args) {
        // Limitem a només una instància de la classe
        // Això no es pot fer:
        // ConnexioBD connexioBD = new ConnexioBD();

        //Intanciació correcte
        ConnexioBD connexioBD = ConnexioBD.getInstance();
        connexioBD.setTipus("A");

        System.out.println("Connexio 1 tipus: " + connexioBD.getTipus());

        ConnexioBD connexioBD_2 = ConnexioBD.getInstance();
        System.out.println("Connexio 2 tipus: " + connexioBD_2.getTipus());


    }
}
