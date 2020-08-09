import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFromFile {
    public static void main(String[] args) {

        try {
//            File fileToBeRead = new File(" D:\\Test Read from File\\TestOne.txt");
            FileInputStream fileToBeRead = new FileInputStream("D:\\Test Read from File\\TestOne.txt");
            Scanner inputFromFile = new Scanner(fileToBeRead);

            StringBuilder sb = new StringBuilder();
            int i = 1;
            while (inputFromFile.hasNext()) {
                String input = inputFromFile.nextLine();
                System.out.println(input + " " + (i++));
                sb.append(input).append(System.lineSeparator());

            }

            inputFromFile.close();
            System.out.println(sb.toString());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
