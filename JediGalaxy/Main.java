package javaOOP.WorkingWithAbstractionExercise.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read dimentions
        int[] dimentions = readCoordinates(scanner.nextLine());
        int rowGalaxy = dimentions[0];
        int colGalaxy = dimentions[1];

        //make and fill matrix(galaxy)
        StarsField starsField = new StarsField(rowGalaxy, colGalaxy);
        starsField.fillStarsField(rowGalaxy, colGalaxy);
        Galaxy galaxy = new Galaxy(starsField);

        //read commands
        String command = scanner.nextLine();

        long collectedStars = 0;

        while (!command.equals("Let the Force be with you")) {
            //read jedi evil coordination
            int[] jediCoordinationInput = readCoordinates(command);
            int[] evilCoordinationInput = readCoordinates(scanner.nextLine());

            //evil coordination
            int evilRow = evilCoordinationInput[0];
            int evilCol = evilCoordinationInput[1];

            //move evil
            galaxy.moveEvil(evilRow, evilCol);

            //jedi coordination
            int jediRow = jediCoordinationInput[0];
            int jediCol = jediCoordinationInput[1];

            //move jedi
            collectedStars += galaxy.moveJedi(jediRow, jediCol);

            command = scanner.nextLine();
        }

        //output
        System.out.println(collectedStars);
    }

    private static int[] readCoordinates(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
