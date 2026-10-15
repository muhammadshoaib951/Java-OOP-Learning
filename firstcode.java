
import java.util.Scanner;

class Student232 {
    private String name;
    private int age;

    public void getInfo(String a, int b) {
        name = a;
        age = b;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class firstcode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student232 s1 = new Student232();

        System.out.print("Enter your name: ");
        String a = sc.nextLine();

        System.out.print("Enter your age: ");
        int b = sc.nextInt();

        s1.getInfo(a, b);
        s1.printInfo();

        sc.close();
    }
}
