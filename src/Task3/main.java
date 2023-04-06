package Task3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String action;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome! Image that you are playing a game");
        System.out.println("You will have special comands:" +
                "\nPlay\nPause\nSave\nStop");
        System.out.println("On every step you will need to write action. Open your imagination " +
                "end GOOD LUCK!");
        Pleyer pleyer = new Pleyer();
        System.out.println("Enter 'Play' for start");
        action = in.nextLine();
        if (action.equals("Play")) {
            do {
                System.out.println("Your action:");
                action = in.nextLine();
                System.out.println("You will " + action);
                if (action.equals("Stop") || action.equals("stop")) break;
                switch (action){
                    case "Pause" , "pause":{
                        System.out.println("Game on pause");
                        action = in.nextLine();
                        if (action.equals("Play") || action.equals("play")) continue;
                        else break;
                    }
                    case "Play" , "play": {
                        System.out.println("Here have to be something, but... no, it's just simple program");
                        System.out.println("Make another choice");
                    }
                    case "Save", "save":{
                        System.out.println("Game is saved");
                        break;
                    }
                    case "Stop", "stop": break;
                }
                if (action.equals("Stop") || action.equals("stop")) break;

            }while (true);

        } else System.out.println("See you next time!");
        System.out.println("Game over!");
    }
}
