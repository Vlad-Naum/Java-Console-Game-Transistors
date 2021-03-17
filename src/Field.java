public class Field {
    private int sizeX, sizeY;
    private Fieldable[][] field;

    public Field(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        field = new Fieldable[sizeX][sizeY];
    }

    public void setFieldable(int x, int y, Fieldable object) {
        field[x][y] = object;
    }
    public static Fieldable pole(){
        Fieldable pole = new Fieldable() {
            @Override
            public String getSymbol() {
                return "*";
            }
        };
        return pole;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public Fieldable[][] getField() {
        return field;
    }
    public void showField(){
        System.out.println();
        for (int i = 0; i < sizeY; i++) {
            System.out.println();
            for (int j = 0; j < sizeX; j++) {
                System.out.print(field[j][i].getSymbol() + " ");
            }
        }
    }
}
