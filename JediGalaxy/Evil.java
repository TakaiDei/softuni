package javaOOP.WorkingWithAbstractionExercise.JediGalaxy;

public class Evil {
    public static void moveEvil(int evilRow, int evilCol, StarsField starsField){
        while (evilRow >= 0 && evilCol >= 0) {
            if (evilRow < starsField.getRowLenght() && evilCol < starsField.getColLenght()) {
                starsField.setValue(evilRow, evilCol, 0);
            }
            evilRow--;
            evilCol--;
        }
    }
}
