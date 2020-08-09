import java.util.Scanner;

public class Permutations1024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] allNumbers = new int[input.nextInt()];
        int[] numbersToReareange = new  int[allNumbers.length];
        
        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = i+1;
            numbersToReareange[i] = input.nextInt();
        }

        int counter = 0;

        while (true){
            for (int i = 0; i <allNumbers.length; i++) {
                if (allNumbers[i] != numbersToReareange[i]){
                    break;
                }
                System.out.println(counter);
                return;
            }
            int [] buferArr = new int[allNumbers.length];
            int buffer= 0;
//            int buffer1= 0;


            for (int i = 0; i <allNumbers.length; i++) {

                buffer = numbersToReareange[allNumbers[i]-1];
//                buffer1 =   ;
                System.out.println( " " + buffer+"-" +1 + " " +allNumbers[i]);

//                buferArr[buffer-1] = i +1;
//                buferArr[buffer-1] = allNumbers[i];
                buferArr[allNumbers[i]-1] = buffer;

            }

                System.out.println("1 2 3 4 5");
            for (int i = 0; i <buferArr.length ; i++) {
                System.out.print(buferArr[i] + " ");

            }
            System.out.println();

            for (int i = 0; i <numbersToReareange.length; i++) {
                numbersToReareange[i] =buferArr[i];
            }
            if (counter==2){

            break;
            }
            counter++;
        }

//        for (int i = 0; i < allNumbers.length ; i++) {
//            System.out.print(allNumbers[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < numbersToReareange.length; i++) {
//            System.out.print(numbersToReareange[i] + " ");
//
//        }
    }
}
