import java.util.Scanner;

public class Metro11129 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int columns = input.nextInt();
        int rows =  input. nextInt();

        int numberOfDiagonals = input.nextInt();

        int[][] arrOfDiagonals = new int[numberOfDiagonals][2] ;
        for (int i = 0; i <arrOfDiagonals.length; i++) {

            arrOfDiagonals[i][0] = input.nextInt();
            arrOfDiagonals[i][1] = input.nextInt();
        }
       int adjacencyMatrixLenght = (columns+1) * (rows+1);

        int[][] adjacencyMatrix = new int[adjacencyMatrixLenght][adjacencyMatrixLenght];

        // initialization of the default adjacencyMatrix
        for (int i = 0; i <adjacencyMatrix.length; i++) {


                        if ((i+1) < adjacencyMatrixLenght && ((i+1)%(columns+1) !=0)){

                        adjacencyMatrix[i][i+1] = 1;
                        }

                        if (i+columns+1<adjacencyMatrixLenght){
                            adjacencyMatrix[i][i+columns+1] =1;
                        }


        }

        // initialization of the adjacencyMatrix with the diagonals

        for (int i = 0; i <arrOfDiagonals.length ; i++) {

                    adjacencyMatrix[arrOfDiagonals[i][0]][arrOfDiagonals[i][1]] = 1;
        }

        //printing adjacencyMatrix

        for (int i = 0; i <adjacencyMatrix.length; i++) {
            for (int j = 0; j <adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }

        //za sega dobre
        //printing the matrixes
        System.out.println(" columns = " + columns);
        System.out.println(" rows = " + rows);

        for (int i = 0; i <arrOfDiagonals.length ; i++) {

                System.out.print(arrOfDiagonals[i][0]);
                System.out.print(arrOfDiagonals[i][1]);
            System.out.println();

        }
    }
}
