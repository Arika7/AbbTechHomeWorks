package lesson3HW;

public class lesson3Task1 {
    public static void main(String[] args) {

        int[] array1 = {4,7,-2,0,99,-100};
        int min = 0;
        int max = 0;
        for (int g: array1){
            if (g < min) min = g;
            if(g > max) max = g;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
