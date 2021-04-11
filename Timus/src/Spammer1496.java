
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Spammer1496 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        Set<String> all = new HashSet<>();
        Set<String> result = new HashSet<>();
        for (int i = 0; i <length ; i++) {
            String current=  input.next();
            if (all.contains(current)){
                result.add(current);
            }else {
                all.add(current);
            }

        }
        for (String s:
             result) {
            System.out.println(s);
        }

    }
}
