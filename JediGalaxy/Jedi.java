package javaOOP.WorkingWithAbstractionExercise.JediGalaxy;

public class Jedi {
    public static long moveJedi(int jediRow, int jediCol, StarsField starsField){
        long collectedStars = 0;
        while (jediRow >= 0 && jediCol < starsField.getColLenght()) {
            if (jediRow < starsField.getRowLenght() && jediCol >= 0) {
                collectedStars += starsField.getValue(jediRow, jediCol);
            }

            jediCol++;
            jediRow--;
        }
        return  collectedStars;
    }
}
