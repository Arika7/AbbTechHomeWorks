package lesson1HW;

public class lesson1 {

    public static void main(String[] args) {
        int age = 22;
        double height = 1.82;
        boolean isStudent = true;


        System.out.println(
                "Age: " + age +"\n" + "Height: "+ height +"\n" + "Is student: " + isStudent
        );

        System.out.println("---------");



        int points = 54;
        double pointsDouble = points;

        System.out.println("int: " + points +"\n" + "double: " + pointsDouble);

        System.out.println("----");


        double avgScore = 89.7;
        int finalScore = (int) avgScore;

        System.out.println("AvgScore: " + avgScore + "\n" + "FinalScore: " + finalScore);
    }
}
