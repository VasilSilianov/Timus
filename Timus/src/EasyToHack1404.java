import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EasyToHack1404 {

    public static void main(String[] args) {

        Map<Character,Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 1);
        map.put('c', 2);
        map.put('d', 3);
        map.put('e', 4);
        map.put('f', 5);
        map.put('g', 6);
        map.put('h', 7);
        map.put('i', 8);
        map.put('j', 9);
        map.put('k', 10);
        map.put('l', 11);
        map.put('m', 12);
        map.put('n', 13);
        map.put('o', 14);
        map.put('p', 15);
        map.put('q', 16);
        map.put('r', 17);
        map.put('s', 18);
        map.put('t', 19);
        map.put('u', 20);
        map.put('v', 21);
        map.put('w', 22);
        map.put('x', 23);
        map.put('y', 24);
        map.put('z', 25);

        Map<Integer,Character> map2 = new HashMap<>();
        map2.put( 0,'a');
        map2.put( 1,'b');
        map2.put( 2,'c');
        map2.put( 3,'d');
        map2.put( 4,'e');
        map2.put( 5,'f');
        map2.put( 6,'g');
        map2.put( 7,'h');
        map2.put( 8,'i');
        map2.put( 9,'j');
        map2.put( 10,'k');
        map2.put( 11,'l');
        map2.put( 12,'m');
        map2.put( 13,'n');
        map2.put( 14,'o');
        map2.put( 15,'p');
        map2.put( 16,'q');
        map2.put( 17,'r');
        map2.put( 18,'s');
        map2.put( 19,'t');
        map2.put( 20,'u');
        map2.put( 21,'v');
        map2.put( 22,'w');
        map2.put( 23,'x');
        map2.put( 24,'y');
        map2.put( 25,'z');

        Scanner input = new Scanner(System.in);
        char[] word = input.nextLine().toCharArray();

        int[] wordLine3 = new int[word.length];
        for (int i = 0; i <word.length ; i++) {

            wordLine3[i] = map.get(word[i]);
        }

        int[] wordLine2 = new int[word.length];

        wordLine2[0] = wordLine3[0] ;
        for (int i = 1; i <word.length; i++) {
            wordLine2[i] = wordLine3[i] +26;
        }
            wordLine2[word.length-1] = wordLine3[word.length-1] +52;
////////
        int[] wordLine1 = new int[word.length];
        wordLine1[0] = wordLine2[0] -5;
//            wordLine1[1] =wordLine2[1] - wordLine1[0];
        for (int i = 1; i <word.length; i++) {

                wordLine1[i] = wordLine2[i] - wordLine2[i-1];
                if (wordLine1[i] >25){
                    wordLine1[i] = wordLine1[i] % 26;
                }
        }
        ///
//
//
//        for (int i = 0; i <word.length; i++) {
//        System.out.print(word[i] + " ");
//        }
//
//        System.out.println();
//        for (int i = 0; i <word.length; i++) {
//        System.out.print(wordLine3[i] + " ");
//        }
//
//        System.out.println();
//        for (int i = 0; i <word.length; i++) {
//        System.out.print(wordLine2[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i <word.length; i++) {
//        System.out.print(wordLine1[i] + " ");
//        }
//
//        System.out.println();
        for (int i = 0; i <word.length; i++) {
        System.out.print(map2.get(wordLine1[i]));

        }
    }
}
