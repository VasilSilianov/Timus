import java.util.Scanner;

public class Farm1349 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <=100; i++) {
            for (int j = i+1; j <=100; j++) {
                for (int k = j+1; k <=100 ; k++) {
                    //int a = i;

                    int a = (int) Math.pow(i,n);
                    int b = (int) Math.pow(j,n);
                    int c = (int) Math.pow(k,n);

                    int d = a + b;
                    if (d==c){
                        System.out.println(i+ " " + j+ " " + k);
                        return;
                    }

                }
            }
        }

        System.out.println(-1);

    }

}
