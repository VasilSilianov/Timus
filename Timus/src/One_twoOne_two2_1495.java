import java.math.BigInteger;
import java.util.Scanner;

public class One_twoOne_two2_1495 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
//        for (int N = 1; N <10000; N++) {

        int N = input.nextInt();

        for (int i = N; i <222222222 ; i++) {
            if (i%N == 0){
                String strNumber = "" +i;
                char[] number = strNumber.toCharArray();
                int counter =0;
                for (int j = 0; j <number.length; j++) {

                    if (number[j]== '1' || number[j] =='2'){
                        counter++;
                    }else{
                         break;
                    }

                }
                if (counter==number.length){
                 System.out.println( strNumber);
                break;
                }
            }
        }
        System.out.println("Impossible");
//        }

//        if(N % 5 == 0){
//            System.out.println("Impossible");
//        }
//        String result = acceptable(new BigInteger(""+N),1, 30);
//
//            System.out.println(result);
    }
    static String acceptable(BigInteger devisor, int devidendLength, int depth){
        if(devidendLength > depth){
            return "Impossible";
        }
        int twoPowered = 1;
        for (int i = 0; i < devidendLength; i++) {
            twoPowered *= 2;
        }
        for (int change = 0; change < twoPowered; change++) {
            String result = getNextNumber(change,devidendLength);
            if(new BigInteger(result).remainder(devisor).intValueExact() == 0){
                return result;
            }
        }
        return acceptable(devisor, devidendLength + 1, depth);
    }

    static String getNextNumber(int change, int devidendLength) {
        String result = "";
        int powOne = 1;
        for (int i = 0; i < devidendLength; i++) {
            if((change&powOne) == 0) {
                result += "1";
            }else {
                result += "2";
            }
            powOne*=2;
        }
        return result;
    }
}
/*

 */
