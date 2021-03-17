import java.util.Scanner;

public class OptionsMenu {
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        int command;
        do {
            System.out.println("Choose and press enter:\n" +
                                  "1: Show settings;\n" +
                                 "2: Change settings;\n" +
                                "3: Exit");
            command = scanner.nextInt();
            switch (command){
                case 1:
                    System.out.println("sizeX: " + Main.sizeX +
                            "\nsizeY: " + Main.sizeY +
                            "\nAmount: " + Main.amount +
                            "\nTransistors: " + Main.transistors +
                            "\nSteps: " + Main.steps); break;
                case 2:
                    System.out.println("Change sizeX:");
                    Main.sizeX = scanner.nextInt();
                    System.out.println("Change sizeY:");
                    Main.sizeY = scanner.nextInt();
                    System.out.println("Change amount:");
                    Main.amount = scanner.nextInt();
                    System.out.println("Change transistors:");
                    Main.transistors = scanner.nextInt();
                    System.out.println("Change steps:");
                    Main.steps = scanner.nextInt();
                    break;
                case 3: break;
                default:
                    System.out.println("Repeat");
            }
        }
        while (command != 3);
    }
}
