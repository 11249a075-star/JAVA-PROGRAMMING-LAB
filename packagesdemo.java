import java.util.ArrayList;
import java.util.Scanner;
public class packagesdemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("Maths");
        subjects.add("Science");

        System.out.println("\nStudent Name: " + name);

        System.out.println("Subjects:");
        for (String subject : subjects) {
            System.out.println(subject);
        }

        sc.close();
    }
}
