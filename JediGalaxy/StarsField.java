package javaOOP.WorkingWithAbstractionExercise.JediGalaxy;

public class StarsField {
    private int[][] starsField;

    public StarsField(int rows, int cols) {
        this.starsField = new int[rows][cols];
    }

    public void fillStarsField(int rowGalaxy, int colGalaxy) {
        int value = 0;
        for (int row = 0; row < rowGalaxy; row++) {

            for (int col = 0; col < colGalaxy; col++) {
                this.starsField[row][col] = value++;
            }
        }
    }

    public int getRowLenght() {
        return this.starsField[1].length;
    }

    public int getColLenght() {
        return this.starsField[0].length;
    }

    public void setValue(int row ,int col, int newValue){
        starsField[row][col] = newValue;
    }

    public int getValue(int row, int col){
        return starsField[row][col];
    }
}
