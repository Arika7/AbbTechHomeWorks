package lesson9HW;

import java.io.*;
import java.util.Scanner;

public class lesson9HW {
    static final String FILE_NAME = "student.txt";

    void main() {
    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
        System.out.println("\nMenu:");
        System.out.println("1. View all records");
        System.out.println("2. Overwrite file with new records");
        System.out.println("3. Append a new record");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter a number: ");
            scanner.next();
        }

        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> viewRecords();
            case 2 -> {
                editFile();
            }
            case 3 -> appendRecords();
            case 4 -> System.out.println("Exiting program...");
            default -> System.out.println("Invalid choice!");
        }
    } while (choice != 4);

}

    static void viewRecords() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println(
                        "StudentID: " + data[0] +
                                ", Name: " + data[1] +
                                ", Score: " + data[2]
                );
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

    static void editFile(){
        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(FILE_NAME))) {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.print("Enter StudentID: ");
                String id = sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Score: ");
                String score = sc.nextLine();

                bw.write(id + "," + name + "," + score);
                System.out.println("Write successful");
                bw.newLine();

                System.out.println("Do you want to continue?(type 'exit' to stop, anything else to continue):");
                if (sc.nextLine().equalsIgnoreCase("exit")) {
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println("File write error");
        }
    }

    static void appendRecords() {
        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            Scanner sc = new Scanner(System.in);
            File file = new File(FILE_NAME);
            while (true) {
                System.out.print("Enter StudentID: ");
                String id = sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Score: ");
                String score = sc.nextLine();

                if (file.length() > 0) {
                    bw.newLine();
                }
                bw.write(id + "," + name + "," + score);

                System.out.println("Record added.");

                System.out.print("Add another record? (type 'exit' to stop): ");
                if (sc.nextLine().equalsIgnoreCase("exit")) {
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }

}











