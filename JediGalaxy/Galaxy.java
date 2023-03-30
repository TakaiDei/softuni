package javaOOP.WorkingWithAbstractionExercise.JediGalaxy;

public class Galaxy {
    StarsField starsField;

    public Galaxy(StarsField starsField) {
        this.starsField = starsField;
    }

    public void moveEvil(int evilCurrentRow, int evilCurrentCol){
        Evil.moveEvil(evilCurrentRow, evilCurrentCol, this.starsField);
    }

    public long moveJedi(int jediCurrentRow, int jediCuurentCol){
       return Jedi.moveJedi(jediCurrentRow, jediCuurentCol, this.starsField);
    }

}
