package setmana3.e13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    public final static int MAX_PLAYERS = 4;

    private ConfigGame configGame;
    private Menu menu;
    private List<Player> playersList;

    public Game() {
        configGame = new ConfigGame(playersList);
        playersList = new ArrayList<>(configGame.getNumPlayers());
        menu = new Menu(this,configGame);
    }

    public void start() {
        menu.show();
    }

    public void play() {
        playersList.clear();
        System.out.println("Nivell de joc: " + configGame.getLevel());
        System.out.println("Creant jugadors...");
        for(int i=0; i<configGame.getNumPlayers(); i++) {
            Player p = new Player("Player-" + i);
            p.setPoints((int)(Math.random()*10));
            playersList.add(p);
        }
        System.out.println("Jugant...");
        System.out.println("Hi ha " + configGame.getNumPlayers() + " jugadors");
        System.out.println("Punts obtinguts:");
        Collections.sort(playersList);
        for (Player p: playersList) {
            System.out.println(p.getName() + ":" + p.getPoints());
        }
        System.out.println("...Joc acabat");
    }
}
