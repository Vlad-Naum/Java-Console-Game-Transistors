import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void game(){
        int win = 0;
        Field f = new Field(Main.sizeX, Main.sizeY);
        Random random = new Random();
        System.out.println("left - a\n right - d\n up - w\n down - s\n");

        for (int i = 0; i < f.getSizeX(); i++) {
            for (int j = 0; j < f.getSizeY(); j++) {
                f.setFieldable(i, j, Field.pole());
            }
        }

        for (int i = 0; i < Main.transistors; i++) {
            Transistors.trX[i] = random.nextInt(Main.sizeX - 1);
            Transistors.trY[i] = random.nextInt(Main.sizeY - 1);
            f.setFieldable(Transistors.trX[i], Transistors.trY[i], Transistors.tr());
        }

        Player p = new Player();
        f.setFieldable(p.p1, p.p2, Player.Player());
        f.showField();
        System.out.println();


        for (int i = 0; i < Main.steps; i++) {
            System.out.println("Collected transistors: " + win + "\nMake a move. Steps left - " + (Main.steps - i));
            Scanner scanner = new Scanner(System.in);
            String step = scanner.nextLine();
            if (step.equals("s")){ f.setFieldable(p.p1, p.p2, Field.pole());p.p2 += 1; f.setFieldable(p.p1, p.p2, Player.Player());}
            if (step.equals("w")){f.setFieldable(p.p1, p.p2, Field.pole());p.p2 -= 1; f.setFieldable(p.p1, p.p2, Player.Player());}
            if (step.equals("a")){f.setFieldable(p.p1, p.p2, Field.pole());p.p1 -= 1; f.setFieldable(p.p1, p.p2, Player.Player());}
            if (step.equals("d")){f.setFieldable(p.p1, p.p2, Field.pole());p.p1 += 1; f.setFieldable(p.p1, p.p2, Player.Player());}
            for (int j = 0; j < Main.transistors; j++) {
                if(p.p1 == Transistors.trX[j] && p.p2 == Transistors.trY[j]){ win++;}
            }
            f.showField();
            System.out.println();
            if (win == Main.transistors){
                System.out.println("We win!");
                System.out.println();
                break;
            }
        }

        if (win != Main.transistors){
            System.out.println("We lose(");
            System.out.println();
        }
    }
}
