import java.util.Scanner;

public class Elections1263 {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int numberOfParties = input.nextInt();
            int numberOfPeople = input.nextInt();
            int[] numberOfPartiesArr= new int[numberOfParties];
        for (int i = 0; i <numberOfPeople; i++) {
                        numberOfPartiesArr[input.nextInt()-1]+=1;
        }
        for (int value : numberOfPartiesArr) {
            double result = 100 /((double)numberOfPeople / value);
            System.out.printf("%.2f%%%n", result);
        }
    }
}
