import java.util.Random;

public class Transistors {
    public static int[] trX = new int[Main.transistors];
    public static int[] trY = new int[Main.transistors];


    public static Fieldable tr(){
        Fieldable transistors = new Fieldable() {
            @Override
            public String getSymbol() {
                return "%";
            }
        };
        return transistors;
    }
}
