package lesson3HW;

public class Lesson3Task7 {
    public static void main(String[] args) {

        String str = "Java is awesome";
        char[] chars = new char[str.length()];
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) > 64 && str.charAt(i) < 91 || str.charAt(i) > 96 && str.charAt(i) < 123){
                chars[length] = str.toLowerCase().charAt(i);
                length++;
            }
            }
        char[] letterChars = new char[length];
        for (int i = 0; i <letterChars.length; i++) {
            letterChars[i] = chars[i];
        }


        for (int i = 0; i < letterChars.length; i++) {
            int count = 0;
            for (int j = 0; j < letterChars.length-1; j++) {
                if(letterChars[i] == letterChars[j]){
                    count++;
                }

            }


            System.out.println(letterChars[i]+" - " + count);

            count = 0;
        }
        }
        }

