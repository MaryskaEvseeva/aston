import java.util.Scanner;

public class Task1Scanner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Здравствуйте! Введите число: ");
        int num = in.nextInt();
        do {
            if (num > 7) {
                System.out.println("Привет");
                return;
            } else {
                System.out.println("Попробуйте ещё раз: ");
            }
            num = in.nextInt();
        } while (num < 7);
        System.out.println("Привет");
    }
}
