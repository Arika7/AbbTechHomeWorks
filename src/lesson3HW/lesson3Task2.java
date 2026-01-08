package lesson3HW;

public class lesson3Task2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum = 0;
        int secondSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j) sum+=matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == 0 && j == 2) {
                    secondSum+=matrix[i][j];
                    break;
                }
                if(i == 1 && j == 1) {
                    secondSum+=matrix[i][j];
                    break;
                }
                if(i == 2) {
                    secondSum+=matrix[i][j];
                    break;
                }

            }
        }

        System.out.println("Main "+ sum);
        System.out.println("Second Main "+ secondSum);


    }
}
