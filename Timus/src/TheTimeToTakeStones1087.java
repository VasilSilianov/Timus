import java.util.Scanner;

public class TheTimeToTakeStones1087 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int pool = input.nextInt();
       int[] numberOfDifertentPicks =  new int[input.nextInt()];

        for (int i = 0; i <numberOfDifertentPicks.length; i++) {

            numberOfDifertentPicks[i] = input.nextInt();

        }
        System.out.println(pool + " " + numberOfDifertentPicks.length);
        for (int i = 0; i < numberOfDifertentPicks.length; i++) {
            System.out.print(numberOfDifertentPicks[i] + " ");
        }

    }
}
