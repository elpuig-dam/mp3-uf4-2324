package setmana3.PrivateConstructor;

public class ConnexioBD {
    static ConnexioBD instance = null;
    private String tipus;

    private ConnexioBD() {
        System.out.println("connexió realitzada...");
    }

    public static ConnexioBD getInstance() {
        if(instance == null) instance = new ConnexioBD();
        return instance;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
}
