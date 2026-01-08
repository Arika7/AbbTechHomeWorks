package lesson3HW;

public class Lesson3Task3 {
    public static void main(String[] args) {

        int[][][] cube = {
                {
                        {1, 2}, {3, 4}
                },
                {
                        {5, 6}, {7, 8}
                }
        };


        for (int [][] g : cube){
            for (int [] k: g){
                for (int m : k){
                    if(m> 6) System.out.println(m);
                }
            }
        }

          }
    }

