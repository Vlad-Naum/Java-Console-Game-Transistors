import java.util.Random;

public class Player {
    Random random = new Random();
    int p1 =  random.nextInt(Main.sizeX - 1);
    int p2 =  random.nextInt(Main.sizeY - 1);

    public int getP1() {
        return p1;
    }

    public int getP2() {
        return p2;
    }

    public static Fieldable Player(){
        Fieldable player = new Fieldable() {
            @Override
            public String getSymbol() {
                return "O";
            }
        };
        return player;
    }
}
