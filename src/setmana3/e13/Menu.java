package setmana3.e13;

import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    Game game;
    ConfigGame configGame;

    public Menu(Game game, ConfigGame configGame) {
        this.game = game;
        this.configGame = configGame;
    }

    public void show() {
        menuPricipal();
    }

    private void menuPricipal() {
        int option;
        do {
            System.out.println("1. Play");
            System.out.println("2. Setttings");
            System.out.println("3. Exit");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    game.play();
                    break;
                case 2:
                    settingsMenu();
                    break;
                case 3:
                    //exit();
                    break;
                default:
                    System.out.println("ATENCIÓ!!!! ha de ser 1,2 o 3");
            }
        }while(option != 3);
    }

    private void settingsMenu() {
        int option;
        do {
            System.out.println("1. Players");
            System.out.println("2. Game");
            System.out.println("3. Return");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    playerSettings();
                    break;
                case 2:
                    gameSettings();
                    break;
                case 3:
                    //exitSettings();
                    break;
                default:
                    System.out.println("ATENCIÓ!!!! ha de ser 1,2 o 3");
            }
        }while(option != 3);
    }

    private void gameSettings() {
        int level;
        System.out.print("Dificultat (1-5): ");
        level = sc.nextInt();
        configGame.setLevel(level);
    }

    private void playerSettings() {
        int njug;
        System.out.print("Número de jugadors" + "(Màxim " + Game.MAX_PLAYERS + ")? ");
        njug = sc.nextInt();
        configGame.setNumPlayers(njug);
    }

}
