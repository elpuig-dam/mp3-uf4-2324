package setmana3.e13;

import java.util.List;

public class ConfigGame {
    List<Player> playersList;
    private int numPlayers;
    private int level;

    public ConfigGame(List<Player> playersList) {
        this.playersList = playersList;
        numPlayers = 1;
        level = 1;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
