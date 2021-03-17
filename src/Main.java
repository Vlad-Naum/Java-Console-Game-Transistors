import java.util.Scanner;

public class Main {
    static int sizeX = 10;
    static int sizeY = 5;
    static int amount = 8;
    static int transistors = 5;
    static int steps = 25;
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int command;
        do {
            System.out.println("Welcome. Choose and press enter:\n" +
                    "1: Start new game;\n" +
                    "2: Options;\n" +
                    "3: Exit.");
            command = scanner.nextInt();
            switch (command){
                case 1:
                    Game.game();
                    break;
                case 2:
                    OptionsMenu.showMenu();
                    break;
                case 3: break;
                default:
                    System.out.println("Repeat");
                    break;
            }
        }
        while (command != 3);

    }
}
